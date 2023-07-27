import java.util.Scanner;

public class ED121{
    static String transform(String str){
	return str.toLowerCase().replaceAll("[^a-z]", "");
    }

    static boolean isPalindrome(String str){
	str = transform(str);
	int size = str.length()-1;

	for(int i=0; i<=size; i++, size--){
	    if(str.charAt(i) != str.charAt(size))
		return false;
	}

	return true;
    }

    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	System.out.println(N);
	in.nextLine(); 

	for(int i=0; i<N; i++){
	    String str = in.nextLine();

	    if(isPalindrome(str))
		System.out.println("sim");

	    else
		System.out.println("nao");

	    System.out.println();
	}
    }
}
