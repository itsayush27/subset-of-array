import java.util.*;
class subset{
    static Scanner scn = new Scanner(System.in);
    
    public static void input(int []arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }
    
    public static void subset(int []arr){
        int pow = 1;
        for(int i=0; i<arr.length; i++){
            pow = pow * 2;
        }
        int count = 0;
        while(count < pow){
            System.out.print("[");
            int length = 0;  int cc = count;
            while(cc!=0){
                int rem = cc % 2; 
                cc = cc / 2;
                if(rem==1){
                    System.out.print(arr[length] + " ");
                }
                length++;
            }
            System.out.print("]");
            System.out.println();
            count++;
        }
    }
    public static void main(String []args){
        int num = scn.nextInt();
        int []arr = new int[num];
        input(arr);
        subset(arr);
    }
}