public class FastFlexible extends FastPiece{

    int[] array = {x,y};

    //Constructor using super to refer to parent class objects.
    public FastFlexible(String name, String colour, int[] position) {
        super(name, colour, position);
    }

    /**
     * Method: move(direction: String)
     *
     * moves the piece by n steps in any direction.
     *
     * @param direction inputs direction in which the piece is asked to move.
     * @param n inputs the number of steps by which we have to move the piece.
     * @return new position of the piece.
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
            if (direction.equals("down")) {
                if(y+n<=7){
                    y = y + n;
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
            if (direction.equals("up")) {
                if(y-n>=0){
                    y = y - n;
                }
            }
            if (direction.equals("down")) {
                if(y+n<=7){
                    y = y + n;
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
            if (direction.equals("up")) {
                if(y-n>=0){
                    y = y - n;
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
            if (direction.equals("up")) {
                if(y-n>=0){
                    y = y - n;
                }
            }
            if (direction.equals("down")) {
                if(y+n<=7){
                    y = y + n;
                }
            }
        }
        return getPosition();
    }

    //toString method to print the FastFlexible piece.
    @Override
    public String toString() {
        return super.toString() + "F";
    }
}
