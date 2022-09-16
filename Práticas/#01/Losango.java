public class Losango{
    static void losango(int n){
	int cardinal = 1;
	int espaco = (n-1)/2;

	while(espaco > 0){
	    for(int i=1; i<=espaco; i++)
		System.out.print(".");

	    for(int i=1; i<=cardinal; i++)
		System.out.print("#");

	    for(int i=1; i<=espaco; i++)
		System.out.print(".");

	    espaco--;
	    cardinal += 2;
	    System.out.println();
	}

	while(cardinal > 0){
	    for(int i=1; i<=espaco; i++)
		System.out.print(".");

	    for(int i=1; i<=cardinal; i++)
		System.out.print("#");

	    for(int i=1; i<=espaco; i++)
		System.out.print(".");

	    espaco++;
	    cardinal -= 2;
	    System.out.println();
	}
    }

    public static void main(String[] args){
	losango(5);
    }
}
