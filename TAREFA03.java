import javax.swing.JOptionPane;

public class TAREFA03 {
    public static void main(String[] args) {
    
        float p1, p2, trab, media;
        String result;

        p1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a Nota da P1:"));
        p2  = Float.parseFloat(JOptionPane.showInputDialog("Informe a Nota da P2:"));
        trab = Float.parseFloat(JOptionPane.showInputDialog("Informe a Nota do Trabalho:"));

        media = (p1 + p2 + trab) / 3;

        if (media >= 6)
            result = "Aprovado";
        else
            result = "Reprovado";

        JOptionPane.showMessageDialog(null, "Média: " + media + " \nResultado: " + result);
    }
}
