/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misVentanas;

import misClases.Mozo;
import misClasesLista.ListaLEG;

/**
 *
 * @author Joshephpm
 */
public class miProcesoU extends javax.swing.JPanel {

    /**
     * Creates new form miProcesoU
     */
    ListaLEG<Mozo> listM;
    public miProcesoU() {
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
        jButtonRegresar = new javax.swing.JButton();
        jButtonProcesarPedidos = new javax.swing.JButton();
        jButtonMozoMayorExperiencia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(49, 44, 111));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N

        jButtonRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jButtonProcesarPedidos.setBackground(new java.awt.Color(53, 190, 162));
        jButtonProcesarPedidos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButtonProcesarPedidos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProcesarPedidos.setText("Procesar Pedidos");
        jButtonProcesarPedidos.setBorder(null);
        jButtonProcesarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcesarPedidosActionPerformed(evt);
            }
        });

        jButtonMozoMayorExperiencia.setBackground(new java.awt.Color(53, 190, 162));
        jButtonMozoMayorExperiencia.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButtonMozoMayorExperiencia.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMozoMayorExperiencia.setText("Mozo mayor Experiencia");
        jButtonMozoMayorExperiencia.setBorder(null);
        jButtonMozoMayorExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMozoMayorExperienciaActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonProcesarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(jButtonMozoMayorExperiencia))
                    .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMozoMayorExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProcesarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        myHome v = new myHome();
        v.listM = listM;
        v.setVisible(true);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonProcesarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcesarPedidosActionPerformed
        jTextArea1.setText("");
        /*if () {
            JOptionPane.showMessageDialog(null,"Debe registrar Pedidos");
        }else{*/
            jTextArea1.append(listM.procesarPedidos());
            //}

    }//GEN-LAST:event_jButtonProcesarPedidosActionPerformed

    private void jButtonMozoMayorExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMozoMayorExperienciaActionPerformed
        jTextArea1.setText("");
        /*if (listM.getPrimero().getDato().getPedidos().colaVacia()==true) {
            JOptionPane.showMessageDialog(null,"Debe registrar Pedidos");
        }else{*/
            jTextArea1.append(listM.mozoMayorAñoExp());
            //}
    }//GEN-LAST:event_jButtonMozoMayorExperienciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMozoMayorExperiencia;
    private javax.swing.JButton jButtonProcesarPedidos;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}