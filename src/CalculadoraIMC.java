import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class CalculadoraIMC extends Application{

    @Override
    public void start(Stage palco) {
        // Campos de entrada
        Label etiquetaPeso = new Label("Peso");
        Label etiquetaAltura = new Label("Altura");

        // Campos de entrada
        TextField campoPeso = new TextField();
        campoPeso.setPromptText("Peso em kg (Ex. 80.0)");

        TextField campoAltura = new TextField();
        campoAltura.setPromptText("Altura em metros (Ex. 1.80)");

        // Resultado do IMC
        Label etiquetaResultado = new Label();

        // Botão para calcular o IMC
        Button botaoCalcular = new Button("Calcular IMC");
        botaoCalcular.setOnAction(e -> {
            try {
                double peso = Double.parseDouble(campoPeso.getText());
                double altura = Double.parseDouble((campoAltura.getText()));

                double imc = peso / (altura * altura);

                String categoria;

                if (imc < 18.5){
                    categoria = "Abaixo do peso";
                } else if (imc < 25.0) {
                    categoria = "Peso normal";
                } else if (imc < 30.0) {
                    categoria = "Sobrepeso";
                } else if (imc < 35.0) {
                    categoria = "Obesidade Grau I";
                } else if (imc < 40.0) {
                    categoria = "Obesidade Grau II";
                } else {
                    categoria = "Obesidade Grau III (Mórbida)";
                }
                etiquetaResultado.setText(String.format("Seu IMC é: %.2f\nClassificação: %s", imc, categoria));

            } catch (NumberFormatException ex) {
                etiquetaResultado.setText("Por favor, insira números válidos para peso e altura.");
            }

        });

        // Layout vertical
        VBox layout = new VBox(10, etiquetaPeso, campoPeso, etiquetaAltura, campoAltura, botaoCalcular, etiquetaResultado);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);


        // Finalizando
        Scene cena = new Scene(layout, 300, 250);
        palco.setTitle("Calculadora de IMC");
        palco.setScene(cena);
        palco.show();



    }

    public static void main(String[] args){
        launch(args);
    }
}
