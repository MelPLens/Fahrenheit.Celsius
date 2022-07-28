public class desafiocurso {
    public static void main (String[]args) {
    // (Fº - 32)x 5/9 =Cº
    	final double FATOR = 5.0 / 9.0; //Constante
    	final double AJUSTE = 32; // constante
    	
    	double fahrenheit = 86; //variavel
    	double celsius =(fahrenheit - AJUSTE) * FATOR; //variavel
    	System.out.println(" O resultado é" + celsius + "ºC.");
    	
    	fahrenheit=150;
    	celsius =(fahrenheit - AJUSTE) * FATOR; //variavel
    	System.out.println(" O resultado é" + celsius + "ºC.");

    	
    }
}
