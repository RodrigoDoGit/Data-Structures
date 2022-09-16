import java.util.Scanner;

public class ED205{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      BTree<Integer> t = LibBTree.readIntTree(in);
      
      t.printPreOrder();      
      System.out.println("t.strict()? " + t.strict());
   }
}
