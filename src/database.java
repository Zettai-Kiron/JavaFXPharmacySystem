
package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @authors  Jude Kiron Mensah - 10947803
            Teye Elisha - 10940920
            Kelvin Sasu - 10981962
            Eyram Ampobi - 10977614
            Gyamfi Caleb Jeff  - 10967054
            Daniel Elijah Gyan - 10956566
            Koomson Jojo Emeka - 10954302
 */


public class database {
    
    public static Connection connectDb(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agyenkwa", "root", "Jayde1&Afua");
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    
}
