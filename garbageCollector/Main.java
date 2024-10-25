import java.util.Scanner;
import java.util.ArrayList;
  
public class Main {

  static void createLine(){
    System.out.println("-------------------------------------------");
  }

  static void createMenu(){
    createLine();
    System.out.println("                 TASK MANAGER");
    createLine();
    System.out.println("1 - Cadastrar tarefa");
    createLine();
    System.out.println("2 - Remover Tarefa");
    createLine();
    System.out.println("3 - Verificar tarefa");
    createLine();
    System.out.println("4 - Verificar todas as tarefas");
    createLine();
    System.out.println("5 - Verificar memória utilizada");
    createLine();
    System.out.println("6 - Garbage Collector");
    createLine();
    System.out.println("7 - Sair");
    createLine();
  }

  public static void obterMemoriaUsada(){
    int MB = 1024 * 1024;
    Runtime runtime = Runtime.getRuntime();
    System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB + "MB");
  }

  static class Task{
    private int ID = 0;
    private String action = " ";

    public Task(int ID, String action){
      this.ID = ID;
      this.action = action;
    }

    public void showTask(){
      System.out.println(ID + " - " + action);
    }

    public void setID(int ID){
      this.ID = ID;
    }
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String action = " ";
    ArrayList <Task> taskManager = new ArrayList <Task>();
    Task task;
    int userInput = 0, ID = 0;
    while(true){
      createMenu();
      System.out.print("Digite o que deve ser feito: ");
      userInput = input.nextInt();
      switch(userInput){
        case 1:
          System.out.print("Digite a sua tarefa: ");
          action = input.next();
          ID = taskManager.size();
          task = new Task((ID+1), action);
          System.out.println();
          taskManager.add(task);
          System.out.println("Sua ação foi criada com sucesso!");
          break;
        case 2:
          System.out.print("Digite o ID da tarefa que deseja remover: ");
          ID = input.nextInt();
          taskManager.remove(ID - 1);
          for(int i = (ID-1); i < taskManager.size(); i++){
            taskManager.get(i).setID(i);
          }
          System.out.println("A tarefa foi removida com sucesso!");
          break;
        case 3:
          System.out.print("Digite o ID da tarefa que deseja verificar: ");
          ID = input.nextInt();
          task = taskManager.get(ID - 1);
          break;
        case 4:
          createLine();
          System.out.println("      TAREFAS CADASTRADAS:");
          createLine();
          for(int i = 0; i < taskManager.size(); i++){
            taskManager.get(i).showTask();
            createLine();
          }
          break;
        case 5:
          System.out.print("A memória que está sendo utilizada é de ");
          obterMemoriaUsada();
          break;
        case 6:
          Runtime.getRuntime().runFinalization();
          Runtime.getRuntime().gc();
          break;
        case 7:
          System.out.println("Saindo....");
          System.exit(0);
          break;
      }
    }
  }
}
