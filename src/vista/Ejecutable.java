package vista;

import controlador.ControlEmpleado;

public class Ejecutable {

	public static void main(String[] args) {
		System.out.print(ControlEmpleado.organizarDiasHoras(ControlEmpleado.cargarDatos()));
	}

}
