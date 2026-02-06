
import java.util.*;
public class DigitFrequency{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();int[] f=new int[10];
while(n>0){f[n%10]++;n/=10;}
for(int i=0;i<10;i++)System.out.println(i+"="+f[i]);
}}
