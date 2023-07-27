import java.util.Scanner;

class Matrix{
    static int lines, cols;
    static char[][] data;

    Matrix(int l, int c){
	lines = l;
	cols = c;
	data = new char[l][c];
    }

    public static int tamanho(){
	int linec = 0, colc = 0, coltmp = 0, linetmp = 0; 

	for(int i=0; i<lines; i++){
	    for(int j=0; j<cols; j++){
		if(data[i][j] == '#')
		    coltmp++;

		else{
		    if(coltmp >= colc)
			colc = coltmp;

		    coltmp = 0;
		}
	    }

	    if(coltmp > colc)
		colc = coltmp;

	    coltmp = 0;
	}

	for(int i=0; i<cols; i++){
	    for(int j=0; j<lines; j++){
		if(data[j][i] == '#')
		    linetmp++;

		else{
		    if(linetmp >= linec)
			linec = linetmp;

		    linetmp = 0;
		}
	    }

	    if(linetmp > linec)
		linec = linetmp;

	    linetmp = 0;
	}

	if(linec > colc)
	    return linec;

	else
	    return colc;
    }

    public static int segments(int n){
	int count = 0, linec = 0, colc = 0;

	for(int i=0; i<lines; i++){
	    for(int j=0; j<cols; j++){
		if(data[i][j] == '#')
		    colc++;

		else if(data[i][j] == '.')
		    colc = 0;

		if(colc == n){
		    count++;
		    colc = 0;
		}
	    }

	    colc = 0;
	}

	for(int i=0; i<cols; i++){
	    for(int j=0; j<lines; j++){
		if(data[j][i] == '#')
		    linec++;

		else if(data[j][i] == '.')
		    linec = 0;

		if(linec == n){
		    count++;
		    linec = 0;
		}
	    }

	    linec = 0;
	}

	return count;
    }
}

public class ED216{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int L = in.nextInt();
	int C = in.nextInt();
	Matrix matriz = new Matrix(L, C);

	for(int i=0; i<L; i++){
	    String line = in.next();
	    
	    for(int j=0; j<C; j++)
		matriz.data[i][j] = line.charAt(j);
	}

	int tam = matriz.tamanho();
	int seg = matriz.segments(tam);

	System.out.println(tam + " " + seg);
    }
}
