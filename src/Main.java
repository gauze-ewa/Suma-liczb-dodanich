import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
ArrayList<Double>list1=new ArrayList<>();
container.setList(list1);
        System.out.println("Witaj!\n" +
                "Wypisz. Jeśli chcesz zakonczyć progrm podaj liczbę ujemną.");
        Scanner sc = new Scanner(System.in);
        double number = 0;
        while (!(number < 0)) {
            System.out.println("Podaj liczbę:");
            number = sc.nextDouble();
            container.addList(number);
        }

        container.printList();
        container.printReverseList();
        container.sumList();
        container.maxList();
        container.minList();
        System.out.println("Wybrano ujemna liczbe koniec programu.");
    }
}
