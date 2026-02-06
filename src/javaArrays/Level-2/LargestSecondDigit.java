
import java.util.*;
public class LargestSecondDigit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),max=0,sec=0;
while(n>0){int d=n%10;n/=10;if(d>max){sec=max;max=d;}else if(d>sec&&d!=max)sec=d;}
System.out.println(max+" "+sec);
}}
