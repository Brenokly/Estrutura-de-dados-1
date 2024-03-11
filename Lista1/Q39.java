import java.util.ArrayList;
import java.util.List;

public class Q39 {

  private static class CrudOperations<T> {
    private List<T> database = new ArrayList<>();

    // Create
    public void create(T item) {
      database.add(item);
      System.out.println("Item adicionado com sucesso.");
    }

    // Read
    public void read() {
      if (database.isEmpty()) {
        System.out.println("A base de dados está vazia.");
      } else {
        System.out.println("Itens na base de dados:");
        for (T item : database) {
          System.out.println(item);
        }
      }
    }

    // Update
    public void update(int index, T newItem) {
      if (index >= 0 && index < database.size()) {
        database.set(index, newItem);
        System.out.println("Item atualizado com sucesso.");
      } else {
        System.out.println("Índice inválido.");
      }
    }

    // Delete
    public void delete(int index) {
      if (index >= 0 && index < database.size()) {
        database.remove(index);
        System.out.println("Item removido com sucesso.");
      } else {
        System.out.println("Índice inválido.");
      }
    }
  }

  private static class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
    }

    @Override
    public String toString() {
      return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }
  }

  public static void main(String[] args) {
    // Exemplo com String
    CrudOperations<String> stringCrud = new CrudOperations<>();
    stringCrud.create("Java");
    stringCrud.create("Python");
    stringCrud.read();
    stringCrud.update(1, "JavaScript");
    stringCrud.read();
    stringCrud.delete(0);
    stringCrud.read();

    // Exemplo com Pessoa
    CrudOperations<Pessoa> pessoaCrud = new CrudOperations<>();
    pessoaCrud.create(new Pessoa("João", 25));
    pessoaCrud.create(new Pessoa("Maria", 30));
    pessoaCrud.read();
    pessoaCrud.update(1, new Pessoa("Carlos", 35));
    pessoaCrud.read();
    pessoaCrud.delete(0);
    pessoaCrud.read();
  }
}