package Tree;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
        //root=null;
    }
    public void insert(int value){
        if (value == data){
            return;
        }
        if (value <data){
            if (leftChild == null){
                leftChild = new TreeNode(value);
            }
            else{
                leftChild.insert(value);
            }
        }
        else{
            if (rightChild == null){
                rightChild = new TreeNode(value);
            }
            else{
                rightChild.insert(value);
            }
        }
    }


    public TreeNode get(int value){
        //returns a node based on the value
        if (value == data){
            //return data;
        }
        if (value <data){
            if (leftChild == null){
                leftChild = new TreeNode(value);
            }
            else{
                leftChild.insert(value);
            }
        }
        else{
            if (rightChild == null){
                rightChild = new TreeNode(value);
            }
            else{
                rightChild.insert(value);
            }
        }
            return rightChild;
    }

    public int min(){
        //looking for the min value of the tree
        if(leftChild==null){
            return data;
        }
        return 0;
    }

    public int max(){
        //looking for the max value of the tree
        return 0;
    }

    public void traverseInOrder(){
        //will be used to print the values of the Nodes
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    //DELETING A NODE !!!
}
