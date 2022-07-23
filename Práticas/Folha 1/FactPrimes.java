public class FactPrimes{
    static void Fact(int n){
	for(int i=2; n>1; ){
	    if(n % i == 0){
		System.out.print(i);
		n = n/i;

		if(n != 1)
		    System.out.print(" * ");
	    }

	    else
		i++;
	}
    }

    public static void main(String[] args){
	System.out.print("20 = ");
	Fact(20);
	System.out.println();
    }
}
