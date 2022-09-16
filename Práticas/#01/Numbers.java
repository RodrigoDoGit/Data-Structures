import java.util.Scanner;

// Uma classe muito simples que usa um ciclo para imprimir numeros entre 1 e n

// O ficheiro tem de ter o mesmo nome da classe + a extensão '.java'
public class Numbers{
    public static void main(String[] args){
	int soma = 0;
	int n = 500;
	
	System.out.println("Numeros de 1 a " + n + ":"); // + é o operador de concatenação de strings
	for(int i=1; i<=n; i++){
	    soma += i;

	    while(i<=n-1){
		System.out.print(i + ", ");
		i++;
		soma += i;
	    }

	    System.out.println(i);
	}

	System.out.println("Soma dos numeros de 1 a " + n + ": " + soma);
    }
}
