/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercice1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.text.Normalizer;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author tkossi
 */
public class Exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        paGe1();
        
    }
    
    public static void paGe1(){
        JFrame fenetre = new JFrame();
        fenetre.setSize(1200, 700);
        fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel panel1 = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        panel1.setLayout(borderLayout);
        
        
        JPanel panelNord = new JPanel(new BorderLayout());
        panelNord.setBackground(new Color(38, 52, 122));
        panelNord.setPreferredSize(new Dimension(0, 60));
        JLabel labelNord = new JLabel("Connecté : username");
        labelNord.setForeground(Color.WHITE);
        labelNord.setFont(new Font("Sans Sérif", Font.PLAIN, 20));
        labelNord.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
        panelNord.add(labelNord, BorderLayout.EAST);
        
        
        JPanel panelCentre = new JPanel(new BorderLayout());
        panelCentre.setBackground(new Color(245, 245, 245));
        JLabel labelCentre = new JLabel("Titre de page 1");
        labelCentre.setBorder(BorderFactory.createEmptyBorder(15, 15, 10, 15));
        labelCentre.setFont(new Font("Sans Sérif", Font.PLAIN, 26));
        labelCentre.setForeground(Color.BLACK);
        panelCentre.add(labelCentre, BorderLayout.PAGE_START);
        
//        JButton panelEst = new JButton("Bouton Est");

        JPanel panelOuest = new JPanel(new BorderLayout());
        panelOuest.setPreferredSize(new Dimension(250, 0));
        panelOuest.setLayout(new BoxLayout(panelOuest, BoxLayout.Y_AXIS));
        panelOuest.setBackground(new Color(220, 220, 220));
        JLabel labelOuest = new JLabel("Menu");
        labelOuest.setFont(new Font("Sans Sérif", Font.PLAIN, 30));
        labelOuest.setBorder(BorderFactory.createEmptyBorder(15, 15, 10, 0));
        panelOuest.add(labelOuest);
        panelOuest.add(labelOuest, BorderLayout.WEST);
        
        for (int i=1; i<=5; i++) {
            JLabel item = new JLabel("Page "+ i);
            item.setFont(new Font("Sans Sérif", Font.PLAIN, 22));
            item.setBorder(BorderFactory.createEmptyBorder(3, 15, 0, 0));
            panelOuest.add(item);
        }
        
        
        JPanel panelSud = new JPanel();
        panelSud.setBackground(new Color(201, 217, 247));
        panelSud.setPreferredSize(new Dimension(0, 60));
        JLabel labelSud = new JLabel("© copyright ...", SwingConstants.CENTER);
        labelSud.setFont(new Font("Sans Sérif", Font.PLAIN, 28));
        labelSud.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        labelSud.setForeground(new Color(90, 90, 90));
        panelSud.add(labelSud, BorderLayout.CENTER);
        
        
        panel1.add(panelCentre);
//        panel1.add(panelEst, BorderLayout.EAST);
        panel1.add(panelOuest, BorderLayout.WEST);
        panel1.add(panelSud, BorderLayout.SOUTH);
        panel1.add(panelNord, BorderLayout.NORTH);

        fenetre.add(panel1);
        fenetre.setVisible(true);
    }
}
