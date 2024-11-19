import javax.swing.*;

public class TAREFA06 {
    public static void main(String[] args) {
        int i=0;
        String user = "java8";
        String pass   = "java8";
        String atptUser, atptPass;
        boolean login;

        do {
            atptUser = JOptionPane.showInputDialog(null, "Insira o nome de Usuário:");
            atptPass   = JOptionPane.showInputDialog(null, "Insira a Senha:");
			
            i++;
            login = atptUser.equals(user) && atptPass.equals(pass);
			
            if(!login)
                JOptionPane.showMessageDialog(null, "Usuário e/ouSenha Inválidos. Você possui mais " + (3 - i) + " tentativas de acesso. ");
				
        } while (!login && i < 3);

        if(login) {
            JOptionPane.showMessageDialog(null, "Acesso realizado com sucesso");
        }
    }
}
