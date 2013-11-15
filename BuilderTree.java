
import java.util.Random;
class BuilderTree extends CreateNode{
 public static final int MAX_LEVEL = 8;

 private Random random;
 private CreateNode root;
 
 public BuilderTree(){
  random = new Random();
  root = new CreateNode();
 }
 
 //this method will build the tree that has the max level is eight.
 public CreateNode build() {
 return null;
 }
 
 
  public void insert(int newInfo){
        if(root==null){//Tree is empty
            root= new CreateNode(newInfo);
        }else{
            CreateNode backPointer;
            CreateNode pointer;
            backPointer=pointer=root;
        while(pointer != null){ 
            // search for location of new node
            backPointer = pointer;
            if(newInfo < pointer.data){
                pointer = pointer.left;//move to the left child
            }else{
                pointer = pointer.right;//move to the right child
            }
        }
        if (newInfo < backPointer.data){
            backPointer.left = new CreateNode(newInfo);
        }else{
            backPointer.right = new CreateNode(newInfo);
        } 
        }
    }
}

