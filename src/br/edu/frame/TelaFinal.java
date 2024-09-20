/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.frame;

import br.edu.model.Candidato;
import java.awt.Color;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.*;

/**
 *
 * @author jm
 */
public class TelaFinal extends javax.swing.JFrame {

    /**
     * Creates new form TelaFinal
     */
    
    public TelaFinal(Candidato[]candidatos, int votosBrancos, int votosNulos) {
        initComponents();
//        initCandidatos();
        Arrays.sort(candidatos, new Comparator<Candidato>() {
            @Override
            public int compare(Candidato c1, Candidato c2) {
                return Integer.compare(c2.votos, c1.votos); // Ordem decrescente
            }
        });
        for(int i = 1 ; i<9;i++){
            if(candidatos[0].votos == candidatos[i].votos){
                lblFotoPrefeitoVencedor.setText("EMPATE");
                lblFotoVicePrefeitoVencedor.setText("EMPATE");
                lblPrimeiro.setForeground(Color.BLACK);
                break;
            } else{
                lblFotoPrefeitoVencedor.setIcon(new javax.swing.ImageIcon(getClass().getResource(candidatos[0].fotoprefeito)));
                lblFotoVicePrefeitoVencedor.setIcon(new javax.swing.ImageIcon(getClass().getResource(candidatos[0].fotovice)));
                lblVencedorLadoFoto.setText(candidatos[0].nome);
                lblVencedorViceLadoFoto.setText(candidatos[0].vice);
            }
        }
        

        lblPrimeiro.setText("1º "+candidatos[0].nome + " - Votos: " + candidatos[0].votos);
        lblSegundo.setText("2º "+candidatos[1].nome + " - Votos: " + candidatos[1].votos);
        lblTerceiro.setText("3º "+candidatos[2].nome + " - Votos: " + candidatos[2].votos);
        lblQuarto.setText("4º "+candidatos[3].nome + " - Votos: " + candidatos[3].votos);
        lblQuinto.setText("5º "+candidatos[4].nome + " - Votos: " + candidatos[4].votos);
        lblSexto.setText("6º "+candidatos[5].nome + " - Votos: " + candidatos[5].votos);
        lblSetimo.setText("7º "+candidatos[6].nome + " - Votos: " + candidatos[6].votos);
        lblOitavo.setText("8º "+candidatos[7].nome + " - Votos: " + candidatos[7].votos);
        lblNono.setText("9º "+candidatos[8].nome + " - Votos: " + candidatos[8].votos);
        lblBrancos.setText(votosBrancos+"");
        lblNulos.setText(votosNulos+"");
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneViceP = new javax.swing.JPanel();
        lblFotoVicePrefeitoVencedor = new javax.swing.JLabel();
        lblVencedorViceLadoFoto = new javax.swing.JLabel();
        panePrefeito = new javax.swing.JPanel();
        lblFotoPrefeitoVencedor = new javax.swing.JLabel();
        lblVencedorLadoFoto = new javax.swing.JLabel();
        paneColocacao = new javax.swing.JPanel();
        lblPrimeiro = new javax.swing.JLabel();
        lblSegundo = new javax.swing.JLabel();
        lblTerceiro = new javax.swing.JLabel();
        lblQuarto = new javax.swing.JLabel();
        lblQuinto = new javax.swing.JLabel();
        lblSexto = new javax.swing.JLabel();
        lblSetimo = new javax.swing.JLabel();
        lblOitavo = new javax.swing.JLabel();
        lblNono = new javax.swing.JLabel();
        lblNulos = new javax.swing.JLabel();
        lblBrancos = new javax.swing.JLabel();
        telavotacaofigma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneViceP.setOpaque(false);
        paneViceP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFotoVicePrefeitoVencedor.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        paneViceP.add(lblFotoVicePrefeitoVencedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 6, 183, 160));

