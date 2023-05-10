import java.util.Scanner;
public class Prova{

    public static void main(String[] args) {
              
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Programa para calculo de custo estimado da viagem.");

        // Identificação do veiculo
        
        System.out.println("\nFavor informar a placa do veículo.");
        String placaVeiculo = scanner.nextLine();

        // Valor combustivel

        System.out.println("\nInforme o preço do litro de combústivel.");
        double precoCombustivel = scanner.nextDouble();

        // KM percorridos

        System.out.println("\nInforme quantos quilometos foram percorridos na faixa de 60KM/H.");
        double velocidade60 = scanner.nextDouble();
        
        System.out.println("Informe quantos quilometos foram percorridos na faixa de 80KM/H.");
        double velocidade80 = scanner.nextDouble();

        System.out.println("Informe quantos quilometos foram percorridos na faixa de 100KM/H.");
        double velocidade100 = scanner.nextDouble();

        System.out.println("Informe quantos quilometos foram percorridos na faixa de 120KM/H.");
        double velocidade120 = scanner.nextDouble();

        System.out.println("Informe quantos quilometos foram percorridos na faixa de 140KM/H.");
        double velocidade140 = scanner.nextDouble();

        // Calculo de consumo de combustível

        double consumoVelocidade60 = velocidade60 / 30.7;
        double consumoVelocidade80 = velocidade80 / 26.8; 
        double consumoVelocidade100 = velocidade100 / 22.4;
        double consumoVelocidade120 = velocidade120 / 18.1;
        double consumoVelocidade140 = velocidade140 / 14.5; 

        double consumoTotalCombustivel = consumoVelocidade60 + consumoVelocidade80 + consumoVelocidade100 + consumoVelocidade120 + consumoVelocidade140;

        // Calculo velocidade média

        double distanciaTotal = velocidade60 + velocidade80 + velocidade100 + velocidade120 + velocidade140;
        double velocidadeMedia = ((velocidade60 * 60) + (velocidade80 * 80) + (velocidade100 * 100) + (velocidade120 * 120) + (velocidade140 * 140)) /  distanciaTotal;
        
        // Calculo custo da viagem

        double custoViagem = consumoTotalCombustivel * precoCombustivel;

        // Imprimir informações

        System.out.println("\nA placa do veiculo é: " + placaVeiculo);
        System.out.printf("O consumo total de combustível em litros é de: %.4f", consumoTotalCombustivel);
        System.out.printf("\nO custo total da viagem é de: R$ %.2f", custoViagem);
        System.out.printf("\nA velocidade média ponderada em KM/H: %.4f", velocidadeMedia);

        scanner.close();
    }
}