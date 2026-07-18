import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palavrasSecretas = new ArrayList<>();
        palavrasSecretas.add("java");
        palavrasSecretas.add("python");
        palavrasSecretas.add("sql");

        Random random = new Random();
        int tamanhoDoArrayList = palavrasSecretas.size();
        int indicePalavraAleatoria = random.nextInt(tamanhoDoArrayList);
        String palavrasSecreta = palavrasSecretas.get(indicePalavraAleatoria);

        ArrayList<Character> letrasDescobertas = new ArrayList<>();

        for (int i = 0; i < palavrasSecreta.length(); i++) {
            letrasDescobertas.add('_');
        }

        int tentativas = 6;
        boolean palavraDescoberta = false;


        while (!palavraDescoberta && tentativas > 0) {
            System.out.println();
            System.out.println("Palavra: " + letrasDescobertas);
            System.out.println("Chute uma letra: ");
            char chute = scanner.next().charAt(0);

            boolean acertou = false;
            for (int i = 0; i < palavrasSecreta.length(); i++) {
                if (palavrasSecreta.charAt(i) == chute){
                    letrasDescobertas.set(i, chute);
                    acertou = true;
                }
            }

            if (!acertou){
                tentativas--;
                System.out.println("Você errou! Mais " + tentativas + " tentativas restantes.");

            }

            palavraDescoberta = !letrasDescobertas.contains('_');

        }

        if (palavraDescoberta) {
            System.out.println("Parabens, você acertou! A palavra era: " +palavrasSecreta);
            } else {
                System.out.println("Você perdeu! A palavra era: " +palavrasSecreta);
            }
        }
    }






        /*
        String palavraSecreta = "java";
        int numerosTentativas = 6;



        System.out.println("=== BEM-VINDO AO JOGO DA FORCA ===");
        System.out.println("A palavra secreta tem " + palavraSecreta.length() + " letras.");

        for (int i = 0; i < numerosTentativas; i++) {
            System.out.print("Chute uma letra: ");
            String chute = scanner.nextLine();

            if (palavraSecreta.contains(chute)) {
                System.out.println("Boa! A letra '" + chute + "' existe na palavra secreta!");
            } else {
                numerosTentativas--;
                System.out.println("Errou! A letra '" + chute + "' não está na palavra.");
                System.out.println("Você tem mais " + numerosTentativas + " tentativas.");
            }
        }

        if (numerosTentativas == 0) {
            System.out.println("\nGame Over! Suas tentativas acabaram. A palavra era: " + palavraSecreta);
        }
    } */

