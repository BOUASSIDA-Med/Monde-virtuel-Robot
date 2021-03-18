/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.robot;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author bouassida
 */
public class InterfaceMonde extends JFrame {
/* 
*
*Variables Interface
*   
*/   
private Monde M = new Monde();  
private boolean PollueurActive=false;
private boolean NettoyerActive=false;
private boolean PollueurSActive=false;
private int i=0;
private int j=0;
private int k=0;
private int l=0;
/*
*
*Conteneurs
*
*
*/
// Conteneurs Matrice (Centre)
private	JPanel PMC = new JPanel(new GridLayout(10,10));
// Conteneurs Haut
private JPanel PBN = new JPanel(new GridLayout());

/*
*
*Menu
*
*/
private JMenuBar menubar =new JMenuBar();
private JMenu menu= new JMenu("EDITION");
private JMenu menu1=new JMenu("MONDE");
private JMenuItem menuItem1=new JMenuItem("New");
private JMenuItem menuItem2=new JMenuItem("Quit");   
private JMenuItem menuItem3=new JMenuItem("Nettoyer"); 
private JMenuItem menuItem4=new JMenuItem("Polluer"); 
/*
*
*Bouton Conteneurs Gauche
*
*/
private JPanel PBW = new JPanel(new GridLayout(5,1));
// 3 Pollueurs
private JButton BWPD = new JButton("Pollueur Tous Droit");
private JButton BWPS = new JButton("Pollueur Sauteur");
private JButton BWPL = new JButton("Pollueur libre");
// 4 Boutons Directions
private JPanel PD1 = new JPanel(new BorderLayout(1,5));
private JButton BWPDD1 = new JButton("Droite");
private JButton BWPDG1 = new JButton("Gauche");
private JButton BWPDH1 = new JButton("Haut");
private JButton BWPDB1 = new JButton("Bas");
// 2 Zones de Textes et 2 Boutons
private JPanel PZ1 = new JPanel(new BorderLayout(1,1));
private JTextField POSX1 = new JTextField(2);
private JTextField POSY1 = new JTextField(2);
private JButton BWPZD1 = new JButton("Deplacer");
private JButton BWPZP1 = new JButton("Position");
/*
*
* Bouton Conteneurs Droite
*
*/
private JPanel PBE = new JPanel(new GridLayout(5,1));
/*3 Nettoyeur*/
private JButton BEND = new JButton("Nettoyeur Tous Droit");
private JButton BENS = new JButton("Nettoyeur Smart");
private JButton BENL = new JButton("Nettoyeur libre");
/*4 Boutons Directions*/
private JPanel PD2 = new JPanel(new BorderLayout(1,5));
private JButton BEPDD2 = new JButton("Droite");
private JButton BEPDG2 = new JButton("Gauche");
private JButton BEPDH2 = new JButton("Haut");
private JButton BEPDB2 = new JButton("Bas");
/*2 Zones de Textes et 2 Boutons*/
private JPanel PZ2 = new JPanel(new BorderLayout(1,1));
private JTextField POSX2 = new JTextField(2);
private JTextField POSY2 = new JTextField(2);
private JButton BEPZD2 = new JButton("Deplacer");
private JButton BEPZP2 = new JButton("Position");

