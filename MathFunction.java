/* Elias Grayson */
/* This is a class which performs exponential and square root equations */
public class MathFunction {
        
    private int num = 0; // This field stores the number that is being used
    
    // This method is the main method
    public static void main(String[] args) {
        System.out.println("This is the num: " + MathFunction.sqrtIterative(16, 0, 16));
    }

    // This method sets the number being used
    public void setNum(int num) {
        this.num = num;
    }

    // This method returns the number being used
    public int getNum() {
        return this.num;
    }

    // This method returns the input variable to the power of itself using recursion
    public static int multiplyRecursive(int x) {
        return multiplyRecursiveHelper(x, 2);
    }

    // This method helps multiplyRecursion() by using recursion
    private static int multiplyRecursiveHelper(int x, int y) {
        if (x == 0) { // This conditional checks if there's nothing to multiply, then return y if there isn't
            return y;
        }
        // This is where recursion happens, where x is decreased and y is multiplied
        else {
            return multiplyRecursiveHelper(x - 1, y * x);
        }
    }

    // This method finds the square root of the entered value if it exists
    public static int sqrtIterative(int x, int low, int high) {
        // If an invalid number is entered, returns -1
        if (low > high || x < 0 || low < 0 || high < 0)
            return -1;
        
        while (low<= high) {
            int p = low + (high - low) / 2;

            if (p * p == x) {
                return p;
            }
            else if (p * p < x) {
                low = p + 1;
            }
            else {
                high = p - 1;
            }
        }  
        return -1; 
    }
}  