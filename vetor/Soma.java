public class Soma {
    public static void main(String[] args) {
        int v1[]={1,2,3,4,5};
        int v2[]={2,2,2,2,2};
        int v3[]=new int[v1.length+v2.length];
        for(int i=0;i<v1.length;i++){
          System.out.print("\nvetor1 eh: "+ v1[i] + " ");
        }
        for(int i=0;i<v2.length;i++){
            System.out.print("\nvetor2 eh: "+ v2[i] + " ");
            
        }
    
        for(int i=0;i<v3.length;i++){
            int valor1=v1[i];
            int valor2=v2[i];

            v3[i]=valor1+valor2;
            System.out.print("\nO vetor 3 eh: "+ v3[i]+" ");
                           
         }
    }         
       
}

