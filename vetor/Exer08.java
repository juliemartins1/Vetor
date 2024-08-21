 import java.util.Scanner;

   public class Exer08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int pos;

        for(int i=0;i<v.length;i++){
          System.out.print(v[i]+ " ");
            }
          System.out.println();
          // Escolha do elemento pelo usuário
        System.out.print("Digite o valor do elemento que deseja comparar: ");
        int elementoEscolhido = in.nextInt();

        // Contagem dos elementos
        int maiores = 0;
        int menores = 0;
        int iguais = 0;

        for (int valor : v) {
            if (valor > elementoEscolhido) {
                maiores++;
            } else if (valor < elementoEscolhido) {
                menores++;
            } else {
                iguais++;
            }
        }

        // Exibição dos resultados
        System.out.println("Quantidade de elementos maiores: " + maiores);
        System.out.println("Quantidade de elementos menores: " + menores);
        System.out.println("Quantidade de elementos iguais: " + iguais);


  }
}