    public InterfaceMonde() {
       /*
        *
        * Add Conteneurs et Composants
        *
        */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(1000, 1000, 1000, 1000);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
 
        /*
        *
        * Add Menu
        *
        */
        
        menubar.add(menu);
        menubar.add(menu1);
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu1.add(menuItem3);
        menu1.add(menuItem4);
        setJMenuBar(menubar);
       
        
        /*
        *
        *Add Bouton Conteneurs Gauche
        *
        */
        
        // Add 4 Boutons Directions
        
        PD1.add("East",BWPDD1);
        PD1.add("West",BWPDG1);
        PD1.add("North",BWPDH1);
        PD1.add("South",BWPDB1);
     
       //Add 2 Zones de Textes et 2 Boutons
        
        PZ1.add("West",POSX1);
        PZ1.add("Center",POSY1);
        PZ1.add("East",BWPZD1);
        PZ1.add("South",BWPZP1);
        
        //Add 3 Pollueurs
        
        PBW.add(BWPD);
        PBW.add(BWPS);
        PBW.add(BWPL);
        PBW.add("West",PD1);
        PBW.add(PZ1); 
        
        /*
        *
        *Add Bouton Conteneurs Droite
        *
        */
        
        // Add 4 Boutons Directions
        
        PD2.add("East",BEPDD2);
        PD2.add("West",BEPDG2);
        PD2.add("North",BEPDH2);
        PD2.add("South",BEPDB2);
     
        //Add 2 Zones de Textes et 2 Boutons
        
        PZ2.add("West",POSX2);
        PZ2.add("Center",POSY2);
        PZ2.add("East",BEPZD2);
        PZ2.add("South",BEPZP2);
        
        //Add 3 Nettoyeurs
        
        PBE.add(BEND);
        PBE.add(BENS);
        PBE.add(BENL);
        PBE.add("West",PD2);
        PBE.add(PZ2); 
        
        /*
        *
        * ACTION MENU
        *
        */
        
        // ACTION NEW
        
            menuItem1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                contentPane.add( "East",PBE );	
                contentPane.add("West", PBW );
                contentPane.add("Center", PMC );
                contentPane.add("North", PBN );
                RefMonde();                        
                }
            });
            
        // ACTION QUIT
        
            menuItem2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        e.getSource();
                        System.exit(0);
                }
            });
            
        // ACTION NETTOYEUR
        
            menuItem3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    RobotNettoyeur RN=new RobotNettoyeur ();
                    RN.Parcourir(M);
                    RefMonde();
                }
            }); 
            
        // ACTION POLLUEUR   
        
            menuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            RobotPollueur RP=new RobotPollueur ();
            RP.Parcourir(M);
            RefMonde();
                }
            });   
            
        /*
        *
        * ACTION ROBOT POLLUEUR
        *
        */
                
        // POLLUEUR TOUT DROIT 
        
            BWPD.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    RobotPollueurToutDroit RPD=new RobotPollueurToutDroit();
                    RPD.RPColonne(M);
                    RefMonde();
                    }
            });
        
        //POLLUEUR SAUTEUR
            
            BWPS.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PollueurSActive=true;
                    PollueurActive=false;
                    BWPL.setBackground(Color.red);
                    BWPS.setBackground(Color.green);
                    RobotPollueurSauteurs RS=new RobotPollueurSauteurs();

                    try {
                        ++i;
                        ++i;
                        RS.DeplaceRobot(i,j);
                    } catch (ErrMonde ex) {
                        Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                        --i;
                        --i;
                    }
                    RS.Parcourir(M);
                    RefMonde();          
                }
            });  
            
        // POLLUEUR LIBRE
        
            BWPL.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PollueurSActive=false;
                    PollueurActive=true;
                    BWPL.setBackground(Color.green);
                    BWPS.setBackground(Color.red);
                    
                    RobotPollueurLibre RP=new RobotPollueurLibre ();
                    try {
                        i++;
                        RP.DeplaceRobot(i,j);
                    } catch (ErrMonde ex) {
                        Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                        i--;
                    }

                    RP.Parcourir(M);
                    RefMonde();
                }
            });
        /*
        *
        * ACTION DIRECTION ROBOT POLLUEUR
        *
        */ 
        
        // DROITE
        
            BWPDD1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (PollueurActive){
                        
                        RobotPollueurLibre RP=new RobotPollueurLibre ();
                        try {
                            ++j;
                            RP.DeplaceRobot(i,j);
                        } catch (ErrMonde ex) {
                            Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                            --j;
                        }
                        RP.Parcourir(M);
                        RefMonde();
                    }
                    if (PollueurSActive){
                       
                       RobotPollueurSauteurs RS=new RobotPollueurSauteurs();
                        try {
                            j=j+2;
                            RS.DeplaceRobot(i,j);
                        } catch (ErrMonde ex) {
                            Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                            j=j-2;
                        }
                       RS.Parcourir(M);
                       RefMonde();
                    }
                }
            });
        
        // GAUCHE
        
            BWPDG1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (PollueurActive){
                       
                        RobotPollueurLibre RP=new RobotPollueurLibre ();
                        try {
                             --j;
                            RP.DeplaceRobot(i,j);
                            
                        } catch (ErrMonde ex) {
                            Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                            ++j;
                        }
                        RP.Parcourir(M);
                        RefMonde();
                    }
                    if (PollueurSActive){
                        
                        RobotPollueurSauteurs RS=new RobotPollueurSauteurs();
                        try {
                            j=j-2;
                            RS.DeplaceRobot(i,j);
                        } catch (ErrMonde ex) {
                            Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                            j=j+2;
                        }
                        RS.Parcourir(M);
                        RefMonde();
                    }        
                }
            });
         
        // HAUT
    
            BWPDH1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {	
                    if (PollueurActive){
                        
                        RobotPollueurLibre RP=new RobotPollueurLibre ();
                        try {
                            --i;
                            RP.DeplaceRobot(i,j);
                        } catch (ErrMonde ex) {
                            Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                            ++i;
                        }
                        RP.Parcourir(M);
                        RefMonde();      
                    }
                    if (PollueurSActive){
                        
                        RobotPollueurSauteurs RS=new RobotPollueurSauteurs();
                        try {
                            i=i-2;
                            RS.DeplaceRobot(i,j);
                        } catch (ErrMonde ex) {
                            Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                            i=i+2;
                        }
                        RS.Parcourir(M);
                        RefMonde();
                    } 
                }
            });
            
        // BAS    
            BWPDB1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  if (PollueurActive){
                        
                        RobotPollueurLibre RP=new RobotPollueurLibre ();
                      try {
                          ++i;
                          RP.DeplaceRobot(i,j);
                      } catch (ErrMonde ex) {
                          Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                          --i;
                      }
                        RP.Parcourir(M);
                        RefMonde();
                    }
                    if (PollueurSActive){
                        
                        RobotPollueurSauteurs RS=new RobotPollueurSauteurs();
                      try {
                          i=i+2;
                          RS.DeplaceRobot(i,j);
                      } catch (ErrMonde ex) {
                          Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                          i=i-2;
                      }
                        RS.Parcourir(M);
                        RefMonde();
                    }  
                }
            });
            
        // TEXT DEPLACER 
        
            BWPZD1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                     RobotPollueurLibre RP=new RobotPollueurLibre ();
                     String x = POSX1.getText();
                     String y = POSY1.getText();
                     i=Integer.parseInt(x);
                     j=Integer.parseInt(y);
                    try {
                        RP.DeplaceRobot(i,j);
                    } catch (ErrMonde ex) {
                        Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     RP.Parcourir(M);
                     RefMonde();
                }
            });
    
        // TEXT POSTION   
    
            BWPZP1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   POSX1.setText(String.valueOf(i));
                   POSY1.setText(String.valueOf(j));
                     RefMonde();
                }
            });
        /*
        *
        *ACTION ROBOT NETTOYEUR
        *
        */
        
        // NETTOYEUR TOUT DROIT 
        
            BEND.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    RobotNettoyeurTousDroit RND=new RobotNettoyeurTousDroit();
                    RND.RNColonne(M);
                    RefMonde();
                    }
            });
            
        // NETTOYEUR LIBRE  
        
            BENL.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                   BENL.setBackground(Color.green);
                   BENS.setBackground(Color.red);
                   k++;
                   RobotNettoyeurLibre RN=new RobotNettoyeurLibre ();
                   try {
                       RN.DeplaceRobot(k,l);
                   } catch (ErrMonde ex) {
                       Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   RN.Parcourir(M);
                   RefMonde();
               }
            });
            
        // NETTOYEUR SMART
        
            BENS.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                   BENL.setBackground(Color.red);
                   BENS.setBackground(Color.green);
                   RobotNettoyeurSmart RS=new RobotNettoyeurSmart();
                   try {
                       RS.DeplacerSmart(k,l,M);
                   } catch (ErrMonde ex) {
                       Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   RS.Parcourir(M);
                   k=RS.i1;
                   l=RS.j1;
                   RefMonde();
               }
            });        
        
        
        /*
        *
        *ACTION DIRECTION ROBOT NETTOYEUR
        *
        */ 
        
        // DROITE
        
            BEPDD2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //if (PollueurActive){
                        
                        RobotNettoyeurLibre RN=new RobotNettoyeurLibre ();
                    try {
                        ++l;
                        RN.DeplaceRobot(k,l);
                    } catch (ErrMonde ex) {
                        Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                        l--;
                        l--;
                    }
                    
                        RN.Parcourir(M);
                        RefMonde();
                }
            });
        
        // GAUCHE
        
            BEPDG2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        
                        RobotNettoyeurLibre RN=new RobotNettoyeurLibre ();
                    try {
                        --l;
                        RN.DeplaceRobot(k,l);
                    } catch (ErrMonde ex) {
                        Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                        ++l;
                    }
                        RN.Parcourir(M);
                        RefMonde();
                }
            });
         
        // HAUT
    
            BEPDH2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {	
                        
                        RobotNettoyeurLibre RP=new RobotNettoyeurLibre ();
                    try {
                        --k;
                        RP.DeplaceRobot(k,l);
                    } catch (ErrMonde ex) {
                        Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                        ++k;
                    }
                        RP.Parcourir(M);
                        RefMonde();      
                }
            });
            
        // BAS    
            BEPDB2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        
                        RobotNettoyeurLibre RP=new RobotNettoyeurLibre ();
                    try {
                        ++k;
                        RP.DeplaceRobot(k,l);
                    } catch (ErrMonde ex) {
                        Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                        --k;
                    }
                        RP.Parcourir(M);
                        RefMonde();
                }
            });
            
        // TEXT DEPLACER 
        
            BEPZD2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                     RobotNettoyeurLibre RP=new RobotNettoyeurLibre ();
                     String x = POSX2.getText();
                     String y = POSY2.getText();
                     l=Integer.parseInt(x);
                     k=Integer.parseInt(y);
                    try {
                        RP.DeplaceRobot(k,l);
                    } catch (ErrMonde ex) {
                        Logger.getLogger(InterfaceMonde.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     RP.Parcourir(M);
                     RefMonde();
                }
            });
    
        // TEXT POSTION   
    
            BEPZP2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   POSX2.setText(String.valueOf(k));
                   POSY2.setText(String.valueOf(l));
                     RefMonde();
                }
            });        
    }
    
    
    
    
    
    
    
    
    public void RefMonde() {     

        PMC.removeAll();
        PBN.removeAll();
        JButton NPD = new JButton("Nombre De Papiers Gras:"+ M.NombrePapierGras());
        PBN.add("Center",NPD);  
            for(int i =0 ;i<10;i++) {
                for(int j =0 ;j<10;j++) {
                    String k;
                    k=i+","+j;
                    JToggleButton m = new JToggleButton(k);
                    m.setBackground(SystemColor.textHighlight);
                    m.setSelected(M.MAT[i][j]);
                    m.setForeground(Color.yellow);
                    PMC.setBackground(Color.green);
                    PMC.add(m);	
                }
            }
            
        PMC.updateUI();
        PBN.updateUI();
        
    }
		
public static void main(String[] args) {
					InterfaceMonde frame = new InterfaceMonde();
					frame.setVisible(true);

   }
}