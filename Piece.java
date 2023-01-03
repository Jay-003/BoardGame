import java.lang.reflect.Array;
import java.util.Arrays;

public class Piece {

    //Instance Variables
    private String name;
    private String colour;
    private int[]  position;

    //Constructor
    public Piece(String name, String colour, int[] position) {
        this.name = name;
        this.colour = colour;
        this.position = position;
    }

    public Piece() {
    }

    //Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position[0] = position[0];
        this.position[1] = position[1];
    }

    //toString method to print the piece
    @Override
    public String toString() {
        return name + colour;
    }
}
