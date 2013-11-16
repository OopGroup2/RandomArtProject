import java.lang.Math;
import java.util.Random;
 class CreateNode {
     
  private CreateNode leaf;
  private String textFunction;
  private int randomNumber;
  
  public CreateNode(CreateNode leaf) {
   // addLeaf(leaf);
  }
  
  public CreateNode() {
    this.leaf = null;
  }
  
  public void addLeaf(CreateNode leaf){
    this.leaf = leaf;
  }
  
  
  /* /**
  * Evaluate the function represented by this node
  * for the given x and y values.
  */
  public double evaluate(double x, double y){
    return 0;
  }
 
 //This method will show the function of random art in the string
  public String funcToString(){
    return "";
 
  }
}

