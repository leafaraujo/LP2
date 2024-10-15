public class Turtle{
  private int turtleLife = 1;
  private int type;
  private int velocity = 1;
  private String turtlePower = "nothing";
  private boolean isInShell = false;

  public Turtle(int type){
    this.type = type;
  }
  
  private void enterInShell(){
    this.isInShell = true;
  }

  private void exitOfShell(){
    this.isInShell = false;
  }

  public int getTurtleLife(){
    return this.turtleLife;
  }

  public void setTurtlePower(String power){
    this.turtlePower = power;
  }
}
