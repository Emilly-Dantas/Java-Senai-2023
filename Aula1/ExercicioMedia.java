import java.util.Scanner;

    public class  ExercicioMedia{
       public static void main(String[] args) {
           
           Scanner sc = new Scanner(System.in); 
           double nota1, nota2, nota3,media;
           String nome;
           int rm;
         
           System.out.println("Digite o nome da aluna: ");
           nome=sc.nextLine();
           System.out.println("Digite o RM");
           rm=sc.nextInt();
           System.out.println("Digite a 1ª nota: ");
           nota1= sc.nextDouble();
           System.out.println("Digite a 2ª nota: ");
           nota2= sc.nextDouble();
           System.out.println("Digite a 3ª nota: ");
           nota3= sc.nextDouble();
           media = (nota1+nota2+nota3)/3;
           System.out.println("O aluno: "+nome+" do rm: "+rm+" e teve sua media final: "+media);
           sc.close();
   } 

}
    