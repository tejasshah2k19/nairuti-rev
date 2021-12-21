import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static void main(String[] args) {
		openConnection();
	}

	public static Connection openConnection() {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/nairuti";
		String userName = "root";
		String password = "root";

		try {
			// load driver
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, userName, password);

			if (con == null) {
				System.out.println("db not connected");
			} else {
				System.out.println("db connected");
			}

			return con;//
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
