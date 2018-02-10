import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;



/**
 *
 * @author sqlitetutorial.net
 */
public class SQLiteJDBCDriverConnection {
     /**
     * Connect to a sample database
     */
    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:/users/rickboles/repos/hack/sqlite/ex1.db";
            // create a connection to the database
            try{
              Class.forName("org.sqlite.JDBC");
            }catch(Exception e){
              e.printStackTrace();
            }
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        connect();

    }
}
