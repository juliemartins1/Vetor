import java.util.Scanner;
public class Exer06 {
    public static void main(String[]args){
       Scanner in = new Scanner(System.in);
        String v[]= new String[10];

        for(int i=0;i<v.length;i++){
            System.out.println("Informe uma letra");
            v[i]=in.next();
        }
         for(int i=0;i<v.length;i++){
            System.out.print(v[i]);
        }
    }
}
