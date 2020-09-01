public class Assignment32 {

    public static void main(String[] args) {

        BSTree test_tree = new BSTree();

        test_tree.insert(40);
        test_tree.insert(20);
        test_tree.insert(60);
        test_tree.insert(5);
        test_tree.insert(30);
        test_tree.insert(50);
        test_tree.insert(70);
        test_tree.insert(3);
        test_tree.insert(8);
        test_tree.insert(25);
        test_tree.insert(35);
        test_tree.insert(42);
        test_tree.insert(56);
        test_tree.insert(63);
        test_tree.insert(77);

        test_tree.insert(20);
        test_tree.insert(50);
        test_tree.insert(5);

        System.out.println(test_tree.root.key);
        System.out.println(test_tree.root.left.key);
        System.out.println(test_tree.root.right.key);
        System.out.println(test_tree.root.left.left.key);
        System.out.println(test_tree.root.left.right.key);
        System.out.println(test_tree.root.right.left.key);
        System.out.println(test_tree.root.right.right.key);
        System.out.println(test_tree.root.left.left.left.key);
        System.out.println(test_tree.root.left.left.right.key);
        System.out.println(test_tree.root.left.right.left.key);
        System.out.println(test_tree.root.left.right.right.key);
        System.out.println(test_tree.root.right.left.left.key);
        System.out.println(test_tree.root.right.left.right.key);
        System.out.println(test_tree.root.right.right.left.key);
        System.out.println(test_tree.root.right.right.right.key);

        System.out.println("----------------------------------------------------");

        BSTree test_split = new BSTree();

        test_split.bstSmaller.PrintPreorder(test_split.bstSmaller.root);
        System.out.println("----------------");
        test_split.bstGreater.PrintPreorder(test_split.bstGreater.root);
    }

}
