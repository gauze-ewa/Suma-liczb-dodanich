import java.util.ArrayList;
import java.util.Collections;

public class Container {
    private ArrayList<Double> list;

    public ArrayList<Double> getList() {
        return list;
    }

    public void setList(ArrayList<Double> list) {
        this.list = list;
    }

    public void addList(double a) {
        if(a>=0)
        list.add(a);
    }

    public void printList() {
        System.out.println("Kolejnosc listy:");
        for (Double t : list)
            System.out.print(t+" ");
        System.out.println();
    }

    public void printReverseList() {
        System.out.println("Odwrócona kolejnosc listy:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(list.size()-i-1)+" ");
        }
        System.out.println();
    }

    public void sumList() {
        System.out.println("Suma liczb z listy to:");
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
             sum +=(double) list.get(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (i < (list.size() - 1))
                System.out.print(list.get(i) + "+");
            else
                System.out.print(list.get(i) + "=" + sum + "\n");
        }
    }

    public void minList() {
        double min= Collections.min(list);
        System.out.println("Najmniejsza liczba z zbioru to:" + min);
    }

    public void maxList() {
        double max= Collections.max(list);
        System.out.println("Najmniejsza liczba z zbioru to:" + max);
    }
}
