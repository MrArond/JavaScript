public class Main {
    public static void main(String[] args) {

        ObiektA obiektA = new ObiektA("X", "Y");
        System.out.println(obiektA.getName());
        obiektA.setName("Z");
        System.out.println(obiektA.getName());

        System.out.println(obiektA);
        obiektA.sayBye();

        obiektA.sayHelloWorld();
        System.out.println(obiektA.returnRandomNumber());

        Pojazd auto = new Pojazd("Honda", "Civic");
        Samolot samolot = new Samolot("X", "Y");
        Jacht jacht = new Jacht("Porsche", "XD");

        useMakeNoise(auto);
        useMakeNoise(samolot);
        useMakeNoise(jacht);
    }
    public static void useMakeNoise(Pojazd pojazd){
        pojazd.makeNoise();
    }

}
