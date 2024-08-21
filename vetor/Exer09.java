import java.util.Scanner;

public class Exer09{
    public static void main(String[] args) {
        // Array pré-definido com 5 valores
        int[] valores = {3, 7, 1, 9, 5};
        boolean[] acertados = new boolean[5];
        Scanner in = new Scanner(System.in);
        int acertos = 0;

        System.out.println("Tente adivinhar os 5 valores do array!");

        while (acertos < 5) {
            System.out.print("Digite um valor: ");
            int palpite = in.nextInt();

            for (int i = 0; i < valores.length; i++) {
                if (palpite == valores[i] && !acertados[i]) {
                    acertados[i] = true;
                    acertos++;
                    System.out.println("Você acertou o valor " + palpite + "!");
                    break;
                }
            }

            if (acertos < 5) {
                System.out.println("Continue tentando!");
            }
        }

        System.out.println("Parabéns! Você acertou todos os valores.");
    
    }
}