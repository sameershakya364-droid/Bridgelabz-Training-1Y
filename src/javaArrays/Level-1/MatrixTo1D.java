
import java.util.Scanner;
public class MatrixTo1D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Rows: ");
        int r=sc.nextInt();
        System.out.print("Cols: ");
        int c=sc.nextInt();
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                m[i][j]=sc.nextInt();
        int[] arr=new int[r*c];
        int k=0;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                arr[k++]=m[i][j];
        for(int i=0;i<arr.length;i++)
            System.out.println("Index "+i+" = "+arr[i]);
        sc.close();
    }
}
