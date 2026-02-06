
import java.util.*;
public class EmployeeBonus{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double totalBonus=0,oldTotal=0,newTotal=0;
for(int i=0;i<10;i++){
double salary=sc.nextDouble(),years=sc.nextDouble();
double rate=years>5?0.05:0.02;
double bonus=salary*rate;
double newSalary=salary+bonus;
totalBonus+=bonus;oldTotal+=salary;newTotal+=newSalary;
}
System.out.println(totalBonus+" "+oldTotal+" "+newTotal);
}}
