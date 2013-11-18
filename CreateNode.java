import java.lang.Math;
import java.util.Random;
class CreateNode {
  private CreateNode leafNode;
  private String textFunction;
  private int randomNumber;
  private static final int RANDOM_SINCOS = 3;
  private static final int RANDOM_XY     = 2;
 
  
  public CreateNode(CreateNode leaf) {
    addLeaf(leaf);
  }
  public CreateNode() {
    this.leafNode = null;
  }
  
  public void addLeaf(CreateNode leaf){
    this.leafNode = leaf;
    random();
  }
  
  public void random(){
    if(leafNode != null){
      this.randomNumber = (int)(Math.random()*RANDOM_SINCOS);
    }else{
      this.randomNumber = (int)(Math.random()*RANDOM_XY+RANDOM_SINCOS);
    }  
    if(this.randomNumber == 0){
      this.textFunction = "sin(PI*x*";
    }else if(this.randomNumber ==1){
      this.textFunction = "cos(PI*y*";
    }else if(this.randomNumber ==2){
      this.textFunction = "abs(PI*";
    }else if(this.randomNumber ==3){
      this.textFunction = "x";
    }else{
      this.textFunction = "y";
  }
}
 
  
  /* /**
  * Evaluate the function represented by this node
  * for the given x and y values.
  */
  public double evaluate(double x, double y){
    if(this.randomNumber == 0){
      return Math.sin(Math.PI *x* this.leafNode.evaluate(x, y));
    }else if(this.randomNumber ==1){
      return Math.cos(Math.PI *y* this.leafNode.evaluate(x, y));
    }else if(this.randomNumber ==2){
      return Math.abs(Math.PI*this.leafNode.evaluate(x, y));
    }else if (this.randomNumber ==3){
      return x;
    }  else{
        return y;
    }
  }
 
 //This method will show the function of random art in the string
 public String stringFunction(){
    if(this.leafNode == null){
      return  this.textFunction +")";
    }else{
       return  this.textFunction + " "+ this.leafNode.stringFunction();
    }
 }
}

