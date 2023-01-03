public class SlowFlexible extends SlowPiece {

    int[] position = {x,y};

    //Constructor using super to refer to parent class objects.
    public SlowFlexible(String name, String colour, int[] position) {
        super(name, colour, position);
    }

    /**
     * Method: move(direction: String)
     *
     * moves the piece exactly one step in any direction.
     *
     * @param direction inputs direction in which the piece is asked to move.
     * @return new position of the piece.
     */
    public int[] move (String direction) {
        if((x > 0 && x<7) && (y==0)) {
            if (direction.equals("right")) {
                x = x + 1;
            }
            if (direction.equals("left")) {
                x = x - 1;
            }
            if (direction.equals("down")) {
                y = y + 1;
            }
            return getPosition();

        }

        if((y > 0 && y<=7) && (x==7)) {
            if (direction.equals("left")) {
                x = x - 1;
            }
            if (direction.equals("up")) {
                y = y - 1;
            }
            if (direction.equals("down")) {
                y = y + 1;
            }
            return getPosition();
        }

        if((x > 0 && x<7) && (y==7)) {
            if (direction.equals("left")) {
                x = x - 1;
            }
            if (direction.equals("right")) {
                x = x + 1;
            }
            if (direction.equals("up")) {
                y = y - 1;
            }
            return getPosition();
        }

        if((y > 0 && y<=7) && (x==0)) {
            if (direction.equals("right")) {
                x = x + 1;
            }
            if (direction.equals("up")) {
                y = y - 1;
            }
            if (direction.equals("down")) {
                y = y + 1;
            }
        }
        return getPosition();

    }

    //toString method to print SlowFlexible piece.
    @Override
    public String toString() {
        return super.toString() + "F";
    }
}
