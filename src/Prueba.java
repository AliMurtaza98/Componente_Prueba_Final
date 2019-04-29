
import SQLBean.GestorSQLBean;
import SQLBean.RegistroSQLBean;

public class Prueba {
	public static void main(String[] args) {
		
		GestorSQLBean g = new GestorSQLBean();
		RegistroSQLBean r = new RegistroSQLBean();

		/* -------------------------------------- IMDB -------------------------------------- */

		/*
		 * Base de datos --> IMDB
		 * Usuario --> root
		 * Password --> ""
		 * Ejecutamos todas las sentencias
		 */
		g.conexionSQL("imdb", "localhost", "3306", "root", "");
		g.sentenciaSQL("INSERT INTO `movies`(`name`, `genre`, `director`, `date`) VALUES ('Iron Maannn','Action/Sci-Fi','Jon Favreau','30/04/2008')");
		g.sentenciaSQL("SELECT * FROM movies");
		g.sentenciaSQL("UPDATE movies SET name='Iron Man' WHERE id=4");
		g.sentenciaSQL("DELETE FROM movies WHERE name = 'Venom'");
		g.sentenciaSQL("CALL myProcedure");
		/*
		 * Base de datos --> IMDB
		 * Usuario --> pepe
		 * Password --> MyPassword
		 */
		g.conexionSQL("imdb", "localhost", "3306", "pepe", "MyPassword");
		g.sentenciaSQL("DELETE FROM movies WHERE name = 'Deadpool'");
		g.sentenciaSQL("SELECT * FROM movies");

		/*
		 * Base de datos --> IMDB
		 * Usuario --> luke
		 * Password --> MyPassword
		 */
		g.conexionSQL("imdb", "localhost", "3306", "luke", "MyPassword");
		g.sentenciaSQL("INSERT INTO `movies`(`name`, `genre`, `director`, `date`) VALUES ('Avengers: Endgame','Action/Fantasy','Anthony Russo & Joe Russo','25/04/2019')");

		/* -------------------------------------- Amazon -------------------------------------- */
		
		/*
		 * Base de Datos --> Amazon
		 * Usuario --> luke
		 * Password --> MyPassword
		 * Ejecutamos todas las sentencias
		 */
		g.conexionSQL("amazon", "localhost", "3306", "luke", "MyPassword");
		g.sentenciaSQL("INSERT INTO `products`(`name`, `price`) VALUES ('Amazon Echo','1000')");
		g.sentenciaSQL("SELECT * FROM products");
		g.sentenciaSQL("UPDATE products SET price='100' WHERE name='Amazon Echo'");
		g.sentenciaSQL("DELETE FROM products WHERE id = 1");
		/*
		 * Base de Datos --> Amazon
		 * Usuario --> root
		 * Password --> ""
		 */
		g.conexionSQL("amazon", "localhost", "3306", "root", "");
		g.sentenciaSQL("INSERT INTO `products`(`name`, `price`) VALUES ('Samsung Galaxy S10+','954')");
		g.sentenciaSQL("INSERT INTO `products`(`name`, `price`) VALUES ('Toshiba 50LF621U19 4K','380')");
	
		/* -------------------------------------- Football -------------------------------------- */
		
		/*
		 * Base de Datos --> Football
		 * Usuario --> pepe
		 * Password --> MyPassword
		 * Ejecutamos todas las sentencias
		 */
		g.conexionSQL("football", "localhost", "3306", "pepe", "MyPassword");
		g.sentenciaSQL("INSERT INTO `players`(`name`, `age`,`team`) VALUES ('Mohamed Salah','26','Egypt')");
		g.sentenciaSQL("DELETE FROM players WHERE id = 1");
		g.sentenciaSQL("INSERT INTO `players`(`name`, `age`,`team`) VALUES ('Eden Hazard','29','Belgium')");

		/*
		 * Base de Datos --> Football
		 * Usuario --> root
		 * Password --> ""
		 */
		g.conexionSQL("football", "localhost", "3306", "root", "");
		g.sentenciaSQL("DELETE FROM players WHERE id = 2");
		g.sentenciaSQL("UPDATE players SET age='28' WHERE name='Eden Hazard'");
		

		/* ************************************** CONSULTAS ************************************** */

		/* CONSULTAS --> IMDB */
		System.out.println("Base de datos --> IMDB");
		g.consultarPor("imdb", "root");
		g.consultarPor("imdb", "pepe");
		g.consultarPor("imdb", "pepe", "SELECT");
		System.out.println();
		System.out.println();
		/* CONSULTAS --> Amazon */
		System.out.println("Base de datos --> Amazon");
		g.consultarPor("amazon", "root");
		g.consultarPor("amazon", "luke", "INSERT");
		System.out.println();
		System.out.println();
		/* CONSULTAS --> Football */
		System.out.println("Base de datos --> Football");
		g.consultarPor("football", "DELETE");
		g.consultarPor("football", "pepe", "INSERT");
		

		/*METODO PARA PRINTAR TODOS LOS REGISTROS DE USUARIOS Y BASE DE DATOS
		 * r.printarTodosRegistros();
		 */
		
		 

	}

}
