import java.security.SecureRandom;
import java.util.Scanner;

public class GeradorDeSenhasSeguras {

    private static final String CARACTERES = "!@#$%&*()+{}[]?.,;/1234567890qwertyuiopasdfghjklçzxcvbnmQWERTYUIOPASDFGHJKLÇZXCVBNM";

    public static String gerarSenha(int tamanho){
        SecureRandom geradorAleatorio = new SecureRandom();
        StringBuilder senha = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            int indice = geradorAleatorio.nextInt(CARACTERES.length());
            senha.append(CARACTERES.charAt(indice));
        }
        return senha.toString();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho da senha que deseja criar: ");
        int tamanhoSenha = scanner.nextInt();

        String senha = gerarSenha(tamanhoSenha);
        System.out.println("Senha gerada: " + senha);
    }
}
