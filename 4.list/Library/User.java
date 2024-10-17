package Library;

public class User{
  String userName;
  String userID;
  String userEmail;
  String userPassword;
  String userAddress;
  String userPhone;
  int userQuantityOfBooks = 0;
  Book userBooks[] = 3;
  boolean isFully = false;

  public User(String name, String ID, String email, String password, String address, String phone){
    this.userName = name;
    this.userID = ID;
    this.userEmail = email;
    this.userPassword = password;
    this.userAddress = address;
    this.userPhone = phone;
  }

  public void takeABook(Book book){
    if(this.userQuantityOfBooks < 3){
      this.userBooks[this.userQuantityOfBooks] = book;
      userQuantityOfBooks ++;
      if(this.userQuantityOfBooks == 2){
        this.isFully = true;
      }
    }
    else{
      System.out.println("Quantidade máxima de livros atingida");
    }
  }

  public void returnABook(Book book){
    for(int i = 0; i < 3; i++){
      if(this.userBooks[i].getID() == book.getID()){
        this.userBooks[i] = null;
        userQuantityOfBooks --;
      }
    }
  }
  
  public boolean getIsFully(){
    return isFully;
  }
  
}
