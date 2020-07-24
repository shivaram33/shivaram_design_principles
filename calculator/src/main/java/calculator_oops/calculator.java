package calculator_oops;

public class calculator {
	public static calculator instance = null;
	operation cal;
	 public static calculator getInstance(){
	        if(instance == null){
	            instance = new calculator();
	        }
	        return instance;
	    }
	 public void setCalculation(operation cal) {
	        this.cal = cal;
	    }
	 public double calculate(double value1, double value2) {
	       return cal.calculate(value1, value2);
	    }
}
