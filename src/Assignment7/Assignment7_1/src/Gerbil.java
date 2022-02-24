public class Gerbil extends Rodent{
    public Gerbil(){
        System.out.println("In gerbil class");
    }
    @Override
    void tail() {
        System.out.println("I have a long tail generally furred");
    }

    @Override
    void color() {
        System.out.println("I am in golden agouti color");
    }

    @Override
    void size() {
        System.out.println("I am 11 cm long");
    }
}
