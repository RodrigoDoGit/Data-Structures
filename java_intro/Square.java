import java.util.Scanner;

public class Square {
    // Desenha uma linha de n caracteres onde:
    // - o primeiro e o último caracteres são o caracter da variável 'a'
    // - todos os outros caracteres são o caracter da variável 'b'
    static void line(char a, char b, int n) {
	System.out.print(a);

	for (int i=1; i<=n-2; i++)
	    System.out.print(b);

	System.out.println(a);
    }

    static void square(int n){
	line('+', '-', n);

	for(int i=0; i<=n-3; i++){
	    System.out.print('|');

	    for(int j=1; j<=n-2; j++)
		System.out.print('.');

	    System.out.println('|');
	}
	
	line('+', '-', n);
    }

    // O procedimento executado inicialmente é sempre o main
    public static void main(String[] args) {	
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();

	square(n);
    }
}
