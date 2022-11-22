package JDBC;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java25Aug", "root", "tejassalunkhe@123"); //connection estsblish.
            Scanner sc = new Scanner(System.in);
            int id;
            String name;
            String address;

            System.out.println("Enter the id name and address");
            id= sc.nextInt();
            name= sc.next();
            address=sc.next();

//            String insert = "insert into employee(id,name,address) values(?,?,?)";
            String update = "update employee set name =?,address=? where id = ?";

//            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            PreparedStatement preparedStatement = connection.prepareStatement(update);

            preparedStatement.setString(1,name);
            preparedStatement.setString(2,address);
            preparedStatement.setInt(3,id);

            int count = preparedStatement.executeUpdate();
            System.out.println(count+ "row is inserted");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
