package Library;

public class Library{
  int quantityOfBooks = 0;
  int quantityOfUsers = 0;
  Book[] books;
  User[] users;

  public Library(){}
  
  public void cadastreBook(Book newBook){
    books[quantityOfBooks] = newBook;
    quantityOfBooks ++;
  }

  public void cadastreUser(User newUser){
    users[quantityOfUsers] = newUser;
    quantityOfUsers ++;
  }

  public void borrowBook(String bookID, string userID){
    for(int j = 0; j < quantityOfUsers; j ++){
      if(users[j].getID() == userID){
        if(users[j].getIsFully()){
          System.out.println("O usuário " + userID + " não pode pegar mais livros no momento!");
          return;
        }
        else{
          for(int i = 0; i < quantityOfBooks; i++){
            if(books[i].getID == bookID){
              users[j].takeABook(books[i]);
              books[i].borrowABook(userID);
              System.out.println("O usuário " + getID + " pegou o livro " + books[i].getTitle());
            }
          }
          
        }
      }
    }
  }
  
}
