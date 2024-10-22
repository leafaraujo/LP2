import java.util.Scanner;
import java.util.ArrayList;

public class Main{

  
  static Retangle cadastreRetangle(){
    Scanner input = new Scanner(System.in);
    Retangle retangle = new Retangle();
    float altura = 0, largura = 0;
    System.out.print("Altura do retângulo: ");
    altura = input.nextFloat();
    System.out.print("Largura do retângulo: ");
    largura = input.nextFloat();
    retangle.setHeight(altura);
    retangle.setWidht(largura);
    retangle.calculateArea();
    retangle.calculatePerimeter();
    return retangle;
    }

  static TriangleRetangle cadastreTriangleRetangle(){
    Scanner input = new Scanner(System.in);
    float cathetA = 0, cathetB = 0;
    TriangleRetangle triangleRetangle = new TriangleRetangle();
    System.out.print("Cateto adjacente do trriângulo retângulo: ");
    cathetA = input.nextFloat();
    System.out.print("Cateto oposto do trriângulo retângulo: ");
    cathetB = input.nextFloat();
    triangleRetangle.setCathetA(cathetA);
    triangleRetangle.setCathetB(cathetB);
    triangleRetangle.calculateHypotenuse();
    triangleRetangle.calculateArea();
    triangleRetangle.calculatePerimeter();
    return triangleRetangle;
    }

  
  static void createLine(){
    System.out.println("-------------------------------------------");
  }

  static void createMenu(){
    createLine();
    System.out.println("                 CYBERCHASE");
    createLine();
    System.out.println("1 - Cadastrar retângulo");
    createLine();
    System.out.println("2 - Cadastrar triângulo retângulo");
    createLine();
    System.out.println("3 - Mostrar retangulo específico");
    createLine();
    System.out.println("4 - Mostrar todos os retângulos");
    createLine();
    System.out.println("5 - Mostrar triângulo retângulo específico");
    createLine();
    System.out.println("6 - Mostrar todos os triângulos retângulos");
    createLine();
  }

  

  static class Retangle{
    private float retangleHeight = 0;
    private float retangleWidht = 0;
    private float retangleArea = 0;
    private float retanglePerimeter = 0;

    public Retangle(){}

    //Setters
    public void setHeight(float height){
      this.retangleHeight = height;
    }

    public void setWidht(float widht){
      this.retangleWidht = widht;
    }

    //Getters
    public float getHeight(){
      return this.retangleHeight;
    }

    public float getWidht(){
      return this.retangleWidht;
    }

    public float getArea(){
      return this.retangleArea;
    }

    public float getPerimeter(){
      return this.retanglePerimeter;
    }

    //Outras funções
    public void calculateArea(){
      this.retangleArea = this.retangleHeight * this.retangleWidht;
    }

    public void calculatePerimeter(){
      this.retanglePerimeter = 2 * (this.retangleHeight + this.retangleWidht); 
    }

    public void showRetangle(){
      System.out.println("Altura: " + this.retangleHeight);
      System.out.println("Largura: " + this.retangleWidht);
      System.out.println("Area: " + this.retangleArea);
      System.out.println("Perímetro: " + this.retanglePerimeter);
    }
    
  }

  static class TriangleRetangle{
    private float cathetA = 0;
    private float cathetB = 0;
    private float hypotenuse = 0;
    private float triangleArea = 0;
    private float trianglePerimeter = 0;

    public TriangleRetangle(){};

    //Setters
    public void setCathetA(float cathet){
      this.cathetA = cathet;
    }
    public void setCathetB(float cathet){
      this.cathetB = cathet;
    }

    //Getters

    public float getCathetA(){
      return this.cathetA;
    }
    public float getCathetB(){
      return this.cathetB;
    }
    public float getHypotenuse(){
      return this.hypotenuse;
    }
    public float getTriangleArea(){
      return this.triangleArea;
    }
    public float getTrianglePerimeter(){
      return this.trianglePerimeter;
  }

  //Outras funções

    public void calculateHypotenuse(){
      this.hypotenuse = (float) Math.sqrt((Math.pow(this.cathetA, 2) + Math.pow(this.cathetB, 2)));
    }
    public void calculateArea(){
      this.triangleArea = (cathetA *cathetB) / 2;
    }
    public void calculatePerimeter(){
      this.trianglePerimeter = cathetA + cathetB + hypotenuse;
    }

    public void showTriangleRetangle(){
      System.out.println("Cateto adjacente: " + this.cathetA);
      System.out.println("Cateto oposto: " + this.cathetB);
      System.out.println("Hipotenusa: " + this.hypotenuse);
      System.out.println("Área: " + this.triangleArea);
      System.out.println("Perímetro : " + this.trianglePerimeter);
    }
    
  }

  
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int userInput = 0, position = 0;
    ArrayList <Retangle> retangles = new ArrayList<Retangle>();
    ArrayList <TriangleRetangle> triangles = new ArrayList<TriangleRetangle>();

    while(true){
      createMenu();
      System.out.print("Digite a opção desejada: ");
      userInput = input.nextInt();
      switch(userInput){
        case 1:
          Retangle retangle = cadastreRetangle();
          retangles.add(retangle);
          break; 
        case 2:
          TriangleRetangle triangleRetangle = cadastreTriangleRetangle();
          triangles.add(triangleRetangle);
          break;
        case 3:
          if(retangles.size() == 0){
            System.out.println("Não existem retângulos cadastrados");
          }
          else{
            System.out.print("Digite a posição do retângulo: ");
            position = input.nextInt();
            if(position > (retangles.size() -1)){
              System.out.println("Essa posição não está cadastrada");
            }
            else{
            retangles.get(position).showRetangle();
            }
          }
          break;
        case 4:
          if(retangles.size() == 0){
            System.out.println("Não existem retângulos cadastrados");
          }
          else{
            createLine();
            System.out.println("RETÂNGULOS");
            createLine();
            for(int i = 0; i < retangles.size(); i++){
              retangles.get(i).showRetangle();
              createLine();
            }
          }
          break;
        case 5:
          if(triangles.size() == 0){
            System.out.println("Não existem triângulos retângulos cadastrados");
          }
          else{
            System.out.print("Digite a posição do triângulo: ");
            position = input.nextInt();
            if(position > (triangles.size() -1)){
              System.out.println("Essa posição não está cadastrada!");
            }
            else{
            triangles.get(position).showTriangleRetangle();
            }
          }
          break;
        case 6:
          if(triangles.size() == 0){
            System.out.println("Não existem triângulos retângulos cadastrados");
          }
          else{
            createLine();
            System.out.println("TRIÂNGULOS RETÂNGULOS");
            createLine();
            for(int i = 0; i < triangles.size(); i++){
              triangles.get(i).showTriangleRetangle();
              createLine();
            }
          }
          break;
        case 7:
          System.out.println("Encerrando o sistema...");
          System.exit(0);
          break;
        default:
          System.out.println("Opção inválida, por favor digite uma das opções válidas!");
          break;
      }
    }
  }
}
