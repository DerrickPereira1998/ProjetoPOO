package projetopoo;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GuiOrdem extends javax.swing.JFrame {

    ArrayList<OrdemServiço> resposta;
    ArrayList<Cliente> listaClientes;
    ArrayList<ClassificaçaoProblema> listaClassificacoes;
    ArrayList<Funcionario> listaFuncionarios;
    
    public GuiOrdem() {
        initComponents();
        this.listaClientesCombo();
        this.listaFuncionariosCombo();
        this.listaClassificaçoesCombo();
    }

    //COMEÇO DOS CODIGOS DE COMBOBOX.
    
    private void listaClientesCombo() {
        try {
            DadosCliente dados = new DadosCliente();
            Cliente cliente = new Cliente();
            this.listaClientes = dados.listar(cliente);
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Cliente c : this.listaClientes) {
                modelo.addElement(c.getNome());
            }
            jComboBox1.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
    
    private void listaFuncionariosCombo() {
        try {
            DadosFuncionario dados = new DadosFuncionario();
            Funcionario funcionario = new Funcionario();
            this.listaFuncionarios = dados.listar(funcionario);
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Funcionario f : this.listaFuncionarios) {
                modelo.addElement(f.getNome());
            }
            jComboBox2.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
    
    //FINAL DE COMBO, COMEÇO DE LISTA
    
    private void listaClassificaçoesCombo() {
        try {
            DadosClassificaçaoProblema dados = new DadosClassificaçaoProblema();
            ClassificaçaoProblema classificaçao = new ClassificaçaoProblema();
            this.listaClassificacoes = dados.listar(classificaçao);
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (ClassificaçaoProblema c1 : this.listaClassificacoes) {
                modelo.addElement(c1.getNome());
            }
            jComboBox3.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldProblema = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCancelar = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSolucao = new javax.swing.JTextField();
        jButtonSolução = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonListar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonCadastro.setText("Cadastrar");
        jButtonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero:");

        jLabel4.setText("Descrição do problema:");

        jTextFieldProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProblemaActionPerformed(evt);
            }
        });

        jLabel6.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel7.setText("Motivo do cancelamento:");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel10.setText("Descrição da solução:");

        jButtonSolução.setText("Solucionar");
        jButtonSolução.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSoluçãoActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jLabel11.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSolucao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldProblema)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDeletar))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSolução, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonListar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldProblema, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastro)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSolução)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jButtonListar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:  
        try {
            OrdemServiço ordem = new OrdemServiço();
            ordem.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
            ordem.setDescricaoproblema(jTextFieldProblema.getText());
            NegocioOrdem negocio = new NegocioOrdem();
            negocio.editar(ordem);
            JOptionPane.showMessageDialog(rootPane, "Classificação editada com sucesso");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }      
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        // TODO add your handling code here:
        try {
            OrdemServiço ordem = new OrdemServiço();
            ordem.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
            NegocioOrdem negocio = new NegocioOrdem();
            negocio.deletar(ordem);
            JOptionPane.showMessageDialog(rootPane, "Ordem deletada com sucesso");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }      
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroActionPerformed
        // TODO add your handling code here:
         try {
            //pegar as posições escolhidas nos combos
            int indexCli = jComboBox1.getSelectedIndex();
            if (indexCli < 0) {
                JOptionPane.showMessageDialog(rootPane, "Selecionar o cliente");
                jComboBox1.requestFocus();
                return;
            }
            int indexFunc = jComboBox2.getSelectedIndex();
            if (indexFunc < 0) {
                JOptionPane.showMessageDialog(rootPane, "Selecionar o funcionário");
                jComboBox2.requestFocus();
                return;
            }

            int indexClass = jComboBox3.getSelectedIndex();
            if (indexClass < 0) {
                JOptionPane.showMessageDialog(rootPane, "Selecionar a classificação do problema");
                jComboBox3.requestFocus();
                return;
            }
            //pegando os objetos para compor a OS
            Cliente clienteSelecionado = this.listaClientes.get(indexCli);
            Funcionario funcinarioSelecionado = this.listaFuncionarios.get(indexFunc);
            ClassificaçaoProblema classificacaoSelecionada = this.listaClassificacoes.get(indexClass);
            //criando a OS
            OrdemServiço ordem = new OrdemServiço();
            //carregado os dados
            ordem.setCliente(clienteSelecionado);
            ordem.setFuncionario(funcinarioSelecionado);
            ordem.setClassificaçaoProblema(classificacaoSelecionada);
            //FIM DOS DADOS DE COMBO------------------------------------------------------------------------------------------------
            ordem.setDescricaoproblema(jTextFieldProblema.getText());
            long time = System.currentTimeMillis();
            Date d = new java.sql.Date(time);
            ordem.setDatacadastro(d);
            NegocioOrdem negocio = new NegocioOrdem();
            negocio.cadastrar(ordem);
            JOptionPane.showMessageDialog(rootPane, "Ordem cadastrada com sucesso");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonCadastroActionPerformed

    private void jTextFieldProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProblemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProblemaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        // TODO add your handling code here:
         try {

            InterfaceOrdem dadosOrdem = new DadosOrdemServiço();
            //dados.cadastrar(av);
             this.resposta = dadosOrdem.listar(null);

            //definindo um novo modelo
            DefaultTableModel modelo = new DefaultTableModel();
            //definindo as colunas do novo modelo
            modelo.setColumnIdentifiers(new Object[]{"Numero", "Funcionario", "Cliente", "Classificação", "Descrição do problema", "Data de cadastro"});

            for (OrdemServiço a : this.resposta) {
                modelo.addRow(new Object[]{a.getNumero(), a.getFuncionario().getMatricula(), a.getCliente().getCpf(), a.getClassificaçaoProblema().getCodigo(), a.getDescricaoproblema(), a.getDatacadastro()});
            }
            //trocando o modelo antigo
            jTable2.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        try {
            OrdemServiço ordem = new OrdemServiço();
            ordem.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
            ordem.setMotivocancelamento(jTextFieldCancelar.getText());
            long time = System.currentTimeMillis();
            Date d = new java.sql.Date(time);
            ordem.setDatacancelamento(d);
            NegocioOrdem negocio = new NegocioOrdem();
            negocio.cancelar(ordem);
            JOptionPane.showMessageDialog(rootPane, "Classificação cancelada com sucesso");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }      
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSoluçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSoluçãoActionPerformed
        // TODO add your handling code here:
        try {
            OrdemServiço ordem = new OrdemServiço();
            ordem.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
            ordem.setDescricaoservico(jTextFieldSolucao.getText());
            long time = System.currentTimeMillis();
            Date d = new java.sql.Date(time);
            ordem.setDatasolucao(d);
            NegocioOrdem negocio = new NegocioOrdem();
            negocio.solucionar(ordem);
            JOptionPane.showMessageDialog(rootPane, "Classificação solucionada com sucesso");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }      
    }//GEN-LAST:event_jButtonSoluçãoActionPerformed

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
            java.util.logging.Logger.getLogger(GuiOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiOrdem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastro;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonSolução;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldCancelar;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldProblema;
    private javax.swing.JTextField jTextFieldSolucao;
    // End of variables declaration//GEN-END:variables
}
