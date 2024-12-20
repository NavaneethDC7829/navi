package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		String dbURL="jdbc:mysql://localhost:3306/advsel";
		Class.forName("com.mysql.cj.jdbc.Driver");

		try {
			DriverManager.getConnection(dbURL,"root","root");
			System.out.println("connection established");
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("conection failed");
		}
	}

}
