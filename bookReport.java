import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

class bookReport {

  public bookReport() {

  }

public int rSearch(ArrayList<String> bookText, String searchWord) {
  if (bookText.size() == 0) {
    return 0;
  }
  else {
    if (bookText.get(0).equalsIgnoreCase(searchWord)){
bookText.remove(0);
      return 1 + rSearch(bookText, searchWord);
    }
    else {
bookText.remove(0);
      return rSearch(bookText, searchWord);
    }
  }
}

public int numWords(ArrayList<String> bookText) {
  return bookText.size();
}

public int avgWordLength(ArrayList<String> bookText){
  int total = 0;
  for (int i = 0; i < bookText.size(); i++) {
    String element = bookText.get(i);
    int elementLength = element.length();
    total = total + elementLength;
  }
  int numWords = bookText.size();
  return total/numWords;
}

/*public Character mostCommonChar(ArrayList<String> bookText, int count, int marker) {
  ArrayList<Character> intoCharacters = new ArrayList<Character>();
    for (int i = 0; i < bookText.size(); i++){
    String elementString = bookText.get(i);
    for (int b = 0; b < elementString.length(); b ++) {
    intoCharacters.add(elementString.charAt(b));
  }
}
//I tried a recursion method
/*int maxNum = -1;
Character maxItem = 'a';
Character currentCompare = intoCharacters.get(0);
  if (intoCharacters.size() == 0) {
    return maxItem;
  }
  else {
    if (marker == intoCharacters.size()) {
      if (count > maxNum){
        count = maxNum;
        count = 0;
      maxItem = currentCompare;
      currentCompare = intoCharacters.get(0);
    }
    else {
      count = 0;
      currentCompare = intoCharacters.get(0);
    }
  }
else {
  if (intoCharacters.get(marker) == currentCompare) {
    intoCharacters.remove(intoCharacters.get(marker));
    return mostCommonChar(bookText, count ++, marker ++);
  }
  else {
   return mostCommonChar(bookText, count, marker ++);
  }
}
}
return maxItem;
}



//And a for loop method

System.out.println(intoCharacters);
  ArrayList<Character> charactersCollect = new ArrayList<Character>();
  ArrayList<Integer> countCollect = new ArrayList<Integer>();
    for (int i = 0; i < intoCharacters.size(); i++) {
    Character current = intoCharacters.get(i);
    charactersCollect.add(current);
    Integer currentCount = 1;
    for (int b = 0; b < intoCharacters.size(); b++){
      if (b == intoCharacters.size()){
        countCollect.add(currentCount);
      }
      else{
      if (intoCharacters.get(b) == current){
        currentCount ++;
        intoCharacters.remove(intoCharacters.get(b));
      }
    }
    }
  }
System.out.println(countCollect.size());
  for (int g = 0; g < countCollect.size(); g ++) {
    Integer max = -1;
    int maxItem = 0;
    if (countCollect.get(g) > max) {
      maxItem = g;
      System.out.println("New max");
    }
  }
  //return charactersCollect.get(maxItem);
return 'h';
}*/
//Both had errors


/*public String mostCommonWord(ArrayList<String> bookText, int count, int marker) {
  int max = -1;
  String maxItem = "hi";
  String currentCompare = bookText.get(0);
  if (bookText.size() == 0) {
    return maxItem;
  }
  else {
    if (marker == bookText.size()) {
      if (count > max) {
        maxItem = currentCompare;
        count = max;
        count = 0;
        marker = 1;
        bookText.remove(0);
      }
      else{
        count = 0;
        marker = 1;
        bookText.remove(0);
      }
    }
    else {
      if (currentCompare.equalsIgnoreCase(bookText.get(marker))) {
        bookText.remove(marker);
        return mostCommonWord(bookText, count ++, marker ++);
      }
      else {
        return mostCommonWord(bookText, count, marker++);
      }
    }
  }
return maxItem;
}

public void randomSum(ArrayList<String> bookText, int summarySize) {
  Random numberGen = new Random();
  int upperbound = bookText.size();
  for (int i = 0; i < summarySize; i ++){
int randomItem = numberGen.nextInt(upperbound);

System.out.print(bookText.get(randomItem));
  }

}*/
//Similar issues here to the mostCommonChar function



public static void main(String[] args) {
  bookReport n = new bookReport();
  ArrayList <String> bookText = new ArrayList<String>();
  try {
    File TomSawyer = new File("TomSawyer.txt");
    Scanner inp = new Scanner(TomSawyer);

    while (inp.hasNext()) {
      bookText.add(inp.next());

    }
  }
  catch (FileNotFoundException e) {
    e.printStackTrace();
  }

  System.out.println("Welcome to Book Report!");
  System.out.println("The book we have here is Tom Sawyer.");
  System.out.println("Choose a function.");
  System.out.println("1: Search for the number of times a word appears in the book.");
  System.out.println("2: Find the total number of words in the book.");
  System.out.println("3: Find the average word length of the book.");
  System.out.println("4: Find the most common character in the book.");
  System.out.println("5: Find the most common word in the book.");
  System.out.println("6: Generate a random summary of the book.");

 Scanner choice = new Scanner(System.in);
 int userChoice = choice.nextInt();


if (userChoice == 1) {
System.out.println("Choose a word to search for.");
Scanner f = new Scanner(System.in);
String searchWord = f.next();
System.out.println(searchWord + " appears " + n.rSearch(bookText, searchWord) + " times in the book.");

}

else{
  if (userChoice == 2) {
    System.out.print("This book contains ");
    System.out.print(n.numWords(bookText));
    System.out.println(" words.");
  }
  else{
    if (userChoice == 3) {
      System.out.print("The average word length of the book is ");
      System.out.print(n.avgWordLength(bookText));
      System.out.println(" characters.");
    }
   else{
      if (userChoice == 4) {
      System.out.print("The character that appears most often in the book is");
      int count = 0;
      int marker = 0;
      //System.out.println(n.mostCommonChar(bookText, count, marker));
    }
    else {
      if (userChoice == 5) {
        System.out.print("The word that appears most often in the book is");
        int count = 0;
        int marker = 1;
        System.out.println(n.mostCommonWord(bookText, count, marker));
      }
      else {
        if (userChoice == 6) {
          System.out.println("How long would you like the random summary to be?");
          Scanner d = new Scanner(System.in);
          int summarySize = d.nextInt();
          System.out.println("Here is a random summary:");
          n.randomSum(bookText, summarySize);
        }
      }
    }
  }





  }

}



}
}
