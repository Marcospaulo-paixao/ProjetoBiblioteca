package uig;

import javax.swing.ImageIcon;
import controle.EditoraControle;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.classes.Editora;
import modelos.utilidades.EditoraTableModel;
import modelos.utilidades.GeradorID;
import modelos.interfaces.ICRUDEditora;

public class TelaEditora extends javax.swing.JFrame {

    boolean incluirOn;
    ICRUDEditora editora = null;
    EditoraTableModel model = null;

    /**
     * Creates new form TelaEditora
     */
    public TelaEditora() {
        super("Biblioteca System - Editora");
        initComponents();
        ImageIcon icone = new ImageIcon("src/icons/livro.png");

        this.setIconImage(icone.getImage());
        try {
            editora = new EditoraControle("./database/editora.txt");
            model = new EditoraTableModel(new String[]{"Nome", "Descrição"});
            gridEditora.setModel(model);
        } catch (Exception errer) {
            JOptionPane.showMessageDialog(null, errer.getMessage());
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonIncluir = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonlistagem = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeEditora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescricaoEditora = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridEditora = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonlistagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonlistagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Editora"));

        jLabel2.setText("Nome");

        txtNomeEditora.setEnabled(false);

        jLabel3.setText("Descrição");

        txtDescricaoEditora.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtDescricaoEditora))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricaoEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Editoras"));

        gridEditora.setAutoCreateRowSorter(true);
        gridEditora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        gridEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridEditoraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gridEditora);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBusca)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        try {
            txtDescricaoEditora.setText("");
            txtNomeEditora.setText("");
            habilitarBott(true);
            jButtonIncluir.setEnabled(false);
            jButtonDeletar.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonlistagem.setEnabled(false);
            txtBusca.setEnabled(false);
            incluirOn = true;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        incluirOn = false;
        habilitarBott(true);
        jButtonlistagem.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonIncluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
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
        txtDescricaoEditora.setText("");
        txtNomeEditora.setText("");
        txtDescricaoEditora.setEnabled(false);
        txtNomeEditora.setEnabled(false);

        jButtonlistagem.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jButtonIncluir.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonVoltar.setEnabled(true);
        jButtonSair.setEnabled(true);
        txtBusca.setEnabled(true);

        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        try {
            if (incluirOn) {
                if (!txtDescricaoEditora.getText().isEmpty() && !txtNomeEditora.getText().isEmpty()) {
                    String nomeEditora = txtNomeEditora.getText();
                    String descricaoEditora = txtDescricaoEditora.getText();
                    GeradorID gId = new GeradorID();
                    editora.incluir(new Editora(gId.getID(), nomeEditora, descricaoEditora));
                    gId.finalize();
                    txtDescricaoEditora.setText("");
                    txtNomeEditora.setText("");
                    JOptionPane.showMessageDialog(null, "Editora: " + nomeEditora + " Incluida! ");
                    txtBusca.setEnabled(true);

                    imprimirNaGrid();

                } else {
                    JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos! ");
                    txtDescricaoEditora.setText("");
                    txtNomeEditora.setText("");
                }
            } else {
                String nomeEditora = gridEditora.getValueAt(gridEditora.getSelectedRow(), gridEditora.getSelectedColumn()).toString();
                Editora antigoEditora = editora.getEditoraNome(nomeEditora);
                editora.alterar(antigoEditora, new Editora(antigoEditora.getId(), txtNomeEditora.getText(), txtDescricaoEditora.getText()));
                txtDescricaoEditora.setText("");
                txtNomeEditora.setText("");
                imprimirNaGrid();
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        } finally {
            txtNomeEditora.setEnabled(false);
            txtDescricaoEditora.setEnabled(false);
            jButtonIncluir.setEnabled(true);
            jButtonDeletar.setEnabled(true);
            jButtonAlterar.setEnabled(true);
            jButtonlistagem.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonVoltar.setEnabled(true);
            jButtonSair.setEnabled(true);
            jButtonSalvar.setEnabled(false);
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

    private void jButtonlistagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlistagemActionPerformed
        try {
            imprimirNaGrid();
        } catch (Exception ex) {
            Logger.getLogger(TelaEditora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonlistagemActionPerformed

    private void gridEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridEditoraMouseClicked
        transferirDadosDaGrid();
    }//GEN-LAST:event_gridEditoraMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        imprimirNaGrid();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        try {

            if (gridEditora.getSelectedRow() != 1) {
                String nomeExcluir = gridEditora.getValueAt(gridEditora.getSelectedRow(), gridEditora.getSelectedColumn()).toString();
                int config = JOptionPane.showConfirmDialog(rootPane, "Confirmar Exclusão de: " + nomeExcluir, nomeExcluir, 0);
                if (config == 0) {
                    editora.excluir(nomeExcluir);
                    imprimirNaGrid();
                    txtNomeEditora.setText("");
                    txtDescricaoEditora.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Exclusão Concluida!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Exclusão Cancelada!");
                }
            }
        } catch (Exception erroNaExclusao) {
            JOptionPane.showMessageDialog(null, erroNaExclusao);
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        try {
            pesquisarLivro(txtBusca.getText().toLowerCase());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtBuscaKeyReleased
    public void habilitarBott(boolean habilitar) {

        jButtonSalvar.setEnabled(habilitar);
        txtDescricaoEditora.setEnabled(habilitar);
        txtNomeEditora.setEnabled(habilitar);
        txtNomeEditora.setRequestFocusEnabled(habilitar);

        if (habilitar) {
            jButtonCancelar.setEnabled(habilitar);
            jButtonSair.setEnabled(!habilitar);
            jButtonVoltar.setEnabled(!habilitar);
        }
    }

    public void desaBilitarBott(boolean habilitar) {

        jButtonSalvar.setEnabled(habilitar);
        txtDescricaoEditora.setEnabled(habilitar);
        txtNomeEditora.setEnabled(habilitar);
        txtNomeEditora.setRequestFocusEnabled(habilitar);

    }

    public void transferirDadosDaGrid() {
        if (gridEditora.getSelectedRow() != 1) {
            String nomeExcluir = gridEditora.getValueAt(gridEditora.getSelectedRow(), 0).toString();
            txtNomeEditora.setText(nomeExcluir);
            String descricaoExcluir = gridEditora.getValueAt(gridEditora.getSelectedRow(), 1).toString();
            txtDescricaoEditora.setText(descricaoExcluir);
        }
    }

    public void imprimirNaGrid() {
        try {
            model.update(editora.listagem());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }

    public void pesquisarLivro(String texto) {
        try {

            String[][] matrizFiltro = new String[2][editora.listagem().size()];
            String[] matrizS = new String[matrizFiltro[1].length];
            model.update(editora.listagem());
            for (int i = 0; i < model.getColumnCount(); i++) {
                for (int j = 0; j < model.getRowCount(); j++) {
                    matrizFiltro[i][j] = model.getValueAt(j, i);
                }
            }
            ArrayList<String> matriz = null;
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
                                || matrizFiltro[1][i].toLowerCase().contains(texto)) {
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void limparDadosGrid(ArrayList<Editora> contatos) {
        DefaultTableModel tabela = (DefaultTableModel) gridEditora.getModel();
        tabela.setRowCount(0);
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
            java.util.logging.Logger.getLogger(TelaEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable gridEditora;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JButton jButtonlistagem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtDescricaoEditora;
    private javax.swing.JTextField txtNomeEditora;
    // End of variables declaration//GEN-END:variables
}
