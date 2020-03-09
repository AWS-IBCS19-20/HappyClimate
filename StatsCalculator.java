import java.util.*;
class StatsCalculator {

  //Constructor method
  public StatsCalculator() {
  }

  //Adding method
  public double add(double s1, double s2) {
    return s1 + s2;
  }

  //Subtracting method
  public double subtract(double d1, double d2){
    return d1 - d2;
  }

  //Multiplying method
  public double multiply(double p1, double p2) {
    return p1 * p2;
  }

  //Dividing method
  public double divide(double q1, double q2) {
    return q1 / q2;
  }

  //Exponentiating method
  public double exponentiate(double x1, double x2) {
    double resultX = 1;
    //for loop is multiplying the user's input base number, x1, times itself x2, the user's second input times
    for (double i = 0; i < x2; i++) {
      //the product of resultX and x1 is reset to resultX each time so the result increases with each repetition
      resultX = resultX * x1;
    }
    return resultX;
  }

  //Factorial method
  public double factorial(double f1) {
    double resultF = 1;
    //f1 is the highest number, and so the for loop decreases it by one each time and multiplies it by the previous value of resultF
    for (double i = f1; i > 0; i--) {
      resultF = resultF * i;
    }
    return resultF;
  }

  //Sum of integers method
  public double sumofintegers(double z1) {
    double resultZ = 0;
    //z1 is the highest number, and like the factorial method, the for loop decreases the next value by one each time, except it is adding instead of multiplying
    for (double i = z1; i > 0; i--) {
      System.out.print(i + " + ");
      resultZ = resultZ + i;
    }
    System.out.println("= " + resultZ);
    return resultZ;
  }

  //Average method
  public double average(Scanner a1) {
    //Method-specific scanner a1 so it makes it easier for the method itself to ask for more information
    double a3 = 0;
    System.out.println("How many numbers are in your sequence?");
    //a2 is user input that is then set to equal the length of the array avg that is created
    int a2 = a1.nextInt();
    double[] avg;
    avg = new double[a2];
    //Loop to take input indefinitely for the sequence
    for (int i = 0; i < avg.length; i++) {
      System.out.println("Enter number " + i + " in your sequence.");
      //avg[i] defines what number term (0th, 1st, 2nd, etc) the user input is and therefore it increases by one each repetition
      avg[i] = a1.nextDouble();
    }
    printArray(avg);
    //Adding all of the terms together
    for (int i = 0; i < avg.length; i++) {
      a3 = a3 + avg[i];
    }
    //Calculating the average and setting a3 equal to it
    a3 = a3/avg.length;
    System.out.println("Average = " + a3);
    return a3;
  }

