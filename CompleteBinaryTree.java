public class CompleteBinaryTree<T> {
    private T item;
    private int size;
    private CompleteBinaryTree<T> leftChild;
    private CompleteBinaryTree<T> rightChild;

    public CompleteBinaryTree(T item) {
        this.item = item;
        this.size = 1;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void add(T item) {
        CompleteBinaryTree<T> currentNode = this;
        while (currentNode.leftChild != null && currentNode.rightChild != null) {
            if (currentNode.goLeft()) {
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
            }
        }

        if (currentNode.leftChild == null) {
            currentNode.leftChild = new CompleteBinaryTree<>(item);
        } else {
            currentNode.rightChild = new CompleteBinaryTree<>(item);
        }
        size++;
    }

    private boolean goLeft() {
        return leftChild.size() <= rightChild.size();
    }

    public boolean contains(T checkItem) {
        if (item == null) {
            return false;
        }
        if (item.equals(checkItem)) {
            return true;
        }
        boolean found = false;
        if (leftChild != null) {
            found = leftChild.contains(checkItem);
        }
        if (!found && rightChild != null) {
            found = rightChild.contains(checkItem);
        }
        return found;
    }

    public int size() {
        return size;
    }
}
