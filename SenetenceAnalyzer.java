import java.util.Scanner;

class SentenceAnalyzer {
      private static int choice;
      private static String str;
      private static boolean exit = false;
      private final static char[] listOfVowels = {'a', 'e', 'i', 'o', 'u', 'y'};
      private static int i;
      private static int count = 0;
      private static int position = 0;
      private static int length = str.length();
      private static int totalOfVowels = 0;
      private static int consonantTotals = 0;
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // System.out.println("Enter a string: ");
      // String str = input.nextLine();
      
      prompt();
      
      
      
      input.close();
    }

  //VOWEL METHOD
  public static void vowels(String str) {
    
    for(i = 0; i < listOfVowels.length - 1; i++) {
      position = str.indexOf(listOfVowels[i]);
      while(position != -1) {
        count++;
        position = str.indexOf(listOfVowels[i], position +1);
      }
      //System.out.println(listOfVowels[i]);
    }
    //int totalOfVowels = str.indexOf(listOfVowels[i]);
    System.out.println(count);
  } 

  //CONSONANT METHOD
  public static void consonant(String str) {
    for(i = 0; i < listOfVowels.length - 1; i++) {
      position = str.indexOf(listOfVowels[i]);
      while(position != -1) {
        count++;
        position = str.indexOf(listOfVowels[i], position +1);
      }
      //System.out.println(listOfVowels[i]);
    }
    con = 
    
  }



  
  public static void prompt() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    str = input.nextLine();
    menu();
  }
  public static void menu() {
    
    do {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number");
      System.out.println("1. Count the number of vowels in the string");
      System.out.println("2. Count the number of consonants in the string");
      System.out.println("3. Count both the vowels and consonants in the string");
      System.out.println("4. Enter another string");
      System.out.print("5. Exit the program:");
      choice = input.nextInt();

      switch(choice) {
        case 1:
          vowels(str);
          break;
        case 2:
          consonant(str);
          break;
        case 3:
          vowels(str);
          consonant(str);
          break;
        case 4: 
          prompt();
          break;
        case 5:
          exit = true;
          break;
      }

    } while(exit == false);
    System.out.println("Good bye");
  }
  
}