import java.util.Scanner;

public class teminarConversor {


    public static String terminarConversor(String resposta) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quer realizar mais alguma conversão? s/n");
        resposta = input.next();

        switch (resposta) {
            case "s" -> {
                System.out.println("|----------Reiniciando Conversor de Temperatura---------|");

            }
            case "n" -> {
                System.out.println("|----------Encerrando Conversor de Temperatura---------|");
            }
            default -> {
                System.out.println("digite apenas s para sim ou n para não");
                terminarConversor(resposta);
            }
        }
        return resposta;
//        if (resposta == "n") {
//            System.out.println("|----------Encerrando Conversor de Temperatura---------|");
//            input.close();
//            return true;
//        } else if (resposta == "s") {
//            System.out.println("|----------Reiniciando Conversor de Temperatura---------|");
//            return false;
//        } else {
//            do {
//                System.out.println("digite apenas s ou n");
//                System.out.println("Quer realizar mais alguma conversão? s/n");
//                resposta = input.next();
//                if (resposta == "n") {
//                    return true;
//                } else if (resposta == "s") {
//                    return false;
//                } else {
//                    return false;
//                }
//            } while (!resposta.equals("s") || !resposta.equals("n"));
//        }

    }


}
