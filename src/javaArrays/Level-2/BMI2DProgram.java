
import java.util.*;
public class BMI2DProgram{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();double[][] p=new double[n][3];String[] s=new String[n];
for(int i=0;i<n;i++){p[i][0]=sc.nextDouble();p[i][1]=sc.nextDouble();
p[i][2]=p[i][0]/(p[i][1]*p[i][1]);
s[i]=p[i][2]<18.5?"Underweight":p[i][2]<25?"Normal":p[i][2]<30?"Overweight":"Obese";}
for(int i=0;i<n;i++)System.out.println(p[i][0]+" "+p[i][1]+" "+p[i][2]+" "+s[i]);
}}
