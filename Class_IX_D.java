/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOULINDU KUNDU
 */
public class Class_IX_D extends javax.swing.JFrame {

    /**
     * Creates new form Class_IX_D
     */
    public Class_IX_D() {
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

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Regn. No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Additional");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mechanics", "Physics", "WPS" }));
        jComboBox2.setSelectedIndex(-1);

        jTextField1.setEditable(false);
        jTextField1.setText(" ");

        jTextField2.setEditable(false);
        jTextField2.setText(" ");

        jButton1.setText("Display");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Select the roll no.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int  b = -1; 
        String a;
        a = (String) jComboBox1.getSelectedItem();
        switch (a)
        {
            case "1": {
                jTextField1.setText("Soumyadeep Naskar");
                jTextField2.setText("8401");
                b = 0;
            } break;
            case "2": {
                jTextField1.setText("Akashdeep karan");
                jTextField2.setText("8404");
                b = 1;
            } break;
            case "3": {
                jTextField1.setText("Koustav Patra");
                jTextField2.setText("8407");
                b = 0;
            } break;
            case "4": {
                jTextField1.setText("Priyankar Sarder");
                jTextField2.setText("8422");
                b = 0;
            } break;
            case "5": {
                jTextField1.setText("Rik Kumer Ghosh");
                jTextField2.setText("8424");
                b = 0;
            } break;
            case "6": {
                jTextField1.setText("Rimon Paul");
                jTextField2.setText("8431");
                b = 1;
            } break;
            case "7": {
                jTextField1.setText("Mainak Manna");
                jTextField2.setText("8462");
                b = 0;
            } break;
            case "8": {
                jTextField1.setText("Sayantan Ghosh");
                jTextField2.setText("8466");
                b = 0;
            } break;
            case "9": {
                jTextField1.setText("Rocky Singh");
                jTextField2.setText("8481");
                b = 1;
            } break;
            case "10": {
                jTextField1.setText("Sourangam Barkandaj");
                jTextField2.setText("8482");
                b = 1;
            } break;
            case "11": {
                jTextField1.setText("Moulindu Kundu");
                jTextField2.setText("8490");
                b = 0;
            } break;
            case "12": {
                jTextField1.setText("Riddhidev Bhaumik");
                jTextField2.setText("8491");
                b = 1;
            } break;
            case "13": {
                jTextField1.setText("Akash Neogi");
                jTextField2.setText("8492");
                b = 2;
            } break;
            case "14": {
                jTextField1.setText("Rakesh Manna");
                jTextField2.setText("8493");
                b = 2;
            } break;
            case "15": {
                jTextField1.setText("Arkadeep Ghosh");
                jTextField2.setText("8494");
                b = 1;
            } break;
            case "16": {
                jTextField1.setText("Tanmoy Mondol");
                jTextField2.setText("8495");
                b = 2;
            } break;
            case "17": {
                jTextField1.setText("Sayantan Sahoo");
                jTextField2.setText("8498");
                b = 1;
            } break;
            case "18": {
                jTextField1.setText("Ritwik Halder");
                jTextField2.setText("8499");
                b = 1;
            } break;
            case "19": {
                jTextField1.setText("Arunava De Sarkar");
                jTextField2.setText("8500");
                b = 1;
            } break;
            case "20": {
                jTextField1.setText("Souvik Bhaduri");
                jTextField2.setText("8505");
                b = 1;
            } break;
            case "21": {
                jTextField1.setText("Sandipan Bhowmik");
                jTextField2.setText("8505");
                b = 0;
            } break;
            case "22": {
                jTextField1.setText("Anirban Bera");
                jTextField2.setText("8506");
                b = 1;
            } break;
            case "23": {
                jTextField1.setText("Saikat Masanta");
                jTextField2.setText("8507");
                b = 1;
            } break;
            case "24": {
                jTextField1.setText("Kanad Debnath");
                jTextField2.setText("8508");
                b = 2;
            } break;
            case "25": {
                jTextField1.setText("Abhishek Mondol");
                jTextField2.setText("8511");
                b = 1;
            } break;
            case "26": {
                jTextField1.setText("Soham Biswas");
                jTextField2.setText("8512");
                b = 0;
            } break;
            case "27": {
                jTextField1.setText("Mayukh Ray Chowdhuri");
                jTextField2.setText("8513");
                b = 0;
            } break;
            case "28": {
                jTextField1.setText("Amritangsu Bhattachariya");
                jTextField2.setText("8514");
                b = 1;
            } break;
            case "29": {
                jTextField1.setText("Prabartak Majumder");
                jTextField2.setText("8517");
                b = 1;
            } break;
            case "30": {
                jTextField1.setText("Mainak Jana");
                jTextField2.setText("8528");
                b = 0;
            } break;
            case "31": {
                jTextField1.setText("Anirban Dhara");
                jTextField2.setText("8531");
                b = 2;
            } break;
            case "32": {
                jTextField1.setText("Kazi Kaium Islam");
                jTextField2.setText("8532");
                b = 2;
            } break;
            case "33": {
                jTextField1.setText("Souvik Ghoshal");
                jTextField2.setText("8539");
                b = 0;
            } break;
            case "34": {
                jTextField1.setText("Shankhyan Dutta");
                jTextField2.setText("8541");
                b = 0;
            } break;
            case "35": {
                jTextField1.setText("Rahul Sarkar");
                jTextField2.setText("8544");
                b = 0;
            } break;
            default : {
                jTextField1.setText("Undefined");
            }   
        }
        jComboBox2.setSelectedIndex(b);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jComboBox1.setSelectedIndex(-1);
        jComboBox2.setSelectedIndex(-1);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Class_IX_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Class_IX_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Class_IX_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Class_IX_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Class_IX_D().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
