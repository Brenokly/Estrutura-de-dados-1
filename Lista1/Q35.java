import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class Q35 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String frase = sc.nextLine();

    String[] palavras = frase.split(" ");
    Map<String, Integer> mapa = new HashMap<>();

    for (int i = 0; i < palavras.length; i++) {
      String palavra = palavras[i];
      if (mapa.containsKey(palavra)) {
        mapa.put(palavra, mapa.get(palavra) + 1);
      } else {
        mapa.put(palavra, 1);
      }
    }

    salvar(mapa);
    ler();
    
    sc.close();
  }

  private static void ler() {
    try {
      FileInputStream fis = new FileInputStream("D:\\Brwno\\OneDrive\\Área de Trabalho\\Meus Arquivos\\Materiais da Faculdade\\P4\\Data Structure 1\\Lista1\\Estrutura-de-dados-1\\Mapa.csv");
      ObjectInputStream ois = new ObjectInputStream(fis);
      @SuppressWarnings("unchecked")
      Map<String, Integer> mapa = (Map<String, Integer>) ois.readObject();

      System.out.println(mapa);

      ois.close();
      fis.close();
    } catch (IOException ioe) {
      ioe.printStackTrace();
      return;
    } catch (ClassNotFoundException c) {
      System.out.println("Classe não encontrada");
      c.printStackTrace();
      return;
    }
  }

  private static void salvar(Map<String, Integer> mapa) {
    try {
      FileOutputStream fos = new FileOutputStream("D:\\Brwno\\OneDrive\\Área de Trabalho\\Meus Arquivos\\Materiais da Faculdade\\P4\\Data Structure 1\\Lista1\\Estrutura-de-dados-1\\Mapa.csv");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(mapa);
      oos.close();
      fos.close();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }
}
