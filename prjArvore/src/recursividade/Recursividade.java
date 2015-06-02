package recursividade;


public class Recursividade {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Informe valor inicial:" ); int a = s.nextInt();
//		System.out.print("Informe valor final:" ); int b = s.nextInt();
//		
//		System.out.println("Total Soma = " + soma(10,200));
//		
//		System.out.println("\nJuros Compostos: " + calculaJuros((float) 5000.00, 5, 4));
//		
//		s.close();
		
//		System.out.println(mdc(30,7));

		int[] vetor = {1,2,3,4,5,6,7,8,9,10};
		if(procuraSequencial(vetor, vetor.length-1, 4))
			System.out.println("achou");
		else
			System.out.println("Não achou");
		
	}

	public static int soma(int a, int b){
		if(a==b+1) return 0;
		
		return a + soma(a+1,b);
	}
	
	public static float jurosComposto(float capital, int qtdMeses, float taxJuros){
		if (qtdMeses == 0)	return capital;
		return jurosComposto(capital+(capital*(taxJuros/100)), qtdMeses-1, taxJuros);
	}
	
	public static int fatorial(int valor){
		if(valor==0) return 1;
		return valor*(fatorial(valor-1));
	}
	
	public static int potencia(int b, int p){
		if(p==0)return 1;
		return b*(potencia(b, p-1));
	}
	
	public static int mdc(int a, int b){
		if(a%b==0) return b;;
		return mdc(b,a%b);
	}
	
	public static boolean procuraSequencial(int[] vetor, int indice ,int valor){
		if(indice==0 || vetor[indice]==valor) return true;
		return procuraSequencial(vetor, indice-1 ,valor);
	}
	
}