        lblVencedorViceLadoFoto.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        paneViceP.add(lblVencedorViceLadoFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 190, 80));

        getContentPane().add(paneViceP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 420, 170));

        panePrefeito.setOpaque(false);
        panePrefeito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFotoPrefeitoVencedor.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        panePrefeito.add(lblFotoPrefeitoVencedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, 183, 160));

        lblVencedorLadoFoto.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        panePrefeito.add(lblVencedorLadoFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 190, 80));

        getContentPane().add(panePrefeito, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 190, 420, 170));

        paneColocacao.setOpaque(false);
        paneColocacao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrimeiro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPrimeiro.setForeground(new java.awt.Color(0, 102, 51));
        lblPrimeiro.setText("1:");
        paneColocacao.add(lblPrimeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 30));

        lblSegundo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSegundo.setText("2:");
        paneColocacao.add(lblSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 370, 30));

        lblTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTerceiro.setText("3:");
        paneColocacao.add(lblTerceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 370, 30));

        lblQuarto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuarto.setText("4:");
        paneColocacao.add(lblQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 370, 30));

        lblQuinto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuinto.setText("5:");
        paneColocacao.add(lblQuinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 370, 30));

        lblSexto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSexto.setText("6:");
        paneColocacao.add(lblSexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 370, 30));

        lblSetimo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSetimo.setText("7:");
        paneColocacao.add(lblSetimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 370, 30));

        lblOitavo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblOitavo.setText("8:");
        paneColocacao.add(lblOitavo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 370, 30));

        lblNono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNono.setText("9:");
        paneColocacao.add(lblNono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 370, 30));

        getContentPane().add(paneColocacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 410, 310));

        lblNulos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(lblNulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 555, 70, 50));

        lblBrancos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(lblBrancos, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 555, 70, 50));

        telavotacaofigma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/images/TelaResultado.jpg"))); // NOI18N
        getContentPane().add(telavotacaofigma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        int votosBrancos = 0;
        int votosNulos = 0;
        Candidato[]candidatos = new Candidato[9];
        candidatos[0] = new Candidato("André Fernandes", "PL", "Alcyvania Pinheiro", "22","/br/edu/images/fotoAndreFernandes.jpg", "/br/edu/images/fotoAlcyvaniaPinheiro.jpg");
        candidatos[1] = new Candidato("Wagner Sousa", "União Brasil", "Edilene Santos", "44","/br/edu/images/fotoCapitaoWagner.jpg" ,"/br/edu/images/fotoEdileneSantos.jpg");
        candidatos[2] = new Candidato("José Sarto", "PDT", "Elcio Batista", "12", "/br/edu/images/fotoSarto.jpg", "/br/edu/images/fotoElcioBatista.jpg");
        candidatos[3] = new Candidato("Evandro Leitão", "PT", "Gabriella Aguiar", "13", "/br/edu/images/fotoEvandroLeitao.jpg", "/br/edu/images/fotoGabriellaAguiar.jpg");
        candidatos[4] = new Candidato("George Lima", "Solidariedade", "Rachel Girão", "77", "/br/edu/images/fotoGeorgeLima.jpeg", "/br/edu/images/fotoRachelGirao.jpeg");
        candidatos[5] = new Candidato("Técio Nunes", "PSol", "Cindy Carvalho", "50","/br/edu/images/fotoTecioNunes.jpg", "/br/edu/images/fotoCindyCarvalho.jpg");
        candidatos[6] = new Candidato("Zé Batista", "PSTU", "Maria de Lourdes", "16", "/br/edu/images/fotoZeBatista.jpg", "/br/edu/images/fotoMalu.jpg");
        candidatos[7] = new Candidato("Eduardo Girão", "Novo", "Silvana Bezerra", "30", "/br/edu/images/fotoEduardoGirao.jpeg", "/br/edu/images/fotoSilvanaBezerra.jpeg");
        candidatos[8] = new Candidato("Chico Malta", "PCB", "Roberto Cabeludo", "21", "/br/edu/images/fotoChicoMalta.jpg", "/br/edu/images/fotoRobertoCabeludo.jpg");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFinal(candidatos, votosBrancos, votosNulos).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBrancos;
    private javax.swing.JLabel lblFotoPrefeitoVencedor;
    private javax.swing.JLabel lblFotoVicePrefeitoVencedor;
    private javax.swing.JLabel lblNono;
    private javax.swing.JLabel lblNulos;
    private javax.swing.JLabel lblOitavo;
    private javax.swing.JLabel lblPrimeiro;
    private javax.swing.JLabel lblQuarto;
    private javax.swing.JLabel lblQuinto;
    private javax.swing.JLabel lblSegundo;
    private javax.swing.JLabel lblSetimo;
    private javax.swing.JLabel lblSexto;
    private javax.swing.JLabel lblTerceiro;
    private javax.swing.JLabel lblVencedorLadoFoto;
    private javax.swing.JLabel lblVencedorViceLadoFoto;
    private javax.swing.JPanel paneColocacao;
    private javax.swing.JPanel panePrefeito;
    private javax.swing.JPanel paneViceP;
    private javax.swing.JLabel telavotacaofigma;
    // End of variables declaration//GEN-END:variables
}