import java.util.Scanner;
public class Exer11 {
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe os tamanho de vetor 1 e 2");
        int tamanho1=in.nextInt();
        int tamanho2=in.nextInt();
        int tamanho3=tamanho1;
        int v1[]=new int[tamanho1];
        int v2[]=new int[tamanho2];
        int v3[]=new int[tamanho3];
        if(v1.length<v2.length){
            tamanho3=tamanho2;
        }
        for(int i=0;i<v1.length;i++){
            System.out.println("Informe um valor");
            int valor=in.nextInt();
            v1[i]=valor;
          }
       
        for(int i=0;i<v1.length;i++){
          System.out.print( v1[i] + " ");
        }
       
        for(int i=0;i<v2.length;i++){
            System.out.println("Informme valores ");
           int valor2=in.nextInt();
           v2[i]=valor2;
            
        }
        for(int i=0;i<v2.length;i++){
            System.out.print( v2[i] + " ");
            
        }
        
        System.out.println("\nvetor 3"+"\n");
        for(int i=0;i<v3.length;i++){

            int valor1=v1[i];
            if(i>=v1.length){
                valor1=0;
            }
            else{
                valor1=v1[i];
            }
            int valor2=v2[i];
            if(i>=v2.length){
                valor2=0;
            }
            else{
                valor2=v2[i];
            }

            v3[i]=valor1+valor2;
                                       
         }
         for(int i=0;i<v3.length;i++){
            System.out.print( v3[i]+" ");
         }
        
    }         
       
}