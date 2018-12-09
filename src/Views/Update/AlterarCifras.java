package Views.Update;

import Views.Cadastrar.*;
import DAO.CifrasDAO;
import DAO.Conexao;
import DAO.UsuarioDAO;
import Models.Cifras;
import Models.Usuario;
import javax.swing.JOptionPane;
import main.Login;
import Views.Consultar.TelaCifras;
import Views.Consultar.VisualizarCifras;
import Views.Excluir.rmCifra;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class AlterarCifras extends javax.swing.JFrame {


    public AlterarCifras() {
        initComponents();
        setSize(852, 572);
        setLocationRelativeTo(this);  
        setTitle("Atualizar cifras");
    }
    
    private void InserirDados(int id){
        Connection con = Conexao.AbrirConexao();
        CifrasDAO sql = new CifrasDAO(con);
        List<Cifras> lista = new ArrayList<>();
        lista = sql.CapturarCifra(id);
        
        for (Cifras a : lista) {
            codCifra.setText("" + a.getIdCifra());
            NomeMusica.setText("" + a.getNomeMusica());
            NomeCantor.setText("" + a.getNomeCantor());
            tomM.setText("" + a.getTom());
            cifra.setText("" + a.getCifra()); 
        }
        
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ok = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tomM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NomeCantor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NomeMusica = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cifra = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        codCifra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        idCifra1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        ok.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        ok.setText("Atualizar!");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok);
        ok.setBounds(140, 410, 130, 50);

        jLabel6.setText("Img by: Jocals");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 500, 100, 20);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        jLabel5.setText("CIFRA:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 90, 60, 30);
        getContentPane().add(tomM);
        tomM.setBounds(150, 340, 210, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        jLabel4.setText("TOM:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 340, 110, 30);
        getContentPane().add(NomeCantor);
        NomeCantor.setBounds(150, 300, 210, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        jLabel3.setText("CANTOR:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 300, 110, 30);
        getContentPane().add(NomeMusica);
        NomeMusica.setBounds(150, 260, 210, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel2.setText("CÓDIGO DA CIFRA:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 220, 110, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATUALIZAR SUAS CIFRAS!");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 20, 410, 50);

        cifra.setColumns(20);
        cifra.setRows(5);
        jScrollPane1.setViewportView(cifra);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(423, 90, 380, 420);

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("DIGITE O CÓDIGO DA CIFRA:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 150, 180, 30);

        codCifra.setEditable(false);
        codCifra.setBackground(new java.awt.Color(204, 255, 255));
        codCifra.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(codCifra);
        codCifra.setBounds(150, 220, 80, 30);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 150, 60, 32);

        idCifra1.setBackground(new java.awt.Color(204, 255, 255));
        idCifra1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(idCifra1);
        idCifra1.setBounds(210, 150, 80, 30);

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel7.setText("NOME DA MÚSICA:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 260, 110, 30);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robo.jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 842, 530);

        jMenu1.setText("Cifras");

        jMenuItem1.setText("Ver todas as cifras...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Cadastrar nova cifra");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Deletar cifra");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setText("Alterar cifra");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem5.setText("Ver cifra - Toque junto!");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");

        jMenuItem2.setText("Logoff...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new TelaCifras().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Fazer o sair
        
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new CadastroCifras().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new rmCifra().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new VisualizarCifras().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
    String idCifra = codCifra.getText();
    String nomeMusica = NomeMusica.getText();
    String nomeCantor = NomeCantor.getText();
    String tom = tomM.getText();
    String cifraCompleta = cifra.getText();
    
    if (nomeMusica.equals("") || nomeCantor.equals("") || tom.equals("") || cifraCompleta.equals("")) {
        JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio!",
                    "Projeto Cifras", JOptionPane.WARNING_MESSAGE);
    } else {
        Connection con = Conexao.AbrirConexao();
        CifrasDAO sql = new CifrasDAO(con);
        int id = Integer.parseInt(idCifra);
        Cifras a = new Cifras();
        
        a.setNomeMusica(nomeMusica);
        a.setNomeCantor(nomeCantor);
        a.setTom(tom);
        a.setCifra(cifraCompleta);
        a.setIdCifra(id);
        
        sql.Alterar_Cifra(a);
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);

        codCifra.setText("");
        NomeMusica.setText("");
        NomeCantor.setText("");
        tomM.setText("");
        cifra.setText("");  
        
        JOptionPane.showMessageDialog(null, "Update realizado com sucesso!",
                    "Projeto Cifras", JOptionPane.INFORMATION_MESSAGE);
  
    }        
    }//GEN-LAST:event_okActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String id_Cifra = idCifra1.getText();
    Connection con = Conexao.AbrirConexao();
    CifrasDAO sql = new CifrasDAO(con);
    int id = Integer.parseInt(id_Cifra);
    
        if (id_Cifra.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite um código para atualizar",
                        "Projeto Cifras", JOptionPane.WARNING_MESSAGE);
        }
            codCifra.setText("");
            NomeMusica.setText("");
            NomeCantor.setText("");
            tomM.setText("");
            cifra.setText("");  
            
    InserirDados(id);
    idCifra1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new AlterarCifras().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed
      
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
            java.util.logging.Logger.getLogger(AlterarCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarCifras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NomeCantor;
    private javax.swing.JTextField NomeMusica;
    private javax.swing.JTextArea cifra;
    private javax.swing.JTextField codCifra;
    private javax.swing.JLabel fundo;
    private javax.swing.JTextField idCifra1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ok;
    private javax.swing.JTextField tomM;
    // End of variables declaration//GEN-END:variables
}