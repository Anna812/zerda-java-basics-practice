import java.util.ArrayList;

/**
 * Created by Anna812 on 11/21/2016.
 */
public class Garden {

    private ArrayList<Plant> gardenList = new ArrayList<>();

    public void addPlants(Plant a) {
        gardenList.add(a);
    }

    public void print() {
        for (Plant p : gardenList) {
            System.out.println(p.toString());
        }
    }
}
