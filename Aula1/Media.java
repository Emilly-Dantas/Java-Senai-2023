/*Programa que calcula média dos alunos*/

// importação necessa´ria para utilizar o Scanner


// SEMPRE PRECISO COLOCAR ESSA LINHA

    import java.util.Scanner;// Para que possa trabalhar com entrada de dados via teclado

 public class Media {

    public static void main(String[] args) {
        
  Scanner sc = new Scanner(System.in); //Sempre escrever assim
  double nota1, nota2, nota3,media;// Declaração das variáveis

  System.out.println("Digite a 1ª nota: ");
  nota1= sc.nextDouble();
  System.out.println("Digite a 2ª nota: ");
  nota2= sc.nextDouble();
  System.out.println("Digite a 3ª nota: ");
  nota3= sc.nextDouble();
  media = (nota1+nota2+nota3)/3;
  System.out.println("O aluno obteve média: "+media);
  sc.close();








    }
    
}
