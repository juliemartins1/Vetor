import java.util.Scanner;
public class Exer01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,pos=0;
        String pos1="";
        int[] vetor = new int[5];
        String inverso= "";
        for(int i=0;i<vetor.length;i++){
            System.err.println("Informe a posiçao e valor");
            pos=in.nextInt();
            n=in.nextInt();
            vetor[pos]=n;
            }
            for(int i=0;i<vetor.length;i++){
                System.out.print(vetor[i] + "  ");
            }
            System.out.print(" ");
            
            for (int i = vetor.length - 1; i >= 0  ; i--  ) {
                System.out.print(vetor[i] + "  ");
            }
    
    }
}