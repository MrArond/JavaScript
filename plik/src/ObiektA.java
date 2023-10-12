public class ObiektA implements X {

    private String name;
    private String nazwisko;

    public ObiektA(String name, String nazwisko){
        this.name = name;
        this.name = nazwisko;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String returnName() {
        return "Janek";
    }
    public void sayBye(){
        System.out.println("Bye");
        System.out.println(returnName());
    }

    public String toString(){
        return "ObiektA{" +
                "name='" + name + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    @Override
    public void sayHelloWorld() {
        System.out.println("SayHelloWorld");
    }

    @Override
    public Double returnRandomNumber() {
        return Math.random();
    }
}
