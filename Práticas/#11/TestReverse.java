// -----------------------------------------------------------
// Estruturas de Dados 2020/2021 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados2021/
// -----------------------------------------------------------
// Invertendo um array (versao recursiva)
// Ultima alteracao: 21/04/2018
// -----------------------------------------------------------

import java.util.Arrays;

public class TestReverse{
    // Inverter array v entre posicoes start e end
    static void reverse(int v[], int start, int end){
      if(start >= end)
	  return;     // Caso base: array de tamanho < 2

      int tmp = v[start];         // Trocar primeiro com ultimo

      v[start] = v[end];
      v[end] = tmp;
      reverse(v, start+1, end-1); // Chamada recursiva para o resto
    }
    
    // -----------------------------------------------------------

    static boolean capicua(int v[], int start, int end){
	if(start >= end)
	    return true;

	return ((v[start] == v[end]) && capicua(v, start+1, end-1));
    }
   
    // -----------------------------------------------------------
    
    public static void main(String[] args){
	int v[] = {2,4,6,8,10}; // Inicializacao de array
	int w[] = {1,2,3,2,1};
	int t[] = {5,8,8,5};
	int s[] = {1,2,3,1};
	int u[] = {5,8,7,5};
	
	System.out.println("Antes  do reverse: " + Arrays.toString(v));
	reverse(v, 0, v.length-1);
	System.out.println("Depois do reverse: " + Arrays.toString(v));
	System.out.println("12321 é capicua? " + capicua(w, 0, 4));
	System.out.println("5885 é capicua? " + capicua(t, 0, 3));
	System.out.println("1231 é capicua? " + capicua(s, 0, 3));
	System.out.println("5875 é capicua? " + capicua(u, 0, 3));
    }
}
