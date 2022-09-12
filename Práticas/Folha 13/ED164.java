import java.util.Scanner;

public class ED164{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	BSTree<String> t = new BSTree<>();
	int N = in.nextInt();

	for(int i=0; i<N; i++)
	    t.insert(in.next());

	System.out.println(t.numberNodes());
    }
}
