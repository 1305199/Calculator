package calsi;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String sym="*";
	do {
	System.out.println("enter your first number");
	int no1=s.nextInt();
	System.out.println("enter your secound number");
	int no2=s.nextInt();
	System.out.println("select your symbol(+,-,*,/)");
	System.out.println("select e for exit");
	
	 sym=s.next();
	int res;
	switch(sym)
	{
	case "+":res=no1+no2;
	System.out.println("addition is:"+res);
	break;
	
    case "-":res=no1-no2;
    System.out.println("substraction is:"+res);
    break;

    case "*":res=no1*no2;
    System.out.println("multiplication is:"+res);
    break;

    case "/":res=no1/no2;
    System.out.println("division is:"+res);
    break;

    default:System.out.println("Invalid Symbol");

}
	}while(sym!="e");
}
}