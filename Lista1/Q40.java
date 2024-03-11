import java.util.Scanner;
import java.io.*;

public class Q40 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String menu = "1) codificar\n2) decodificar?\n3) Sair\nO que você deseja fazer? ";
    int op = 0;

    do {
      System.out.print(menu);
      op = sc.nextInt();
      sc.nextLine();

      if (op == 1) {
        codificar();
      } else if (op == 2) {
        decodificar();
      } else if (op == 3) {
        System.out.println("Saindo...");
      } else {
        System.out.println("Opção inválida.");
      }
    } while (op == 1 || op == 2);

    sc.close();
  }

  public static void codificar() {
    try {
      FileInputStream fis = new FileInputStream("D:\\Users\\Brwno\\OneDrive\\Área de Trabalho\\Meus Arquivos\\brenin.txt");
      InputStreamReader isr = new InputStreamReader(fis);
      BufferedReader br = new BufferedReader(isr);
      FileOutputStream fos = new FileOutputStream("D:\\Users\\Brwno\\OneDrive\\Área de Trabalho\\Meus Arquivos\\breninCodificado.txt");
      OutputStreamWriter osw = new OutputStreamWriter(fos);
      BufferedWriter bw = new BufferedWriter(osw);

      String linha;

      while ((linha = br.readLine()) != null) {

        linha = substituirCaractere(linha);

        bw.write(linha);
        bw.newLine();
      }

      System.out.println("Arquivo codificado com sucesso!");

      br.close();
      isr.close();
      fis.close();
      bw.close();
    } catch (IOException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }

  public static void decodificar() {
    try {
      FileInputStream fis = new FileInputStream(
          "D:\\Users\\Brwno\\OneDrive\\Área de Trabalho\\Meus Arquivos\\breninCodificado.txt");
      InputStreamReader isr = new InputStreamReader(fis);
      BufferedReader br = new BufferedReader(isr);
      FileOutputStream fos = new FileOutputStream(
          "D:\\Users\\Brwno\\OneDrive\\Área de Trabalho\\Meus Arquivos\\breninDecodificado.txt");
      OutputStreamWriter osw = new OutputStreamWriter(fos);
      BufferedWriter bw = new BufferedWriter(osw);

      String linha;

      while ((linha = br.readLine()) != null) {

        linha = substituirCaractere(linha);

        bw.write(linha);
        bw.newLine();
      }

      System.out.println("Arquivo decodificado com sucesso!");

      br.close();
      isr.close();
      fis.close();
      bw.close();
    } catch (IOException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }

  private static String substituirCaractere(String original) {
    char[] originalArray = original.toCharArray();

    for (int i = 0; i < original.length(); i++) {
      switch (original.charAt(i)) {
        case 'Z':
          originalArray[i] = 'P';
          break;
        case 'P':
          originalArray[i] = 'Z';
          break;
        case 'E':
          originalArray[i] = 'O';
          break;
        case 'O':
          originalArray[i] = 'E';
          break;
        case 'N':
          originalArray[i] = 'L';
          break;
        case 'L':
          originalArray[i] = 'N';
          break;
        case 'I':
          originalArray[i] = 'A';
          break;
        case 'A':
          originalArray[i] = 'I';
          break;
        case 'T':
          originalArray[i] = 'R';
          break;
        case 'R':
          originalArray[i] = 'T';
          break;
        default:
          break;
      }
    }

    return new String(originalArray);
  }
}
