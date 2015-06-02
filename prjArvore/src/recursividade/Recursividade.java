package recursividade;

public class Recursividade {

	public static void main(String[] args) {
		System.out.println("Total Soma: " + soma(10,20));
		System.out.println("Juros Compostos: " + calculaJuros((float) 5000.00, 5, 4));
	}

	public static int soma(int a, int b){
		if(a==b+1) return 0;
		
		return a + soma(a+1,b);
	}
	
	public static float calculaJuros(float capital, int qtdMeses, float taxJuros){
		if (qtdMeses == 0)	return capital;
		return calculaJuros(capital+(capital*(taxJuros/100)), qtdMeses-1, taxJuros);
	}
}
