import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorTemp {
    public static void main(String[] args) {
        String answer = "s";

        while (answer.equals("s")) {
            initialize();

//pede a unidade de entrada da temp;
            String type = "inicial";
            UnityOptions entrada = codeOption(type);
            if (entrada == UnityOptions.SAIR) {
                System.out.println("|----------Encerrando Conversor de Temperatura---------|");
                break;
            }
// não entendi pq o verifica não funciona;
            if (entrada == UnityOptions.ERRO){
                while (entrada == UnityOptions.ERRO){
                    entrada = codeOption(type);
                }
            }
//            verifica(entrada, type);

//pede a quantidade de temperaturas q quer converter e as temperaturas;
            double[] temp = new double[QuantTemperaturas()];
            getTemps(entrada, temp);



//pede a unidade para qual quer converter a temp;
        type = "final";
        UnityOptions saida = codeOption(type);
        if (saida == UnityOptions.SAIR) {
            System.out.println("|----------Encerrando Conversor de Temperatura---------|");
            break;
        }

//não entendi pq o verifica não funciona;
            if (saida == UnityOptions.ERRO){
                while (saida == UnityOptions.ERRO){
                    saida = codeOption(type);
                }
            }
//        verifica(saida, type);


//converte as temp passadas e faz a média das temp convertidas;
        Convert.convert(temp, entrada, saida);

//termina ou reinicia o conversor;
        answer = TerminarConversor.terminarConversor(answer);
    }

}

        private static double[] getTemps(UnityOptions entrada, double[] temp){
            try{
            for (int i = 0; i < temp.length; i++) {
                int numero = i;
                Scanner input = new Scanner(System.in);
                System.out.println("Temperatura " + (++numero) + " em " + entrada + " que quer converter: ");
                    temp[i] = input.nextDouble();
                }
            } catch (InputMismatchException d){
                System.err.println("Temperatura invalida, tente novamente!" +
                        "\nPS: caso tenha tentando algum número com virgula, troque a virgula por ponto;");
                getTemps(entrada, temp);
            }

            return temp;
        }

        private static int QuantTemperaturas () {
            Scanner input = new Scanner(System.in);
            int quantTemps;
            System.out.println("Quantas temperaturas quer converter?");
            try {
                quantTemps = input.nextInt();
                if(quantTemps <= 10) {
                    return quantTemps;
                } else {
                    System.err.println("ATENÇÃO: Quantidade maxima de temperaturas = 10.");
                    return QuantTemperaturas();
                }
            }catch (InputMismatchException b){
                System.err.println("Quantidade invalida, escolha um número inteiro!");
                return QuantTemperaturas();
            }
        }

        public static UnityOptions codeOption (String tipo) {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite a unidade "+ tipo +"  da sua temperatura: ");
            try {
            int x = input.nextInt();
                if (x == 1) {
                    return UnityOptions.CELSIUS;
                } else if (x == 2) {
                    return UnityOptions.FAHRENHEIT;
                } else if (x == 3) {
                    return UnityOptions.KELVIN;
                } else if (x == 0) {
                    return UnityOptions.SAIR;
                } else {
                    System.err.println("Opção invalida, tente uma opção apresentada no no menu!");
                    return UnityOptions.ERRO;
                }
            } catch (InputMismatchException a) {
                System.err.println("Opção invalida, tente uma opção apresentada no no menu!");
                return codeOption(tipo);
            }
        }


//        public static UnityOptions verifica(UnityOptions escolha, String tipo) {
//
//                while (escolha == UnityOptions.ERRO){
//                    escolha = codeOption(tipo);
//                }
//                return escolha;
//        }

        private static void initialize () {
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|---------------Conversor de temperaturas---------------|");
            System.out.println("|---------------------Menu de opções:-------------------|");
            System.out.println("|Opção 1 = Celsius                                      |");
            System.out.println("|Opção 2 = Fahrenheit                                   |");
            System.out.println("|Opção 3 = Kelvin                                       |");
            System.out.println("|Opção 0 = Sair do Conversor de Temperatura             |");
            System.out.println("|                                                       |");
            System.out.println("|ps: quantidade máxima de temperaturas = 10             |");
            System.out.println("|-------------------------------------------------------|");
        }

}
