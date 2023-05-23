package ie.atu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


class RacerBike extends Motorcycle implements CRUD {
    private int topSpeed;

    public RacerBike(String make, String model, int year, int bhp, String style, String licence_catagory, int topSpeed) {
        super(make, model, year, bhp, style, licence_catagory);
        this.topSpeed = topSpeed;
    }

    // Implementing CRUD operations
    public void create() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/motorcycles", "root", "password")) {
            String query = "INSERT INTO moto (make, model, year, bhp, style, licence_catagory, top_Speed) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, make);
            statement.setString(2, model);
            statement.setInt(3, year);
            statement.setInt(4, bhp);
            statement.setString(5, style);
            statement.setString(6,licence_catagory);
            statement.setInt(7,topSpeed);
            statement.executeUpdate();
            System.out.println("Motorcycle created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void read() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/motorcycles", "root", "password")) {
            String query = "SELECT * FROM moto WHERE make = ? AND model = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, make);
            statement.setString(2, model);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int year = resultSet.getInt("year");
                int bhp = resultSet.getInt("bhp");
                String style = resultSet.getString("style");
                String licence_catagory = resultSet.getString("licence_catagory");
                int topSpeed = resultSet.getInt("top_speed");
                System.out.println("Make: " + make);
                System.out.println("Model: " + model);
                System.out.println("Year: " + year);
                System.out.println("BHP: " + bhp);
                System.out.println("Style: " + style);
                System.out.println("Licence Catagory: " + licence_catagory);
                System.out.println("Top Speed: " + topSpeed);
            } else {
                System.out.println("Motorcycle not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/motorcycles", "root", "password")) {
            String query = "UPDATE moto SET year = ?, bhp = ?, style = ?, licence_catagory = ?, top_speed = ? WHERE make = ? AND model = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, year);
            statement.setInt(2, bhp);
            statement.setString(3, style);
            statement.setString(4, licence_catagory);
            statement.setInt(5, topSpeed);
            statement.setString(6, make);
            statement.setString(7, model);
            //statement.setInt(7, topSpeed);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Motorcycle updated successfully!");
            } else {
                System.out.println("Motorcycle not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/motorcycles", "root", "password")) {
            String query = "DELETE FROM moto WHERE make = ? AND model = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, make);
            statement.setString(2, model);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Motorcycle deleted successfully!");
            } else {
                System.out.println("Motorcycle not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
        }
