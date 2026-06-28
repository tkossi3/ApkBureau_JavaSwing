/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.UtilisateurDao;
import entite.Utilisateur;
import java.util.List;

/**
 *
 * @author tkossi
 */
public class UtilisatuerService {
    
    private final UtilisateurDao dao;
    
    public UtilisatuerService(){
        this.dao = new UtilisateurDao();
    }
    
    public void ajouter (Utilisateur utilisateur){
        
    }
    
    public Utilisateur trouver (int id){
        return null;
    }
    
    public Utilisateur trouver(String identifiant){
        return null;
    }
    
    public Utilisateur modifier(Utilisateur utilisateur){
        return null;
    }
    
    public List<Utilisateur> lister(){
        return null;
    }
    
    public void supprimer(Utilisateur utilisatuer){
        
    }
    
    public void supprimer(int id){
        
    }
    
    public void supprimer(String identifiant){
        
    }
    
}
