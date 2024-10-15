public class Mario{
  private int marioLife;
  private int marioCoins = 0;
  private int marioPositionX = 0;
  private int marioPositionY = 0;
  private int marioSize = 1;
  private String marioPowerUp;
  private boolean isMarioAlive = true;

  public Mario(int life, String powerUp){
    this.marioLife = life;
    this.marioPowerUp = powerUp;
  }

  private void moveInMap(int valueOfY, int valueOfX){
    this.marioPositionY += valueOfY;
    this.marioPositionX += valueOfX;
  }

  public void marioJump(int valueOfY){
    moveInMap(valueOfY, 0);
  }

  public void marioWalk(int valueOfX){
    moveInMap(0, valueOfX);
  }

  public void marioDie(){
    this.isMarioAlive = false;
  }
  
  public static void main(String[] args){
    
  }
}
