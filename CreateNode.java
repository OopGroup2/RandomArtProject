import java.lang.Math;
import java.util.Random;
 class CreateNode {
  int data;
  CreateNode left;
  CreateNode right;
  
  public CreateNode(){
      this.data=0;
      this.left =null;
      this.right = null;
    }
  public CreateNode(int data) {
      this.data = data;
  
  }
  public CreateNode(int data,CreateNode left,CreateNode right) {
      this.data = data;
  
  }
  
  /* /**
  * Evaluate the function represented by this node
  * for the given x and y values.
  */
  public double evaluate(double x, double y){
    return 0;
  }
 
 //This method will show the function of random art in the string
 public String exprAsString(){
    return " "+evaluate(1,2);
    
  }
}

