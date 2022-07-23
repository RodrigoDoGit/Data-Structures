import java.util.Scanner;

public class ED183{
    static int amplitude(int v[]){
	int max = v[0];
	int min = v[0];

	for(int i=0; i<v.length; i++){
	    if(v[i] > max)
		max = v[i];

	    if(v[i] < min)
		min = v[i];
	}

	return max - min;
    }

    static double media(int v[]){
	float soma = 0;
	int i;

	for(i=0; i<v.length; i++)
	    soma += v[i];

	return soma/i;
    }

    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int v[] = new int[N];

	for(int i=0; i<N; i++)
	    v[i] = in.nextInt();

	int amp = amplitude(v);
	double med = media(v);

	System.out.printf("%.2f\n", med);
	System.out.println(amp);
    }
}
