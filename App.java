import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
Exemplos:
Entrada: Saída:
12 1 5.30
16 2 5.10
VALOR A PAGAR: R$ 15.50
Entrada: Saída:
13 2 15.30
161 4 5.20
VALOR A PAGAR: R$ 51.40
Entrada: Saída:
1 1 15.10
2 1 15.10
VALOR A PAGAR: R$ 30.20 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código de uma peça 1: ");
        int codigo1 = sc.nextInt();
        System.out.println("Digite o número de peças 1:");
        int numero1 = sc.nextInt();
        System.out.println("Digite o valor unitário de cada peça 1: ");
        double valor1 = sc.nextDouble();
        System.out.println("Digite o codigo de uma peça 2: ");
        int codigo2 = sc.nextInt();
        System.out.println("Digite o número de peças 2: ");
        int numero2 = sc.nextInt();
        System.out.println("Digite o valor unitário de cada peça 2: ");
        double valor2 = sc.nextDouble();
        double total = (numero1 * valor1) + (numero2 * valor2);
        System.out.println("VALOR A PAGAR: R$ " + total);
    }
}
