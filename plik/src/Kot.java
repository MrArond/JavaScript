public class Kot extends Animal{
    public Kot(String name, Integer age, String plec){
        super(name, age, plec);
    }
    @Override
    public void makeNoise() {
        System.out.println("fly fly");
    }
}
