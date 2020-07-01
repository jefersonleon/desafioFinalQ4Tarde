package desafiofinalquest04;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class DesafioFinalQuest04 {

    /**
     * Escrever um algoritmo que leia o número de identificação, as 3 notas
     * obtidas por um aluno nas 3 verificações e a média dos exercícios que
     * fazem parte da avaliação. Calcular a média de aproveitamento, usando a
     * fórmula: ma = (n1 + n2 * 2 + n3 * 3 + me)/ 7; //media ponderada A
     * atribuição de conceitos obedece a tabela abaixo: Média de Aproveitamento
     * Conceito -------------------------------------------------------- 9,0 A
     * 7,5 e 9,0 B 6,0 e 7,5 C 4,0 e 6,0 D 4,0 E
     *
     * O algoritmo deve escrever o número do aluno, suas notas, a média dos
     * exercícios, a média de aproveitamento, o conceito correspondente e a
     * mensagem: APROVADO se o conceito for A, B ou C e REPROVADO se o conceito
     * for D ou E.
     */
    public static void main(String[] args) {
        String numAluno, conceito;
        double n1, n2, n3, me, ma;

        numAluno = JOptionPane.showInputDialog("Número de Identificação:");
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3"));
        me = Double.parseDouble(JOptionPane.showInputDialog("Média de Exercicios"));

        ma = (n1 + n2 * 2 + n3 * 3 + me) / 7; //media ponderada 
        DecimalFormat f = new DecimalFormat("0.0");
        if (ma >= 9) {
            conceito = "\nSeu conceito final é -> A - Situação: Aprovado";
        } else if (ma >= 7.5 && ma < 9) {
            conceito = "\nSeu conceito final é -> B - Situação: Aprovado";
        } else if (ma >= 6 && ma < 7.5) {
            conceito = "\nSeu conceito final é -> C - Situação: Aprovado";
        } else if (ma >= 4 && ma < 6) {
            conceito = "\nSeu conceito final é -> D - Situação: Reprovado";
        } else {
            conceito = "\nSeu conceito final é -> E - Situação: Reprovado";
        }  //fim se

        JOptionPane.showMessageDialog(null, "Número identificação do aluno: " + numAluno
                + "\nNota 1:" + n1
                + "\nNota 2:" + n2
                + "\nNota 3:" + n3
                + "\nMédia Exercícios:" + me
                + "\n---------------------------------------------------"
                + "\nMédia de Aproveitamento é " + f.format(ma)
                + "\n--------------------------------------------------"
                + conceito);

    }

}
