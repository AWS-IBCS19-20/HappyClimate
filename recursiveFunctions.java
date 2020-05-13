import java.util.*;

public class recursiveFunctions{

  public recursiveFunctions() {

  }

  public Integer bunnyEars(int n){
    if (n == 0) {
      return n;
    }
  else {
    Integer ears2 = (bunnyEars(n-1) + 2);
    if (n%2 == 0) {
      Integer ears3 = (ears2 + (n/2*1));
      return ears3;
    }
    else{
      Integer ears3 = (ears2 + (n-1)/2*1);
      return ears3;
    }

  }
}

public Integer triangle(int r){
  if (r == 0) {
    return r;
  }
  else {
    Integer blocks = r + triangle(r-1);
    return blocks;
  }
}

/*public Integer tree(int h){
return h;
}*/

public static void main(String[] args) {
  recursiveFunctions n = new recursiveFunctions();

  int inputVal = 3;

  System.out.println(n.bunnyEars(inputVal));
  System.out.println(n.triangle(inputVal));
  //System.out.println(tree(inputVal));

}
}
