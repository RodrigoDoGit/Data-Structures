public class ED209{
    public static void main(String[] args){
	BSTree<Integer> t = new BSTree<>();
	Integer[] nodes = {6,3,10,1,4,8,42,2,7,23,54};

	for(int i=0; i<nodes.length; i++)
	    t.insert(nodes[i]);
	
	System.out.print("t em ");
	t.printPreOrder();
	System.out.println("t.countBetween(5, 44) = " + t.countBetween(5, 44));
	System.out.println("t.countBetween(7, 10) = " + t.countBetween(7, 10));
	System.out.println("t.countBetween(0, 90) = " + t.countBetween(0, 90));
	System.out.println("t.countBetween(60, 80) = " + t.countBetween(60, 80));
	System.out.println("t.countBetween(8, 54) = " + t.countBetween(8, 54));
	System.out.println("t.countBetween(2, 22) = " + t.countBetween(2, 22));
	System.out.println("t.countBetween(2, 2) = " + t.countBetween(2, 2));
    }
}
