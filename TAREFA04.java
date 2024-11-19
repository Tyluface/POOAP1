import javax.swing.*;

public class TAREFA04 {
    public static void main(String[] args) {

        float idade, contrib;
		
        String[] sexo = {"Masculino=", "Feminino"};
		
        idade = Float.parseFloat(JOptionPane.showInputDialog("Informe sua Idade:"));
        contrib = Float.parseFloat(JOptionPane.showInputDialog("Informe seus anos de Contribuição:"));
		
        int sex = JOptionPane.showOptionDialog(
                null
                , "Selecione o Sexo?"
                , "Sexo"
                , JOptionPane.YES_NO_OPTION
                , JOptionPane.PLAIN_MESSAGE
                , null
                , sexo
                , null
        );

        if(sex == 0) {
            float minIdade = 65;
            float minTempo = 35;
            if (idade >= 65 || contrib >= 35) {
                JOptionPane.showMessageDialog(null,"Você já tem o direito a aposentadoria");
            }else{
                JOptionPane.showMessageDialog(null,"Faltam "+(minIdade-idade)+" anos para se aposentar por idade");
                JOptionPane.showMessageDialog(null,"Faltam "+(minTempo-contrib)+" anos para se aposentar por tempo de contribuição");
            }

        }
		else {
            float minIdade = 60;
            float minTempo = 30;
            if (idade >= 60 || contrib >= 30) {
                JOptionPane.showMessageDialog(null,"Você já tem o direito a aposentadoria");
            }else{
                JOptionPane.showMessageDialog(null,"Faltam "+(minIdade-idade)+" anos para se aposentar por idade");
                JOptionPane.showMessageDialog(null,"Faltam "+(minTempo-contrib)+" anos para se aposentar por tempo de contribuição");
            }

        }
    }
}