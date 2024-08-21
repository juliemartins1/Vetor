import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] votos = new int[5];

        while (true) {
            System.out.print("Digite o número do candidato (1-5) ou -1 para encerrar: ");
            int voto = scanner.nextInt();

            if (voto == -1) {
                break;
            } else if (voto >= 1 && voto <= 5) {
                votos[voto - 1]++;
            } else {
                System.out.println("Voto inválido. Tente novamente.");
            }
        }

        int vencedor = 0;
        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > votos[vencedor]) {
                vencedor = i;
            }
        }

        System.out.println("O candidato vencedor é o número " + (vencedor + 1) + " com " + votos[vencedor] + " votos.");
        scanner.close();
    }
}