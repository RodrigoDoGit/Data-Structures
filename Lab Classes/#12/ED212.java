import java.util.Scanner;
import java.util.Arrays;

public class ED212{
    public static int[] sumLevels(BTree<Integer> t){
	int sum[] = new int[t.depth()+1];

	return sumLevels(sum, 0, t.getRoot());
    }

    private static int[] sumLevels(int v[], int i, BTNode<Integer> n){
	if(n == null)
	    return v;

	else
	    v[i] += n.getValue();

	sumLevels(v, i+1, n.getLeft());
	sumLevels(v, i+1, n.getRight());

	return v;
    }

    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	BTree<Integer> t = LibBTree.readIntTree(in);

	t.printPreOrder();
	System.out.println("sumLevels(t) = " + Arrays.toString(sumLevels(t)));
    }
}
