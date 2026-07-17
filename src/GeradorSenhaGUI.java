import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.security.SecureRandom;


public class GeradorSenhaGUI extends Application {

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
    @Override
    public void start(Stage palco)  {

        palco.setTitle("Gerador de Senha");

        Label labelTamanhoSenha = new Label("Tamanho senha:");
        TextField campoTamanhoSenha = new TextField();
        campoTamanhoSenha.setText("12");
        campoTamanhoSenha.setAlignment(Pos.CENTER);

        Label labelSenhaGerada = new Label("Senha gerada");
        labelSenhaGerada.setStyle("-fx-font-weight: bold; -fx-text-fill: #2c3e50;");
        TextField campoSenhaGerada = new TextField();
        campoSenhaGerada.setEditable(false);




        Button botaoGerar = new Button("Gerar senha");
        botaoGerar.setOnAction(e ->{
            int tamanhoSenha = Integer.parseInt(campoTamanhoSenha.getText());
            String senha = gerarSenha(tamanhoSenha);
            campoSenhaGerada.setText(senha);
        });

        VBox vBox = new VBox(labelTamanhoSenha, campoTamanhoSenha, botaoGerar, labelSenhaGerada, campoSenhaGerada);
        vBox.setAlignment(Pos.CENTER);

        Scene cena = new Scene(vBox, 300, 200);
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}
