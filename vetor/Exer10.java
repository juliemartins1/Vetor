import java.util.Scanner;
public class Exer10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v1[]= new int[10];
        int v2[]=new int[10];

        for(int i=0;i<v1.length;i++){
            System.out.println("Infome valores");
            v1[i]=in.nextInt();
        }
        for(int i=0;i<v1.length;i++){
          System.out.print(v1[i] + " ");
        }
        for (int i = 0; i < 10; i++) {
            int soma = 0;
            for (int j = 0; j <= i; j++) {
                soma += v1[j];
            }
            v2[i] = soma;
        }

        // Exibindo os valores de v2
        System.out.println("\nValores de v2:");
        for (int i = 0; i < 10; i++) {
            System.out.println("v2[" + i + "] = " + v2[i]);
    }
}
}