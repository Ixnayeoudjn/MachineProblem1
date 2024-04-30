public class BinarySearchTree {
Nodee root;

    public void insertNode(Nodee node) {

        root = insertHelper(root, node);
    }

    private Nodee insertHelper(Nodee root, Nodee node) {
        
        int data = node.data;

        if (root == null) {
            root = node;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        
        return root;
    }

    public void inOrderDisplay() {
        inDisplayHelper(root);
    }

    public void preOrderDisplay() {
        preDisplayHelper(root);
    }

    public void postOrderDisplay() {
        postDisplayHelper(root);
    }

    private void postDisplayHelper(Nodee root) {
        if(root != null) {
            postDisplayHelper(root.left);
            postDisplayHelper(root.right);
            System.out.print(root.data + " ");
        }
    }

    private void preDisplayHelper(Nodee root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preDisplayHelper(root.left);
            preDisplayHelper(root.right);
        } 
    }

    private void inDisplayHelper(Nodee root) {
        if(root != null) {
            inDisplayHelper(root.left);
            System.out.print(root.data + " ");
            inDisplayHelper(root.right);
        } 

    }

    public void remove(int data) {
        if (searchNode(data)) {
            removeHelper(root, data);
        } else {
            System.out.println("Element not found");
        }
    }

    private Nodee removeHelper(Nodee root, int data) {

        if (root == null) {
            return root;
        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) {
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            } else {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int successor(Nodee root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    private int predecessor(Nodee root) {
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public boolean searchNode(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper (Nodee root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }

    private void leafNode(Nodee root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }

        leafNode(root.left);
        leafNode(root.right);
    }

    private void parentNode(Nodee root) {
        if (root == null || root.left == null && root.right == null) {
            return;
        }

        System.out.print(root.data + " ");
        parentNode(root.left);
        parentNode(root.right);
    }

    private int treeDepth(Nodee root) {
        if (root == null) {
            return 0;
        }
    int lDepth = treeDepth(root.left);
    int rDepth = treeDepth(root.right);

    return Math.max(lDepth, rDepth) + 1;
    }

    public void treeStructure() {
        System.out.println("Parent Nodes:");
        parentNode(root);
        System.out.println("\nLeaf Nodes:");
        leafNode(root);
        int lvltree = treeDepth(root);
        System.out.println("\nLevel of the Tree: " + lvltree);
    }


}