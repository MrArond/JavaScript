public class Samolot extends Pojazd{
        public Samolot(String marka, String model){
            super(marka, model);
        }

    @Override
    public void makeNoise() {
        System.out.println("fly fly");
    }
}

