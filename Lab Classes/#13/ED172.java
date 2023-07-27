import java.util.Scanner;

public class ED172{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	BSTMap<String, Integer> m = new BSTMap<>();

	while(in.hasNext()){
	    String word = in.next();

	    if(m.get(word) == null)
		m.put(word, 1);

	    else{
		int val = m.get(word);

		val++;
		m.put(word, val); 
	    }
	}

	for(String s : m.keys())
	    System.out.println(s + ": " + m.get(s));
    }
}
