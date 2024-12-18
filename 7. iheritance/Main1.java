  class Imovel {
      protected String endereco;
      protected double preco;

      public Imovel(String endereco, double preco) {
          this.endereco = endereco;
          this.preco = preco;
      }

      public String getEndereco() {
          return endereco;
      }

      public double getPreco() {
          return preco;
      }

      public void imprimirInfo() {
          System.out.println("Endereço: " + endereco);
          System.out.println("Preço: " + preco);
      }
  }

  class Novo extends Imovel {
      private double adicional;

      public Novo(String endereco, double preco, double adicional) {
          super(endereco, preco);
          this.adicional = adicional;
      }

      public double getAdicional() {
          return adicional;
      }

      public double getPrecoFinal() {
          return preco + adicional;
      }

      public void imprimirAdicional() {
          System.out.println("Adicional: " + adicional);
          System.out.println("Preço com adicional: " + getPrecoFinal());
      }
  }

  class Velho extends Imovel {
      private double desconto;

      public Velho(String endereco, double preco, double desconto) {
          super(endereco, preco);
          this.desconto = desconto;
      }

      public double getDesconto() {
          return desconto;
      }

      public double getPrecoFinal() {
          return preco - desconto;
      }

      public void imprimirDesconto() {
          System.out.println("Desconto: " + desconto);
          System.out.println("Preço com desconto: " + getPrecoFinal());
      }
  }

  public class Main1 {
      public static void main(String[] args) {
          Novo imovelNovo = new Novo("Rua A, 123", 300000.0, 50000.0);
          Velho imovelVelho = new Velho("Rua B, 456", 250000.0, 30000.0);

          System.out.println("Informações do Imóvel Novo:");
          imovelNovo.imprimirInfo();
          imovelNovo.imprimirAdicional();

          System.out.println("\nInformações do Imóvel Velho:");
          imovelVelho.imprimirInfo();
          imovelVelho.imprimirDesconto();
      }
  }