  //Printing out an array method
  public static void printArray(double[] array) {
    //This method makes it so any array can be passed into it
    System.out.print("{");
    for (int i = 0; i < array.length - 1; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.print(array[array.length - 1]);
    System.out.println("}");
  }

  //Median
  public double median(Scanner md1)  {
    //Same reason for using a scanner as the average method
    double md2 = 0;
    System.out.println("How many numbers will be in your sequence?");
    int md3 = md1.nextInt();
    //Variable md3 takes user input and sets it to the length of the array med
    double[] med;
    med = new double[md3];
    //For loop functions the same as it does in the average method
    for (int i = 0; i < med.length; i++) {
      System.out.println("Enter number " + i + " in your sequence.");
      med[i] = md1.nextInt();
    }
    printArray(med);
    //Arrays.sort(med); -- right now it is assumed that the data is entered in the correct order
    //Determining if it's even or odd number of terms
    if (med.length % 2 == 0) {
      //Calculating the median if an even number of terms
      int m = med.length/2;
      md2 = ((med[m] + med[m-1]) / 2);
    }
    else {
      //Calculating the median if an odd number of terms
      int m = med.length/2;
      md2 = med[m];
    }
    System.out.println("Median = " + md2);
    return md2;
  }

  //Minimum
  public double minimum(Scanner mm1) {
    //Setting mm2 to a high value creates a starting point for finding the lowest number
    double mm2 = 100000000;
    System.out.println("How many numbers will be in your sequence?");
    int mm3 = mm1.nextInt();
    //mm3 takes user input and then defines the length of the array min
    double[] min;
    min = new double[mm3];
    //For loop functions the same way as it does in the average method
    for (int i = 0; i < mm3; i++) {
      min[i] = mm1.nextInt();
      //if within the for loop determines if each new value is less than the previous minimum (variable mm2), then resets mm2 accordingly
      if (min[i] < mm2) {
        mm2 = min[i];
      }
    }
    printArray(min);
    System.out.println("Minimum of the sequence = " + mm2);
    return mm2;
  }

  //Maximum
  public double maximum(Scanner mx1) {
    //Setting mx2 to a very low number creates a starting point to compare values to find the highest number
    double mx2 = -100000000;
    System.out.println("How many numbers will be in your sequence?");
    int mx3 = mx1.nextInt();
    double[] max;
    max = new double[mx3];
    for (int i = 0; i < mx3; i++) {
      max[i] = mx1.nextInt();
      //This if compares the value that has just been entered and the value mx2 (the current maximum) is and then replaces mx2 if the new input value is larger
      if (max[i] > mx2) {
        mx2 = max[i];
      }
    }
    printArray(max);
    System.out.println("Maximum of the sequence = " + mx2);
    return mx2;
  }

  //PercentChange
  public double percentChange(double pc1, double pc2) {
    return ((pc2 - pc1)/pc1) * 100;
  }

  //Main method
  public static void main(String[] args) {
    StatsCalculator n = new StatsCalculator();
    loop: while (true) {
      //Introduction
      System.out.println("Welcome to the Stats Calculator. Choose a function:");
      System.out.println("Add: 1");
      System.out.println("Subtract: 2");
      System.out.println("Multiply: 3");
      System.out.println("Divide: 4");
      System.out.println("Exponentiate: 5");
      System.out.println("Factorial: 6");
      System.out.println("Sum of Integers: 7");
      System.out.println("Average: 8");
      System.out.println("Median: 9");
      System.out.println("Minimum: 10");
      System.out.println("Maximum: 11");
      System.out.println("Percent Change: 12");
      System.out.println("Quit: 13");
      //Creating a scanner to be used for all of the main method
      Scanner inp = new Scanner(System.in);
      int function = inp.nextInt();
      //Adding
      if (function == 1) {
        System.out.println("Adding two numbers.");
        System.out.println("What is the first number?");
        double s1 = inp.nextDouble();
        System.out.println("What is the second number?");
        double s2 = inp.nextDouble();
        System.out.println(s1 + " + " + s2 + " = " + n.add(s1, s2));
      }
      //Subtracting
      if (function == 2) {
        System.out.println("Subtracting one number from another.");
        System.out.println("What is the first number?");
        double d1 = inp.nextDouble();
        System.out.println("What is the second number?");
        double d2 = inp.nextDouble();
        System.out.println(d1 + " - " + d2 + " = " + n.subtract(d1, d2));
      }
      //Multiplying
      if (function == 3) {
        System.out.println("Multiplying two numbers.");
        System.out.println("What is the first number?");
        double p1 = inp.nextDouble();
        System.out.println("What is the second number?");
        double p2 = inp.nextDouble();
        System.out.println(p1 + " * " + p2 + " = " + n.multiply(p1, p2));
      }
      //Dividing
      if (function == 4) {
        System.out.println("Dividing two numbers.");
        System.out.println("What is the first number?");
        double q1 = inp.nextDouble();
        System.out.println("What is the second number?");
        double q2 = inp.nextDouble();
        System.out.println(q1 + " / " + q2 + " = " + n.divide(q1, q2));
      }
      //Exponentiating
      if (function == 5) {
        System.out.println("Raising a base to a power.");
        System.out.println("What is the base number?");
        double x1 = inp.nextDouble();
        System.out.println("What is the number the base is being raised to?");
        double x2 = inp.nextDouble();
        System.out.println(x1 + " ^ " + x2 + " = " + n.exponentiate(x1, x2));
      }
      //Factorial
      if (function == 6) {
        System.out.println("Finding the factorial of a number.");
        System.out.println("What is the number?");
        double f1 = inp.nextDouble();
        System.out.println(f1 + "! = " + n.factorial(f1));
      }
      //Sum of integers
      if (function == 7) {
        System.out.println("Finding the sum of integers up to a number.");
        System.out.println("What is the highest number?");
        double z1 = inp.nextDouble();
        n.sumofintegers(z1);
      }
      //Average
      if (function == 8) {
        System.out.println("Calculating the average of a sequence.");
        //Passing the scanner inp into the average method
        n.average(inp);
      }
      //Median
      if (function == 9) {
        System.out.println("Calculating the median of a sequence.");
        //Passing the scanner inp into the median method
        n.median(inp);
      }
      //Minimum
      if (function == 10) {
        System.out.println("Finding the minimum of a sequence.");
        //Passing the scanner inp into the minumum method
        n.minimum(inp);
      }
      //Maximum
      if (function == 11) {
        System.out.println("Finding the maximum of a sequence.");
        //Passing the scanner inp into the maximum method
        n.maximum(inp);
      }
      //Percent Change
      if (function == 12) {
        System.out.println("Finding the percent change between two numbers.");
        System.out.println("What is the first number?");
        double pc1 = inp.nextDouble();
        System.out.println("What is the second number?");
        double pc2 = inp.nextDouble();
        System.out.println("Percent change = " + n.percentChange(pc1, pc2) + "%");
      }
      //Quit
      if (function == 13) {
        //Breaking the while loop
        break;
      }
    }










  }
}
