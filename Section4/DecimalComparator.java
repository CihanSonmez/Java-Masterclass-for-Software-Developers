/*
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


EXAMPLES OF INPUT/OUTPUT:

* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.


TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
*/
import java.text.DecimalFormat;
public class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces(double v1, double v2){
        
        double t1 = v1*1000.0;
        double t2 = v2*1000.0;
        System.out.println("t1:"+t1+" t2:"+t2);
        
        int s1 = (int) t1/1;
        int s2 = (int) t2/1;
        
        System.out.println("s1:"+s1+" s2:"+s2);

        if(s1 == s2){
            return true;
        }
        else{
            return false;
        }
        
    }
}