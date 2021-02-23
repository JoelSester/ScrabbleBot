public class DictionaryNode {
    public String data;
    private DictionaryNode right = null;
    private DictionaryNode left = null;

    DictionaryNode(String dataToSet){
        data = dataToSet;
    }

    public DictionaryNode getLeft() {
        return left;
    }

    public DictionaryNode getRight() {
        return right;
    }

    public void insert(String toAdd) {
        if(data.compareTo(toAdd)<0){
            if(left!=null) {
                left.insert(toAdd);
            }
            left = new DictionaryNode(toAdd);
        }
        else{
            if(right!=null) {
                right.insert(toAdd);
            }
            else{
                right = new DictionaryNode(toAdd);
            }
        }
        balance();
    }

    private void balance() {
        int heightDifference = 0;
        int leftHeight = 0;
        int rightHeight = 0;
        DictionaryNode temp;
        String stemp;
        if(left!=null){
            leftHeight = left.height();
        }
        if(right!=null){
            rightHeight = right.height();
        }
        heightDifference = leftHeight-rightHeight;
        if(heightDifference>1){
            if(right!=null) {
                right.insert(data);
            }
            else{
                right = new DictionaryNode(data);
            }
            stemp = data;
            data = left.data;
            temp = right;
            right = new DictionaryNode(stemp);
            left.right = right.left;
            left.left = left;
        }
    }

    private int height(){
        int height = 0;
        int rightHeight = 0;
        if(left != null){
            height = left.height();
        }
        if(right != null){
            rightHeight=right.height();
            if(rightHeight>height){
                height = rightHeight;
            }
        }
        return height+1;
    }
    /*
    private DictionaryNode getLeftChild(){
        DictionaryNode finalChild;
        if(left==null){
            return this;
        }
        finalChild = left.getLeftChild();
        if(finalChild == left){
            if (left.right != null){
                left = left.right;
            }
        }
    }
    private DictionaryNode getRightChild(){
        DictionaryNode finalChild;
        if(right==null){
            return this;
        }
        finalChild = right.getLeftChild();
        if(finalChild == right){
            if (right.left != null){
                right = right.left;
            }
        }
    }
    */
}
