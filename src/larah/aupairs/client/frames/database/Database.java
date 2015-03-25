package larah.aupairs.client.frames.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import larah.aupairs.client.Constants;
import larah.aupairs.client.frames.AupairFrame;
import larah.aupairs.client.frames.FamilyFrame;

/**
 *
 * @author James
 */
public class Database {
    
    
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
            Connection connection = DriverManager.getConnection(Constants.HOST, Constants.USERNAME, Constants.PASSWORD);
            //Statement statement = connection.createStatement();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO tblaupairs (Name, Surname, Nationality, Telephone, Religion, Profession, Experience, Smoke, Drive, Convictions, SpokenAbility, Swim, Animals, Vegetarian, Children, Medication, Housework, Confident, FirstAid, Flexible, Id) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
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
            statement.setInt(21, AupairFrame.id);


            statement.executeUpdate();
            
            statement.close();
            connection.close();
            System.out.println("Wrote to aupair database.");  
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
     
    public static void writeToFamily() {
        connect();
        
        try {      
            Connection connection = DriverManager.getConnection(Constants.HOST, Constants.USERNAME, Constants.PASSWORD);
            //Statement statement = connection.createStatement();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO tblfamilies (Name, Telephone, Address, Information, Hours, Driver, Nationality, Smoker, Animals, FirstAid, Children, Id) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            
            statement.setString(1, FamilyFrame.familyName);
            statement.setString(2, FamilyFrame.familyTelephone);
            statement.setString(3, FamilyFrame.familyAddress);
            statement.setString(4, FamilyFrame.additionalInformation);
            statement.setString(5, FamilyFrame.requiredHours);
            statement.setString(6, FamilyFrame.driver);
            statement.setString(7, FamilyFrame.nationality);
            statement.setString(8, FamilyFrame.smoker);
            statement.setString(9, FamilyFrame.animalFriendly);
            statement.setString(10, FamilyFrame.firstAidFamiliar);
            statement.setString(11, FamilyFrame.childrenToCare);   
            statement.setInt(12, FamilyFrame.id);


            statement.executeUpdate();
            
            statement.close();
            connection.close();
            System.out.println("Wrote to family database.");  
        } catch(SQLException e) {
            e.printStackTrace();
        }     
    }
    
    public static void writeToMatch(Date dateMatched, int matchId, String aupairName, String familyName) {
        connect();
        
        try {      
            Connection connection = DriverManager.getConnection(Constants.HOST, Constants.USERNAME, Constants.PASSWORD);
            //Statement statement = connection.createStatement();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO tblmatches (DateMatched, MatchId, AupairName, FamilyName) VALUES(?,?,?,?)");
            
            statement.setDate(1, new java.sql.Date( dateMatched.getTime()));
            statement.setInt(2, matchId);
            statement.setString(3, aupairName);
            statement.setString(4, familyName);

            statement.executeUpdate();
            
            statement.close();
            connection.close();
            System.out.println("Wrote to match database.");  
        } catch(SQLException e) {
            e.printStackTrace();
        }     
    }
    
}
