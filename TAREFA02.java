import javax.swing.JOptionPane;

public class TAREFA02 {
    public static void main(String[] args) {
	
        float valNeg, Venal, percentImposto, valImposto;

        valNeg = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor Negociado:"));
        Venal  = Float.parseFloat(JOptionPane.showInputDialog("Insira o Valor Venal:"));
        percentImposto = Float.parseFloat(JOptionPane.showInputDialog("Insira o Percentual do Imposto:"));

        if (valNeg > Venal)
            valImposto = (valNeg*percentImposto)/100;
        else
            valImposto = (Venal*percentImposto)/100;

        JOptionPane.showMessageDialog(null,"Valor do Imposto: " + valImposto);

    }
}