/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management_system;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author uriel
 */
public class javaconnect {
    /**
     *
     * @return
     */
    public static Connection ConnectrDb(){
try{
//Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
return conn;
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
return null;
}
}


