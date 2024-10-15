public class Bowser{
  private int life;
  private int localization;
  private int damage;
  private boolean isAngry;
  private boolean hasAlive;

  public int getBowserLife(){
    return this.life;
  }
  public boolean bowserIsAngry(){
    return this.isAngry;
  }
  
  void takeDamage(){
    this.life --;
  }
  
  void setAngry(){
    this.isAngry = true;
  }
  
  void bowserDie(){
    this.hasAlive = false;
  }
}
