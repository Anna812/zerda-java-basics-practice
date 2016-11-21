import java.util.ArrayList;

/**
 * Created by Anna812 on 11/21/2016.
 */
public class Garden {

    private ArrayList<Plant> gardenList = new ArrayList<>();

    public void addPlant(Plant a) {
        gardenList.add(a);
    }

    public void print() {
        for (Plant p : gardenList) {
            System.out.println(p.toString());
        }
        System.out.println();
    }

    public void waterGarden(int i) {
        System.out.printf("Watering with %d \n", i);
        int numNeedWater = 0;
        for (Plant temp : gardenList) {
            if (temp.needWater()){
                numNeedWater++;
            }
        }
        try {
            i = i / numNeedWater;
        } catch (ArithmeticException e){
        }
        for (Plant temp2 : gardenList) {
            temp2.water(i);
        }
    }
}
