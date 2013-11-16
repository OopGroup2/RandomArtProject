//import java.util.Math;
class BuilderTree {
 private static final int MAX_HEIGHT = 8;
 private static final int MIN_HEIGHT = 4;
 private CreateNode root;
 
 public BuilderTree(){
  buildTree();
 }
 
 public CreateNode buildTree() {
  CreateNode leaf = new CreateNode(null);
  this.root = new CreateNode(leaf);
  
  for (int i = 0; i < (int)(Math.random()*(MAX_HEIGHT-MIN_HEIGHT+1)+ MIN_HEIGHT); i++) {
    CreateNode node = new CreateNode(null);
    leaf.addLeaf(node);
    leaf = node;
  }
  return this.root;
 }
}
  



