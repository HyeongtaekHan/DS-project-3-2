public class BSTree {

    public BSTNode root;
    public BSTNode before;
    public BSTree bstSmaller, bstGreater;

    public BSTree() {
        root = null;
        before = null;
    }
    public void BSTSplit() {
        bstSmaller = null;
        bstGreater = null;
    }

    public BSTree(BSTree bstSmaller, BSTree bstGreater){
        bstSmaller = new BSTree();
        bstGreater = new BSTree();

        preorderSplit(bstSmaller.root, bstSmaller, bstGreater, root.key);
    }

    public void preorderSplit(BSTNode r, BSTree small, BSTree great, int value) {

        if(r == null) {
            return;
        }

        if(r.key < value) {
            small.insert(r.key);
        }
        else if(r.key > value) {
            great.insert(r.key);
        }
        preorderSplit(r.left, small, great, value);
        preorderSplit(r.right, small, great, value);

    }

    public void insert(int key) {

        if(root == null) {
            root = new BSTNode();
            root.key = key;
        }
        else {
            BSTNode temp = root;

            while(true) {
                if(key < temp.key) {
                    before = temp;
                    temp = temp.left;
                    if(temp == null) {
                        before.left = new BSTNode();
                        before.left.key = key;
                        before = null;
                        break;
                    }
                }
                else if(key > temp.key) {
                    before = temp;
                    temp = temp.right;
                    if(temp == null) {
                        before.right = new BSTNode();
                        before.right.key = key;
                        before = null;
                        break;
                    }
                }
                else if(key == temp.key) {
                    break;
                }
            }

        }
    }

    public void PrintPreorder(BSTNode r) {
        if(r== null) {
            return;
        }

        System.out.println(r.key);
        PrintPreorder(r.left);
        PrintPreorder(r.right);
    }



}

