import java.util.Scanner;

public class MathQuiz {

    public static void main(String[] args) {

        Questions questions = new Questions();
        questions.setQuestion1(15);
        questions.setQuestion2(144);
        questions.setQuestion3(123);
        int sumaPkt = 0;

        Scanner mnozenie = new Scanner(System.in);
        System.out.println("Jaki jest wynik mnożenia 3 * 5?");
        int odp1 = mnozenie.nextInt();
        if(odp1 == questions.getQuestion1()) {
            System.out.println("Odpowiedź poprawna");
            sumaPkt++;
        }

        Scanner pole = new Scanner(System.in);
        System.out.println("Jakie jest pole kweadratu o boku 12?");
        int odp2 = pole.nextInt();
        if(odp2 == questions.getQuestion2()) {
            System.out.println("Odpowiedź poprawna");
            sumaPkt++;
        }

        Scanner pierwiastek = new Scanner(System.in);
        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129?");
        int odp3 = pierwiastek.nextInt();
        if(odp3 == questions.getQuestion3()) {
            System.out.println("Odpowiedź poprawna");
            sumaPkt++;
        }

        System.out.printf("Suma uzyskanych punktow: %d/3", sumaPkt);

    }

}
