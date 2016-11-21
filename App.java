/**
 * Created by Anna812 on 11/21/2016.
 */
public class App {

    public static void main(String[] args) {

        Flower one = new Flower("yellow", 5);
        Flower two = new Flower("blue", 5);
        Tree three = new Tree("purple", 0);
        Tree four = new Tree("orange", 0);

        Garden garden = new Garden();

        garden.addPlant(one);
        garden.addPlant(two);
        garden.addPlant(three);
        garden.addPlant(four);

        garden.print();

        garden.waterGarden(40);

        garden.print();

        garden.waterGarden(70);

        garden.print();
    }
}
