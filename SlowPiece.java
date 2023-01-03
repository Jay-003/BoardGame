public class SlowPiece extends Piece {

    //Instance Variables
    int x = getPosition()[0];
    int y = getPosition()[1];

    int[] position = {x,y};

    //Constructor
    public SlowPiece(String name, String colour, int[] position) {
        super(name, colour, position);
    }


    /**
     * Method: move(direction: String)
     *
     * moves the piece exactly one step to left or right
     *
     * @param direction inputs direction in which the piece is asked to move
     * @return new position of the piece
     */
    public int[] move(String direction) {
        if(direction.equals("left")) {
            y = y-1;
        }
        else if (direction.equals("right")) {
            y= y+1;
        }
        if (x>=0 && x<8) {
            if (y>=0 && y<8) {
                setPosition(new int[]{x,y});

            }

        }
        return getPosition();
    }

    //toString method to print the SlowPiece
    @Override
    public String toString() {
        return super.toString()+"S";
    }
}
