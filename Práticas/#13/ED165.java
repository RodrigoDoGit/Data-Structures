import java.util.Scanner;

public class ED165{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int num[] = new int[N];
	BSTree<Integer> t = new BSTree<>();

	for(int i=0; i<N; i++)
	    num[i] = in.nextInt();

	for(int i=0; i<N; i++){
	    t.insert(num[i] + num[i]);
	    
	    for(int j=1; j<N; j++){
		int sum = num[i] + num[j];

		t.insert(sum);
	    }
	}

	int P = in.nextInt();

	for(int i=0; i<P; i++){
	    int val = in.nextInt();

	    if(t.contains(val))
		System.out.println(val + ": sim"); 

	    else
		System.out.println(val + ": nao");
	}
    }
}
