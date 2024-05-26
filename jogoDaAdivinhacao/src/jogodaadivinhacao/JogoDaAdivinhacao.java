package jogodaadivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int numero;
        int escolher;
        int chancesF = 5900;
        int chancesM = 30;
        int chancesD = 10;
        int aleatorio = random.nextInt(100);

        System.out.println("Ola!! voce esta no jogo da adivinhacao");
        System.out.println("MODOS:");
        System.out.println("1. FACIL: numero de 1 a 100, infinitas tentativas");
        System.out.println("2. MEDIO: numero 1 a 100, 30 tentativas");
        System.out.println("3. DIFICIL: numero 1 a 100, 10 tentativas");
        escolher = ler.nextInt();

        switch (escolher) {
            case 1:
                for (int i = 1; i < chancesF; i++) {

                    System.out.println("Qual sua aposta?");
                    numero = ler.nextInt();

                    if (numero == aleatorio) {
                        System.out.println("Voce acertou!! parabens!!");
                        break;
                    } else if (numero < aleatorio) {
                        System.out.println("Tente um numero maior");
                    } else if (numero > aleatorio) {
                        System.out.println("Tente um numero menor");
                    }

                    System.out.println("Voce esta na tentatica: " + i);

                }
                break;
            case 2:
                for (int i = 1; i < chancesM; i++) {

                    System.out.println("Qual sua aposta?");
                    numero = ler.nextInt();

                    if (numero == aleatorio) {
                        System.out.println("Voce acertou!! parabens!!");
                        break;
                    } else if (numero < aleatorio) {
                        System.out.println("Tente um numero maior");
                    } else if (numero > aleatorio) {
                        System.out.println("Tente um numero menor");
                    }

                    System.out.println("Voce esta na tentatica: " + i);

                }

                break;

            case 3:
                for (int i = 1; i < chancesD; i++) {

                    System.out.println("Qual sua aposta?");
                    numero = ler.nextInt();

                    if (numero == aleatorio) {
                        System.out.println("Voce acertou!! parabens!!");
                        break;
                    } else if (numero < aleatorio) {
                        System.out.println("Tente um numero maior");
                    } else if (numero > aleatorio) {
                        System.out.println("Tente um numero menor");
                    }

                    System.out.println("Voce esta na tentatica: " + i);

                }
                break;
        }

    }

}
