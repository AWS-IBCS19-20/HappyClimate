import java.util.*;

public class recursiveBacktracking{

public recursiveBacktracking() {

}

public boolean groupSum(int start, int[] a, int s){
  //s==0 means that a subset of elements in the array has subtracted from the sum exactly, and they add up to the sum
  if (s == 0) {
    return true;
  }
  else {
  //the other base case is when start reaches the end of the array and still hasn't found a subset adding up to the sum
    if (start == a.length) {
      return false;
    }
    else {
      //moves start along 1 each time, so the element in the array the function is looking at moves along the array
      start = start+1;
      //OR statement creates two branches: one where the current term is included and one where it isn't
      return groupSum(start, a, s) || groupSum(start, a, s-a[start-1]);







  }

}
}


public static void main(String[] args) {

  recursiveBacktracking r = new recursiveBacktracking();

  int start = 0;
  int[] a = {3,5,6,2};
  int s = 10;

  System.out.println(r.groupSum(start, a, s));

}
}
