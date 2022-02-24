public class Hamster extends Rodent
{
    public Hamster(){
        System.out.println("In hamster class");
    }
    @Override
    void tail() {
        System.out.println("I have a very small, stubby tail");
    }

    @Override
    void color() {
        System.out.println("I am in brown and blonde color");
    }

    @Override
    void size() {
        System.out.println("I have size of 5.5 to 10.5 cms");
    }
}
