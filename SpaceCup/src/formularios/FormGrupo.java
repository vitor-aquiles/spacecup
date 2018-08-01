/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dao.GrupoDAO;
import grupo.Grupo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author aquil
 */
public class FormGrupo extends javax.swing.JFrame {

    MaskFormatter mascara;
    /**
     * Creates new form JanelaGrupos
     */
    public FormGrupo() {
        initComponents();
        setLocationRelativeTo(null);
    }

    Grupo grupo = null;
    
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxTurma = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIntegrantes = new javax.swing.JTextArea();
        txtDataLancamento = new javax.swing.JFormattedTextField();
        try {
            mascara = new MaskFormatter("##/##/####");
            mascara.install(txtDataLancamento);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        btnCadastrar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAvancar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Grupo");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Integrantes");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Turma");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Data lançamento");

        txtGrupo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtGrupo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\aquil\\Documents\\NetBeansProjects\\SpaceCup\\img\\logoFIAP.png")); // NOI18N

        cbxTurma.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxTurma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "2º SIA", "3º ENG" }));

        txtIntegrantes.setColumns(20);
        txtIntegrantes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIntegrantes.setLineWrap(true);
        txtIntegrantes.setRows(5);
        txtIntegrantes.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtIntegrantes);

        txtDataLancamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataLancamento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(101, 27));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAvancar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAvancar.setText("Avançar");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAvancar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtGrupo)
                            .addComponent(cbxTurma, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDataLancamento)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnLimpar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        
        if(grupo != null){
            FormInformacao formInfo = new FormInformacao(this.grupo);
            this.dispose();
            formInfo.setVisible(true);
        }else
            JOptionPane.showMessageDialog(this, "Grupo não informado");
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String nome = txtGrupo.getText();
            String integrantes = txtIntegrantes.getText();
            String turma = String.valueOf(cbxTurma.getSelectedItem());
            Date dataLancamento = formato.parse(txtDataLancamento.getText());
            if(validarCampos(nome, integrantes, turma, dataLancamento)){
                JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
            }else{
                GrupoDAO grupoDAO = new GrupoDAO();
                if(nome != grupoDAO.verificarNomeGrupo(nome)){
                    Grupo grupo = new Grupo(nome, integrantes, turma, dataLancamento, null);
                    grupoDAO.cadastrar(grupo);
                    limparCampos();
                    JOptionPane.showMessageDialog(this, "Cadastro efetuado!");
                }else{
                    JOptionPane.showMessageDialog(this, "Este grupo já consta cadastrado no sistema!");
                }
            }
        }
        catch (ParseException ex) {
            //Logger.getLogger(FormGrupo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Data inválida");
            txtDataLancamento.requestFocus();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
            DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String nome = txtGrupo.getText();
            String integrante = txtIntegrantes.getText();
            String turma = String.valueOf(cbxTurma.getSelectedItem());
            
            GrupoDAO grupoDAO = new GrupoDAO();
            
            if((nome != null && !nome.isEmpty()) || (integrante != null && !integrante.isEmpty()) || (turma != "Selecione")){
                this.grupo = grupoDAO.pesquisar((nome != null?nome:null),(integrante != null?integrante:null), (turma != "Selecione"?turma:null));
                
                if(this.grupo == null) {
                    JOptionPane.showMessageDialog(this, "Grupo não encontrado");
                }else{
                    txtIntegrantes.setText(grupo.getIntegrantes());
                    cbxTurma.setSelectedItem(grupo.getTurma());
                    txtDataLancamento.setText(formato.format(grupo.getDataLancamento()));
                    
                }
            } else{
                JOptionPane.showMessageDialog(this, "Informe ao menos um campo para pesquisa!");
                txtGrupo.requestFocus();
            }
                
                
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String nome = txtGrupo.getText();
            String integrantes = txtIntegrantes.getText();
            String turma = String.valueOf(cbxTurma.getSelectedItem());
            Date dataLancamento = formato.parse(txtDataLancamento.getText());
            Grupo grupo = new Grupo(nome, integrantes, turma, dataLancamento, null);
            GrupoDAO grupoDAO = new GrupoDAO();
            grupoDAO.alterar(grupo);
            JOptionPane.showMessageDialog(this, "Dados alterados com sucesso!");
            limparCampos();
        }
        catch (ParseException ex) {
            Logger.getLogger(FormGrupo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String nome = txtGrupo.getText();
        int resp = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir os dados do grupo "+ nome +"?");
            if(resp == JOptionPane.YES_OPTION){
		GrupoDAO grupoDAO = new GrupoDAO();
		grupoDAO.excluir(nome);
		limparCampos();
            }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?");
        if(resp == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    public boolean validarCampos(String nome, String integrantes, String turma, Date dataLancamento){
        if(nome.isEmpty()){
            txtGrupo.requestFocus();
            return true;
        }else if(integrantes.isEmpty()){
                txtIntegrantes.requestFocus();
                return true;
        }else if(turma.length() == 9){
                    cbxTurma.requestFocus();
                    return true;
        }else if(dataLancamento.equals("  /  /    ")){
                        txtDataLancamento.requestFocus();
                        return true;
                }
        return false;        
    }
    
    public void limparCampos(){
        txtGrupo.setText(null);
        txtIntegrantes.setText(null);
        cbxTurma.setSelectedIndex(0);
        txtDataLancamento.setText(null);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");  
            //UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");    
            //UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");  
            //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");  
            //UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel"); 
            //UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel"); 
            
            // start application
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox cbxTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtDataLancamento;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextArea txtIntegrantes;
    // End of variables declaration//GEN-END:variables
}
