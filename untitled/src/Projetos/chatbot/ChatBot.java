package projetos.chatbot; 
import java.util.Scanner;

import projetos.Projeto;

public class ChatBot extends Projeto
{
   @Override
   public void Executar() 
   {
      Scanner sc = new Scanner(System.in);

      
      System.out.println("\n***********************");
      System.out.println("CHAT BOT\n");

      System.out.println("Qual o seu dia da semana favorito? (1 - Segunda, 2 - Terça, 3 - Quarta, 4 - Quinta, 5 - Sexta, 6 - Sábado, 7 - Domingo)");
      String str = sc.next();
      int dia = Integer.parseInt(str);

      switch (dia) {
         case 1:
            System.out.println("Você gosta de Segunda-feira!");
            break;
         case 2:
            System.out.println("Você gosta de Terça-feira!");
            break;
         case 3:
            System.out.println("Você gosta de Quarta-feira!");
            break;
         case 4:
            System.out.println("Você gosta de Quinta-feira!");
            break;
         case 5:
            System.out.println("Você gosta de Sexta-feira!");
            break;
         case 6:
            System.out.println("Você gosta de Sábado!");
            break;
         case 7:
            System.out.println("Você gosta de Domingo!");
            break;
         default:
            System.out.println("Dia não reconhecido");
            break;
      }
   }

}
