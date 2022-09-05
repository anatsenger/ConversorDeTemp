import java.util.Scanner;

public class TerminarConversor {

    public static String terminarConversor(String answer) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quer realizar mais alguma conversão? s/n");
        answer = input.next();

        switch (answer) {
            case "s" ->
                System.out.println("|----------Reiniciando Conversor de Temperatura---------|");

            case "n" ->
                System.out.println("|----------Encerrando Conversor de Temperatura---------|");

            default -> {
                System.out.println("digite apenas s para sim ou n para não");
                terminarConversor(answer);}

        }
        return answer;
//        if (answer == "n") {
//            System.out.println("|----------Encerrando Conversor de Temperatura---------|");
//            input.close();
//            return true;
//        } else if (answer == "s") {
//            System.out.println("|----------Reiniciando Conversor de Temperatura---------|");
//            return false;
//        } else {
//            do {
//                System.out.println("digite apenas s ou n");
//                System.out.println("Quer realizar mais alguma conversão? s/n");
//                answer = input.next();
//                if (answer == "n") {
//                    return true;
//                } else if (answer == "s") {
//                    return false;
//                } else {
//                    return false;
//                }
//            } while (!answer.equals("s") || !answer.equals("n"));
//        }

    }
}
