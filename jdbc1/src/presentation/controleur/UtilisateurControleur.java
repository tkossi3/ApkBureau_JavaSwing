/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation.controleur;

import entite.Utilisateur;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import presentation.vue.UtilisateurUI;
import service.UtilisatuerService;
import util.ObjetNonTrouveException;

/**
 *
 * @author tkossi
 */
public class UtilisateurControleur {
    
    private final UtilisatuerService service;
    
    public UtilisateurControleur(){
        this.service = new UtilisatuerService();
    }
    
    public void ajouter(){
        Utilisateur utilisateur = new Utilisateur();
        UtilisateurUI utilisateurUI = new UtilisateurUI(utilisateur);
        utilisateurUI.getBoutonEnregistrer().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                utilisateurUI.modifierUtilisateur();
                Utilisateur u = utilisateurUI.getUtilisateur();
                service.ajouter(u);
                utilisateurUI.dispose();
            }
        });
        utilisateurUI.setVisible(true);
    }
    
    public void modifier(int id){
        try {
            Utilisateur utilisateur = service.trouver(id);
            UtilisateurUI utilisateurUI = new UtilisateurUI(utilisateur);
            utilisateurUI.getBoutonEnregistrer().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    utilisateurUI.modifierUtilisateur();
                    Utilisateur u = utilisateurUI.getUtilisateur();
                    service.modifier(u);
                    utilisateurUI.dispose();
                }
            });
            utilisateurUI.setVisible(true);
        } catch (ObjetNonTrouveException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            System.getLogger(UtilisateurControleur.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
}
