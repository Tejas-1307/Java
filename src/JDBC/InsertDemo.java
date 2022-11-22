package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java25Aug","root","tejassalunkhe@123"); //connection estsblish.

        Statement statement = connection.createStatement();

//        String insert = "insert into employee (id,name,address) values(2,'Amit','Mumbai')";

//        String update = "update employee set name = 'Ravi' where id = '2'";

        String delete = "delete from employee where id = 2";

//        int count = statement.executeUpdate(insert);
//        int count = statement.executeUpdate(update);
        int count = statement.executeUpdate(delete);

//        System.out.println(count+"row is inserted");
//        System.out.println(count+"row is updated");
        System.out.println(count + "row is delete");
    }
}

//ddl => create alter drop
//dml => insert update delete
//dql => select
