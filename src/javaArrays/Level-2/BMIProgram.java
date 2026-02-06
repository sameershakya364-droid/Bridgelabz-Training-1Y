
import java.util.*;
public class BMIProgram{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++){double w=sc.nextDouble(),h=sc.nextDouble();
double bmi=w/(h*h);
String st=bmi<18.5?"Underweight":bmi<25?"Normal":bmi<30?"Overweight":"Obese";
System.out.println(bmi+" "+st);}}
}
