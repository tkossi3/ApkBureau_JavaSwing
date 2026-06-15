/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author tkossi
 */
public class Jdbc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        connexionUtilisateur();
    }
    
    private static void connexionUtilisateur(){
        String login = "toto";
//        String motDePasse = "123123";
        String motDePasse = "1' OR '1' = '1";
        Connection connexion = getConnection();
        String sql = "SELECT * FROM utilisateurs WHERE identifiant = '" + login + "' "
                + "AND mot_de_passe = '" + motDePasse + "';";
        System.out.println(sql);
        try {
            Statement etat = connexion.createStatement();
            ResultSet resultat = etat.executeQuery(sql);
            if(resultat.next()){
                System.out.println("Connexion effectuée avec succès.");
            }else{
                System.out.println("Identifiant ou mot de passe incorrect.");
            }
            etat.close();
            connexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }
    
    private static void trouver(){
        Connection connexion = getConnection();
        String sql = "SELECT * FROM utilisateurs WHERE id = 1;";
        try {
            Statement etat = connexion.createStatement();
            ResultSet resultat = etat.executeQuery(sql);
            if(resultat.next()){
                System.out.println("Id = " + resultat.getString(1));
                System.out.println("Identifiant = " + resultat.getString(2));
            }
            etat.close();
            connexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }
    
    private static void ajouter(){
        Connection connexion = getConnection();
        String sql = "INSERT INTO utilisateurs(identifiant, mot_de_passe)"
                + "VALUES ('user3', '123123');";
        try {
            Statement etat = connexion.createStatement();
            etat.execute(sql);
            etat.close();
            connexion.close();
            
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static Connection getConnection(){
        String url = "jdbc:postgresql://localhost:5432/jdbc";
        String login = "jdbc";
        String motDePasse = "123456789";
        try{
            java.sql.Connection connexion = java.sql.DriverManager.getConnection(url, login, motDePasse);
            //System.out.println("Connexion effectuée avec succès");
            return connexion;
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
