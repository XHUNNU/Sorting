// Importing class Arrays of the sub-package util.
import java.util.Arrays;
public class SortingExample
{             
public static void main(String argvs[])
{
               // String array
               String[] str = { "hjk", "ty", "trf", "tyf", "ytf", "bnm", "uio", "oml", "tkt" };
               // Integer Array
               int[] intAr = { 31, 5, 86, 405, 211, 19, 171, 192, 67 };
               Arrays.sort(str); // Sorting string array
               Arrays.sort(intAr);  // Sorting integer array
               // Displaying results
               System.out.printf("Sorted str[] : %s \n", Arrays.toString(str)); 
                System.out.printf("Modified intAr[] : %s", Arrays.toString(intAr));
}
}
