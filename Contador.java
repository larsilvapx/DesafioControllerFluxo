import java.util.Scanner;

/**
 * Contador
 */
public class Contador {    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor ");
        int parametro1 = sc.nextInt();
        System.out.println("Digite o segundo valor ");
        int parametro2 = sc.nextInt();        

        try {

            if (parametro1 >= parametro2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            for (int i = parametro1; i <= parametro2; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Os parâmetros devem ser números inteiros válidos.");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
}
}