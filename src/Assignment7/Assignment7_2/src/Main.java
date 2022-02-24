public class Main {
    public static void main(String[] args) {
           Unicycle unicycle     =new Unicycle();
            Bicycle bicycle    = new Bicycle();
             Tricycle tricycle   = new Tricycle();
        Cycle[] cycles = new Cycle[3];
        cycles[0]=unicycle;
        cycles[1]=bicycle;
        cycles[2]=tricycle;

        for(int i=0;i<3;i++)
            cycles[i].balance();

        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        ((Tricycle)cycles[2]).balance();

    }
}
