package unidad4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import unidad4.model.EmpleadoDAO;
import unidad4.model.EmpleadoDO;
import unidad4.model.TiendaDAO;
import unidad4.utils.UtilsBD;

public class PruebasBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Nos conectamos a la bd
		Connection con = UtilsBD.ConectarBD();

		//Cargamos la lista de empleados desde bd
		ResultSet rs = EmpleadoDAO.getEmpleados(con);

		try {

			while (rs.next()) {
				//Para sacar los datos utilizamos funciones get con el tipo de dato y el numero de la columna
				//o el nombre del campo
				System.out.println(
						rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getDouble("sueldo"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		//Cargamos la lista de empleados desde bd
		rs = EmpleadoDAO.getEmpleado(con, 17);

		try {
			//Hay que ejecutar siempre el next
			rs.next();
			//Para sacar los datos utilizamos funciones get con el tipo de dato y el numero de la columna
			//o el nombre del campo
			System.out.println("\n\n\n EL EMPLEADO NUMERO 17 ES:\n");
			System.out.println(
					rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getDouble("sueldo"));

		} catch (SQLException e) {
			e.printStackTrace();

		}

		System.out.println("Resultado de borrar el 16 " + EmpleadoDAO.deleteEmpleado(con, 16));

		EmpleadoDO juanito = new EmpleadoDO(-1, "juanito", "El de los palitos", 12, 3400, 1);
		EmpleadoDO antonina = new EmpleadoDO(10, "Antonina", "mendez", 14, 1900, 2);

		TiendaDAO tiendaM = new TiendaDAO();

		System.out.println("Al insertar a juanito devolvio: " + EmpleadoDAO.insertEmpleado(con, juanito));

		System.out.println("Al actualizar a Antonina devolvio: " + EmpleadoDAO.updateEmpleado(con, antonina));

		//Cargamos la lista de empleados desde bd
		rs = tiendaM.getAll(con);

		try {

			while (rs.next()) {
				//Para sacar los datos utilizamos funciones get con el tipo de dato y el numero de la columna
				//o el nombre del campo
				System.out.println(
						"Tienda " + rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + " " + rs.getDate(5));

			}

			//Cerramos la conexion
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
