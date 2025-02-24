import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
    }
}
