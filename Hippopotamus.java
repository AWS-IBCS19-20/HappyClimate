import java.util.*;

class Hippopotamus {

private Integer Height;
private Integer Length;
private Integer Weight;
private Integer Age;
private String Gender;
private Boolean Angry;

public Hippopotamus() {
  Height = 4;
  Length = 12;
  Weight = 4700;
  Age = 9;
  Gender = "Male";
  Angry = true;
}
public void Walk() {

}
public void Chomp() {
  System.out.println("CHOMP!");

}
public void Roar() {
  System.out.println("ROAR! GRUNT! WHEEZE!");

}
public void Charge() {
  System.out.println("*THUNDERING FOOTFALLS AS THE HIPPO CHARGES*");

}
public void Rest() {

}

public static void main(String[] args) {

  Hippopotamus h = new Hippopotamus();

  System.out.println("What To Do In The Case of a Hippo Attack: A Guide");
  System.out.println("Table of Contents");
  System.out.println("1: Info on Hippos");
  System.out.println("2: Info on Hippo Attacks");
  System.out.println("3: Simulating a Hippo Attack - interactive experience");
  System.out.println("Choose chapter.");

  Scanner chp = new Scanner(System.in);
  String chpc = chp.next();

  if (chpc.equals("1")) {
    System.out.println("INFO ON HIPPOS");
    System.out.println("Hippos are large land mammals native to Africa. They spend at least sixteen hours a day submerged in water to stay cool and are considered amphibious. Their closest living relatives are pigs, whales, and dolphins. The name 'hippopotamus' is derived from the Greek word for 'water horse' or 'river horse'. Hippos are very big, typically weighing two to four tons and having a length of ten to sixteen feet. They are herbivores, though they are sometimes known to feed on animal carcasses. Hippos are notorious for being very agressive. They use their tusks and teeth to fight off threats, including other hippos and humans.");
  }

  else {
    if (chpc.equals("2")) {
      System.out.println("INFO ON HIPPO ATTACKS");
      System.out.println("Hippos are considered the most dangerous of large land animals, responsible for over five hundred deaths yearly in Africa. Their unpredictable and agressive nature leads to attacks on humans that encroach on their territory or that they encounter while wandering on land. Though they do not intend to eat humans, they are still capable of lethally assaulting them. For example, numerous people have been attacked and killed while canoeing or traveling by boat in hippo-infested waters.");
    }

    else{
      if (chpc.equals("3")) {
        System.out.println("SIMULATING A HIPPO ATTACK - INTERACTIVE EXPERIENCE");
        System.out.println("Sizing up the prospective hippo:");
        System.out.println("Height:" + h.Height);
        System.out.println("Length:" + h.Length);
        System.out.println("Weight:" + h.Weight);
        System.out.println("Age:" + h.Age);
        System.out.println("Gender:" + h.Gender);
        System.out.println("Aggresive?:" + h.Angry);
        System.out.println("Enter 'Y' to begin simulation.");

        Scanner ready = new Scanner(System.in);
        String begin = ready.next();

        if (begin.equals("Y")) {
          System.out.println("You hear something loud -");
          h.Roar();

          System.out.println("You see a hippo...it begins to charge -");
          h.Charge();

          System.out.println("It opens its mouth and -");
          h.Chomp();

          System.out.println("HIPPO ATTACK SIMULATION COMPLETE");
        }
      }
    }
  }

}

}
