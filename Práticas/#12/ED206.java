import java.util.Scanner;

public class ED206{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      BTree<Integer> t = LibBTree.readIntTree(in);
      
      t.printPreOrder();      
      System.out.println("t.path('ED') = " + t.path("ED"));
      System.out.println("t.path('E') = " + t.path("E"));
      System.out.println("t.path('DD') = " + t.path("DD"));
      System.out.println("t.path('R') = " + t.path("R"));
      System.out.println("t.path('DE') = " + t.path("DE"));
   }
}
