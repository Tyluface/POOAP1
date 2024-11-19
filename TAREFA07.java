import java.util.Scanner;

public class TAREFA07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o Número para gerar a tabuada: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = i * num;
            System.out.println(i + " x " + num + " = " + resultado);
        }
        input.close();
    }
}