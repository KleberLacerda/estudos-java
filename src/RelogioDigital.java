import javafx.animation.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.control.Alert.AlertType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RelogioDigital extends Application{

    final DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void start(Stage palco) {
        Label rotuloTempo = new Label();
            rotuloTempo.setStyle("-fx-font-size: 24pt; -fx-text-fill: #686e6e;");

        final boolean[] alertaExibido = {false};

        // Criação do KeyFrame
        KeyFrame keyFrameAtualizar = new KeyFrame(Duration.ZERO, e ->{
            LocalDateTime agora = LocalDateTime.now();
            rotuloTempo.setText(agora.format(formatador));

            int minuto = agora.getMinute();
            int segundo = agora.getSecond();

            if (minuto == 0 || minuto == 30 ){
                if (!alertaExibido[0]) {
                    alertaExibido[0] = true;

                    Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                    alerta.setTitle("Hora da Água!");
                    alerta.setHeaderText(null);
                    alerta.setContentText("Já se passaram 30 minutos. Que tal beber um copo de água para se manter hidratada?");
                    alerta.show();
                }
            }else {
                alertaExibido[0] = false;
            }

        });

        KeyFrame keyFrameIntervalo = new KeyFrame(Duration.seconds(1));

        Timeline relogio = new Timeline();
        relogio.getKeyFrames().addAll(keyFrameAtualizar, keyFrameIntervalo);

        relogio.setCycleCount(Animation.INDEFINITE);
        relogio.play();

        VBox vboxLayout = new VBox(rotuloTempo);
        vboxLayout.setAlignment(Pos.CENTER);
        vboxLayout.setStyle("-fx-background-color: #68e6e8;");

        Scene cena = new Scene(vboxLayout, 300, 100);

        palco.setTitle("Relogio Digital");
        palco.setScene(cena);
        palco.show();

    }


public static void main(String[] args) {
    launch(args);

    }

}

