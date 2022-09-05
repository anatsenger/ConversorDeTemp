import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class ConversorTemp {
    public static void main(String[] args) {
        String resposta = "s";

        while (resposta.equals("s")) {
            initialize();

//pede a unidade de entrada da temp;
            String tipo = "inicial";
            OpcoesUnidade entrada = codeOption(tipo);
            if (entrada == OpcoesUnidade.SAIR) {
                System.out.println("|----------Encerrando Conversor de Temperatura---------|");
                break;
            }
            if (entrada == OpcoesUnidade.ERRO){
                while (entrada == OpcoesUnidade.ERRO){
                    entrada = codeOption(tipo);
                }
            }
//            verifica(entrada, tipo);

//pede a quantidade de temperaturas q quer converter e as temperaturas;
            double[] temp = new double[QuantTemperaturas()];
            getTemps(entrada, temp);



//pede a unidade para qual quer converter a temp;
        tipo = "final";
        OpcoesUnidade saida = codeOption(tipo);
//        verifica(saida, tipo);
        if (saida == OpcoesUnidade.SAIR) {
            System.out.println("|----------Encerrando Conversor de Temperatura---------|");
            break;
        }
            if (saida == OpcoesUnidade.ERRO){
                while (saida == OpcoesUnidade.ERRO){
                    saida = codeOption(tipo);
                }
            }


//converte as temp passadas e faz a média das temp convertidas;
        Converte.converte(temp, entrada, saida);

//termina ou reinicia o conversor;
        resposta = teminarConversor.terminarConversor(resposta);
    }

}

        private static double[] getTemps(OpcoesUnidade entrada, double[] temp){
            try{
            for (int i = 0; i < temp.length; i++) {
                int numero = i;
                Scanner input = new Scanner(System.in);
                System.out.println("Temperatura " + (++numero) + " em " + entrada + " que deseja converter: ");
                    temp[i] = input.nextInt();
                }
            } catch (InputMismatchException d){
                System.out.println("Temperatura invalida, tente novamente!");
                getTemps(entrada, temp);}

            return temp;
        }

        private static int QuantTemperaturas () {
            Scanner input = new Scanner(System.in);
            System.out.println("Quantas temperaturas deseja converter?");
            try {
                return input.nextInt();
            }catch (InputMismatchException b){
                System.out.println("Quantidade invalida, tente novamente!");
                return QuantTemperaturas();
            }
        }

        public static OpcoesUnidade codeOption (String tipo) {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite a unidade "+ tipo +"  da sua temperatura: ");
            try {
            int x = input.nextInt();
                if (x == 1) {
                    return OpcoesUnidade.CELSIUS;
                } else if (x == 2) {
                    return OpcoesUnidade.FAHRENHEIT;
                } else if (x == 3) {
                    return OpcoesUnidade.KELVIN;
                } else if (x == 0) {
                    return OpcoesUnidade.SAIR;
                } else {
                    System.out.println("Opção inválida, tente novamente!");
                    return OpcoesUnidade.ERRO;
                }
            } catch (InputMismatchException a) {
                System.out.println("Opção invalida, tente uma opção apresentada no no menu!");
                return codeOption(tipo);
            }
        }


//        public static void verifica(OpcoesUnidade escolha, String tipo) {
//             if (escolha == OpcoesUnidade.ERRO){
//                while (escolha == OpcoesUnidade.ERRO){
//                    escolha = codeOption(tipo);
//                }
//            }
//        }

        private static void initialize () {
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|---------------Conversor de temperaturas---------------|");
            System.out.println("|---------------------Menu de opções:-------------------|");
            System.out.println("|Opção 1 = Celsius--------------------------------------|");
            System.out.println("|Opção 2 = Fahrenheit-----------------------------------|");
            System.out.println("|Opção 3 = Kelvin---------------------------------------|");
            System.out.println("|Opção 0 = Sair do Conversor de Temperatura-------------|");
            System.out.println("|-------------------------------------------------------|");
        }

}
