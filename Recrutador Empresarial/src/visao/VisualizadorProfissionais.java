/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ConnectionConsulta;
import java.awt.Desktop;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableRowSorter;
import modelo.ModeloTabela;
import modelo.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 *
 * @author vinicius
 */
public class VisualizadorProfissionais extends javax.swing.JFrame {
    
     private final String ruta = System.getProperties().getProperty("user.dir");
      ConnectionConsulta conecta = new ConnectionConsulta();
      Usuario mod = new Usuario();
    /**
     * Creates new form VisualizadoreEx
     */
    public VisualizadorProfissionais() {
        initComponents();
        this.setExtendedState(this.getExtendedState()|VisualizadorProfissionais.MAXIMIZED_BOTH);
        conecta.conectaBanco();
        preenchertabela("select * from clientes order by Person_A_e_B_Encore_2017");
        jTableEstado.setAutoCreateRowSorter(true);
        //ModeloTabela modelo = (ModeloTabela) jTableEstado.getModel();
       //jTableEstado.setRowSorter(new TableRowSorter(modelo)); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldPessoa = new javax.swing.JTextField();
        jTextFieldEmpresa = new javax.swing.JTextField();
        jTextFieldEmprego = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSalario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableEstado.setOpaque(false);
        jScrollPane2.setViewportView(jTableEstado);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));
        jPanel2.setOpaque(false);

        jTextFieldPessoa.setToolTipText("Empresa");
        jTextFieldPessoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPessoaKeyPressed(evt);
            }
        });

        jTextFieldEmpresa.setToolTipText("Descrição");
        jTextFieldEmpresa.setPreferredSize(new java.awt.Dimension(9, 20));
        jTextFieldEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpresaActionPerformed(evt);
            }
        });
        jTextFieldEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmpresaKeyPressed(evt);
            }
        });

        jTextFieldEmprego.setToolTipText("Destinatário");
        jTextFieldEmprego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmpregoKeyPressed(evt);
            }
        });

        jLabel1.setText("Profissional:");

        jLabel2.setText("Empresa:");

        jLabel3.setText("Cargo atual:");

        jLabel4.setText("Salario:");

        jTextFieldSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalarioActionPerformed(evt);
            }
        });
        jTextFieldSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSalarioKeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/xls.png"))); // NOI18N
        jButton1.setText("Criar Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jProgressBar1.setStringPainted(true);

        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user3.png"))); // NOI18N
        Reset.setToolTipText("Resetar");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(670, 670, 670)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(56, 56, 56)))
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(483, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jTextFieldPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reset, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{

            Thread t = new Thread(){
                public void run(){
                    XSSFWorkbook workbook = new XSSFWorkbook();
                    XSSFSheet hoja = workbook.createSheet();

                    XSSFRow fila = hoja.createRow(0);
                    fila.createCell(0).setCellValue("ID");
                    fila.createCell(1).setCellValue("PESSOA");
                    fila.createCell(2).setCellValue("EMPRESA");
                    fila.createCell(3).setCellValue("EMPREGO");
                    fila.createCell(4).setCellValue("SALARIO");
                    fila.createCell(5).setCellValue("TELEFONE_TRABALHO");
                    fila.createCell(6).setCellValue("E-MAIL_TRABALHO");
                    jProgressBar1.setMaximum(jTableEstado.getRowCount());
                    XSSFRow filas;
                    Rectangle rect;
                    for(int i=0; i<jTableEstado.getRowCount(); i++){

                        rect = jTableEstado.getCellRect(i, 0, true);
                        try{
                            jTableEstado.scrollRectToVisible(rect);
                        }catch(java.lang.ClassCastException e){}
                        jTableEstado.setRowSelectionInterval(i, i);
                        jProgressBar1.setValue((i+1));

                        filas = hoja.createRow((i+1));
                        filas.createCell(0).setCellValue(jTableEstado.getValueAt(i, 0).toString());
                        filas.createCell(1).setCellValue(jTableEstado.getValueAt(i, 1).toString());
                        filas.createCell(2).setCellValue(jTableEstado.getValueAt(i, 2).toString());
                        filas.createCell(3).setCellValue(jTableEstado.getValueAt(i, 3).toString());
                        filas.createCell(4).setCellValue(jTableEstado.getValueAt(i, 4).toString());
                        filas.createCell(5).setCellValue(jTableEstado.getValueAt(i, 5).toString());
                        filas.createCell(6).setCellValue(jTableEstado.getValueAt(i, 6).toString());
                        // try{
                            //           Thread.sleep(20);
                            //      } catch (InterruptedException ex){
                            //         Logger.getLogger(Visualizador.class.getName ()).log(Level.SEVERE, null, ex);
                            //     }
                    }
                    jProgressBar1.setValue(0);
                    //jProgressBar1.setString("Abrindo Excel...");
                    //this.dispose();
                    //dispose();
                    try{
                        workbook.write(new FileOutputStream(new File(ruta+"//Excel.xlsx")));
                        Desktop.getDesktop().open(new File(ruta+"//Excel.xlsx"));
                    } catch (Exception ex) {
                        Logger.getLogger(VisualizadorProfissionais.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            };
            t.start();
        }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldSalarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSalarioKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldSalario.getText());
            preenchertabela("select * from clientes where Salary like '%" + jTextFieldSalario.getText() + "%'");
        }
    }//GEN-LAST:event_jTextFieldSalarioKeyPressed

    private void jTextFieldSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalarioActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        jTextFieldPessoa.setText("");
        jTextFieldEmpresa.setText("");
        jTextFieldEmprego.setText("");
        jTextFieldSalario.setText("");
       // jTextField4.setText("");
       // jTextField6.setText("");
        preenchertabela("select * from clientes order by Person_A_e_B_Encore_2017");
    }//GEN-LAST:event_ResetActionPerformed

    private void jTextFieldEmpregoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmpregoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldEmprego.getText());
            preenchertabela("select * from clientes where Titulo_oficial like '%" + jTextFieldEmprego.getText() + "%'");
        }
    }//GEN-LAST:event_jTextFieldEmpregoKeyPressed

    private void jTextFieldEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmpresaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldEmpresa.getText());
            preenchertabela("select * from clientes where Empresa like '%" + jTextFieldEmpresa.getText() + "%'");
            //conecta.desconecta();
        }
    }//GEN-LAST:event_jTextFieldEmpresaKeyPressed

    private void jTextFieldEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpresaActionPerformed

    private void jTextFieldPessoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPessoaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldPessoa.getText());
            preenchertabela("select * from Clientes where Person_A_e_B_Encore_2017 like '%" + jTextFieldPessoa.getText() + "%'");
        }
    }//GEN-LAST:event_jTextFieldPessoaKeyPressed

    
    public void preenchertabela(String SQL){
        ArrayList dados = new ArrayList();
        
        
        String [] Colunas = new String[]{"ID","PESSOA","EMPRESA","CARGOATUAL","SALARIO","TELEFONE_TRABALHO","E-MAIL_TRABALHO"};
        conecta.conectaBanco();
        conecta.executaSQL(SQL);
        try {
           conecta.rs.first(); 
        do{
        dados.add(new Object[]{conecta.rs.getInt("Clientes_id"),conecta.rs.getString("Person_A_e_B_Encore_2017"),conecta.rs.getString("Empresa"),conecta.rs.getString("Titulo_oficial"),conecta.rs.getString("Salary"),conecta.rs.getString("Work_Phone"),conecta.rs.getString("Work_Email")}); 
        }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pesquisa inexistente!");
        }             
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableEstado.setModel(modelo);
        jTableEstado.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTableEstado.getColumnModel().getColumn(0).setResizable(false);
        jTableEstado.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTableEstado.getColumnModel().getColumn(1).setResizable(false);
        jTableEstado.getColumnModel().getColumn(2).setPreferredWidth(280);
        jTableEstado.getColumnModel().getColumn(2).setResizable(false);
        jTableEstado.getColumnModel().getColumn(3).setPreferredWidth(250);
        jTableEstado.getColumnModel().getColumn(3).setResizable(false);
        jTableEstado.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableEstado.getColumnModel().getColumn(4).setResizable(false);
        jTableEstado.getColumnModel().getColumn(5).setPreferredWidth(200);
        jTableEstado.getColumnModel().getColumn(5).setResizable(false);
        jTableEstado.getColumnModel().getColumn(6).setPreferredWidth(280);
        jTableEstado.getColumnModel().getColumn(6).setResizable(false);
        jTableEstado.getTableHeader().setReorderingAllowed(true);
        jTableEstado.setAutoResizeMode(jTableEstado.AUTO_RESIZE_OFF);
        jTableEstado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);       
        
    }
    /*
    public Usuario buscaProduto(Usuario modelo){
       conecta.conectaBanco();
       conecta.executaSQL("select * from usuarios where descricao like '%" + modelo.getPesquisa() + "%'");
       try  {
           conecta.rs.first();
            mod.setId(conecta.rs.getInt("id"));
            mod.setEmpresa(conecta.rs.getString("empresa"));
            mod.setDescricao(conecta.rs.getString("descricao"));
            mod.setDestinatario(conecta.rs.getString("destinatario"));
            mod.setDepartamento(conecta.rs.getString("departamento"));
            mod.setData(conecta.rs.getString("data"));
            mod.setDataentrega(conecta.rs.getString("dataentrega"));
            mod.setHorario(conecta.rs.getString("horario")); 
            mod.setEntrega(conecta.rs.getString("entrega"));
            mod.setUsuario(conecta.rs.getString("usuario"));
            mod.setRecebimento(conecta.rs.getString("recebimento"));
            mod.setCorreios(conecta.rs.getString("correio")); 
            mod.setBaixa(conecta.rs.getString("baixa"));
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao buscar a data!\nErro" + ex);   
       }
   
       return mod;
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
            java.util.logging.Logger.getLogger(VisualizadorProfissionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizadorProfissionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizadorProfissionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizadorProfissionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizadorProfissionais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTextField jTextFieldEmprego;
    private javax.swing.JTextField jTextFieldEmpresa;
    private javax.swing.JTextField jTextFieldPessoa;
    private javax.swing.JTextField jTextFieldSalario;
    // End of variables declaration//GEN-END:variables
}