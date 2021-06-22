package fju.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        try {
            //Driver
            Class.forName("org.mariadb.jdbc.Driver");
            //Connection
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/demo?user=root&password=123456&useUnicode=true&characterEncoding=UTF-8");
            Statement statement = connection.createStatement();
//            statement.executeUpdate("insert into students values('00001', 'Hank')");
            //
            ResultSet rs = statement.executeQuery("select * from drinks");
            List<Drink> drinks = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");

                System.out.println(id + "\t" + name + "\t" + price);
                drinks.add(new Drink(id, name, price));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
