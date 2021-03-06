import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class TestFunciones {

	private String nombre = "Carlos gonzalez";
	private char sexo = 'H';
	private int edad = 34;
	private float altura = (float) 1.78;
	private float peso = (float) 67.6;
	private Alumno alumno = new Alumno(nombre,sexo,edad,altura,peso);
	
	
	
	private String nombre2 = "Clara diez";
	private char sexo2 = 'M';
	private int edad2 = 26;
	private float altura2 = (float) 1.58;
	private float peso2 = (float) 61.6;
	private Alumno alumno2 = new Alumno(nombre2,sexo2,edad2,altura2,peso2);
	
	private FuncionesMain funciones = new FuncionesMain();
	
	private Alumno[] alumnos = new Alumno[2];
	
	
	@Test
	public void testCalcularTotal() {
		alumnos[0] = alumno;
		alumnos[1] = alumno2;
		assertEquals(funciones.CalcularTotal(alumnos),1);
	}
	@Test
	public void testCalcularPromedio() {
		alumnos[0] = alumno;
		alumnos[1] = alumno2;
		assertEquals(funciones.CalcularPromedio(alumnos),34,0.2);
	}
	
	@Test
	public void test2() {
	
		FuncionesMain funcionesMain = new FuncionesMain();
		Scanner reader = new Scanner(System.in);
		LeerDatos leerDatosMock =mock(LeerDatos.class);
		funcionesMain.CargarDatos(reader, leerDatosMock);
	}
	

}
