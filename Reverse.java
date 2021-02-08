/**
 * Created by Ali on 08/02/2021.
 */
import java.util.*;
import java.util.stream.*;
public class Reverse
{
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9};


        System.out.println("Original Array:");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");

        System.out.println();


        System.out.println("Original Array in reverse order:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");
    }
}