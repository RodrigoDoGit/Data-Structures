import java.util.Scanner;

class Matrix{
    int data[][]; // os elementos da matriz em si
    int rows;     // numero de linhas
    int cols;     // numero de colunas
    
    // construtor padrao de matriz
    Matrix(int r, int c){
	data = new int[r][c];
	rows = r;
	cols = c;
    }
    
    // Ler os rows x cols elementos da matriz
    public void read(Scanner in) {
	for (int i=0; i<rows; i++)
	    for (int j=0; j<cols; j++)
		data[i][j] = in.nextInt();
    }
    
    // Representacao em String da matriz
    public String toString(){
      String ans = "";
      
      for (int i=0; i<rows; i++){
	  for (int j=0; j<cols; j++)
	      ans += data[i][j] + " ";

	  ans += "\n";
      }
      
      return ans;
    }

    public static Matrix identity(int n){
	Matrix m = new Matrix(n, n);

	for(int i=0; i<n; i++){
	    for(int j=0; j<n; j++){
		if(i == j)
		    m.data[i][j] = 1;

		else
		    m.data[i][j] = 0;
	    }
	}

	return m;
    }

    public Matrix transpose(){
	Matrix m = new Matrix(cols, rows);

	for(int i=0; i<cols; i++)
	    for(int j=0; j<rows; j++)
		m.data[i][j] = data[j][i];

	return m; 
    }

    public Matrix sum(Matrix m){
	Matrix s = new Matrix(rows, cols);

	for(int i=0; i<rows; i++)
	    for(int j=0; j<cols; j++)
		s.data[i][j] = data[i][j] + m.data[i][j];

	return s;
    }

    public Matrix multiply(Matrix m){
	Matrix mul = new Matrix(rows, m.cols);
	int k = cols;

	for(int i=0; i<rows; i++){
	    for(int j=0; j<m.cols; j++)
		for(int ij=0; ij<k; ij++)
		    mul.data[i][j] += (data[i][ij] * m.data[ij][j]);
	}

	return mul;
    }
}

public class ED187{
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	
	Matrix m1 = Matrix.identity(5);
	System.out.println(m1);
	
	Matrix m2 = new Matrix(stdin.nextInt(), stdin.nextInt());
	m2.read(stdin);
	System.out.println(m2);
	Matrix m3 = new Matrix(stdin.nextInt(), stdin.nextInt());
	m3.read(stdin);
	System.out.println(m3);
	Matrix m4 = new Matrix(stdin.nextInt(), stdin.nextInt());
	m4.read(stdin);
	System.out.println(m4);
	
	Matrix m5 = m1.transpose();
	System.out.println(m5);
	Matrix m6 = m2.transpose();
	System.out.println(m6);
	
	Matrix m7 = m2.sum(m3);
	System.out.println(m7);
	Matrix m8 = m2.multiply(m4);
	System.out.println(m8);
    }
}
