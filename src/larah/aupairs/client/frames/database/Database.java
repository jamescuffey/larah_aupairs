package larah.aupairs.client.frames.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import larah.aupairs.client.frames.AupairFrame;

/**
 *
 * @author James
 */
public class Database {
    
    private static final String host = "jdbc:mysql://localhost:3306/larah aupairs";
    private static final String username = "root";
    private static final String password = "";
    
    public static void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void writeToAupair() {
        connect();
        
        try {      
            Connection connection = DriverManager.getConnection(host, username, password);
            //Statement statement = connection.createStatement();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO tblaupairs (Name, Surname, Nationality, Telephone, Religion, Profession, Experience, Smoke, Drive, Convictions, SpokenAbility, Swim, Animals, Vegetarian, Children, Medication, Housework, Confident, FirstAid, Flexible) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            statement.setString(1, AupairFrame.username);
            statement.setString(2, AupairFrame.surname);
            statement.setString(3, AupairFrame.nationality);
            statement.setString(4, AupairFrame.telephone);
            statement.setString(5, AupairFrame.religion);
            statement.setString(6, AupairFrame.profession);
            statement.setString(7, AupairFrame.houseworkVariable);
            statement.setString(8, AupairFrame.smoke);
            statement.setString(9, AupairFrame.drive);
            statement.setString(10, AupairFrame.criminal);
            statement.setString(11, AupairFrame.spoken);
            statement.setString(12, AupairFrame.swim);
            statement.setString(13, AupairFrame.animal);
            statement.setString(14, AupairFrame.vegetarian);
            statement.setString(15, AupairFrame.care);
            statement.setString(16, AupairFrame.medication);
            statement.setString(17, AupairFrame.housework);
            statement.setString(18, AupairFrame.charge);
            statement.setString(19, AupairFrame.aid);
            statement.setString(20, AupairFrame.flexible);                                                


            statement.executeUpdate();
            
            statement.close();
            connection.close();
            System.out.println("Wrote to database.");  
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void writeToFamily() {
        
    }
    
    public void readFromAupair() {
        
    }
    
    public void readFromFamily() {
        
    }
 
    
}
