import javax.swing.*;

public class TAREFA05 {
    public static void main(String[] args) {
        int i = 1;
        int qtd = 4;
        int total = 0;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        do {
            int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da Resistência " + i + ": "));
            total += valor;

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }

            i++;
        } while (i <= qtd);

        JOptionPane.showMessageDialog(null, "Total: " + total);
        JOptionPane.showMessageDialog(null, "Menor: " + menor);
        JOptionPane.showMessageDialog(null, "Maior: " + maior);
    }
}
