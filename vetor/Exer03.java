import java.util.Scanner;
public class Exer03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota=0.0f,notas=0.0f,media=0.0f;
        float vetor[]= new float[10];
        for(int i=0;i<vetor.length;i++){
            System.out.println("Informe a posicao e as notas:");
            int pos=in.nextInt();
            nota=in.nextFloat();
            vetor[pos]=nota;
            notas=notas+vetor[pos];
            }
        for(int i=0;i<vetor.length;i++){
           // System.out.println(vetor[i]+ "");
        }
        media=notas/vetor.length;
         System.out.println("A media eh: " + media);
    }
}
