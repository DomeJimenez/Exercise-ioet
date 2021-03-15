package controlador;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import modelo.Empleado;

class ControlEmpleadoTest {
	
	private Empleado empleado;
	private ArrayList<Empleado> empleados;
	
	@Test
	void test01() {
		System.out.println("Caso de prueba 01.");
		empleado = new Empleado();
		empleado.setNombre("RENE");
		empleado.setHorasTrabajo(new ArrayList<String>(Arrays.asList("MO10:00-12:00", "TU10:00-12:00", "TH01:00-03:00", "SA14:00-18:00", "SU20:00-21:00")));
		empleados = new ArrayList<Empleado>(Arrays.asList(empleado));
		String actual = ControlEmpleado.organizarDiasHoras(empleados);
		String esperado = "El monto a pagar a RENE es: 215 USD.\n";
		assertEquals(esperado, actual);
	}
	
	@Test
	void test02() {
		System.out.println("Caso de prueba 02.");
		empleado = new Empleado();
		empleado.setNombre("ASTRID");
		empleado.setHorasTrabajo(new ArrayList<String>(Arrays.asList("MO10:00-12:00", "TH12:00-14:00", "SU20:00-21:00")));
		empleados = new ArrayList<Empleado>(Arrays.asList(empleado));
		String actual = ControlEmpleado.organizarDiasHoras(empleados);
		String esperado = "El monto a pagar a ASTRID es: 85 USD.\n";
		assertEquals(esperado, actual);
	}
	
	@Test
	void test03() {
		System.out.println("Caso de prueba 03.");
		empleado = new Empleado();
		empleado.setNombre("MARIA");
		empleado.setHorasTrabajo(new ArrayList<String>(Arrays.asList("MO00:01-02:00", "SU22:00-00:00")));
		empleados = new ArrayList<Empleado>(Arrays.asList(empleado));
		String actual = ControlEmpleado.organizarDiasHoras(empleados);
		String esperado = "El monto a pagar a MARIA es: 100 USD.\n";
		assertEquals(esperado, actual);
	}
	
	@Test
	void test04() {
		System.out.println("Caso de prueba 04.");
		empleado = new Empleado();
		empleado.setNombre("LUIS");
		empleado.setHorasTrabajo(new ArrayList<String>(Arrays.asList("TU01:00-02:00", "WE14:00-18:00", "TH23:00-00:00")));
		empleados = new ArrayList<Empleado>(Arrays.asList(empleado));
		String actual = ControlEmpleado.organizarDiasHoras(empleados);
		String esperado = "El monto a pagar a LUIS es: 105 USD.\n";
		assertEquals(esperado, actual);
	}
	
	@Test
	void test05() {
		System.out.println("Caso de prueba 05.");
		empleado = new Empleado();
		empleado.setNombre("ANA");
		empleado.setHorasTrabajo(new ArrayList<String>(Arrays.asList("FR10:00-14:00", "SA00:01-01:00", "SU22:00-00:00")));
		empleados = new ArrayList<Empleado>(Arrays.asList(empleado));
		String actual = ControlEmpleado.organizarDiasHoras(empleados);
		String esperado = "El monto a pagar a ANA es: 140 USD.\n";
		assertEquals(esperado, actual);
	}

}
