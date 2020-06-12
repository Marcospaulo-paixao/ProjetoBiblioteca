/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uig;

import controle.ColaboradorControle;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelos.classes.Colaborador;
import modelos.utilidades.ColaboradorTableModel;
import modelos.interfaces.ICRUDColaborador;
import modelos.utilidades.TipoDeColadoradores;
import modelos.utilidades.TipoDeStatus;

/**
 *
 * @author marcos
 */
public class TelaDoColaborador extends javax.swing.JFrame {

    private ColaboradorTableModel model = null;
    ICRUDColaborador colaboradorControler = null;
    private boolean incluir = false;

    /**
     * Creates new form TelaDoColaborador
     */
    public TelaDoColaborador() {
        super("Biblioteca System - Colaboradores");
        initComponents();
        ImageIcon icone = new ImageIcon("src/icons/livro.png");
        this.setIconImage(icone.getImage());
        try {
            colaboradorControler = new ColaboradorControle("colaborador.txt");
            model = new ColaboradorTableModel(new String[]{"Nome", "Matricula", "OAB", "E-mail", "Telefone", "Tipo De Colaborador", "Status"});
            jTableColaboradores.setModel(model);

            if (colaboradorControler.listagem() != null) {
                model.update(colaboradorControler.listagem());
            }
            this.habilitaFormulario(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldOAB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDddTelefone = new javax.swing.JTextField();
        jTextFieldNumeroTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxTipoDeColaborador = new javax.swing.JComboBox<>();
        jButtonStatus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonIncluir = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonlistagem = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableColaboradores = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Colaborador"));

        jLabel1.setText("Matricula");

        jLabel2.setText("Nome");

        jLabel3.setText("OAB");

        jLabel4.setText("E-mail");

        jLabel5.setText("Telefone");

        jLabel6.setText("Tipo De Colaborador");

        jComboBoxTipoDeColaborador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Advogado", "Estagiario", "Funcionario" }));
        jComboBoxTipoDeColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoDeColaboradorActionPerformed(evt);
            }
        });
        jComboBoxTipoDeColaborador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBoxTipoDeColaboradorKeyReleased(evt);
            }
        });

        jButtonStatus.setText("INATIVO");
        jButtonStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldDddTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNumeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxTipoDeColaborador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldOAB, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonStatus)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldOAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldDddTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNumeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxTipoDeColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonStatus)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        jButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/mais.png"))); // NOI18N
        jButtonIncluir.setText("Incluir");
        jButtonIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/lixo.png"))); // NOI18N
        jButtonDeletar.setText("Deletar");
        jButtonDeletar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDeletar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/papel.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonlistagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/listing-option_icon-icons.com_73504.png"))); // NOI18N
        jButtonlistagem.setText("Listar");
        jButtonlistagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonlistagem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonlistagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlistagemActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/salve-.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/cancel_77947.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/1491254395-returnbackredoarrow_82934.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltar.setIconTextGap(12);
        btnVoltar.setVerifyInputWhenFocusTarget(false);
        btnVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/Logout_37127.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonlistagem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonlistagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonIncluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Colaboradores"));

        jTableColaboradores.setAutoCreateRowSorter(true);
        jTableColaboradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableColaboradores);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        // TODO add your handling code here:
        try {
            incluir = true;
            habilitaFormulario(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Deseja Cancelar?", "Cancelar", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
            habilitaFormulario(false);
            jTableColaboradores.setRowSelectionAllowed(true);
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        try {
            if (jTableColaboradores.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione o Colaborador para ser alterado");
            } else {
                incluir = false;
                habilitaFormulario(true);
                setValuesJTextFields(colaboradorControler.getColaborador(model.getValueAt(jTableColaboradores.getSelectedRow(), 0)));
                jTableColaboradores.setRowSelectionAllowed(false);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        try {

            int matricula = Integer.parseInt(jTextFieldMatricula.getText());
            String nome = jTextFieldNome.getText();
            int OAB = (jTextFieldOAB.getText().equals(""))?0:Integer.parseInt(jTextFieldOAB.getText());
            String email = jTextFieldEmail.getText();
            int ddd = Integer.parseInt(jTextFieldDddTelefone.getText());
            int telefone = Integer.parseInt(jTextFieldNumeroTelefone.getText());
            if (jComboBoxTipoDeColaborador.getSelectedItem().equals("Selecione")) {
                throw new Exception("Selecione o Tipo de colaborador!");
            }
            TipoDeColadoradores tipoDeColaborador = null;
            if (jComboBoxTipoDeColaborador.getSelectedItem().equals("Advogado")) {
                tipoDeColaborador = TipoDeColadoradores.ADVOGADO;
            }
            if (jComboBoxTipoDeColaborador.getSelectedItem().equals("Estagiario")) {
                tipoDeColaborador = TipoDeColadoradores.ESTAGIARIO;
            }
            if (jComboBoxTipoDeColaborador.getSelectedItem().equals("Funcionario")) {
                tipoDeColaborador = TipoDeColadoradores.FUNCIONARIO;
            }

            TipoDeStatus status = (jButtonStatus.getText().equals("Ativo") ? TipoDeStatus.ATIVO : TipoDeStatus.INATIVO);
            if (incluir) {
                colaboradorControler.incluir(new Colaborador(matricula, nome, OAB, email, ddd, telefone, tipoDeColaborador, status));
                model.update(colaboradorControler.listagem());
                habilitaFormulario(false);
                JOptionPane.showMessageDialog(null, "Colaborador salvo com sucesso");

            } else {
                String nome_aux = model.getValueAt(jTableColaboradores.getSelectedRow(), 0);

                colaboradorControler.alterar(colaboradorControler.getColaborador(nome_aux),
                        new Colaborador(matricula, nome, OAB, email, ddd, telefone, tipoDeColaborador, status));
                JOptionPane.showMessageDialog(null, "Colaborador alterado com sucesso");
                habilitaFormulario(false);
                model.update(colaboradorControler.listagem());
                jTableColaboradores.setRowSelectionAllowed(true);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());

        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStatusActionPerformed
        // TODO add your handling code here:
        if (jButtonStatus.getText().equals("Ativo")) {
            jButtonStatus.setText("Inativo");

        } else {
            jButtonStatus.setText("Ativo");
        }
    }//GEN-LAST:event_jButtonStatusActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        try {
            if (JOptionPane.showConfirmDialog(null, "Deseja sair do sistema?", "Cancelar", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
                Login login = new Login();
                login.setVisible(true);
                dispose();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonlistagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlistagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonlistagemActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        // TODO add your handling code here:
        try {
            if (jTableColaboradores.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione o Colaborador para ser deletado");
            } else {
                if (JOptionPane.showConfirmDialog(null, "Deseja Deletar este Colaborador?", "Cancelar", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
                    colaboradorControler.deletar(colaboradorControler.getColaborador(model.getValueAt(jTableColaboradores.getSelectedRow(), 0)));
                    JOptionPane.showMessageDialog(null, "Colaborador deletado com sucesso");
                    model.update(colaboradorControler.listagem());
                    habilitaFormulario(false);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try {
            TelaMenuPrincipal menu = new TelaMenuPrincipal();
            menu.setVisible(true);
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jComboBoxTipoDeColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoDeColaboradorActionPerformed
        // TODO add your handling code here:
       textFieldOAB();
    }//GEN-LAST:event_jComboBoxTipoDeColaboradorActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        try {
            pesquisarColaboradores(jTextField1.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBoxTipoDeColaboradorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxTipoDeColaboradorKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxTipoDeColaboradorKeyReleased

    public void textFieldOAB() {
        if (!jComboBoxTipoDeColaborador.getSelectedItem().equals("Advogado")) {
            jTextFieldOAB.setEnabled(false);
            jTextFieldOAB.setText("");
        } else {
            jTextFieldOAB.setEnabled(true);            
        }
    }

    public void habilitaFormulario(boolean habilita) {
        jTextFieldDddTelefone.setEnabled(habilita);
        jTextFieldEmail.setEnabled(habilita);
        jTextFieldMatricula.setEnabled(habilita);
        jTextFieldNome.setEnabled(habilita);
        jTextFieldNumeroTelefone.setEnabled(habilita);
        jTextFieldOAB.setEnabled(false);
        jComboBoxTipoDeColaborador.setEnabled(habilita);
        jButtonStatus.setEnabled(habilita);
        jButtonAlterar.setEnabled(!habilita);
        jButtonDeletar.setEnabled(!habilita);
        jButtonIncluir.setEnabled(!habilita);
        jButtonCancelar.setEnabled(habilita);
        jButtonSalvar.setEnabled(habilita);
        jButtonlistagem.setEnabled(!habilita);
        if (!habilita) {
            
            jTextFieldDddTelefone.setText("");
            jTextFieldEmail.setText("");
            jTextFieldMatricula.setText("");
            jTextFieldNome.setText("");
            jTextFieldNumeroTelefone.setText("");
            jTextFieldOAB.setText("");
            jComboBoxTipoDeColaborador.setSelectedIndex(0);
            jButtonStatus.setText("Inativo");
        }

    }

    public void setValuesJTextFields(Colaborador objeto) {
        jTextFieldNome.setText(objeto.getNome());
        jTextFieldMatricula.setText(objeto.getMatricula() + "");
        jTextFieldOAB.setText(objeto.getOAB() + "");
        jTextFieldEmail.setText(objeto.getEmail());
        jTextFieldDddTelefone.setText(objeto.getTelefone().getDdd() + "");
        jTextFieldNumeroTelefone.setText(objeto.getTelefone().getNumero() + "");
        jComboBoxTipoDeColaborador.setSelectedItem(objeto.getTipoDeColaborador());
        int aux = objeto.getTipoDeColaborador().getValor();
        jComboBoxTipoDeColaborador.setSelectedIndex(objeto.getTipoDeColaborador().getValor());
        if ((objeto.getTipoDeStatus().getValor()) == 0) {
            jButtonStatus.setText("Ativo");
        }
        if ((objeto.getTipoDeStatus().getValor()) == 1) {
            jButtonStatus.setText("Inativo");
        }
        if ((objeto.getTipoDeStatus().getValor()) == 2) {
            jButtonStatus.setText("Inativo");
        }

    }

    private void pesquisarColaboradores(String texto) throws Exception {
        try {

            String[][] matrizFiltro = new String[7][colaboradorControler.listagem().size()];
            String[] matrizS = new String[matrizFiltro[1].length];
            model.update(colaboradorControler.listagem());
            for (int i = 0; i < model.getColumnCount(); i++) {
                for (int j = 0; j < model.getRowCount(); j++) {
                    matrizFiltro[i][j] = model.getValueAt(j, i);
                }
            }
            ArrayList<String> matriz = null;
            if (model != null) {
                if (matrizFiltro.length > 0) {
                    texto = texto.toLowerCase().trim();
                    if (texto.length() == 0) {
                        for (int i = 0; i < matrizFiltro[1].length; i++) {
                            matrizS[i] = matrizFiltro[0][i];
                        }

                    } else {
                        matriz = new ArrayList<>();

                        for (int i = 0; i < matrizFiltro[1].length; i++) {
                            if (matrizFiltro[0][i].toLowerCase().contains(texto)
                                    || matrizFiltro[1][i].toLowerCase().contains(texto)
                                    || matrizFiltro[2][i].toLowerCase().contains(texto)
                                    || matrizFiltro[3][i].toLowerCase().contains(texto)
                                    || matrizFiltro[4][i].toLowerCase().contains(texto)
                                    || matrizFiltro[5][i].toLowerCase().contains(texto)
                                    || matrizFiltro[6][i].toLowerCase().contains(texto)) {
                                matriz.add(matrizFiltro[0][i]);
                            }
                        }

                        matrizS = new String[matriz.size()];
                        for (int i = 0; i < matriz.size(); i++) {
                            matrizS[i] = matriz.get(i);
                        }
                    }
                }

                model.update(matrizS);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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
            java.util.logging.Logger.getLogger(TelaDoColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDoColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDoColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDoColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDoColaborador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonStatus;
    private javax.swing.JButton jButtonlistagem;
    private javax.swing.JComboBox<String> jComboBoxTipoDeColaborador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableColaboradores;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldDddTelefone;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumeroTelefone;
    private javax.swing.JTextField jTextFieldOAB;
    // End of variables declaration//GEN-END:variables
}
