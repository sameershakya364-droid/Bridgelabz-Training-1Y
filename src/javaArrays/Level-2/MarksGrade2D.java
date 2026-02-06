
import java.util.*;
public class MarksGrade2D{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();double[][] m=new double[n][3];
for(int i=0;i<n;i++)for(int j=0;j<3;j++)m[i][j]=sc.nextDouble();
for(int i=0;i<n;i++){
double per=(m[i][0]+m[i][1]+m[i][2])/3;
char g=per>=80?'A':per>=70?'B':per>=60?'C':per>=50?'D':per>=40?'E':'R';
System.out.println(per+" "+g);}
}}
