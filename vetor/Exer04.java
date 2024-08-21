import java.util.Scanner;
public class Exer04 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int v[] = new int[10];
      String par=" ",impares=" ";
      for(int i=0;i<v.length;i++){
        System.out.println("Informe 10 valores");
      
        v[i]=in.nextInt();  

      }
      for(int i=0;i<v.length;i++){
        System.out.print(v[i] +" ");
      }
      for(int i=0;i<v.length;i++){
        if(v[i]%2==0){
        par=par+v[i];            

        }if(v[i]%2!=0){
          impares=impares+v[i];
           
        }
                     
      }
      System.out.print("\n Os numeros pares são: " + par + " ");
      System.out.println();
      System.out.println("Os numeros impares são: " + impares + " ");
      System.out.println();
         
    }
}
