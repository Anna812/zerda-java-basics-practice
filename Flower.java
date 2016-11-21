/**
 * Created by Anna812 on 11/21/2016.
 */
public class Flower extends Plant {

    public Flower(String colour, int waterLevel) {
        super(colour, waterLevel);
    }

    @Override
    public String toString() {
        if(needWater()){
            return String.format("The %s Flower needs water", getColour());
        } else {
            return String.format("The %s Flower doesnt need water", getColour());
        }
    }

    @Override
    public boolean needWater() {
        if(getWaterLevel() < 5){
            return true;
        }
        return false;
    }

    @Override
    public void water(int i) {
        if (needWater()) {
            setWaterLevel(getWaterLevel() + (int)(i * 0.4));
        }
    }
}
