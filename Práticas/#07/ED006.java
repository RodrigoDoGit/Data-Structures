import java.util.Scanner;

public class ED006{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	in.nextLine();

	for(int i=0; i<N; i++){
	    CircularLinkedList<String> children = new CircularLinkedList<>();
	    String frase = in.nextLine();
	    int words = frase.split(" ").length;
	    int child = in.nextInt();

	    for(int j=0; j<child; j++)
		children.addLast(in.next());

	    in.nextLine();

	    for(int j=0; j<(child-1); j++){
		for(int k=0; k<(words-1); k++)
		    children.rotate();

		children.removeFirst();
	    }

	    if(children.getFirst().equals("Carlos"))
		System.out.println("O Carlos nao se livrou");

	    else
		System.out.println("O Carlos livrou-se (coitado do " + children.getFirst() + "!)");
	}
    }
}
