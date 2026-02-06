
import java.util.Scanner;
public class NumberNature {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter number "+(i+1)+": ");
            arr[i]=sc.nextInt();
            if(arr[i]>0){
                System.out.println(arr[i]+" is positive and "+(arr[i]%2==0?"even":"odd"));
            }else if(arr[i]<0){
                System.out.println(arr[i]+" is negative");
            }else{
                System.out.println("Zero");
            }
        }
        if(arr[0]==arr[arr.length-1]) System.out.println("First and last are equal");
        else if(arr[0]>arr[arr.length-1]) System.out.println("First is greater");
        else System.out.println("Last is greater");
        sc.close();
    }
}
