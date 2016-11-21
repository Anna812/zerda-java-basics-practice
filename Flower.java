/**
 * Created by Anna812 on 11/21/2016.
 */
public class Flower extends Plant {

    public Flower(String colour, int waterLevel) {
        super(colour, waterLevel);
    }

    @Override
    public String toString() {
        if(getWaterLevel() < 5){
            return String.format("The %s Flower needs water", getColour());
        } else {
            return String.format("The %s Flower doesnt need water", getColour());
        }
    }
}
