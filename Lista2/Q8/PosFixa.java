package Lista2.Q8;

import java.util.Scanner;

public class PosFixa {
  public static void main(String[] args) {
    String infix;
    Scanner sc = new Scanner(System.in);

    System.out.print("Entre com a expressão (Ex: 315 + 16 - 7): ");
    infix = sc.nextLine();

    String posFixa = infixParaPosFixa(infix);

    double resultado = avaliarPosFixa(posFixa);

    System.out.println("Expressão PosFixa: " + posFixa);
    System.out.println("O resultado da expressão [" + infix + "] é: " + resultado);

    sc.close();
  }

  static double avaliarPosFixa(final String posFixa) {
    PilhaCrescente<Double> operandos = new PilhaCrescente<Double>(); // minha própria pilha

    // String padrao = "(?<=[-+*/^()])|(?=[-+*/^()])|(?<![\\d.])(?=[\\d.]+)|(?<=[\\d.])(?![\\d.])"; expressão regular

    String[] tokens = posFixa.split(" ");

    for (String token : tokens) {
      if (ehOperando(token.charAt(0))) {
        if (token.charAt(0) == 'e') {
          operandos.push(Math.E);
        } else {
          operandos.push(Double.parseDouble(token));
        }
      } else if (ehOperador(token.charAt(0))) {
        double operando2 = operandos.pop();
        double operando1 = operandos.pop();

        double resultado = aplicarOperador(operando1, operando2, token.charAt(0));
        operandos.push(resultado);
      }
    }

    return operandos.peek();
  }

  static String infixParaPosFixa(final String infixa) {
    StringBuilder posFixa = new StringBuilder();
    PilhaCrescente<Character> operadores = new PilhaCrescente<>(); // minha própria pilha

    StringBuilder numero = new StringBuilder(); // Para construir números com mais de um dígito

    for (char token : infixa.toCharArray()) {
      if (Character.isDigit(token)) {
        numero.append(token); // Adiciona o caractere ao número sendo construído
      } else {
        if (numero.length() > 0) {
          posFixa.append(numero.toString()).append(" ");
          numero.setLength(0); // Reseta o StringBuilder para construir o próximo número
        }
        if (ehOperando(token)) {
          posFixa.append(token).append(" ");
        } else if (ehOperador(token)) {

          while (!operadores.isEmpty() && prioridade(operadores.peek()) >= prioridade(token)) {
            posFixa.append(operadores.pop()).append(" ");
          }

          operadores.push(token);
        } else if (token == '(') {
          operadores.push(token);
        } else if (token == ')') {
          while (!operadores.isEmpty() && operadores.peek() != '(') {
            posFixa.append(operadores.pop()).append(" ");
          }
          operadores.pop(); // Remover o '(' da pilha
        }
      }
    }

    if (numero.length() > 0) {
      posFixa.append(numero.toString()).append(" ");
    }

    while (!operadores.isEmpty()) {
      posFixa.append(operadores.pop()).append(" ");
    }

    return posFixa.toString();
  }

  static public int prioridade(char op) {
    if (op == '^')
      return 3;
    if (op == '*' || op == '/')
      return 2;
    if (op == '+' || op == '-')
      return 1;
    return 0;
  }

  static public boolean ehOperador(char op) {
    return op == '+' || op == '-' || op == '*' || op == '/' || op == '^';
  }

  static public boolean ehOperando(char op) {
    return Character.isDigit(op) || op == 'e';
  }

  static public double aplicarOperador(double operando1, double operando2, char operador) {
    switch (operador) {
      case '+':
        return operando1 + operando2;
      case '-':
        return operando1 - operando2;
      case '*':
        return operando1 * operando2;
      case '/':
        return operando1 / operando2;
      case '^':
        return Math.pow(operando1, operando2);
      default:
        return 0.0;
    }
  }
}