package Library;

public class Book{
  private String bookTitle;
  private String bookAutor;
  private String bookID;
  private String bookGender;
  private String userID;
  private int bookEdition;
  private int quantityOfPages;
  private boolean isAvailable = true;

  public Book(String title, String autor, int edition, int pages, Strin ID){
    this.bookTitle = title;
    this.bookAutor = autor;
    this.bookEdition = edition;
    this.bookID = ID;
  }

  public String getTitle(){
    return this.bookTitle;
  }
  
  public String getID(){
    return this.bookID;
  }

  public void borrowABook(String userID){
    if(this.isAvailable){
      isAvailable = false;
      this.userID = userID;
    }
    else{
      System.out.println("Esse livro está emprestado para o usuário " + this.userID);
    }
  }

  public void returnABook(){
    if(!this.isAvailable){
      isAvailable = true;
    }
  }
}
