// Uma classe simples para representar um aluno
class Aluno{
    public static int contador = 0;

    // Atributos da classe (variáveis para conter informação)
    String nome;
    int numero;

    // Construtor "padrão"
    Aluno(){
	contador++;
	nome   = "indefinido";
	numero = -1;
    }

    @Override
    public String toString(){
	return "(" + nome + "," + numero + ")";
    }

    Aluno(String n, int mec){
	contador++;
	nome = n;
	numero = mec;
    }

    int ano(){
	return numero/100000;
    }
}

// Classe principal contendo o main para testar a classe Aluno
public class TestAluno{
    public static void main(String[] args){
	System.out.println("contador = " + Aluno.contador);

	Aluno a = new Aluno();
	Aluno b = new Aluno();
	Aluno c = b;
	Aluno d = new Aluno();
	Aluno e = new Aluno("Manuel", 201506234);
	//Aluno f = new Aluno("Maria");
	Aluno g = new Aluno("Ana", 201408762);
	Aluno h = new Aluno("Bruno", 201508145);
	int n = 3;
	Aluno[] v = new Aluno[n];
	
	System.out.println("a.nome = " + a.nome);
	System.out.println("a.numero = " + a.numero);
	System.out.println("a = " + a);
	b.nome = "modificado";
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	System.out.println("d = " + d);
	System.out.println("e = " + e);
	System.out.println(g.ano() + " " + h.ano());

	for(int i=0; i<n; i++){
	    v[i] = new Aluno();
	    System.out.println("v[" + i + "] = " + v[i]);
	}

	v[0].nome = "Pedro";
	System.out.println("contador = " + Aluno.contador);
    }
}
