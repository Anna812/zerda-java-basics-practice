/**
 * Created by Anna812 on 11/21/2016.
 */
public class Plant {

    private String colour;
    private int waterLevel;

    public Plant(String colour, int waterLevel) {
        this.colour = colour;
        this.waterLevel = waterLevel;
    }

    public String getColour() {
        return colour;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }
}
