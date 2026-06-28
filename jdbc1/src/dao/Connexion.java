/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author tkossi
 */
public class Connexion {
    private static Connection connexion;
    
    static {
        String url = "jdbc:postgresql://localhost:5432/jdbc";
        String login = "jdbc";
        String motDePasse = "123456789";
        try{
            connexion = DriverManager.getConnection(url, login, motDePasse);
            //System.out.println("Connexion effectuée avec succès");
//            return connexion;
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
//            return null;
        }
    }
    
    public static Connection getConnexion(){
        return connexion;
    }
    
}
