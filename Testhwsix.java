public class Testhwsix {

    public static void main(String[] args) {
        CompleteBinaryTree<Integer> tree = new CompleteBinaryTree<>(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(10);
        tree.add(8);
        tree.add(9);
    
        System.out.println("Tree contents: \n" + tree.toString());
    }
    
    
    
}
