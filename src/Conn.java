

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Styve Ndabo
 */
public class Conn {
     Connection c;
     Statement s;
     
     //MUTATEURS
      void setConn(Connection c){
        this.c = c;
    }
      void setStat(Statement s){
        this.s = s;
    }

    //ACCESSEURS
    Connection getConn(){
        return this.c;
    }

    Statement getStat(){
        return this.s;
    }
    
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");    
            s =c.createStatement();  
          
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}
