import java.util.Scanner;

public class ED207{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      BTree<Integer> t = LibBTree.readIntTree(in);
      
      t.printPreOrder();      
      System.out.println("t.nodesLevel(0) = " + t.nodesLevel(0));
      System.out.println("t.nodesLevel(1) = " + t.nodesLevel(1));
      System.out.println("t.nodesLevel(2) = " + t.nodesLevel(2));
      System.out.println("t.nodesLevel(3) = " + t.nodesLevel(3));
   }
}
