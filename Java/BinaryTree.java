package BinaryTree;
class TreeNode{
  int data;
  TreeNode left,right;
   public TreeNode(int data){
       this.data=data;
       this.left=this.right=null;
   }
}
class BinaryTreeImpl {
    TreeNode root;

    public void insert(int data) {
        root=insertRec(root, data);
    }

    public TreeNode insertRec(TreeNode root, int data) {

        if (root == null) {
            root = new TreeNode(data);
        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        }
        else if(data> root.data){
            root.right=insertRec(root.right,data);
        }

      return root;
    }
    public void inorder(){
        System.out.print("Inorder ");
        inorderRec(root);
    }
    public void inorderRec(TreeNode root){
        if(root!=null){

            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }
    public void preorder(){
        System.out.print("Preorder ");
      preorderRec(root);
    }
    public void preorderRec(TreeNode root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    public void postorder(){
        System.out.print("Postorder ");
       postorderRec(root);
    }
    public void postorderRec(TreeNode root){
        if(root!=null){

            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data+" ");
        }
    }
}

public class BinaryTree {
    public static void main(String[] args) {
      BinaryTreeImpl obj=new BinaryTreeImpl();
      obj.insert(8);
      obj.insert(7);
        obj.insert(12);
        obj.insert(15);
        obj.insert(2);
        obj.insert(5);
        obj.inorder();
        obj.preorder();
        obj.postorder();
    }
}
