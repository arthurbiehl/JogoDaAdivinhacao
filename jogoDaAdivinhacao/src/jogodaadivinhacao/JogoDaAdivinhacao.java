package jogodaadivinhacao;

import java.util.Random;
import java.util.Scanner;


public class JogoDaAdivinhacao {
    
   
    public int randomica(){
        Random random = new Random();
        return random.nextInt(100);
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int escolher;
        
        
        System.out.println("Bem vindo ao Jogo da Adivinhacao");
        System.out.println("Adivinhe o numero de 1 a 100 para vencer!");
       
        do{
            
            System.out.print("Escolha seu numero: ");
            escolher = ler.nextInt();
                            
           
                
            };
            
        }while(true);
        
        
        
        
        
    }
    


}
