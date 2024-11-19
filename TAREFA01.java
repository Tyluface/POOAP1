import java.util.Scanner;

public class TAREFA01 {
    public static void main(String[] args) {

        double valProd, desc, valDesc, valFinal;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Insira o Valor do Produto: ");
            valProd  = input.nextDouble();
            System.out.print("Insira a porcentagem de desconto: ");
            desc = input.nextDouble();
            
            valDesc = (valProd*desc)/100;
            valFinal = valProd-valDesc;
            
            System.out.println("Valor do Desconto:  " + valDesc);
            System.out.println("Valor do Produto com Desconto:  " + valFinal );
        }
    }
}