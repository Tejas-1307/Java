package JDBC;

import java.sql.*;
import java.util.concurrent.Callable;

public class CallableDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java25Aug","root","tejassalunkhe@123"); //connection estsblish.

        CallableStatement callableStatement = connection.prepareCall(" call getData()");

        ResultSet resultSet = callableStatement.executeQuery();

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));

        }

    }
}
