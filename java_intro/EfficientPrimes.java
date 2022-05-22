import java.util.Scanner;

public class EfficientPrimes {
    // Verifica se o número n é primo (apenas divisível por 1 e por si próprio)
    static boolean isPrime(int n) {
	if(n <= 1)
	    return false;

	for(int i=2; i*i<=n; i++){
	    if(n%i == 0)
		return false;
	}

	return true;
    }
    
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	int n = in.nextInt();
	
	for (int i=2; i<=n; i++){
	    if(isPrime(i))
		System.out.println(i + " é primo? Sim!");
	    
	    else
		System.out.println(i + " é primo? Não!");
	}
    }
}
