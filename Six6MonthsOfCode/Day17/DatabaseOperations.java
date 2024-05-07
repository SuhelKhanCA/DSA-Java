import java.sql.*;

public class DatabaseOperations {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Replace with your database connection details
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        // Step 1: Load and register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        // Step 2: Open a connection
        Connection connection = DriverManager.getConnection(url, username, password);

        // Step 3a: Insert data
        String insertSql = "INSERT INTO your_table_name (column1, column2) VALUES (?, ?)";
        PreparedStatement insertStatement = connection.prepareStatement(insertSql);
        insertStatement.setString(1, "value1");
        insertStatement.setString(2, "value2");
        insertStatement.executeUpdate();

        System.out.println("Data inserted successfully!");

        // Step 3b: Retrieve data
        String selectSql = "SELECT * FROM your_table_name";
        Statement selectStatement = connection.createStatement();
        ResultSet resultSet = selectStatement.executeQuery(selectSql);

        System.out.println("Retrieved data:");
        while (resultSet.next()) {
            int id = resultSet.getInt(1); // Assuming the first column is an integer (id)
            String value1 = resultSet.getString(2);
            String value2 = resultSet.getString(3);
            System.out.println("ID: " + id + ", Value 1: " + value1 + ", Value 2: " + value2);
        }

        // Step 4: Close resources (connection, statements, resultset)
        resultSet.close();
        selectStatement.close();
        insertStatement.close();
        connection.close();
    }
}
