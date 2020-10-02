package cse360assignment02;
import java.util.*;

/**
 * Practicing Version Control by Building the class AddingMachine and adding it to git and GitHub.
 * The Adding Machine class is a simple calculator that adds and subtracts values from a starting
 * value known as total. The methods of Adding Machine are getTotal(), which returns the total. Next, is add(int value)
 * and subtract(int value) which add or subtract the value parameter from the total. Finally, the two methods
 * are toString() and clear(). What toString() does is that it keeps track of the calculators history and the operations
 * it has done on the current total. What the clear method does is it resets the calculators history and the total.
 * @author cristianmosqueda
 */
public class AddingMachine {
    private int total;
    private String currentOp;
    private String currCalcStr;

    /**
     * Constructor for AddingMachine class. The purpose of the constructor for AddingMachine is to initialize
     * the total variable to 0 and to set the current calculation string to 0, since no operations have been made.
     */
    public AddingMachine() {
        total = 0;
        currCalcStr = total + " ";
    }

    /**
     * This function returns the current calculation result.
     * @return returns the current calculator total.
     */
    public int getTotal() {
        return total;
    }

    /**
     *  This function adds an integer to the calculators current total. The function also
     *  updates the calculator history string by appending the addition operator and the parameter value.
     * @param value adds the parameter value to the calculators total.
     */
    public void add(int value) {
        currentOp = "+";
        currCalcStr += currentOp + " " + value + " ";
        total += value;
    }

    /**
     * This function subtracts an integer from the calculators current total. The function
     * also updates the calculator history string by appending the subtract operator and the parameter
     * value.
     * @param value subtracts the parameter value from the calculators total.
     */
    public void subtract(int value) {
        currentOp = "-";
        currCalcStr += currentOp + " " + value + " ";
        total -= value;
    }

    /**
     * This function returns the calculators operation history beginning with the totals initial value
     * of 0.
     * @return returns the calculators operation history in the form of a string.
     */
    @Override
    public String toString() {
        return currCalcStr;
    }

    /**
     * This function clears out the calculators operation history and resets the total to 0.
     */
    public void clear() {
        currCalcStr = "0 ";
        total = 0;
    }

    public static void main(String[] args) {
        AddingMachine myCalc = new AddingMachine();
        myCalc.add(100);
        myCalc.subtract(25);
        myCalc.add(5);
        myCalc.subtract(10);
        myCalc.add(25);
        myCalc.add(2);
        myCalc.subtract(200);
        String trans = myCalc.toString();
        System.out.println("CURRENT OP TRANSACTIONS:\n" + trans);
        int result = myCalc.getTotal();
        System.out.println("TOTAL VALUE: " + result);
        // clearing the history transaction string
        myCalc.clear();
        String check = myCalc.toString();
        System.out.println("CLEAR METHOD: " + check);
        myCalc.add(5);
        myCalc.add(10);
        myCalc.subtract(5);
        System.out.println("NEW CALC HISTORY: " + myCalc.toString());
        int result2 = myCalc.getTotal();
        System.out.println("NEW TOTAL: " + result2);
        myCalc.clear();
        myCalc.add(10000);
        myCalc.add(250000);
        myCalc.add(3000000);
        System.out.println("NEW HISTORY: " + myCalc.toString() + "= " + myCalc.getTotal());

    }

}

