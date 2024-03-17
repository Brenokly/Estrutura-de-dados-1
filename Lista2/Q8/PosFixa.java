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
    PilhaCrescente<Double> operandos = new PilhaCrescente<Double>();

    String padrao = "(?<=[-+*/^()])|(?=[-+*/^()])|(?<![\\d.])(?=[\\d.]+)|(?<=[\\d.])(?![\\d.])";

    // Usando expressão regular para dividir a expressão em tokens
    String[] tokens = posFixa.split(padrao);

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
    PilhaCrescente<Character> operadores = new PilhaCrescente<Character>();
    String posFixa = "";

    String padrao = "(?<=[-+*/^()])|(?=[-+*/^()])|(?<![\\d.])(?=[\\d.]+)|(?<=[\\d.])(?![\\d.])";

    // Usando expressão regular para dividir a expressão em tokens
    String[] tokens = infixa.split(padrao);

    for (String token : tokens) {
      if (ehOperando(token.charAt(0)) || token.equals("e")) { // "e" é constante de euler

        posFixa += token + " ";

      } else if (ehOperador(token.charAt(0))) {
        // Enquanto a pilha de operadores não estiver vázia e o simbolo do topo não for
        // um abre parêntese e a prioridade do operador no topo
        // for maior que a prioridade do operador atual, adiciona na expressão posfixa.
        // é uma forma de manter a prescedência.
        // Ex: 35 + 4 * 2 -> na pilha terá + no topo, porém quando achar o *, ele tem
        // uma prescendência maior, então entrará na expressão primeiro.

        while (!operadores.isEmpty() && operadores.peek() != '('
            && prioridade(operadores.peek().charValue()) >= prioridade(token.charAt(0))) {

          posFixa += operadores.pop() + " ";

        }
        operadores.push(token.charAt(0));

      } else if (token.charAt(0) == '(') {
        // abre parêntese na pilha

        operadores.push(token.charAt(0));

      } else if (token.charAt(0) == ')') {
        while (operadores.peek() != '(' && !operadores.isEmpty()) {
          // Enquanto o while não achar o abre parentese, adiciona tudo a expressão, ou
          // seja, tudo que está entre o abre e fecha parentese.

          posFixa += operadores.pop() + " ";

        }
        operadores.pop();
      }
    }

    while (!operadores.isEmpty()) {
      posFixa += operadores.pop() + " ";
    }

    return posFixa;
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