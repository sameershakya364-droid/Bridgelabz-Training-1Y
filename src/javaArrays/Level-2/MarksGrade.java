
import java.util.*;
public class MarksGrade{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++){
double p=sc.nextDouble(),c=sc.nextDouble(),m=sc.nextDouble(),per=(p+c+m)/3;
char g=per>=80?'A':per>=70?'B':per>=60?'C':per>=50?'D':per>=40?'E':'R';
System.out.println(per+" "+g);}
}}
