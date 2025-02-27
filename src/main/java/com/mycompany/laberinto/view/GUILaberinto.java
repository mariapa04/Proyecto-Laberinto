/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.laberinto.view;

import com.mycompany.laberinto.controller.ControladorPrincipal;
import java.awt.event.KeyListener;

/**
 *
 * @author Paula
 */
public class GUILaberinto extends javax.swing.JFrame {

    /**
     * Creates new form GUILaberinto
     */
//    private ControladorLaberinto controlador; 
    private PanelLaberinto panelLaberinto;
    private ControladorPrincipal controlador;
    private GUIPrincipal guiPrincipal;

    public GUILaberinto(ControladorPrincipal controlador, GUIPrincipal guiPrincipal) {
        initComponents();
        this.controlador = controlador;
        this.guiPrincipal = guiPrincipal;
        
        panelLaberinto = new PanelLaberinto(controlador, guiPrincipal);
        add(panelLaberinto);

        setTitle("Golden Rays");
        setSize(815, 638);
        setLocationRelativeTo(null);
        setResizable(false);

        panelLaberinto.setSize(815, 638);

    }

//    public void escuchar(KeyListener controlador) {
//        this.addKeyListener(controlador);
//    }

    public PanelLaberinto getPanelLaberinto() {
        return panelLaberinto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTerminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTerminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnTerminar.png"))); // NOI18N
        btnTerminar.setText("btnTerminar");
        btnTerminar.setBorderPainted(false);
        btnTerminar.setContentAreaFilled(false);
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnRegresar.png"))); // NOI18N
        btnRegresar.setText("btnRegresar");
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(491, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(381, Short.MAX_VALUE)
                .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        controlador.mostrarGUIPrincipal();
        this.setVisible(false);
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        controlador.mostrarGUIPrincipal();
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnTerminar;
    // End of variables declaration//GEN-END:variables
}
