public class Main {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0]=new Mouse();
        rodents[1]= new Gerbil();
        rodents[2]=new Hamster();

        for (int i = 0; i < 3; i++) {
            rodents[i].tail();
            rodents[i].color();
            rodents[i].size();
        }
    }
}
