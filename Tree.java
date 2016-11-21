/**
 * Created by Anna812 on 11/21/2016.
 */
public class Tree extends Plant{

    public Tree(String colour, int waterLevel) {
        super(colour, waterLevel);
    }

    @Override
    public String toString() {
        if(needWater()){
            return String.format("The %s Tree needs water", getColour());
        } else {
            return String.format("The %s Tree doesnt need water", getColour());
        }
    }

    @Override
    public boolean needWater() {
        if(getWaterLevel() < 10){
            return true;
        }
        return false;
    }

    @Override
    public void water(int i) {
        if (needWater()) {
            setWaterLevel(getWaterLevel() + (int)(i * 0.75));
        }
    }
}
