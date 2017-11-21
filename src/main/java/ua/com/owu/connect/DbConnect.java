package ua.com.owu.connect;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbConnect {
    private String password = "root";
    private String username = "root";
    private String url = "jdbc:mysql://localhost:3306/db1900";
    Connection connection;

    public DbConnect() {
        try {
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(String username) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO USER (USERNAME) VALUES ('" + username + "')");
            preparedStatement.executeUpdate();
            System.out.println("INSERT INTO USER (USERNAME) VALUES ('?')");
        } catch (SQLException e) {
            e.printStackTrace();
//            connection.rollback();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public List<String> select() {
        List<String> users = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT *FROM USER ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
//                String id = resultSet.getString(1);
//                String name= resultSet.getString(2);
//                String user = id + " " + name;
                String user = resultSet.getString(1) + " " + resultSet.getString(2);
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return users;
    }
}
