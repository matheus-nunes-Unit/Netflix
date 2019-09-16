/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Conteudo;
import Model.Filme;
import javax.swing.JFrame;
import Model.Netflix;
import Model.Serie;
import javax.swing.JOptionPane;

/**
 *
 * @author EriikD
 */
public class AtualizarConteudo extends javax.swing.JFrame {

    private Netflix netflixBancoDeDados;
    private JFrame telaAdministrador;
    private Conteudo ultimoConteudoPesquisado;

    /**
     * Creates new form AtualizarConteudo
     */
    public AtualizarConteudo() {
        initComponents();
    }

    public AtualizarConteudo(Netflix netflixBancoDeDados, JFrame telaAdministrador) {
        this.netflixBancoDeDados = netflixBancoDeDados;
        this.telaAdministrador = telaAdministrador;
        this.ultimoConteudoPesquisado = null;
        initComponents();
    }

    public void desabilitarCampos() {
        this.nomeConteudoEditar.setEnabled(false);
        this.comboBoxCategoria.setEnabled(false);
        this.comboBoxSubCategoria.setEnabled(false);
        this.diretorConteudoEditar.setEnabled(false);
        this.comboBoxAtoresEditar.setEnabled(false);
        this.textAtoresEditar.setEnabled(false);
        this.substituirAtorEditar.setEnabled(false);
        this.botaoSalvar.setEnabled(false);
        this.labelTemporada.setVisible(false);
        this.textTemporadas.setVisible(false);
        this.ultimoConteudoPesquisado = null;
    }

    private void habilitarCampos() {
        this.nomeConteudoEditar.setEnabled(true);
        this.comboBoxCategoria.setEnabled(true);
        this.comboBoxSubCategoria.setEnabled(true);
        this.diretorConteudoEditar.setEnabled(true);
        this.comboBoxAtoresEditar.setEnabled(true);
        this.textAtoresEditar.setEnabled(true);
        this.substituirAtorEditar.setEnabled(true);
        this.botaoSalvar.setEnabled(true);
    }

    private void atualizarCategoria() {
        this.comboBoxCategoria.removeAllItems();
        for (String categoria : this.netflixBancoDeDados.getCategorias()) {
            this.comboBoxCategoria.addItem(categoria);
        }
    }

    private void atualizarSubCategoria() {
        this.comboBoxSubCategoria.removeAllItems();
        for (String subCategoria : this.netflixBancoDeDados.getSubcategorias()) {
            this.comboBoxSubCategoria.addItem(subCategoria);
        }
    }

    private void atualizarAtores(Conteudo conteudo) {
        this.comboBoxAtoresEditar.removeAllItems();
        for (String ator : conteudo.getListaDeAtores()) {
            this.comboBoxAtoresEditar.addItem(ator);
        }
    }

