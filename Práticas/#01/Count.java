public class Count{
    static int ocorrencias(String s, char c){
	int count = 0;

	for(int i=0; i<s.length(); i++){
	    if(s.charAt(i) == c)
		count++;
	}

	return count;
    }

    public static void main(String[] args){
	System.out.println(ocorrencias("algoritmo", 'o'));
	
    }
}
