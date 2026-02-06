
import java.util.*;
public class DynamicLargestSecondDigit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),size=10,i=0;int[] arr=new int[size];
while(n>0){
if(i==size){size+=10;arr=java.util.Arrays.copyOf(arr,size);}
arr[i++]=n%10;n/=10;}
int max=0,sec=0;
for(int j=0;j<i;j++){int d=arr[j];if(d>max){sec=max;max=d;}else if(d>sec&&d!=max)sec=d;}
System.out.println(max+" "+sec);
}}
