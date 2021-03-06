import java.lang.*;

/** Finds Smallest of all Elements in an Array
@param Array Name
@return Smallest Number
*/
  public static int getSmallestElement(int[] x) {

    int min = x[0];
    for (int i = 1; i < x.length; i++) {
      if (x[i] < min) {
        min = x[i];
      }
    }
    return min;
  }
