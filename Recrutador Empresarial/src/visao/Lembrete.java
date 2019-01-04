/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ConnectionConsulta;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import modelo.ModeloTabela;

/**
 *
 * @author vinicius
 */
public class Lembrete extends javax.swing.JFrame {

    
    ConnectionConsulta conecta = new ConnectionConsulta();
    
    /**
     * Creates new form Lembrete
     */
    public Lembrete() {
        initComponents();
        
       setLocation(720,600);
        conecta.conectaBanco();
        preenchertabela("select * from usuarios where destinatario = 'thais' and recebimento = 'Não recebido' order by id");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAviso = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(646, 124));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Lembrete de baixa!");

        jLabel2.setText("Caso não existam recebimentos desconsiderar!");

        jTableAviso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAviso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAvisoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAviso);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/close_1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(26, 21));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/closecinza.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/closecinza.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1)
                        .addGap(252, 252, 252)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(0, 0, 645, 127);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAvisoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAvisoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableAvisoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0); 
        
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void preenchertabela(String SQL){
        ArrayList dados = new ArrayList();
        
        
        String [] Colunas = new String[]{"ID","EMPRESA","DESCRICAO","DEST","DATA","ENTREGA","RECEBIMENTO"};
        conecta.conectaBanco();
        conecta.executaSQL(SQL);
        try {
           conecta.rs.first(); 
        do{
          dados.add(new Object[]{conecta.rs.getInt("id"),conecta.rs.getString("empresa"),conecta.rs.getString("descricao"),conecta.rs.getString("destinatario"),conecta.rs.getString("data"),conecta.rs.getString("entrega"),conecta.rs.getString("recebimento")});
        }while(conecta.rs.next());
        } catch (SQLException ex) {
            
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableAviso.setModel(modelo);
        jTableAviso.getColumnModel().getColumn(0).setPreferredWidth(48);
        jTableAviso.getColumnModel().getColumn(0).setResizable(false);
        jTableAviso.getColumnModel().getColumn(1).setPreferredWidth(110);
        jTableAviso.getColumnModel().getColumn(1).setResizable(false);
        jTableAviso.getColumnModel().getColumn(2).setPreferredWidth(164);
        jTableAviso.getColumnModel().getColumn(2).setResizable(false);
        jTableAviso.getColumnModel().getColumn(3).setPreferredWidth(70);
        jTableAviso.getColumnModel().getColumn(3).setResizable(false);
        jTableAviso.getColumnModel().getColumn(4).setPreferredWidth(80);
        jTableAviso.getColumnModel().getColumn(4).setResizable(false);
        jTableAviso.getColumnModel().getColumn(5).setPreferredWidth(68);
        jTableAviso.getColumnModel().getColumn(5).setResizable(false);
        jTableAviso.getColumnModel().getColumn(6).setPreferredWidth(98);
        jTableAviso.getColumnModel().getColumn(6).setResizable(false);
        jTableAviso.getTableHeader().setReorderingAllowed(false);
        jTableAviso.setAutoResizeMode(jTableAviso.AUTO_RESIZE_OFF);
        jTableAviso.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
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
            java.util.logging.Logger.getLogger(Lembrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lembrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lembrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lembrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lembrete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAviso;
    // End of variables declaration//GEN-END:variables
}
