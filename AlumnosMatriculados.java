/**
 * Crea la clase AlumnosMatriculados. Queremos guardar en la memoria del
 * ordenador el número de alumnos matriculados en cada grupo del ciclo de
 * "Desarrollo de Aplicaciones Web" (por módulos). Existen dos grupos y se
 * imparten seis módulos distintos en cada grupo. Utiliza métodos en la medida
 * de lo posible. Sabemos que: En el primer grupo hay: 30 alumnos matriculados en Sistemas informáticos
 * 27 alumnos matriculados en Bases de datos 25 alumnos matriculados en Programación
 * 21 alumnos matriculados en Lenguaje de marcas 19 alumnos matriculados en Entornos de desarrollo 
 * 16 alumnos matriculados en FOL En el segundo grupo hay: 15 alumnos matriculados en Desarrollo Web en entorno cliente
 * 14 alumnos matriculados en Desarrollo Web en entorno servidor 15 alumnos matriculados en Despliegue de aplicaciones Web
 * 15 alumnos matriculados en Diseño de interfaces Web 15 alumnos matriculados en Desarrollo Web en entorno cliente
 * @author Antonio Luque Bravo
 * @version 1.0
 */
public class AlumnosMatriculados {
	public static void main(String[] args) {
		int modulosContador = 0;
		int grupoContador = 0;
		int[][] alumnosMatriculados = annadirAlumnosMatriculados();
		String[] modulos= annadirModulos();
		String[] grupos = annadirGrupos();

		for (int[] grupo : alumnosMatriculados) {
			System.out.println("En el " + grupos[grupoContador++] + " grupo hay:\n");
			for (int alumnos : grupo) {
				System.out.println( "\t" + alumnos + " alumnos matriculados en " + modulos[modulosContador++] + ".");
			}
		}
	}
	private static int[][] annadirAlumnosMatriculados(){
		int[][] matriculados = { { 30, 27, 25, 21, 19, 16}, { 15, 14, 15, 15, 15 } };
		return matriculados;
	}
	private static String[] annadirModulos(){
		String[] modulos = {"Sistemas Informaticos" , "Base de Datos" , "Programacion" , "Lenguaje de marcas",
		 "Entornos de Desarrollo" , "FOL" , "Desarrollo Web en entorno cliente" ,
		  "Desarrollo Web en entorno servidor" , "Despliegue de aplicaciones Web" ,
		   "Diseño de interfaces Web" , "Desarrollo Web en entorno cliente"};
		return modulos;
	}
	private static String[] annadirGrupos(){
		String[] grupos = {"primer" , "segundo"};
		return grupos;
	}
}
