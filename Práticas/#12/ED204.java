import java.util.Scanner;

public class ED204{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	BTree<Integer> t = LibBTree.readIntTree(in);

	t.printPreOrder();
	System.out.println("numberLeafs = " + t.numberLeafs());
    }
}
