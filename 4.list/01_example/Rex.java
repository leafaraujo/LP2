public class Rex{
  private int life;
  private int localization;
  private String direction;
  private int size;
  private boolean hasAlive;

  public int getLife(){
    return this.life;
  }

  public String getDirection(){
    return this.direction;
  }

  public int getSize(){
    return this.size;
  }

  public void takeDamage(){
    this.life --;
  }

  public void setDirection(String direction){
    this.direction = direction;
  }
}
