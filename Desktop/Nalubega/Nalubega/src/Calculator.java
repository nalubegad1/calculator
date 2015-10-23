import java.util.Scanner;

public class Calculator {
	
	public static void main(String args[]){
	Scanner dan=new Scanner(System.in);
	double x = 0; 
	double y = 0;
	int counter;
	double subtraction;
	double division;
	double addition;
	double multiplication;
	System.out.println();
	System.out.println();
	System.out.println ("TO ADD PRESS  1:");
	System.out.println ("TO SUBTRACT PRESS 2:");
	System.out.println ("TO DIVIDE PRESS 3:");
	System.out.println ("T0 MULTIPLY PRESS 4:");
	System.out.println();
	System.out.println();
	counter=dan.nextInt();
	System.out.println();
	System.out.println();
	System.out.println("**************************************");
	
	switch(counter)
	{
	
	case 1:
	{
	System.out.println ("ENTER FRIST NUMBER:");
	x = dan.nextDouble();
	System.out.println ("ENTER SECOND NUMBER:");
	y = dan.nextDouble();
	
	addition = x + y;
	System.out.println();
	System.out.println();
	//System.out.println("___________________________________________________");
			System.out.println (x 	+"+"	 + y +	"="		+addition);
			System.out.println("___________________________________________________");
			System.out.println();
break;
	}
	
	case 2:
	{
		System.out.println ("ENTER FRIST NUMBER:");
		x = dan.nextDouble();
		System.out.println ("ENTER SECOND NUMBER:");
		y = dan.nextDouble();
		
		subtraction = x - y;
		System.out.println();
		System.out.println();
		//System.out.println("___________________________________________________");
				System.out.println (x 	+"-"	 + y +	"="		+subtraction);
				System.out.println("___________________________________________________");
				System.out.println();
	break;
		}
	case 3:
	{
		System.out.println ("ENTER FRIST NUMBER:");
		x = dan.nextDouble();
		System.out.println ("ENTER SECOND NUMBER:");
		y = dan.nextDouble();
		
		division = x / y;
		System.out.println();
		System.out.println();
		//System.out.println("___________________________________________________");
				System.out.println (x 	+"/"	 + y +	"="		+division);
				System.out.println("___________________________________________________");
				System.out.println();
	break;
		}
	case 4:
	{
		System.out.println ("ENTER FRIST NUMBER:");
		x = dan.nextDouble();
		System.out.println ("ENTER SECOND NUMBER:");
		y = dan.nextDouble();
		
		multiplication = x * y;
		System.out.println();
		System.out.println();
		//System.out.println("___________________________________________________");
				System.out.println (x 	+"/"	 + y +	"="		+multiplication);
				System.out.println("___________________________________________________");
				System.out.println();
	break;
		}
	default:
		break;
	}
}
}
