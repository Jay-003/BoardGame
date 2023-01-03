public class FastPiece extends Piece {

    //Instance variables
    int x = getPosition()[0];
    int y = getPosition()[1];
    int[] position = {x,y};

    //Constructor using super to refer to parent class objects.
    public FastPiece(String name, String colour, int[] position) {
        super(name, colour, position);
    }

    /**
     * Method: move(direction: String)
     *
     * moves the piece by n step in left or right direction.
     *
     * @param direction inputs direction in which the piece is asked to move.
     * @param n inputs the number of steps by which the piece is supposed to move.
     * @return new position of the piece
     */
    public int[] move(String direction, int n) {
        if((x > 0 && x<7) && (y==0)) {
            if (direction.equals("right")) {
                if(x+n<=7) {
                    x = x + n;
                }
            }
            if (direction.equals("left")) {
                if(x-n>=0) {
                    x = x - n;
                }
            }
            return getPosition();
        }

        if((y >= 0 && y<=7) && (x==7)) {
            if (direction.equals("left")) {
                if(x-n>=0){
                    x = x - n;
                }
            }
            return getPosition();
        }

        if((x >= 0 && x<=7) && (y==7)) {
            if (direction.equals("left")) {
                if(x-n>=0) {
                    x = x - n;
                }

            }
            if (direction.equals("right")) {
                if(x+n<=7) {
                    x = x + n;
                }
            }
            return getPosition();
        }

        if((y >= 0 && y<=7) && (x==0)) {
            if (direction.equals("right")) {
                if(x+n<=7){
                    x = x + n;
                }
            }
        }
        return getPosition();
    }


    @Override
    public String toString() {
        return super.toString() + "F";
    }
}
