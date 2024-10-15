public class Yoshi{
  private boolean yoshiIsMounted = false;
  private int yoshiFood = 0;
  private int yoshiSpeed = 1;
  private boolean yoshiIsScared = false;
  private String objectInMouth = "nothing";
  private String yoshiPowerUp = "none";

  public void Yoshi(){}

  public void yoshiTakeDamage(){
    this.yoshiIsScared = true;
    this.yoshiSpeed ++;
  }

  public void yoshiEatFood(){
    this.yoshiFood ++;
  }

  public void marioMountInYoshi(){
    this.yoshiIsMounted = true;
  }

  public void marioUnmountFromYoshi(){
    this.yoshiIsMounted = false;
  }

  public void yoshiThrowObject(){
    this.objectInMouth = "nothing";
  }
}