    private String[] parserJComboBoxToArrayList() {
        String[] vetorDeAtores = new String[this.ultimoConteudoPesquisado.getListaDeAtores().length];
        for (int i = 0; i < vetorDeAtores.length; i++) {
            vetorDeAtores[i] = (String) this.comboBoxAtoresEditar.getItemAt(i);
        }
        return vetorDeAtores;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeConteudoPesquisar = new javax.swing.JTextField();
        pesquisarBotao = new javax.swing.JButton();
        nomeConteudoEditar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        diretorConteudoEditar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();
        voltarTelaADMBotao = new javax.swing.JButton();
        comboBoxCategoria = new javax.swing.JComboBox<>();
        comboBoxSubCategoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        comboBoxAtoresEditar = new javax.swing.JComboBox<>();
        textAtoresEditar = new javax.swing.JTextField();
        substituirAtorEditar = new javax.swing.JButton();
        checkBoxFilme = new javax.swing.JCheckBox();
        checkBoxSerie = new javax.swing.JCheckBox();
        labelTemporada = new javax.swing.JLabel();
        textTemporadas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("ATUALIZAÇÃO DE CONTEÚDO");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("PESQUISAR NOME:");

        nomeConteudoPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeConteudoPesquisarKeyTyped(evt);
            }
        });

        pesquisarBotao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        pesquisarBotao.setText("Pesquisar");
        pesquisarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarBotaoActionPerformed(evt);
            }
        });

        nomeConteudoEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeConteudoEditarKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("INFORMAÇÕES");

        diretorConteudoEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                diretorConteudoEditarKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("NOME:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("CATEGORIA:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("SUBCATEGORIA:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("DIRETOR:");

        botaoSalvar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        voltarTelaADMBotao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        voltarTelaADMBotao.setText("Voltar");
        voltarTelaADMBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaADMBotaoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("ATOR/ATRIZ:");

        textAtoresEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAtoresEditarKeyTyped(evt);
            }
        });

        substituirAtorEditar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        substituirAtorEditar.setText("Substituir");
        substituirAtorEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substituirAtorEditarActionPerformed(evt);
            }
        });

        checkBoxFilme.setText("Filme");
        checkBoxFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxFilmeActionPerformed(evt);
            }
        });

        checkBoxSerie.setText("Serie");
        checkBoxSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxSerieActionPerformed(evt);
            }
        });

        labelTemporada.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        labelTemporada.setText("TEMPORADAS:");
        this.labelTemporada.setVisible(false);

        this.textTemporadas.setVisible(false);
        textTemporadas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTemporadasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxAtoresEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textAtoresEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(substituirAtorEditar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nomeConteudoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(checkBoxFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(checkBoxSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(nomeConteudoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesquisarBotao))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboBoxSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(diretorConteudoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(voltarTelaADMBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeConteudoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarBotao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxFilme)
                    .addComponent(checkBoxSerie))
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nomeConteudoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboBoxSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(diretorConteudoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTemporada))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxAtoresEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAtoresEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(substituirAtorEditar))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(voltarTelaADMBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(botaoSalvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarTelaADMBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaADMBotaoActionPerformed
        this.setVisible(false);
        this.desabilitarCampos();
        this.telaAdministrador.setVisible(true);
    }//GEN-LAST:event_voltarTelaADMBotaoActionPerformed

    private void substituirAtorEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substituirAtorEditarActionPerformed
        String novoAtor = this.textAtoresEditar.getText();
        int posicaoDoNovoAtor = this.comboBoxAtoresEditar.getSelectedIndex();
        this.ultimoConteudoPesquisado.getListaDeAtores()[posicaoDoNovoAtor] = novoAtor;
        this.atualizarAtores(this.ultimoConteudoPesquisado);
    }//GEN-LAST:event_substituirAtorEditarActionPerformed

    private void pesquisarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarBotaoActionPerformed
        String nomeDoConteudoPesquisar = this.nomeConteudoPesquisar.getText();
        this.desabilitarCampos();
        if (this.checkBoxFilme.isSelected()) {
            this.ultimoConteudoPesquisado = this.netflixBancoDeDados.buscarFilme(nomeDoConteudoPesquisar);
            if (this.ultimoConteudoPesquisado != null) {
                this.habilitarCampos();
                this.nomeConteudoEditar.setText(this.ultimoConteudoPesquisado.getNome());
                this.atualizarCategoria();
                this.atualizarSubCategoria();
                this.diretorConteudoEditar.setText(this.ultimoConteudoPesquisado.getDiretor());
                this.atualizarAtores(this.ultimoConteudoPesquisado);
            } else {
                JOptionPane.showMessageDialog(null, "Nao existe filme com o nome informado");
            }
        } else {
            this.ultimoConteudoPesquisado = this.netflixBancoDeDados.buscarSerie(nomeDoConteudoPesquisar);
            if (this.ultimoConteudoPesquisado != null) {
                this.habilitarCampos();
                this.labelTemporada.setVisible(true);
                this.textTemporadas.setVisible(true);
                this.nomeConteudoEditar.setText(this.ultimoConteudoPesquisado.getNome());
                this.atualizarCategoria();
                this.atualizarSubCategoria();
                this.diretorConteudoEditar.setText(this.ultimoConteudoPesquisado.getDiretor());
                this.atualizarAtores(this.ultimoConteudoPesquisado);
                Serie serieAtual = (Serie) this.ultimoConteudoPesquisado;
                this.textTemporadas.setText(Integer.toString(serieAtual.getTemporadas()));
            } else {
                JOptionPane.showMessageDialog(null, "Nao existe serie com o nome informado");
            }
        }
    }//GEN-LAST:event_pesquisarBotaoActionPerformed

    private void textAtoresEditarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAtoresEditarKeyTyped
        String caracteres = "/-+,'!@#$%¨&()_+{}][´`^~,<.>:;/?|*=0123456789";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textAtoresEditarKeyTyped

    private void textTemporadasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTemporadasKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textTemporadasKeyTyped

    private void diretorConteudoEditarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diretorConteudoEditarKeyTyped
        String caracteres = "/-+,'!@#$%¨&()_+{}][´`^~,<.>:;/?|*=0123456789";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_diretorConteudoEditarKeyTyped

    private void nomeConteudoEditarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeConteudoEditarKeyTyped
        String caracteres = "/-+,'!@#$%¨&()_+{}][´`^~,<.>:;/?|*=0123456789";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_nomeConteudoEditarKeyTyped

    private void nomeConteudoPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeConteudoPesquisarKeyTyped
        String caracteres = "/-+,'!@#$%¨&()_+{}][´`^~,<.>:;/?|*=0123456789";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_nomeConteudoPesquisarKeyTyped

    private void checkBoxFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxFilmeActionPerformed
        if (this.checkBoxFilme.isSelected()) {
            this.checkBoxSerie.setEnabled(false);
        } else {
            this.checkBoxSerie.setEnabled(true);
        }
    }//GEN-LAST:event_checkBoxFilmeActionPerformed

    private void checkBoxSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxSerieActionPerformed
        if (this.checkBoxSerie.isSelected()) {
            this.checkBoxFilme.setEnabled(false);
        } else {
            this.checkBoxFilme.setEnabled(true);
        }
    }//GEN-LAST:event_checkBoxSerieActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String novoNome = this.nomeConteudoEditar.getText();
        String novaCategoria = (String) this.comboBoxCategoria.getSelectedItem();
        String novaSubCategoria = (String) this.comboBoxSubCategoria.getSelectedItem();
        String novoDiretor = this.diretorConteudoEditar.getText();
        if (this.ultimoConteudoPesquisado instanceof Filme) {
            this.ultimoConteudoPesquisado.setNome(novoNome);
            this.ultimoConteudoPesquisado.setCategoria(novaCategoria);
            this.ultimoConteudoPesquisado.setSubcategoria(novaSubCategoria);
            this.ultimoConteudoPesquisado.setDiretor(novoDiretor);
            JOptionPane.showMessageDialog(null, "Filme salvo com sucesso");
        } else {
            Serie serie = (Serie) this.ultimoConteudoPesquisado;
            int novaTemporada = Integer.parseInt(this.textTemporadas.getText());
            this.ultimoConteudoPesquisado.setNome(novoNome);
            this.ultimoConteudoPesquisado.setCategoria(novaCategoria);
            this.ultimoConteudoPesquisado.setSubcategoria(novaSubCategoria);
            this.ultimoConteudoPesquisado.setDiretor(novoDiretor);
            serie.setTemporadas(novaTemporada);
            JOptionPane.showMessageDialog(null, "Serie salva com sucesso");
        }
        this.setVisible(false);
        this.desabilitarCampos();
        this.telaAdministrador.setVisible(true);
    }//GEN-LAST:event_botaoSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarConteudo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JCheckBox checkBoxFilme;
    private javax.swing.JCheckBox checkBoxSerie;
    private javax.swing.JComboBox<String> comboBoxAtoresEditar;
    private javax.swing.JComboBox<String> comboBoxCategoria;
    private javax.swing.JComboBox<String> comboBoxSubCategoria;
    private javax.swing.JTextField diretorConteudoEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTemporada;
    private javax.swing.JTextField nomeConteudoEditar;
    private javax.swing.JTextField nomeConteudoPesquisar;
    private javax.swing.JButton pesquisarBotao;
    private javax.swing.JButton substituirAtorEditar;
    private javax.swing.JTextField textAtoresEditar;
    private javax.swing.JTextField textTemporadas;
    private javax.swing.JButton voltarTelaADMBotao;
    // End of variables declaration//GEN-END:variables
}
