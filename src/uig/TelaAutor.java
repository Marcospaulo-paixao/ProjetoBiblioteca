package uig;

import controle.AutorControle;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.classes.Autor;
import modelos.interfaces.IcrudAutor;
import modelos.utilidades.GeradorID;

public class TelaAutor extends javax.swing.JFrame {
    
    boolean incluirOr = true;
    IcrudAutor autor = null;

    /**
     * Creates new form TelaAutor
     */
    public TelaAutor() {
        super("Biblioteca System - Autor");
        initComponents();
        try {
            autor = new AutorControle("autor.txt");
        } catch (Exception e) {
        }
        ImageIcon icone = new ImageIcon("src/icons/livro.png");
        this.setIconImage(icone.getImage());
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
        jLabel2 = new javax.swing.JLabel();
        txtNomeAutor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridAutor = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButtonIncluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonlistagem = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Autor"));

        jLabel2.setText("Nome");

        txtNomeAutor.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Autores"));

        gridAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Autor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        gridAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridAutorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gridAutor);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
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

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/Logout_37127.png"))); // NOI18N
        jButtonSair.setText("sair");
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/cancel_77947.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/salve-.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crud/1491254395-returnbackredoarrow_82934.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVoltar.setIconTextGap(12);
        jButtonVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonlistagem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonlistagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        // TODO add your handling code here:
        habilitaFormulario(true);
        jButtonDeletar.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonlistagem.setEnabled(false);
        jButtonVoltar.setEnabled(false);
        jButtonSair.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        
        incluirOr = true;
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            incluirOr = false;
            txtNomeAutor.setEnabled(true);
            jButtonSalvar.setEnabled(true);
            
            jButtonlistagem.setEnabled(false);
            jButtonDeletar.setEnabled(false);
            jButtonIncluir.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonVoltar.setEnabled(false);
            jButtonSair.setEnabled(false);
            jButtonCancelar.setEnabled(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        try {
            Login login = new Login();
            login.setVisible(true);
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
        txtNomeAutor.setText("");
        txtNomeAutor.setEnabled(false);
        
        jButtonlistagem.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jButtonIncluir.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonVoltar.setEnabled(true);
        jButtonSair.setEnabled(true);
        
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        try {
            if (!txtNomeAutor.getText().isEmpty()) {
                String nome = txtNomeAutor.getText();
                if (incluirOr) {
                    GeradorID gId = new GeradorID();
                    int id = gId.getID();
                    autor.incluir(new Autor(id, nome));
                    gId.finalize();
                    txtNomeAutor.setText("");
                    JOptionPane.showMessageDialog(null, "Incluido com Sucesso! ");
                    
                } else if (!incluirOr) {
                    String nomeAlterar = gridAutor.getValueAt(gridAutor.getSelectedRow(), gridAutor.getSelectedColumn()).toString();
                    Autor antigoAutor = autor.getNomeAutor(nomeAlterar);
                    
                    autor.alterar(antigoAutor, new Autor(antigoAutor.getId(), txtNomeAutor.getText()));
                    JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "O campo nome dever ser preenchido!");
                txtNomeAutor.setText("");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        } finally {
            imprimirNaGrid();
            jButtonDeletar.setEnabled(true);
            jButtonAlterar.setEnabled(true);
            jButtonlistagem.setEnabled(true);
            jButtonVoltar.setEnabled(true);
            jButtonSalvar.setEnabled(true);
            jButtonSair.setEnabled(true);
            jButtonIncluir.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            txtNomeAutor.setText("");
            habilitaFormulario(false);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        try {
            TelaMenuPrincipal menu = new TelaMenuPrincipal();
            menu.setVisible(true);
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonVoltarActionPerformed
    public void limparDadosGrid(ArrayList<Autor> contatos) {
        DefaultTableModel tabela = (DefaultTableModel) gridAutor.getModel();
        tabela.setRowCount(0);
    }
    private void jButtonlistagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlistagemActionPerformed
        imprimirNaGrid();
    }//GEN-LAST:event_jButtonlistagemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        imprimirNaGrid();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        try {
            DefaultTableModel tabela = (DefaultTableModel) gridAutor.getModel();
            if (gridAutor.getSelectedRow() != 1) {
                String nomeExcluir = gridAutor.getValueAt(gridAutor.getSelectedRow(), gridAutor.getSelectedColumn()).toString();
                int config = JOptionPane.showConfirmDialog(rootPane, "Confirmar Exclusão de: " + nomeExcluir, nomeExcluir, 0);
                if (config == 0) {
                    autor.excluir(nomeExcluir);
                    imprimirNaGrid();
                    txtNomeAutor.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Exclusão Concluida!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Exclusão Cancelada!");
                }
            }
        } catch (Exception erroNaExclusao) {
            JOptionPane.showMessageDialog(null, erroNaExclusao);
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void gridAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridAutorMouseClicked
        transferirDadosDaGrid();
    }//GEN-LAST:event_gridAutorMouseClicked
    public void transferirDadosDaGrid() {
        if (gridAutor.getSelectedRow() != 1) {
            String nomeExcluir = gridAutor.getValueAt(gridAutor.getSelectedRow(), gridAutor.getSelectedColumn()).toString();
            txtNomeAutor.setText(nomeExcluir);
        }
    }
    
    public void habilitaFormulario(boolean habilita) {
        jButtonSalvar.setEnabled(habilita);
        txtNomeAutor.setEnabled(habilita);
        if (habilita) {
            txtNomeAutor.setRequestFocusEnabled(true);
        }
    }
    
    public void imprimirNaGrid() {
        DefaultTableModel tabela = (DefaultTableModel) gridAutor.getModel();
        try {
            limparDadosGrid(autor.listagem());
            ArrayList<Autor> autoresList = autor.listagem();
            String[] autores = new String[1];
            
            for (int pos = 0; pos < autoresList.size(); pos++) {
                Autor aux = autoresList.get(pos);
                
                autores[0] = aux.getNome();
                tabela.addRow(autores);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(TelaAutor.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(TelaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable gridAutor;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JButton jButtonlistagem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNomeAutor;
    // End of variables declaration//GEN-END:variables
}
