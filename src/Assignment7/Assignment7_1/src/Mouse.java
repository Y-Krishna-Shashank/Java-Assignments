public class Mouse extends Rodent {

    public Mouse(){
        System.out.println("In mouse class");
    }
    @Override
    void tail() {
        System.out.println("I have a long pink tail");

    }

    @Override
    void color() {
        System.out.println("I am in brown, white and grey");

    }

    @Override
    void size() {
        System.out.println("I have size of 7.5 - 10 cms");
    }
}
