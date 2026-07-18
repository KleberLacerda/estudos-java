import java.util.Scanner;

public class CalculadoraViagem {
    public static void main(String[] args){

        String destinoViagem;
        int kmDestino;
        double consumoCarro;
        double valorLitroCombustivel;
        int quantidadeLitroAbastecido;
        int numPassageiros;


        System.out.println("**** Programa Viagem Certa ****");

        // Nesse bloco será feito as perguntas para motorista
        Scanner motorista = new Scanner(System.in);

        System.out.print("Qual o nome da cidade que vai viajar: ");
        destinoViagem = motorista.nextLine();
        System.out.println();

        System.out.print("Quantos km são até  " + destinoViagem + " ? ");
        kmDestino = motorista.nextInt();
        System.out.println();

        System.out.print("Quantos Km/l seu carro faz? ");
        consumoCarro = motorista.nextDouble();
        System.out.println();

        System.out.print("Valor do combustivel R$ ");
        valorLitroCombustivel = motorista.nextDouble();
        System.out.println();

        System.out.print("Quantos litros foram abastecidos: ");
        quantidadeLitroAbastecido = motorista.nextInt();
        System.out.println();

        System.out.print("Número de pessoas que será divido os custo da viagem: ");
        numPassageiros = motorista.nextInt();
        System.out.println();


    // Quantos litros são necessário para chegar no destino
        int litrosParaChegarNoDestino = (int) ((kmDestino * 2) / consumoCarro);

    //qual o custo da viagem
        double custoDaViagem = litrosParaChegarNoDestino * valorLitroCombustivel;

    //qual o valor para cada passageiro
        double custoPorPassageiro = custoDaViagem / numPassageiros;

        if (quantidadeLitroAbastecido >= litrosParaChegarNoDestino){
            System.out.println("Você abasteceu " + quantidadeLitroAbastecido +" litros, vai viajar tranquilo! \nBoa Viagem!");
        } else {
            System.out.println("Você abasteceu só " + quantidadeLitroAbastecido +" litros, vai precisar para no meio da viagem para abastecer.");
        }

    System.out.println();
    System.out.println("A viagem para " + destinoViagem + "são " + kmDestino + "km.");
    System.out.println("O custo total da viagem R$ " + custoDaViagem + ". \nDivido pelas " + numPassageiros + " pessoas, fica R$ " + custoPorPassageiro + " para cada.");

    }


}
