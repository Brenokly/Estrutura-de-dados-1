package Lista2.Q5;

import java.io.*;
import java.util.*;

public class Teste {
  public static void main(String[] args) {
    // Leitura de arquivo de texto
    List<String> linhas = new List<String>();
    try {
      File file = new File("Estrutura-de-dados-1/Lista2/Q5/Leitura.txt");
      FileReader fis = new FileReader(file);
      BufferedReader buffer = new BufferedReader(fis);

      String linha;
      while ((linha = buffer.readLine()) != null) {
        linhas.addLast(linha);
      }

      buffer.close();
    } catch (Exception e) {
      System.out.println("Erro ao ler o arquivo");
    }

    Map<String, Integer> map = new HashMap<>();

    String[] palavras = linhas.peekFirst().split(" ");

    for (String palavra : palavras) {
      if (map.containsKey(palavra)) {
        map.put(palavra, map.get(palavra) + 1);
      } else {
        map.put(palavra, 1);
      }
    }

    try {
      // Escrever no arquivo de texto
      BufferedWriter writer = new BufferedWriter(new FileWriter("Estrutura-de-dados-1/Lista2/Q5/Escrita.txt"));
      for (Map.Entry<String, Integer> entry : map.entrySet()) {
        writer.write(entry.getKey() + ": " + entry.getValue());
        writer.newLine();
      }
      writer.close();
      System.out.println("Arquivo de texto escrito com sucesso");

      // Escrever no arquivo binário
      FileOutputStream fos = new FileOutputStream("Estrutura-de-dados-1/Lista2/Q5/EscritaBinaria.bin");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(map);
      oos.close();
      fos.close();
      System.out.println("Arquivo binário escrito com sucesso");
    } catch (Exception e) {
      System.out.println("Erro ao escrever no arquivo");
    }

    // Perguntar se o usuário quer ler o arquivo binário ou de texto

    Scanner scanner = new Scanner(System.in);
    System.out.print("Deseja ler o arquivo de texto ou binário? (texto/binario): ");
    String resposta = scanner.nextLine();

    if (resposta.equals("texto")) {
      try {
        File file = new File("Estrutura-de-dados-1/Lista2/Q5/Escrita.txt");
        FileReader fis = new FileReader(file);
        BufferedReader buffer = new BufferedReader(fis);

        String linha;
        while ((linha = buffer.readLine()) != null) {
          System.out.println(linha);
        }

        buffer.close();
      } catch (Exception e) {
        System.out.println("Erro ao ler o arquivo");
      }
    } else if (resposta.equals("binario")) {
      try {
        FileInputStream fis = new FileInputStream("Estrutura-de-dados-1/Lista2/Q5/EscritaBinaria.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        @SuppressWarnings("unchecked")
        Map<String, Integer> mapLido = (Map<String, Integer>) ois.readObject();
        ois.close();
        fis.close();

        for (Map.Entry<String, Integer> entry : mapLido.entrySet()) {
          System.out.println(entry.getKey() + ": " + entry.getValue());
        }
      } catch (Exception e) {
        System.out.println("Erro ao ler o arquivo");
      }
    } else {
      System.out.println("Opção inválida");
    }

    scanner.close();
  }
}