package calculator_oops;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class calmain {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		 Map<Character, operation> operationMap = new HashMap<Character, operation>();
		 operationMap.put('+', new addition());
	     operationMap.put('-', new subtraction());
	     operationMap.put('*', new multiplication());
	     operationMap.put('/', new division());
		System.out.println("enter two numbers and +, -, * or / sign");
		char operator = 0;
        double firstNum = 0;
        double secondNum = 0;
        try {
            firstNum = inp.nextDouble();
            secondNum = inp.nextDouble();
            operator = inp.next().charAt(0);
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        }
        calculator cal = calculator.getInstance();
		cal.setCalculation(operationMap.getOrDefault(operator,new NoOperation(operator)));
		System.out.println(cal.calculate(firstNum, secondNum));
	}

}
