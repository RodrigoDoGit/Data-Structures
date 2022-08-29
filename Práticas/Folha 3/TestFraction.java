class Fraction{
    int num, denom;

    Fraction(int n, int d){
	num = n;
	denom = d;
    }

    @Override
    public String toString(){
	int u = num/denom;
	int r = num%denom;

	if(r == 0)
	    return u + "";

	else
	    return u + " + " + r + "/" + denom; 
    }

    public Fraction add(Fraction f){
	Fraction fs = new Fraction(num, denom);

	if(denom != f.denom){
	    fs.num = (num * f.denom) + (f.num * denom);
	    fs.denom = denom * f.denom;
	}

	else
	    fs.num = num + f.num;

	return fs;
    }

    public Fraction multiply(Fraction f){
	Fraction fm = new Fraction(num, denom);

	fm.num = num * f.num;
	fm.denom = denom * f.denom;

	return fm;
    }

    static int mdc(int a, int b){
	int r;

	while(b != 0){
	    r = a%b;
	    a = b;
	    b = r;
	}

	return a;
    }

    public void simplify(){
	int m = mdc(num, denom);

	num /= m;
	denom /= m;
    }
}

public class TestFraction{
    public static void main(String[] args){
	Fraction f1 = new Fraction(7, 3);

	System.out.println(f1);

	Fraction f2 = new Fraction(8, 3);
	Fraction f3 = f1.add(f2);

	f3.simplify();
	System.out.println(f3);

	Fraction f4 = new Fraction(4, 5);
	Fraction f5 = f3.multiply(f4);

	f5.simplify();
	System.out.println(f5);
    }
}
