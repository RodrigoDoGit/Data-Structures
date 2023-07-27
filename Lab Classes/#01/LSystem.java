public class LSystem{
    static void system(int n){
	String str = "A";
	System.out.println(str);

	for(int i=1; i<n; i++){
	    str = str.replaceAll("A", "AB").replaceAll("BB", "BA");
	    System.out.println(str);
	}
    }

    public static void main(String[] args){
	system(7);
    }
}
