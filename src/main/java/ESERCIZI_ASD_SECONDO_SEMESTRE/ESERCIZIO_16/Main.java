package ESERCIZI_ASD_SECONDO_SEMESTRE.ESERCIZIO_16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bst bst = new Bst();

        iterativeInput(bst);

    }

    private static void iterativeInput(Bst bst) {
        String s;
        int n;
        Scanner scan = new Scanner(System.in);

        while (true) {

            s = scan.next();

            if (s.equals("insert")) {
                s = scan.next();
                n = Integer.parseInt(s);
                s = scan.next();

                bst.insert(n, s);
            } else if (s.equals("remove")) {
                s = scan.next();
                n = Integer.parseInt(s);

                bst.remove(n);
            } else if (s.equals("find")) {
                s = scan.next();
                n = Integer.parseInt(s);

                System.out.println(bst.find(n));
            } else if (s.equals("clear")) {
                bst.clear();
            } else if (s.equals("show")) {
                bst.show();
                System.out.println();
            } else {
                break;
            }

        }
    }

}
