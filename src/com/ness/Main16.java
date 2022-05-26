package com.ness;

import java.sql.*;

public class Main16 {

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\databases\\testjava.db");
            //conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Tim2', 656552, 'e@c.com2')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Tim3', 656553, 'e@c.com3')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Tim4', 656554, 'e@c.com4')");
//            statement.execute("UPDATE contacts SET phone=444444 WHERE name='Tim2'");
//            statement.execute("DELETE FROM contacts WHERE name='Tim2'");
            statement.execute("SELECT * FROM contacts");
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + " "
                        + resultSet.getInt("phone") + " " +
                        resultSet.getString("email"));
            }
            resultSet.close();
            statement.close();
            conn.close();
        } catch(SQLException e) {
            System.out.println("something is wrong with DB: " + e.getMessage());
        }

//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\databases\\testjava.db");
//                Statement statement = conn.createStatement();) {
//             statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
//        } catch(SQLException e) {
//            System.out.println("something is wrong with DB: " + e.getMessage());
//        }


    }



}
