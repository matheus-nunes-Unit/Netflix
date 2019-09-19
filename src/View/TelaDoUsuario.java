/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Conteudo;
import Model.Netflix;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus Nunes
 */
public class TelaDoUsuario extends javax.swing.JFrame {

    private Netflix netflixBancoDeDadosAtual;
    private JFrame telaanterior;
    private TelaConfiguracaoUsuario telaDeConfiguracaoDoUsuario;
    private Cliente cliente;

    /**
     * Creates new form teste
     */
    public TelaDoUsuario() {
        initComponents();
        iniciandoPaineis();
    }

    public TelaDoUsuario(Netflix netflixBancoDeDadosAtual, JFrame telaanterior, Cliente cliente) {
        this.netflixBancoDeDadosAtual = netflixBancoDeDadosAtual;
        this.telaanterior = telaanterior;
        this.cliente = cliente;
        this.telaDeConfiguracaoDoUsuario = new TelaConfiguracaoUsuario(this.netflixBancoDeDadosAtual, this);
        initComponents();
        iniciandoPaineis();
        this.AtualizaCadastradosRecentemente();
        this.resetandoBotaoDeResultadoDaPesquisa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void iniciandoPaineis() {
        this.painelDeMelhoresAvaliados = new javax.swing.JPanel();
        this.painelDeRecentementeAvaliados = new javax.swing.JPanel();

        this.painelDeMelhoresAvaliados.setLayout(new FlowLayout());
        this.scrollPaneMelhoresAvaliados.setViewportView(this.painelDeMelhoresAvaliados);
        this.painelDeRecentementeAvaliados.setLayout(new FlowLayout());
        this.scrollPaneAdicionadosRecentemente.setViewportView(this.painelDeRecentementeAvaliados);
    }

    private void resetandoBotaoDeResultadoDaPesquisa() {
        ActionListener[] actionListener = this.botaoResultadoPesquisa.getActionListeners();
        if (actionListener.length != 0) {
            this.botaoResultadoPesquisa.removeActionListener(actionListener[0]);
        }
        this.botaoResultadoPesquisa.setIcon(null);
        this.botaoResultadoPesquisa.setVisible(false);
    }

    private void AtualizaCadastradosRecentemente() {
        ArrayList<Conteudo> adicionadosRecentemente = this.netflixBancoDeDadosAtual.avaliadosRecentemente();
        for (int i = 0; i < adicionadosRecentemente.size(); i++) {
            Conteudo conteudoAtual = adicionadosRecentemente.get(i);
            JButton botao = new JButton();
            botao.setPreferredSize(new Dimension(150, 115));
            botao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botaoDeConteudoActionPerformed(evt, conteudoAtual);
                }
            });
            botao.setIcon(conteudoAtual.getIcone());
            botao.setIcon(this.redimensionar(botao, 150, 115));
            this.painelDeRecentementeAvaliados.add(botao);
        }
        this.painelDeRecentementeAvaliados.revalidate();
        this.painelDeRecentementeAvaliados.repaint();
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scrollPaneAdicionadosRecentemente = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        geraAvaliados = new javax.swing.JButton();
        scrollPaneMelhoresAvaliados = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        textFieldPesquisa = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();
        botaoResultadoPesquisa = new javax.swing.JButton();
        sairDaTela = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botaoDeConfiguracao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(485, 32767));

        jLabel2.setText("Avaliados Recentemente");

        scrollPaneAdicionadosRecentemente.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPaneAdicionadosRecentemente.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jLabel1.setText("Melhores Avaliados");

        geraAvaliados.setText("Teste");
        geraAvaliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geraAvaliadosActionPerformed(evt);
            }
        });

        scrollPaneMelhoresAvaliados.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPaneMelhoresAvaliados.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jLabel4.setText("Pesquisar Nome Do Filme");

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        sairDaTela.setText("Sair");
        sairDaTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairDaTelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneAdicionadosRecentemente)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneMelhoresAvaliados, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldPesquisa)
                                .addComponent(botaoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoResultadoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(geraAvaliados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sairDaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoPesquisar))
                    .addComponent(botaoResultadoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneAdicionadosRecentemente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(scrollPaneMelhoresAvaliados, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sairDaTela)
                            .addComponent(geraAvaliados))
                        .addContainerGap())))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logooficial-1.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        botaoDeConfiguracao.setText("Configuracao");
        botaoDeConfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeConfiguracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoDeConfiguracao, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(botaoDeConfiguracao, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geraAvaliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geraAvaliadosActionPerformed
        try {
            String valorMinimoString = JOptionPane.showInputDialog("Informe o valor minimo de avaliacao a ser demonstrado:");
            Double valorMinimo = Double.parseDouble(valorMinimoString);
            this.painelDeMelhoresAvaliados.removeAll();
            ArrayList<Conteudo> melhoresAvaliados = this.netflixBancoDeDadosAtual.melhoresAvaliados(valorMinimo);
            for (int i = 0; i < melhoresAvaliados.size(); i++) {
                Conteudo conteudoAtual = melhoresAvaliados.get(i);
                JButton botao = new JButton();
                botao.setPreferredSize(new Dimension(150, 115));
                botao.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botaoDeConteudoActionPerformed(evt, conteudoAtual);
                    }
                });
                botao.setIcon(conteudoAtual.getIcone());
                botao.setIcon(this.redimensionar(botao, 150, 115));
                this.painelDeMelhoresAvaliados.add(botao);
            }
            this.painelDeMelhoresAvaliados.revalidate();
            this.painelDeMelhoresAvaliados.repaint();
            this.pack();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Informe um valor numerico");
        }
    }//GEN-LAST:event_geraAvaliadosActionPerformed

    private void botaoDeConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeConfiguracaoActionPerformed
        this.setVisible(false);
        this.telaDeConfiguracaoDoUsuario.setVisible(true);    }//GEN-LAST:event_botaoDeConfiguracaoActionPerformed

    private void sairDaTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairDaTelaActionPerformed
        this.setVisible(false);
        this.telaanterior.setVisible(true);
    }//GEN-LAST:event_sairDaTelaActionPerformed

    private void botaoDeConteudoActionPerformed(java.awt.event.ActionEvent evt, Conteudo conteudo) {
        new telaDosConteudos(conteudo, this, this.cliente).setVisible(true);
    }

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        this.resetandoBotaoDeResultadoDaPesquisa();
        String nomeDoConteudo = this.textFieldPesquisa.getText();
        if (!"".equals(nomeDoConteudo)) {
            Conteudo conteudoPesquisado = this.netflixBancoDeDadosAtual.buscarConteudo(nomeDoConteudo);
            if (conteudoPesquisado != null) {
                this.botaoResultadoPesquisa.setIcon(conteudoPesquisado.getIcone());
                this.botaoResultadoPesquisa.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botaoDeConteudoActionPerformed(evt, conteudoPesquisado);
                    }
                });
                this.botaoResultadoPesquisa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Nao existe filme com o nome informado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informe o nome do conteúdo para ser pesquisado!");
        }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private ImageIcon redimensionar(JButton botao, int xLargura, int yAltura) {
        ImageIcon img = new ImageIcon(botao.getIcon().toString());
        img.setImage(img.getImage().getScaledInstance(xLargura, yAltura, 100));
        return img;
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
            java.util.logging.Logger.getLogger(TelaDoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDoUsuario().setVisible(true);
            }
        });
    }

    public Cliente getCliente() {
        return cliente;
    }

    private javax.swing.JPanel painelDeRecentementeAvaliados;
    private javax.swing.JPanel painelDeMelhoresAvaliados;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDeConfiguracao;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoResultadoPesquisa;
    private javax.swing.JButton geraAvaliados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sairDaTela;
    private javax.swing.JScrollPane scrollPaneAdicionadosRecentemente;
    private javax.swing.JScrollPane scrollPaneMelhoresAvaliados;
    private javax.swing.JTextField textFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
