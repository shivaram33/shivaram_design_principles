package calculator_oops;
import java.util.InputMismatchException;
public class NoOperation implements operation{
	private char sign;
    NoOperation(char sign){
        this.sign = sign;
}
public double calculate(double a,double b) {
	 
	throw new InputMismatchException("Invalid operator sign: "+sign);

}
}
