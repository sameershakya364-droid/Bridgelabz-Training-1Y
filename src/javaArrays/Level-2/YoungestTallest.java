
import java.util.*;
public class YoungestTallest{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String[] n={"Amar","Akbar","Anthony"};
int y=0,t=0;int[] a=new int[3];double[] h=new double[3];
for(int i=0;i<3;i++){a[i]=sc.nextInt();h[i]=sc.nextDouble();}
for(int i=1;i<3;i++){if(a[i]<a[y])y=i;if(h[i]>h[t])t=i;}
System.out.println(n[y]+" "+n[t]);
}}
