import java.util.Scanner;

public class ED231{
    public static int min(int C[], int N){
	int m = C[1] - C[0];

	for(int i=2; i<N; i++){
	    int tmp = C[i] - C[i-1];

	    if(tmp < m)
		m = tmp;
	}

	return m;
    }

    public static int max(int C[], int N){
	int m = C[1] - C[0];

	for(int i=2; i<N; i++){
	    int tmp = C[i] - C[i-1];

	    if(tmp > m)
		m = tmp;
	}

	return m;
    }

    public static void periodos(int C[], int N){
	int nperiodos = 0, maior = 0, tempomaior = 0, anterior = 1;

	for(int i=1; i<N; i++){
	    double percent = ((C[i] - C[i-1]) * 100.0/C[i-1]);

	    if(percent <= 5){
		if(anterior == 1)
		    nperiodos++;

		tempomaior++;
		anterior = 0;
	    }

	    else{
		if(tempomaior > maior)
		    maior = tempomaior;

		tempomaior = 0;
		anterior = 1;
	    }
	}

	if(tempomaior > maior)
	    maior = tempomaior;

	System.out.println(nperiodos + " " + maior);
    }

    public static int maxseq(int C[], int N){
	int max = C[0];

	for(int i=1; i<N; i++)
	    if(C[i] > max)
		max = C[i];

	return max;
    }

    public static void print(int C[], int N){
	int cols = N;
	int lines = maxseq(C, N)/100;
	char m[][] = new char[lines][cols];

        for(int i=0; i<cols; i++){
	    int tmp = C[i]/100;

	    for(int j=lines-1; j>=0; j--){
		if(tmp > 0){
		    m[j][i] = '#';
		    tmp--;
		}

		else
		    m[j][i] = '.';
	    }
	}

	for(int i=0; i<lines; i++){
	    for(int j=0; j<cols; j++)
		System.out.print(m[i][j] + " ");

	    System.out.println();
	}
	
    }

    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int C[] = new int[N];

	for(int i=0; i<N; i++)
	    C[i] = in.nextInt();

	int flag = in.nextInt();

	if(flag == 1)
	    System.out.println(min(C, N) + " " + max(C, N));

	else if(flag == 2)
	    periodos(C, N);

	else if(flag == 3)
	    print(C, N);
    }
}
