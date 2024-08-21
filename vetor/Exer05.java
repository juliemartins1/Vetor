public class Exer05 {
    public static void main(String[] args) {
        int v[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i=0;i<v.length;i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
        for(int i=0; i<10;i++){
            int temp= v[i];
            v[i]=v[i+10];
            v[i+10]=temp;
        }
        System.out.println("vetor apos Modificação");
        for(int i=0;i<20;i++){
            System.out.print(v[i] + " ");   
        }
        System.out.println();
    }
}
