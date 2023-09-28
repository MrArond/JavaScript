public class Main {
    public static void main(String[] args) {
        System.out.println("JakubRybczyński");
        

        int i = 2;
        System.out.println(i);
        double f = 2.0;
        long l = 2L;

        Integer i2 = null;
        System.out.println(i2);
        Double f2 = 2.0;
        Long l2 = 2L;

        char w = 'X';
        String name = "Jakub";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        int licznik = 0;
        while (licznik <= 10) {
            System.out.print(licznik);
            if (licznik < 10) {
                System.out.print(", ");
            }
            licznik++;
        }
        System.out.println();

        int zmienna;
        for (zmienna = 0; zmienna <= 20; zmienna++) {
            System.out.print(zmienna);
            if (zmienna < 20) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int druga = 0;
        do {
            System.out.print(druga);
            if (druga < 10) {
                System.out.print(", ");
            }
            druga++;
        } while (druga <= 10);
        System.out.println();
        a();
        b();
        c();
    }


    public static string a(){
        System.out.println("Func A");
    }
    protected static void b(){
        System.out.println("Func B");
    }
    private static void c(){
        System.out.println("Func C");
    }

}