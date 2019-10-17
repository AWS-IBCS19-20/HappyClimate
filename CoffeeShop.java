import java.util.*;

public class CoffeeShop{

  public static void main(String[] args) {
    System.out.println("Welcome to the Coffee Shop!");

    System.out.println("What's your name?");

    Scanner inp = new Scanner(System.in);
    String name = inp.next();

    System.out.println("Hello, " + name + "!");
    System.out.println("What would you like to order today?");

    System.out.println("Pick one.");

    System.out.println("1: Beverage Option");
    System.out.println("2: Food Option");

    Scanner inp2 = new Scanner(System.in);
    String option1 = inp2.next();

    if (option1.equals("1")) {

      System.out.println("Here is the beverage menu.");
      System.out.println("1: Hot Chocolate");
      System.out.println("2: Mocha");
      System.out.println("3: Coffee");
      System.out.println("4: Decaf");

      Scanner inp3 = new Scanner(System.in);
      String order = inp3.next();

      if (order.equals("1")) {
        order = "hot chocolate";
      }

      if (order.equals("2")) {
        order = "mocha";
      }

      if (order.equals("3")) {
        order = "coffee";
      }

      if (order.equals("4")) {
        order = "decaf";
      }

      System.out.println("You ordered a " + order + ".");

      System.out.println("What size?");
      System.out.println("1: Small");
      System.out.println("2: Regular");
      System.out.println("3: Large");

      Scanner inp5 = new Scanner(System.in);
      String size = inp5.next();

      if (size.equals("1")) {
        size = "small";
      }

      if (size.equals("2")) {
        size = "regular";
      }

      if (size.equals("3")) {
        size = "large";
      }

      System.out.println("You ordered a " + size + " " + order + ".");

      System.out.println("Is that order to go or for here?");
      System.out.println("1: To Go");
      System.out.println("2: For here");

      Scanner inp6 = new Scanner(System.in);
      String order4 = inp6.next();

      if (order4.equals("1")) {
        order4 = "to go";
      }

      if (order4.equals("2")) {
        order4 = "for here";
      }

      System.out.println("Ok, so that's a " + size + " " + order + " " + order4 + ".");

    }

    if (option1.equals("2")) {

      System.out.println("Here is the food menu.");
      System.out.println("1: Scone");
      System.out.println("2: Sandwich");
      System.out.println("3: Parfait");
      System.out.println("4: Cakepop");

      Scanner inp4 = new Scanner(System.in);
      String order2 = inp4.next();

      if (order2.equals("1")) {
        order2 = "scone";
      }

      if (order2.equals("2")) {
        order2 = "sandwich";
      }

      if (order2.equals("3")) {
        order2 = "parfait";
      }

      if (order2.equals("4")) {
        order2 = "cakepop";
      }
      System.out.println("You ordered a " + order2 + ".");

      System.out.println("Is that order to go or for here?");
      System.out.println("1: To Go");
      System.out.println("2: For here");

      Scanner inp6 = new Scanner(System.in);
      String order3 = inp6.next();

      if (order3.equals("1")) {
        order3 = "to go";
      }

      if (order3.equals("2")) {
        order3 = "for here";
      }

      System.out.println("Ok, so that's a " + order2 + " " + order3 + ".");
    }
    System.out.println("Thanks for stopping by the Coffee Shop!");
  }
}
