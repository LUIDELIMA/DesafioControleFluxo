import exception.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("----------DIO Trilha Java Básico----------");
            System.out.println("-------------Controle de Fluxo-----------");
            System.out.println("Digite dois valores para saber o número de interações entre eles");
            System.out.println("Digite o primeiro parâmetro: ");
            int paramentro1 = lerInteiro(input);

            System.out.println("Digite o segundo parâmetro: ");
            int paramentro2 = lerInteiro(input);

            try{
                contar(paramentro1, paramentro2);
            }catch (ParametrosInvalidosException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }
        static void contar(int paramentro1, int paramentro2 ) throws ParametrosInvalidosException {
            if (paramentro1 >= paramentro2){
                throw new ParametrosInvalidosException();

            }else{
                int diferenca = paramentro2 - paramentro1;
                for (int i = 1; i <= diferenca; ++i) {
                    System.out.println("Imprimindo a " + i + "ª interação: " + i);


                }
            }
}
public static int lerInteiro(Scanner scanner) {
    while (true) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número inteiro:");
        }
    }
}

}
