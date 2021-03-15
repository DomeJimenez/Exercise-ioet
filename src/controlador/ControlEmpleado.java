package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Empleado;

public class ControlEmpleado {
	
	public static ArrayList<Empleado> cargarDatos() {
		File archivo;
	    FileReader fileReader;
	    BufferedReader buffReader;
	    Empleado empleado;
	    ArrayList<String> diasHoras;
	    ArrayList<Empleado> empleados = null;
	    
		try {
			archivo = new File ("../Exercise-ioet/src/archivo/datos.txt");
			fileReader = new FileReader (archivo);
	        buffReader = new BufferedReader(fileReader);
	        empleados = new ArrayList<Empleado>();
	        String[] result;
	        String linea;
	        
	        while((linea = buffReader.readLine())!=null) {
	        	empleado = new Empleado();
	        	
	        	result = linea.split("=");
	    	    for (int x=0; x<result.length; x++){
	    	    	if(x==1) {
	    	    		diasHoras = new ArrayList<String>();
	    	    		result = result[x].split(",");
	    	    		for(int y=0; y<result.length; y++) {
	    	    			diasHoras.add(result[y]);
	    	    		}
	    	    		empleado.setHorasTrabajo(diasHoras);
	    	    		break;
	    	    	}
	    	    	empleado.setNombre(result[x]);
	    	    	
	    	    }
	    	    empleados.add(empleado);
	        }
	        buffReader.close();
	        return empleados;
        } catch (IOException e) {
			return empleados;
		} catch (NullPointerException e) {
			return empleados;
		}
	}
	
	public static String organizarDiasHoras(ArrayList<Empleado> empleados) {
        try {
        	String dia, inicio, fin, resultado = "";
            int sumaSueldo, horaInicio, horaFinal;
            
            for (int x=0; x<empleados.size(); x++){
            	sumaSueldo = 0;
            	for (int y=0; y<empleados.get(x).getHorasTrabajo().size(); y++){
            		dia = empleados.get(x).getHorasTrabajo().get(y).substring(0,2).toString();
            		inicio = empleados.get(x).getHorasTrabajo().get(y).substring(2,7).toString();
            		if(empleados.get(x).getHorasTrabajo().get(y).substring(8,13).toString().compareTo("00:00")==0)
            			fin = "24:00";
            		else
            			fin = empleados.get(x).getHorasTrabajo().get(y).substring(8,13).toString();
            		horaInicio = Integer.parseInt(inicio.substring(0,2));
            		horaFinal = Integer.parseInt(fin.substring(0,2));
            		
            		switch(dia) {
            			case "MO": case "TU": case "WE": case "TH": case "FR":
            				if((inicio.compareTo("00:01") >= 0) && (fin.compareTo("09:00") <= 0)) {
            					sumaSueldo += (25*calcularHoras(horaFinal, horaInicio));
            				}
            				if((inicio.compareTo("09:01") >= 0) && (fin.compareTo("18:00") <= 0)) {
            					sumaSueldo += (15*calcularHoras(horaFinal, horaInicio));
            				}
            				if((inicio.toString().compareTo("18:01") >= 0) && (fin.compareTo("24:00") <= 0)) {
            					sumaSueldo += (20*calcularHoras(horaFinal, horaInicio));
            				}
            				break;
            			
            			case "SA": case "SU":
            				if((inicio.compareTo("00:01") >= 0) && (fin.compareTo("09:00") <= 0)) {
            					sumaSueldo += (30*calcularHoras(horaFinal, horaInicio));
            				}
            				if((inicio.compareTo("09:01") >= 0) && (fin.compareTo("18:00") <= 0)) {
            					sumaSueldo += (20*calcularHoras(horaFinal, horaInicio));
            				}
            				if((inicio.compareTo("18:01") >= 0) && (fin.compareTo("24:00") <= 0)) {
            					sumaSueldo += (25*calcularHoras(horaFinal, horaInicio));
            				}
            				break;
            		}
            		
            		
            	}
            	resultado += "El monto a pagar a "+empleados.get(x).getNombre()+" es: "+sumaSueldo+" USD.\n";
    	    }
            return resultado;
        } catch (NullPointerException e){
        	return "Archivo no encontrado.";
        }
	}
	
	public static int calcularHoras(int horaFinal, int horaInicio) {
		return horaFinal - horaInicio;
	}
	
}
