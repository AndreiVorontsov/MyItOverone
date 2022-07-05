package level4.lesson7.JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/jdbc.properties"));

        //1
          Class.forName(properties.getProperty("driver-class-name"));
//        //2
        String url = properties.getProperty("url");
        String login =properties.getProperty( "login");
        String password = properties.getProperty("password");
        Connection connection = DriverManager.getConnection(url, login, password);

        //3
        String sql = "select * from person";
        PreparedStatement statement = connection.prepareStatement(sql);

        //4
        statement.execute();

        //5
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int age = resultSet.getInt("age");
            System.out.println(id + "|" + name + "|" + age);
        }
        //6
        resultSet.close();
        statement.close();
        connection.close(); // можно только это
    }
}
