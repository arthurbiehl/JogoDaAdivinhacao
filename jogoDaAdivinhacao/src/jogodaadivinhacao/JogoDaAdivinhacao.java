package jogodaadivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {

    public static void main(String[] args) {

        do {

            Scanner ler = new Scanner(System.in);
            Random random = new Random();

            int numero;
            int escolher;
            int chancesF = 31;
            int chancesM = 16;
            int chancesD = 6;
            int chancesI = 11;
            int aleatorio = random.nextInt(100);
            String nome;

            System.out.println("Antes do jogo, qual seu Nome?");
            nome = ler.nextLine();
            System.out.println("====================");
            System.out.println("Ola, " + nome + "");
            System.out.println("Bem vindo ao jogo de ADIVINHACAO");
            System.out.println("Voce quer comecar a jogar? 1.SIM | 2.NAO");
            escolher = ler.nextInt();
            if (escolher == 1) {
                System.out.println("VAMOOO!!");
            } else {
                System.out.println("ADIOS");
                break;
            }
            System.out.print("O JOGO: ");
            System.out.println(" A interface escolhera um numero aleatorio de 1 a 100 para voce acertar com suas tentativas. ");
            System.out.println("MODOS DE JOGO:");
            System.out.println("1. FACIL: numeros de 1 a 100, 30 tentativas");
            System.out.println("2. MEDIO: numeros 1 a 100, 15 tentativas");
            System.out.println("3. DIFICIL: numeros 1 a 100, 5 tentativas");
            System.out.println("4. IMPOSSIVEL: numeros 1 a 1000, 10 tentativas");
            System.out.println("====================");
            System.out.print("Escolha o MODO: ");
            escolher = ler.nextInt();
            System.out.println("====================");

            switch (escolher) {
                case 1:
                    for (int i = 1; i < chancesF; i++) {

                        System.out.println("Qual seu palpite?");
                        numero = ler.nextInt();

                        if (numero == aleatorio) {
                            System.out.println("Voce acertou!! parabens!!");
                            System.out.println("====================");

                            break;
                        } else if (numero < aleatorio) {
                            System.out.println("Tente um numero maior");
                            System.out.println("====================");

                        } else if (numero > aleatorio) {
                            System.out.println("Tente um numero menor");
                            System.out.println("====================");

                        }

                        System.out.println("Voce esta na tentativa: " + i);

                    }
                    break;
                case 2:
                    for (int i = 1; i < chancesM; i++) {

                        System.out.println("Qual seu palpite?");
                        numero = ler.nextInt();

                        if (numero == aleatorio) {
                            System.out.println("Voce acertou!! parabens!!");
                            System.out.println("====================");

                            break;
                        } else if (numero < aleatorio) {
                            System.out.println("Tente um numero maior");
                            System.out.println("====================");

                        } else if (numero > aleatorio) {
                            System.out.println("Tente um numero menor");
                            System.out.println("====================");

                        }

                        System.out.println("Voce esta na tentativa: " + i);

                    }

                    break;

                case 3:
                    for (int i = 1; i < chancesD; i++) {

                        System.out.println("Qual seu palpite?");
                        numero = ler.nextInt();

                        if (numero == aleatorio) {
                            System.out.println("Voce acertou!! parabens!!");
                            System.out.println("====================");

                            break;
                        } else if (numero < aleatorio) {
                            System.out.println("Tente um numero maior");
                            System.out.println("====================");

                        } else if (numero > aleatorio) {
                            System.out.println("Tente um numero menor");
                            System.out.println("====================");

                        }

                        System.out.println("Voce esta na tentativa: " + i);
                    }
                    break;
                case 4:
                    for (int i = 0; i < chancesI; i++) {

                        System.out.println("Qual seu palpite?");
                        numero = ler.nextInt();

                        if (numero == aleatorio) {
                            System.out.println("VOCE REALMENTE ACERTOR, MEUS PARABENS!!");
                            System.out.println("====================");

                            break;
                        } else if (numero < aleatorio) {
                            System.out.println("Tente um numero maior");
                            System.out.println("====================");

                        } else if (numero > aleatorio) {
                            System.out.println("Tente um numero menor");
                            System.out.println("====================");

                        }

                        System.out.println("Voce esta na tentativa: " + i);

                    }

                    break;

            }

            System.out.println("Deseja continuar? 1.SIM | 2.NAO");
            escolher = ler.nextInt();

            if (escolher == 1) {

            } else {
                System.out.println("BELEZA MEU MANO, VAI COM DEUS TMJ");
                break;
            }

        } while (true);

    }

}
