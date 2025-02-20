package unidad4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EjemploConexionBasica {

	public static void main(String args[]) {
		try {

			//Comprueba que tengamos el driver para conectarnos a la bd mysql 
			//Antes de conectarnos en si, si no esta no pasa nada
			Class.forName("com.mysql.cj.jdbc.Driver");

			/*Para conectarnos necesitamos 5 parametros
			 * ip o nombre del host donde esta la bd, en nuestro caso localhost
			 * puerto por el que nos conectamos,en mysql 3306
			 * usuario y contraseña
			 * nombre del esquema de la bd en nuestro caso como dijo mario es frigopie
			 */
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/frigopie", "root", "");

			//Con la conexion ya activa (con) crea una sentencia para poder ejecutar
			//sentencias sql
			Statement stmt = con.createStatement();

			//Directamente ejecutamos la sentencia
			//Si es una sentenci tipo select se hace con executeQuery
			//Esta nos devuelve un objeto de tipo ResultSet con los datos de la query
			ResultSet rs = stmt.executeQuery("select * from empleados");

			//teniendo el resultset relleno de registros, los recorremos utilizando la funcion next
			//Por defecto el resultset no apunta a ningun registro
			//Es decir si no ejecuto next() ninguna vez y intento acceder a los datos va a fallar
			Boolean hayMas = rs.next();
			while (hayMas) {
				//Para sacar los datos utilizamos funciones get con el tipo de dato y el numero de la columna
				//o el nombre del campo
				System.out.println(
						rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getDouble("sueldo"));

				hayMas = rs.next();
			}

			con.close();
		} catch (Exception e) {
			//El printstacktrace muesta el errror de la excepcion si ocurre el error
			e.printStackTrace();
		}
	}

}
