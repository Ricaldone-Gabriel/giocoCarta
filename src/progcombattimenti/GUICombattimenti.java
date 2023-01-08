/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package progcombattimenti;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author gigga
 */
public class GUICombattimenti extends javax.swing.JFrame {

    /**
     * Creates new form GUICombattimenti
     */
    public GUICombattimenti() {
        try {
            img1 = ImageIO.read(new File("src/progcombattimenti/immagini/CartaRobot.png"));
        } catch (IOException ex) {
            Logger.getLogger(GUICombattimenti.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barraSotto = new javax.swing.JLabel();
        iconaGiocatore = new javax.swing.JLabel();
        FineTurno = new javax.swing.JButton();
        cartaBS = new javax.swing.JPanel();
        attaccoBS = new javax.swing.JLabel();
        vitaBS = new javax.swing.JLabel();
        titoloBS = new javax.swing.JLabel();
        cartaBD = new javax.swing.JPanel();
        attaccoBD = new javax.swing.JLabel();
        vitaBD = new javax.swing.JLabel();
        titoloBD = new javax.swing.JLabel();
        cartaBC = new javax.swing.JPanel();
        attaccoBC = new javax.swing.JLabel();
        vitaBC = new javax.swing.JLabel();
        titoloBC = new javax.swing.JLabel();
        cartaAC = new javax.swing.JPanel();
        attaccoAC = new javax.swing.JLabel();
        vitaAC = new javax.swing.JLabel();
        titoloAC = new javax.swing.JLabel();
        cartaAS = new javax.swing.JPanel();
        attaccoAS = new javax.swing.JLabel();
        vitaAS = new javax.swing.JLabel();
        titoloAS = new javax.swing.JLabel();
        cartaAD = new javax.swing.JPanel();
        attaccoAD = new javax.swing.JLabel();
        vitaAD = new javax.swing.JLabel();
        titoloAD = new javax.swing.JLabel();
        barraSopra = new javax.swing.JLabel();
        iconaIA = new javax.swing.JLabel();
        iniziaGioco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Combattimento");
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(new java.awt.Color(255, 239, 199));

        barraSotto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progcombattimenti/immagini/barra.png"))); // NOI18N

        iconaGiocatore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progcombattimenti/immagini/cornice.png"))); // NOI18N

        FineTurno.setText("Fine turno");
        FineTurno.setEnabled(false);
        FineTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FineTurnoActionPerformed(evt);
            }
        });

