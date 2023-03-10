/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import SQL.Conexion;

/**
 *
 * @author Det-Pc
 */
public class frmPractica extends javax.swing.JFrame {

    /**
     * Creates new form frmPractica
     */
    Conexion con = new Conexion();
    public frmPractica() {
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

        btnConectar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList<>();
        btnConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btcnConC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConA = new javax.swing.JButton();
        btnConE = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnConF = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnConG = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnConH = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btni1 = new javax.swing.JButton();
        btni2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnConJ = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnConK = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnConM = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnConO = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnConN = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnConP = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnConQ = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnConR = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btnConS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jScrollPane1.setViewportView(lstProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 47, 518, -1));

        btnConsultar.setText("Consultar B,D");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel1.setText("C");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 90, -1));

        btcnConC.setText("Consultar C");
        btcnConC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcnConCActionPerformed(evt);
            }
        });
        getContentPane().add(btcnConC, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel2.setText("B,D");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 100, -1));

        jLabel3.setText("A");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, -1));

        btnConA.setText("Consultar A");
        btnConA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConAActionPerformed(evt);
            }
        });
        getContentPane().add(btnConA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        btnConE.setText("Consultar E");
        btnConE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConEActionPerformed(evt);
            }
        });
        getContentPane().add(btnConE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel4.setText("E");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 90, -1));

        jLabel5.setText("F");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 90, -1));

        btnConF.setText("Consultar F");
        btnConF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConFActionPerformed(evt);
            }
        });
        getContentPane().add(btnConF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, -1));

        jLabel6.setText("G");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 100, -1));

        btnConG.setText("Consultar G");
        btnConG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConGActionPerformed(evt);
            }
        });
        getContentPane().add(btnConG, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 100, -1));

        jLabel7.setText("H");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 90, -1));

        btnConH.setText("Consultar H");
        btnConH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConHActionPerformed(evt);
            }
        });
        getContentPane().add(btnConH, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 100, -1));

        jLabel8.setText("i1 , i2");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        btni1.setText("i1");
        btni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btni1ActionPerformed(evt);
            }
        });
        getContentPane().add(btni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 60, -1));

        btni2.setText("i2");
        btni2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btni2ActionPerformed(evt);
            }
        });
        getContentPane().add(btni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 50, -1));

        jLabel9.setText("J");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 90, -1));

        btnConJ.setText("Consultar J");
        btnConJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConJActionPerformed(evt);
            }
        });
        getContentPane().add(btnConJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel10.setText("K");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 100, -1));

        btnConK.setText("Consultar K");
        btnConK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConKActionPerformed(evt);
            }
        });
        getContentPane().add(btnConK, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 100, -1));

        jLabel11.setText("L");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 80, -1));

        jButton1.setText("Consultar L");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 100, -1));

        jLabel12.setText("M");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 90, -1));

        btnConM.setText("Consultar M");
        btnConM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConMActionPerformed(evt);
            }
        });
        getContentPane().add(btnConM, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        jLabel13.setText("O");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 90, -1));

        btnConO.setText("Consultar O");
        btnConO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConOActionPerformed(evt);
            }
        });
        getContentPane().add(btnConO, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jLabel14.setText("N");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 90, -1));

        btnConN.setText("ConsultarN");
        btnConN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConNActionPerformed(evt);
            }
        });
        getContentPane().add(btnConN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 90, -1));

        jLabel15.setText("P");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 100, -1));

        btnConP.setText("Consultar P");
        btnConP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConPActionPerformed(evt);
            }
        });
        getContentPane().add(btnConP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 100, -1));

        jLabel16.setText("Q");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 110, -1));

        btnConQ.setText("Consultar Q");
        btnConQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConQActionPerformed(evt);
            }
        });
        getContentPane().add(btnConQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 110, -1));

        jLabel17.setText("R");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 90, -1));

        btnConR.setText("ConsultarR");
        btnConR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConRActionPerformed(evt);
            }
        });
        getContentPane().add(btnConR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 90, -1));

        jLabel18.setText("S");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 100, -1));

        btnConS.setText("ConsultarS");
        btnConS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConSActionPerformed(evt);
            }
        });
        getContentPane().add(btnConS, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
    
        con.conection();
        //en caso de querer conectarse sin un boton, agregar esta linea en el constructor
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        con.consultar("nombre,precio", lstProductos, "producto", 2);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btcnConCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcnConCActionPerformed
        con.consultar(lstProductos, "producto");
    }//GEN-LAST:event_btcnConCActionPerformed

    private void btnConAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConAActionPerformed
        con.consultar("nombre", lstProductos, "producto");
    }//GEN-LAST:event_btnConAActionPerformed

    private void btnConEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConEActionPerformed
        con.consultar("id_fabricante", lstProductos, "producto");
    }//GEN-LAST:event_btnConEActionPerformed

    private void btnConFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConFActionPerformed
        con.consultar("id_fabricante", lstProductos, "producto", "id_fabricante");
    }//GEN-LAST:event_btnConFActionPerformed

    private void btnConGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConGActionPerformed
        con.ordenar("nombre", lstProductos, "fabricante", "asc");
    }//GEN-LAST:event_btnConGActionPerformed

    private void btnConHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConHActionPerformed
        con.ordenar("nombre", lstProductos, "fabricante", "desc");
    }//GEN-LAST:event_btnConHActionPerformed

    private void btni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btni1ActionPerformed
        con.ordenar("nombre", lstProductos, "producto", "asc");
    }//GEN-LAST:event_btni1ActionPerformed

    private void btni2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btni2ActionPerformed
        con.ordenar("nombre","precio", lstProductos, "producto", "desc");
    }//GEN-LAST:event_btni2ActionPerformed

    private void btnConJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConJActionPerformed
        con.obtenerFilas(lstProductos, "fabricante", 5);
    }//GEN-LAST:event_btnConJActionPerformed

    private void btnConKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConKActionPerformed
        con.ordenar("nombre,precio", "precio", lstProductos, "producto", "asc", 1);
    }//GEN-LAST:event_btnConKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        con.obtenerFilas("nombre", lstProductos, "producto", "id_fabricante", "=",2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnConMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConMActionPerformed
        con.obtenerFilas("nombre", lstProductos, "producto", "precio", "<=", 120);
    }//GEN-LAST:event_btnConMActionPerformed

    private void btnConNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConNActionPerformed
        con.obtenerFilas("nombre", lstProductos, "producto", "precio", ">=", 400);
    }//GEN-LAST:event_btnConNActionPerformed

    private void btnConOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConOActionPerformed
        con.obtenerFilas("nombre", lstProductos, "producto", "NOT precio", ">=", 400);
    }//GEN-LAST:event_btnConOActionPerformed

    private void btnConPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConPActionPerformed
        con.obtenerFilas("*", lstProductos, "producto", "precio", 80, 300);
    }//GEN-LAST:event_btnConPActionPerformed

    private void btnConQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConQActionPerformed
        con.obtenerFilas("*", lstProductos, "producto", "precio",60 , 200);
    }//GEN-LAST:event_btnConQActionPerformed

    private void btnConRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConRActionPerformed
        con.obtenerFilas("*", lstProductos, "producto", "precio", ">", 200, "id_fabricante", "=", 6);
    }//GEN-LAST:event_btnConRActionPerformed

    private void btnConSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConSActionPerformed
        con.obtenerFilas("*", lstProductos, "producto", "id_fabricante", "=", 1, 3, 5);
    }//GEN-LAST:event_btnConSActionPerformed

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
            java.util.logging.Logger.getLogger(frmPractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPractica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcnConC;
    private javax.swing.JButton btnConA;
    private javax.swing.JButton btnConE;
    private javax.swing.JButton btnConF;
    private javax.swing.JButton btnConG;
    private javax.swing.JButton btnConH;
    private javax.swing.JButton btnConJ;
    private javax.swing.JButton btnConK;
    private javax.swing.JButton btnConM;
    private javax.swing.JButton btnConN;
    private javax.swing.JButton btnConO;
    private javax.swing.JButton btnConP;
    private javax.swing.JButton btnConQ;
    private javax.swing.JButton btnConR;
    private javax.swing.JButton btnConS;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btni1;
    private javax.swing.JButton btni2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstProductos;
    // End of variables declaration//GEN-END:variables
}
