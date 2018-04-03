package jdbcdemo;

import java.sql.*;


/**
 * Created by Selina on 05/01/2018.
 *
 */

public class ConnectToMySQLDemo {

    private static final String URL = "jdbc:mysql://localhost:3306/employees";
    private static final String USER = "root";
    private static final String PASSWORD = "Nasreen12345";

    public static void main(String[] args) {
    try {
        //1. Get a connection to the database
        Connection myConn = DriverManager.getConnection(URL, USER, PASSWORD);


        //2. Create a statement
        Statement myStmt = myConn.createStatement();



        //3. Execute a SQL Query
        ResultSet myRs = myStmt.executeQuery( "SELECT * FROM StudentInfo");


         //4. Process the result set
        while (myRs.next()) {
            System.out.println("Name" + myRs.getString("Name") +" " + myRs.getString("Id") + " " + myRs.getString("Subject"));
        }

            }catch (Exception e) {
            e.printStackTrace();
    }
    }
}
