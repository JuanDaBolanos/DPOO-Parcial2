package logica;

public class Parcial {
	
	public Parcial() {
	}
	
	public String raices(double a, double b, double c) throws Exception {
		double x1;
		double x2;
		String raices = "";
		
		if(a == 0) {
			throw new Exception("El primer término debe ser diferente de 0");
		} else if(((Math.pow(b, 2))-4*a*c)<0) {
			throw new Exception("El indeterminante es negativo (Sin solución real)");
		}
		
		if(((Math.pow(b, 2))-4*a*c)==0) {
			x1 = -b/(2*a);
			x2 = -b/(2*a);
		} else {
			x1 = (-b + Math.sqrt((Math.pow(b, 2))-4*a*c))/(2*a);
			x2 = (-b - Math.sqrt((Math.pow(b, 2))-4*a*c))/(2*a);
		}
		return raices + "x=" + x1 +", " + "x=" + x2;
	}
}
