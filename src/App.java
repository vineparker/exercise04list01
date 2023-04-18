import java.util.Scanner;

class Main {
  // Faça um Programa que peça as 4 notas bimestrais e mostre a média.
  public static void main(String[] args) {

    // declaração das variáveis 
    Scanner input = new Scanner(System.in);int resultado; 
    int numero1;
    int numero2;
    int numero3;
    int numero4;

    // primeira mensagem
    String textoUm = "Qual sua nota do primeiro bimestre?: ";
    System.out.print(textoUm);
    numero1 = input.nextInt();

    // segunda mensagem
    String textoDois = "Qual sua nota do segundo bimestre?: ";
    System.out.print(textoDois);
    numero2 = input.nextInt();

    // terceira mensagem
    String textoTres = "Qual sua nota do terceiro bimestre?: ";
    System.out.print(textoTres);
    numero3 = input.nextInt();

    // quarta mensagem
    String textoQuatro = "Qual sua nota do quarto bimestre?: ";
    System.out.print(textoQuatro);
    numero4 = input.nextInt();
    
    // calcular a media entre as notas dos 4 bimestres
    
    resultado = (numero1 + numero2 + numero3 + numero4) / 4;

    // mostrar o resultado da soma
    System.out.println("O a media da nota dos 4 bimetres e igual a: " + resultado);

    input.close();
  }
}





