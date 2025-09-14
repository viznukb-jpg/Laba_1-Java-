/**
 * Class Number represents a Fibonacci number with a given index.
 * Its methods can calculate the value of the number from the index
 * and check if this number is a cube of some integer.
 */

public class Number {
    private int index;
    private long value;

    /**
     * Calculates the Fibonacci number by its index.
     * Works for both positive and negative indices.
     *
     * @param index the index of the Fibonacci number (can be negative or positive)
     * @return the value of the Fibonacci number at the given index
     */
    protected long  findValueFromIndex(int index){
        // case 1
        long current = 0;


        //case 2
        if(index == 1 || index == 2 || index == -1){
            current = 1;
        }

        // case 3 (for other positive numbers)
        if (index > 2){
            long prev = 1;
            long prevPrev = 1;

            for(int i = 3; i <= index; i++){
                current = prev + prevPrev;
                prevPrev = prev;
                prev = current;
            }
        }

        // case 4 (for other negative numbers)
        if (index < -1){
            long positiveValue = findValueFromIndex(-index);
            current =  (index % 2 == 0 ? -1 : 1) * positiveValue;
        }

        return current;
    }


    public long getValue(){
        return this.value;
    }

    /**
     * Can determinate whether the number is a cube of integer or not
     * @return true or false value whether the number is a cube
     */
    public boolean isCube(){
        double cubeRoot = Math.cbrt( (double)this.value);
        return Math.pow(Math.round(cubeRoot), 3) == this.value;
    }

    Number(){
        this.index = 0;
        this.value = 0;
    }

    Number(int index){
        this.index = index;
        this.value = findValueFromIndex(this.index);
    }
}
