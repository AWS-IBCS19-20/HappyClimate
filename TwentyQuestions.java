import java.util.*;

public class TwentyQuestions {

  public static void main(String[] args) {

    System.out.println("Welcome to Twenty Questions - Harry Potter Edition! In this game, I'll be trying to guess what you are thinking of.");
    System.out.println("When I ask a question, please reply with Y for yes and N for no.");
    System.out.println("Let's begin! Please choose a character from the list below.");

    System.out.println("Albus Dumbledore");
    System.out.println("Bellatrix Lestrange");
    System.out.println("Cedric Diggory");
    System.out.println("Crabbe & Goyle");
    System.out.println("Draco Malfoy");
    System.out.println("Hagrid");
    System.out.println("Harry Potter");
    System.out.println("Hermione Granger");
    System.out.println("Luna Lovegood");
    System.out.println("Nagini");
    System.out.println("Neville Longbottom");
    System.out.println("Peter Pettigrew");
    System.out.println("Professor Quirrell");
    System.out.println("Remus Lupin");
    System.out.println("Ron Weasely");
    System.out.println("Severus Snape");

    System.out.println("Ready?");

    Scanner inp0 = new Scanner(System.in);
    String ready = inp0.next();

    if (ready.equals("Y")) {
      System.out.println("Ok! Let's begin!");
    }

    else {
      System.out.println("Well too bad, you're playing anyway.");
    }
    System.out.println("Question 1: Are they a student at Hogwarts?");

    Scanner inp = new Scanner(System.in);
    String student = inp.next();

    if(student.equals("Y")) {
      System.out.println("Question 2: Is their house Gryffindor?");

      Scanner inp2 = new Scanner(System.in);
      String gryffindor = inp2.next();

      if (gryffindor.equals("Y")) {
        System.out.println("Question 3: Were they raised in a wizarding family?");

        Scanner inp3 = new Scanner(System.in);
        String wizarding = inp3.next();

        if (wizarding.equals("Y")) {
          System.out.println("Question 4: Do they have any siblings?");

          Scanner inp4 = new Scanner(System.in);
          String siblings = inp4.next();

          if (siblings.equals("Y")) {
            System.out.println("Is it Ron Weasely?");
          }

          else {
            System.out.println("Is it Neville Longbottom?");
          }
        }

        else {
          System.out.println("Question 4: Are they muggle-born?");

          Scanner inp5 = new Scanner(System.in);
          String muggle = inp5.next();

          if (muggle.equals("Y")) {
            System.out.println("Is it Hermione Granger?");
          }

          else {
            System.out.println("Is it Harry Potter?");
          }
        }
      }

      else {
        System.out.println("Question 3: Is their house Slytherin?");

        Scanner inp6 = new Scanner(System.in);
        String slytherin = inp6.next();

        if (slytherin.equals("Y")) {
          System.out.println("Question 4: Are they blond?");

          Scanner inp7 = new Scanner(System.in);
          String blond = inp7.next();

          if (blond.equals("Y")) {
            System.out.println("Is it Draco Malfoy?");
          }

          else {
            System.out.println("Is it Crabbe & Goyle?");
          }
        }

        else {
          System.out.println("Question 4: Do they die during the series?");

          Scanner inp8 = new Scanner(System.in);
          String die = inp8.next();

          if (die.equals("Y")) {
            System.out.println("Is it Cedric Diggory?");
          }

          else {
            System.out.println("Is it Luna Lovegood?");
          }
        }
      }
    }

    else {
      System.out.println("Question 2: Do they support Voldemort?");

      Scanner inp9 = new Scanner(System.in);
      String voldemort = inp9.next();

      if (voldemort.equals("Y")) {
        System.out.println("Question 3: Do they have an animal form?");

        Scanner inp10 = new Scanner(System.in);
        String animal = inp10.next();

        if (animal.equals("Y")) {
          System.out.println("Question 4: Are they a horcrux?");

          Scanner inp11 = new Scanner(System.in);
          String horcrux = inp11.next();

          if (horcrux.equals("Y")) {
            System.out.println("Is it Nagini?");
          }

          else {
            System.out.println("Is it Peter Pettigrew?");
          }
        }

        else {
          System.out.println("Question 4: Did they teach at Hogwarts?");

          Scanner inp12 = new Scanner(System.in);
          String quirrell = inp12.next();

          if (quirrell.equals("Y")) {
            System.out.println("Is it Professor Quirrell?");
          }

          else {
            System.out.println("Is it Bellatrix Lestrange?");
          }
        }
      }
      else {
        System.out.println("Question 3: Did they attend Hogwarts with James Potter?");

        Scanner inp13 = new Scanner(System.in);
        String james = inp13.next();

        if (james.equals("Y")) {
          System.out.println("Question 4: Were they friends with him?");

          Scanner inp14 = new Scanner(System.in);
          String friends = inp14.next();

          if (friends.equals("Y")) {
            System.out.println("Is it Remus Lupin?");
          }

          else {
            System.out.println("Is it Severus Snape?");
          }
        }
        else {
          System.out.println("Do they own a wand?");

          Scanner inp15 = new Scanner(System.in);
          String wand = inp15.next();

          if (wand.equals("Y")) {
            System.out.println("Is it Albus Dumbledore?");
          }

          else {
            System.out.println("Is it Hargid?");
        }
      }
    }
  }
  System.out.println("Was I correct?");

  Scanner inp16 = new Scanner(System.in);
  String correct = inp16.next();

  if (correct.equals("Y")) {
    System.out.println("Great! Thanks for playing!");
  }

  else {
    System.out.println("Oh no! What was the correct answer?");

    Scanner inp17 = new Scanner(System.in);
    String correction = inp17.next();

    System.out.println("Okay. I'll make sure to get " + correction + " correct next time! Thanks for playing!");
  }
}
}
