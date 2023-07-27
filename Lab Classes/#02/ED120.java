import java.util.Scanner;

public class ED120{
    static void Losango(int n){
        int asterisco = 1;
	int espaco = (n-1)/2;
	
	while(espaco>0){
	    for(int i=1; i<=espaco; i++)
		System.out.print(".");
	    
	    for(int i=1; i<=asterisco; i++) 
		System.out.print("#");
	    
	    for(int i=1; i<=espaco; i++) 
		System.out.print(".");
	    
	    espaco--;
	    asterisco += 2;
	    System.out.println();
	}
	
	while(asterisco>0){
	    for(int i=1; i<=espaco; i++) 
		System.out.print(".");
	    
	    for(int i=1; i<=asterisco; i++) 
		System.out.print("#");
	    
	    for(int i=1; i<=espaco; i++) 
		System.out.print(".");
	    
	    espaco++;
	    asterisco -= 2;
	    System.out.println();
	}
    }
    
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();

	Losango(n);
    }
}
