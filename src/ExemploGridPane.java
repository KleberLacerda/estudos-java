import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExemploGridPane extends Application {

    @Override
    public void start(Stage palco) { // Corrigido para "start"

        Label rotuloNome = new Label("Nome:");
        Label rotuloEmail = new Label("E-mail:");

        TextField campoNome = new TextField();
        TextField campoEmail = new TextField();

        Button botaoEnviar = new Button("Enviar");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10); // Ajustado para não ficar um espaço gigante
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(15)); // Usando o Insets do JavaFX

        // Organizando em Linhas (Linha, coluna1, coluna2...)
        gridPane.addRow(0, rotuloNome, campoNome);
        gridPane.addRow(1, rotuloEmail, campoEmail);

        // Colocando o botão na linha 2, coluna 1 (segundo parâmetro)
        gridPane.add(botaoEnviar, 1, 2);

        Scene cena = new Scene(gridPane, 350, 150);
        palco.setTitle("Exemplo de GridPane");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}