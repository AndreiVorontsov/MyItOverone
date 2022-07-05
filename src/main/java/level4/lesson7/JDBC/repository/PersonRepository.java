package level4.lesson7.JDBC.repository;

import level4.lesson7.JDBC.model.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class PersonRepository {
    // CRUD
    // create read update delete
    public void create(Person person) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("config/jdbc.properties"));

        //1
        Class.forName(properties.getProperty("driver-class-name"));
//        //2
        String url = properties.getProperty("url");
        String login =properties.getProperty( "login");
        String password = properties.getProperty("password");
        Connection connection = DriverManager.getConnection(url, login, password);

        //3
        String sql = "insert into person (name, age) values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, person.name);
        statement.setInt(2, person.age);
        //4
        statement.execute();

        //5
//        ResultSet resultSet = statement.getResultSet();
//        while (resultSet.next()) {
//            int id = resultSet.getInt("id");
//            String name = resultSet.getString("name");
//            int age = resultSet.getInt("age");
//            System.out.println(id + "|" + name + "|" + age);
//        }
        //6
//        resultSet.close();
//        statement.close();
        connection.close(); // можно только это
    }
}
