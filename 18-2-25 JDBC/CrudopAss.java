import java.sql.*;

public class CrudopAss {
    String url = "jdbc:mysql://localhost:3306/abcd";
    String username = "root";
    //Give the password to access MySQL server
    String password = "Uranium@292";
    public void selectRecords() throws SQLException {
        String query = "select * from student";
        //Step 1 - connect database
        Connection connection = DriverManager.
                getConnection(url,username, password);
        //Step 2 - Creating statement
        Statement stmt = connection.createStatement();
        //Step 3 - Executing query and Processing resultset
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()) {

            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nFirstname is:" + rs.getString(2));
            System.out.print("\nLastname is:" + rs.getString(3));
            System.out.print("\nCity is:"+rs.getString(4));

        }
        //Step 4 - Close connection
        connection.close();
    }
    public void insertRecord() throws SQLException {

        String query = "insert into student values(19, 'Jessy','Pinkman','Albuquerque');";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        int row = st.executeUpdate(query);
        System.out.println("Number of rows affected:"
                +row);
        connect.close();
    }
    public void deleteRecordWithPreparedStatement(int studentID) throws SQLException {

        // String query = "delete from employee where emp_id=11;";
        // String query = "delete from employee where emp_id="
        // +id+";";
        String query = "delete from student where studentID=?;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,studentID);
        System.out.println("Number of rows affected:"
                +pst.executeUpdate());
        connect.close();

        
    }
    public void updateRecordWithPreparedStatement(int studentID, String City) throws SQLException {

        //String query = "update employee set salary=800000 where emp_id=15;";
        //String query = "update employee set salary="+salary+" where " +
        // "emp_id="+id+";";
        String query = "update student City=? where studentID=?;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,studentID);
        pst.setString(2,City);
        System.out.println("Number of rows affected:"
                +pst.executeUpdate());
        connect.close();
    }
}