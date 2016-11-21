/**
 * Created by Anna812 on 11/21/2016.
 */
public class App {

    public static void main(String[] args) {

        Flower one = new Flower("yellow", 0);
        Flower two = new Flower("blue", 0);
        Tree three = new Tree("purple", 0);
        Tree four = new Tree("orange", 0);

        Garden garden = new Garden();

        garden.addPlants(one);
        garden.addPlants(two);
        garden.addPlants(three);
        garden.addPlants(four);

        garden.print();


    }
}