        cartaBS.setPreferredSize(new java.awt.Dimension(130, 180));
        cartaBS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cartaBSMousePressed(evt);
            }
        });

        attaccoBS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attaccoBS.setForeground(new java.awt.Color(0, 0, 0));
        attaccoBS.setEnabled(false);
        attaccoBS.setOpaque(true);

        vitaBS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vitaBS.setEnabled(false);
        vitaBS.setOpaque(true);

        titoloBS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titoloBS.setEnabled(false);

        javax.swing.GroupLayout cartaBSLayout = new javax.swing.GroupLayout(cartaBS);
        cartaBS.setLayout(cartaBSLayout);
        cartaBSLayout.setHorizontalGroup(
            cartaBSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartaBSLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(attaccoBS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(vitaBS)
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartaBSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titoloBS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cartaBSLayout.setVerticalGroup(
            cartaBSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartaBSLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(titoloBS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cartaBSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attaccoBS)
                    .addComponent(vitaBS))
                .addGap(5, 5, 5))
        );

        cartaBD.setPreferredSize(new java.awt.Dimension(130, 180));
        cartaBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cartaBDMousePressed(evt);
            }
        });

        attaccoBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attaccoBD.setForeground(new java.awt.Color(0, 0, 0));
        attaccoBD.setEnabled(false);
        attaccoBD.setOpaque(true);

        vitaBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vitaBD.setEnabled(false);
        vitaBD.setOpaque(true);

        titoloBD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titoloBD.setEnabled(false);

        javax.swing.GroupLayout cartaBDLayout = new javax.swing.GroupLayout(cartaBD);
        cartaBD.setLayout(cartaBDLayout);
        cartaBDLayout.setHorizontalGroup(
            cartaBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartaBDLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(attaccoBD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(vitaBD)
                .addGap(7, 7, 7))
            .addGroup(cartaBDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titoloBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cartaBDLayout.setVerticalGroup(
            cartaBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartaBDLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(titoloBD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cartaBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attaccoBD)
                    .addComponent(vitaBD))
                .addGap(5, 5, 5))
        );

        cartaBC.setPreferredSize(new java.awt.Dimension(130, 180));
        cartaBC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cartaBCMousePressed(evt);
            }
        });

        attaccoBC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attaccoBC.setForeground(new java.awt.Color(0, 0, 0));
        attaccoBC.setEnabled(false);
        attaccoBC.setOpaque(true);

        vitaBC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vitaBC.setEnabled(false);
        vitaBC.setOpaque(true);

        titoloBC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titoloBC.setEnabled(false);

        javax.swing.GroupLayout cartaBCLayout = new javax.swing.GroupLayout(cartaBC);
        cartaBC.setLayout(cartaBCLayout);
        cartaBCLayout.setHorizontalGroup(
            cartaBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartaBCLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(attaccoBC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(vitaBC)
                .addGap(7, 7, 7))
            .addGroup(cartaBCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titoloBC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cartaBCLayout.setVerticalGroup(
            cartaBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartaBCLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(titoloBC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(cartaBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attaccoBC)
                    .addComponent(vitaBC))
                .addGap(5, 5, 5))
        );

        cartaAC.setPreferredSize(new java.awt.Dimension(130, 180));
        cartaAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cartaACMousePressed(evt);
            }
        });

        attaccoAC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attaccoAC.setForeground(new java.awt.Color(0, 0, 0));
        attaccoAC.setEnabled(false);
        attaccoAC.setOpaque(true);

        vitaAC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vitaAC.setEnabled(false);
        vitaAC.setOpaque(true);

        titoloAC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titoloAC.setEnabled(false);

        javax.swing.GroupLayout cartaACLayout = new javax.swing.GroupLayout(cartaAC);
        cartaAC.setLayout(cartaACLayout);
        cartaACLayout.setHorizontalGroup(
            cartaACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartaACLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(attaccoAC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(vitaAC)
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartaACLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titoloAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cartaACLayout.setVerticalGroup(
            cartaACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartaACLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(titoloAC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cartaACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attaccoAC)
                    .addComponent(vitaAC))
                .addGap(5, 5, 5))
        );

        cartaAS.setPreferredSize(new java.awt.Dimension(130, 180));
        cartaAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cartaASMousePressed(evt);
            }
        });

        attaccoAS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attaccoAS.setForeground(new java.awt.Color(0, 0, 0));
        attaccoAS.setEnabled(false);
        attaccoAS.setOpaque(true);

        vitaAS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vitaAS.setEnabled(false);
        vitaAS.setOpaque(true);

        titoloAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titoloAS.setEnabled(false);

        javax.swing.GroupLayout cartaASLayout = new javax.swing.GroupLayout(cartaAS);
        cartaAS.setLayout(cartaASLayout);
        cartaASLayout.setHorizontalGroup(
            cartaASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartaASLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(attaccoAS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(vitaAS)
                .addGap(7, 7, 7))
            .addGroup(cartaASLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titoloAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cartaASLayout.setVerticalGroup(
            cartaASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartaASLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(titoloAS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(cartaASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attaccoAS)
                    .addComponent(vitaAS))
                .addGap(5, 5, 5))
        );

        cartaAD.setPreferredSize(new java.awt.Dimension(130, 180));
        cartaAD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cartaADMousePressed(evt);
            }
        });

        attaccoAD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attaccoAD.setForeground(new java.awt.Color(0, 0, 0));
        attaccoAD.setEnabled(false);
        attaccoAD.setOpaque(true);

        vitaAD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vitaAD.setEnabled(false);
        vitaAD.setOpaque(true);

        titoloAD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titoloAD.setEnabled(false);

        javax.swing.GroupLayout cartaADLayout = new javax.swing.GroupLayout(cartaAD);
        cartaAD.setLayout(cartaADLayout);
        cartaADLayout.setHorizontalGroup(
            cartaADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartaADLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(attaccoAD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(vitaAD)
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartaADLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titoloAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cartaADLayout.setVerticalGroup(
            cartaADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartaADLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(titoloAD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(cartaADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attaccoAD)
                    .addComponent(vitaAD))
                .addGap(5, 5, 5))
        );

        barraSopra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progcombattimenti/immagini/barra.png"))); // NOI18N

        iconaIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progcombattimenti/immagini/corniceAI.png"))); // NOI18N

        iniziaGioco.setText("Inizia gioco");
        iniziaGioco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniziaGiocoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(barraSotto, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(iconaGiocatore))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconaIA)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(barraSopra)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cartaAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85)
                                        .addComponent(cartaAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(cartaAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cartaBS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85)
                                        .addComponent(cartaBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(cartaBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FineTurno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iniziaGioco)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(barraSopra)
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartaAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cartaAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cartaAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(iconaIA))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FineTurno)
                    .addComponent(iniziaGioco))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cartaBC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaBS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconaGiocatore, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barraSotto, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
        ImageIcon icona = new ImageIcon("src/progcombattimenti/immagini/barra.png"); //funziona per cambiare immagine
        jLabel13.setIcon(icona);
    */
    boolean[] cartaG = {false, false, false};
    boolean[] cartaAI = {false, false, false};
    boolean turnoG = true;
    Carta[] mazzoG = new Carta[3];
    Carta[] mazzoAI = new Carta[3];
    String ambiente = "";
    static BufferedImage img1;
    
    private void FineTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FineTurnoActionPerformed
        int rand;
        int i = 0, j = 0;
        if (turnoG) {
            while (!cartaG[i] && i < 2) {
                i++;
            }
            while (!cartaAI[j] && j < 2) {
                j++;
            } 

            mazzoG[i].attacco(mazzoAI[j], ambiente);

        } else {
            while (!cartaG[i] && i < 2) {
                i++;
            } 
            while (!cartaAI[j] && j < 2){
                j++;
            } 

            mazzoAI[j].attacco(mazzoG[i], ambiente);
        }
        
        cartaG[0] = false;
        cartaG[1] = false;
        cartaG[2] = false;
        
        cartaAI[0] = false;
        cartaAI[1] = false;
        cartaAI[2] = false;
        
        disegna();
        
        turnoG = !turnoG;
        if (turnoG) {
            cambiaAmbiente();
        }
    }//GEN-LAST:event_FineTurnoActionPerformed

    private void cartaBSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartaBSMousePressed
        // TODO add your handling code here:
        cartaG[0] = true;
        cartaG[1] = false;
        cartaG[2] = false;
    }//GEN-LAST:event_cartaBSMousePressed

    private void cartaBCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartaBCMousePressed
        // TODO add your handling code here:
        cartaG[0] = false;
        cartaG[1] = true;
        cartaG[2] = false;
    }//GEN-LAST:event_cartaBCMousePressed

    private void cartaBDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartaBDMousePressed
        // TODO add your handling code here:
        cartaG[0] = false;
        cartaG[1] = false;
        cartaG[2] = true;
    }//GEN-LAST:event_cartaBDMousePressed

    private void cartaASMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartaASMousePressed
        // TODO add your handling code here:
        cartaAI[0] = true;
        cartaAI[1] = false;
        cartaAI[2] = false;
    }//GEN-LAST:event_cartaASMousePressed

    private void cartaACMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartaACMousePressed
        // TODO add your handling code here:
        cartaAI[0] = false;
        cartaAI[1] = true;
        cartaAI[2] = false;
    }//GEN-LAST:event_cartaACMousePressed

    private void cartaADMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartaADMousePressed
        // TODO add your handling code here:
        cartaAI[0] = false;
        cartaAI[1] = false;
        cartaAI[2] = true;
    }//GEN-LAST:event_cartaADMousePressed

    private void iniziaGiocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniziaGiocoActionPerformed
        // TODO add your handling code here:
        int rand;
        cambiaAmbiente();
        Graphics g1, g2, g3, g4, g5, g6;
        g6 = cartaAS.getGraphics();
        g5 = cartaAC.getGraphics();
        g4 = cartaAD.getGraphics();
        g3 = cartaBS.getGraphics();
        g2 = cartaBC.getGraphics();
        g1 = cartaBD.getGraphics();
        
        ImageIcon icona = new ImageIcon("src/progcombattimenti/immagini/barra.png");
   

        for (int i = 0; i < 3; i++) {
            rand = (int) (Math.random() * 5);
            switch (rand) {
                case 0:
                    mazzoG[i] = new Carta("Giovanni", 8, 4, "terra");
                    break;
                case 1:
                    mazzoG[i] = new Carta("Giovanno", 8, 2, "aria");
                    break;
                case 2:
                    mazzoG[i] = new Carta("Alberto", 5, 4, "acqua");
                    break;
                case 3:
                    mazzoG[i] = new Carta("Davide", 2, 9, "terra");
                    break;
                case 4:
                    mazzoG[i] = new Carta("B4-0", 12, 4, "aria");
                    break;
            }

            rand = (int) (Math.random() * 5);
            switch (rand) {
                case 0:
                    mazzoAI[i] = new Carta("Giovanni", 8, 4, "terra");
                    break;
                case 1:
                    mazzoAI[i] = new Carta("Giovanno", 8, 2, "aria");
                    break;
                case 2:
                    mazzoAI[i] = new Carta("Alberto", 5, 4, "acqua");
                    break;
                case 3:
                    mazzoAI[i] = new Carta("Davide", 2, 9, "terra");
                    break;
                case 4:
                    mazzoAI[i] = new Carta("B4-0", 12, 4, "aria");
                    break;
            }
        }

        disegna();
        iniziaGioco.setEnabled(false);
        FineTurno.setEnabled(true);
    }//GEN-LAST:event_iniziaGiocoActionPerformed
    private void disegna() {
        Graphics g1, g2, g3, g4, g5, g6; 
        g6 = cartaAS.getGraphics();
        g5 = cartaAC.getGraphics();
        g4 = cartaAD.getGraphics();
        g3 = cartaBS.getGraphics();
        g2 = cartaBC.getGraphics();
        g1 = cartaBD.getGraphics();
        try {
            img1 = ImageIO.read(new File("src/progcombattimenti/immagini/CartaRobot.png"));
        } catch (IOException ex) {
            Logger.getLogger(GUICombattimenti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    attaccoBS.setEnabled(false);
                    vitaBS.setEnabled(false);
                    titoloBS.setEnabled(false);
                    
                    g3.drawImage(img1, WIDTH, WIDTH, null);
                    
                    attaccoBS.setEnabled(true);
                    attaccoBS.setText(String.valueOf(mazzoG[i].getAttacco()));
                    
                    vitaBS.setEnabled(true);
                    vitaBS.setText(String.valueOf(mazzoG[i].getVita()));
                    
                    titoloBS.setEnabled(true);
                    titoloBS.setText(String.valueOf(mazzoG[i].getNome()));
                    //cartaBS;
                    break;
                case 1:
                    attaccoBC.setEnabled(false);
                    vitaBC.setEnabled(false);
                    titoloBC.setEnabled(false);
                    
                    g2.drawImage(img1, WIDTH, WIDTH, null);
                    
                    attaccoBC.setEnabled(true);
                    attaccoBC.setText(String.valueOf(mazzoG[i].getAttacco()));
                    
                    vitaBC.setEnabled(true);
                    vitaBC.setText(String.valueOf(mazzoG[i].getVita()));
                    
                    titoloBC.setEnabled(true);
                    titoloBC.setText(String.valueOf(mazzoG[i].getNome()));
                    //cartaBC;
                    break;
                case 2:
                    attaccoBD.setEnabled(false);
                    vitaBD.setEnabled(false);
                    titoloBD.setEnabled(false);
                    
                    g1.drawImage(img1, WIDTH, HEIGHT, null);
                    
                    attaccoBD.setEnabled(true);
                    attaccoBD.setText(String.valueOf(mazzoG[i].getAttacco()));
                    
                    vitaBD.setEnabled(true);
                    vitaBD.setText(String.valueOf(mazzoG[i].getVita()));
                    
                    titoloBD.setEnabled(true);
                    titoloBD.setText(String.valueOf(mazzoG[i].getNome()));     
                    //cartaBD;
                    break;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    attaccoAS.setEnabled(false);
                    vitaAS.setEnabled(false);
                    titoloAS.setEnabled(false);
                    
                    g6.drawImage(img1, WIDTH, WIDTH, null);
                    
                    attaccoAS.setEnabled(true);
                    attaccoAS.setText(String.valueOf(mazzoAI[i].getAttacco()));
                    
                    vitaAS.setEnabled(true);
                    vitaAS.setText(String.valueOf(mazzoAI[i].getVita()));
                    
                    titoloAS.setEnabled(true);
                    titoloAS.setText(String.valueOf(mazzoAI[i].getNome()));
                    //cartaBS;
                    break;
                case 1:
                    attaccoAC.setEnabled(false);
                    vitaAC.setEnabled(false);
                    titoloAC.setEnabled(false);
                    
                    g5.drawImage(img1, WIDTH, WIDTH, null);
                    
                    attaccoAC.setEnabled(true);
                    attaccoAC.setText(String.valueOf(mazzoAI[i].getAttacco()));
                    
                    vitaAC.setEnabled(true);
                    vitaAC.setText(String.valueOf(mazzoAI[i].getVita()));
                    
                    titoloAC.setEnabled(true);
                    titoloAC.setText(String.valueOf(mazzoAI[i].getNome()));
                    //cartaBC;
                    break;
                case 2:
                    attaccoAD.setEnabled(false);
                    vitaAD.setEnabled(false);
                    titoloAD.setEnabled(false);
                    
                    g4.drawImage(img1, WIDTH, HEIGHT, null);
                    
                    attaccoAD.setEnabled(true);
                    attaccoAD.setText(String.valueOf(mazzoAI[i].getAttacco()));
                    
                    vitaAD.setEnabled(true);
                    vitaAD.setText(String.valueOf(mazzoAI[i].getVita()));
                    
                    titoloAD.setEnabled(true);
                    titoloAD.setText(String.valueOf(mazzoAI[i].getNome()));
              
                    //cartaBD;
                    break;
            }
        }   
    }
    
    
    private void cambiaAmbiente() {
        int rand = (int) (Math.random() * 3);
        switch (rand) {
            case 0:
                ambiente = "terra";
                jPanel1.setBackground(new Color(180, 243, 163));
                break;
            case 1:
                ambiente = "aria";
                jPanel1.setBackground(new Color(198, 242, 242));
                break;
            case 2:
                ambiente = "acqua";
                jPanel1.setBackground(new Color(57, 130, 255));
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUICombattimenti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICombattimenti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICombattimenti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICombattimenti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICombattimenti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FineTurno;
    private javax.swing.JLabel attaccoAC;
    private javax.swing.JLabel attaccoAD;
    private javax.swing.JLabel attaccoAS;
    private javax.swing.JLabel attaccoBC;
    private javax.swing.JLabel attaccoBD;
    private javax.swing.JLabel attaccoBS;
    private javax.swing.JLabel barraSopra;
    private javax.swing.JLabel barraSotto;
    private javax.swing.JPanel cartaAC;
    private javax.swing.JPanel cartaAD;
    private javax.swing.JPanel cartaAS;
    private javax.swing.JPanel cartaBC;
    private javax.swing.JPanel cartaBD;
    private javax.swing.JPanel cartaBS;
    private javax.swing.JLabel iconaGiocatore;
    private javax.swing.JLabel iconaIA;
    private javax.swing.JButton iniziaGioco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titoloAC;
    private javax.swing.JLabel titoloAD;
    private javax.swing.JLabel titoloAS;
    private javax.swing.JLabel titoloBC;
    private javax.swing.JLabel titoloBD;
    private javax.swing.JLabel titoloBS;
    private javax.swing.JLabel vitaAC;
    private javax.swing.JLabel vitaAD;
    private javax.swing.JLabel vitaAS;
    private javax.swing.JLabel vitaBC;
    private javax.swing.JLabel vitaBD;
    private javax.swing.JLabel vitaBS;
    // End of variables declaration//GEN-END:variables
}
