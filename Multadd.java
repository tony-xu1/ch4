public class Multadd{

	public static void main (String[] args){
		System.out.println( multadd(1.0, 2.0, 3.0) );
		
		double eq1 = multadd( Math.cos(Math.PI/4), 0.5, Math.sin(Math.PI/4));
		System.out.println(eq1);
		
		double eq2 = multadd( Math.log10(10), 1.0, Math.log10(20));
		System.out.println(eq2);
		
		System.out.println(expSum(5));
	}
	
	public static double multadd (double a, double b, double c){
		double result = a * b + c;
		return result;
	}
	
	public static double expSum (double x){
		double result = multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
		return result;
	}
}
