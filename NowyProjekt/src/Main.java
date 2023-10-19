import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Kalkulator");

        System.out.println("Podaj pierwszą liczbe");
        double a = pobieranie();

        System.out.println("Podaj drugą liczbe");
        double b = pobieranie();

        System.out.println("Podaj typ działania");
        System.out.println();
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Potęga");
        int choice = pobieranieInt();

        switch (choice) {
            case 1:
                dodawanie(a, b);
                break;
            case 2:
                odejmowanie(a, b);
                break;
            case 3:
                mnozenie(a, b);
                break;
            case 4:
                dzielenie(a, b);
                break;
            case 5:
                potega(a, b);
                break;
        }
    }


    public static double pobieranie() {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            String input = myObj.nextLine();
            Pattern pattern = Pattern.compile("^[0-9]*$");
            if (pattern.matcher(input).matches()) {
                return Double.parseDouble(input);
            } else {
                System.out.println("Podaj liczbe");
            }
        }
    }

    public static int pobieranieInt() {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            String input = myObj.nextLine();
            Pattern pattern = Pattern.compile("^[0-9]*$");
            if (pattern.matcher(input).matches()) {
                return Integer.parseInt(input);
            } else {
                System.out.println("Podaj liczbe");
            }
        }
    }

    public static double dodawanie(double liczba1, double liczba2) {
        double w = liczba1 + liczba2;
        System.out.println("Wynik wynosi: " + w);
        return w;
    }

    public static double odejmowanie(double liczba1, double liczba2) {
        double e = liczba1 - liczba2;
        System.out.println("Wynik wynosi: " + e);
        return e;
    }

    public static double mnozenie(double liczba1, double liczba2) {
        double r = liczba1 * liczba2;
        System.out.println("Wynik wynosi: " + r);
        return r;
    }

    public static double dzielenie(double liczba1, double liczba2) {
        if (liczba1 == 0 || liczba2 == 0) {
            System.out.println("Jedna z liczb jest równa 0. Nie można dzielić przez 0.");
            return Double.NaN;
        }
        double t = liczba1 / liczba2;
        System.out.println("Wynik wynosi: " + t);
        return t;
    }

    public static double potega(double liczba1, double liczba2) {
        double y = Math.pow(liczba1, liczba2);
        System.out.println("Wynik wynosi: " + y);
        double u = Math.sqrt(y);
        System.out.println("Wynik wynosi: " + u);
        return u;
    }


}