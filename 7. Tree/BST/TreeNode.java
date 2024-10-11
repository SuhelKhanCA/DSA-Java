public class TreeNode<T extends Comparable<T>> {
    T element;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T o) {
        this.element = o;
        this.left = null;
        this.right = null;
    }

    public TreeNode() {
        this.element = null;
        this.left = null;
        this.right = null;
    }

    // Insertion method
    public void insert(T o) {
        if (element.compareTo(o) < 0) {
            if (right == null) {
                right = new TreeNode<T>(o);
            } else {
                right.insert(o);
            }
        } else if (element.compareTo(o) > 0) {
            if (left == null) {
                left = new TreeNode<T>(o);
            } else {
                left.insert(o);
            }
        }
    }

    // Deletion method
    public TreeNode<T> delete(TreeNode<T> root, T key) {
        if (root == null) return root;

        if (root.element.compareTo(key) > 0) {
            root.left = delete(root.left, key);
        } else if (root.element.compareTo(key) < 0) {
            root.right = delete(root.right, key);
        } else {
            // Node to be deleted found
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Node with two children: Get inorder successor
            root.element = minValue(root.right);
            root.right = delete(root.right, root.element);
        }
        return root;
    }

    // Method to find the minimum value in a tree
    public T minValue(TreeNode<T> root) {
        T minv = root.element;
        while (root.left != null) {
            minv = root.left.element;
            root = root.left;
        }
        return minv;
    }

    // Search method
    public TreeNode<T> search(T key) {
        if (this == null) return null;

        if (this.element.compareTo(key) == 0) {
            return this;
        } else if (this.element.compareTo(key) > 0) {
            return (this.left == null) ? null : this.left.search(key);
        } else {
            return (this.right == null) ? null : this.right.search(key);
        }
    }

    public void searchResult(T key) {
        if (search(key) == null) {
            System.out.println("Not Found");
        } else {
            System.out.println(key + " : Found");
        }
    }

    // Traversal methods
    static void inorder(TreeNode<?> R) {
        if (R != null) {
            inorder(R.left);
            R.visit();
            inorder(R.right);
        }
    }

    static void preorder(TreeNode<?> R) {
        if (R != null) {
            R.visit();
            preorder(R.left);
            preorder(R.right);
        }
    }

    static void postorder(TreeNode<?> R) {
        if (R != null) {
            postorder(R.left);
            postorder(R.right);
            R.visit();
        }
    }

    public void visit() {
        System.out.print(this.element + " ");
    }

    // Main method for testing
    public static void main(String args[]) {
        TreeNode<Integer> root = new TreeNode<>(6);
        root.insert(5);
        root.insert(7);
        root.insert(4);

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();

        root = root.delete(root, 5);
        System.out.print("Inorder after deletion: ");
        inorder(root);
        System.out.println();

        root.searchResult(7);
        root.searchResult(12);
        root.searchResult(-112);
    }
}
