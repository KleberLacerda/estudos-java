import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.web.WebView;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ExemploVideo extends Application {

    @Override
    public void start(Stage palco) {

        Button botaoAbrir = new Button("Tocar Música (Inglaterra Copa 2026)");


        botaoAbrir.setOnAction(e -> {
           String urlYoutube = "https://www.youtube.com/shorts/vMokQuZHkkg";
            abrirVideoYoutube(urlYoutube, palco);
        });

        VBox layout = new VBox(20, botaoAbrir);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));

        Scene cena = new Scene(layout, 800, 600);
        palco.setTitle("Player de Vídeo - Copa do Mundo de 2026");
        palco.setScene(cena);
        palco.show();
    }

    private void abrirVideoYoutube(String url, Stage palcoDoVideo) {
        WebView webView = new WebView();
        webView.getEngine().load(url);

        webView.setPrefWidth(760);
        webView.setPrefHeight(450);

        VBox layout = (VBox) palcoDoVideo.getScene().getRoot();

        if (layout.getChildren().size() > 1) {
            layout.getChildren().remove(1);
        }

        layout.getChildren().add(webView);

        palcoDoVideo.setTitle("Tocando Música da Copa 2026");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
