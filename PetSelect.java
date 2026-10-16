import java.util.Scanner;  // Import the Scanner class

class Main {

  public static void check (String scan) {

 if ("abcdefghijklmnopqrstuvwxyz".indexOf(scan.substring(1, scan.length()).toLowerCase()) >= 0) {
                //this is a letter
                
                return;
}


 }

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Color");

    String color = myObj.nextLine().toLowerCase();  // Read user input

check(color);
System.out.println("Now enter you favorite season.");

String season = myObj.nextLine().toLowerCase();
  check(season);

 System.out.println("Enter your name.");
 String name = myObj.nextLine().toLowerCase();

 check(name);
if (!color.equals("blue") && !color.equals("green") && !color.equals("red")){
  System.out.println("Error");
  main(args);
  return;
}
 
else if (color.equals("red")){
  if ("aeiou".indexOf(name.substring(0,1)) >= 0){
   System.out.println("you got porcupine");
  }
  else{
  System.out.println("Ya got panda");
}
}
  
else if (color.equals("green") && "aeiou".indexOf(name.substring(0,1)) < 0 && season.equals("winter")){
  System.out.println("you got an giraffe");
}
else if (color.equals("green") && !season.equals("fall")){
  System.out.println("You got dog");
}
else if (color.equals("blue")){

  if (season.equals("fall")){
    System.out.println("You got alligator!");
  }
  else if (season.equals("spring")){
    System.out.println("You got an ostrich");
  }
  else if ("aeiou".indexOf(name.substring(0,1)) < 0 && !season.equals("summer") && !season.equals("fall")){
    System.out.println("You got axolotl");
  }
else if (season.equals("summer")){
  System.out.println("you got pony");

}
else {
  System.out.println("You got a rock");
}
}


else {
  System.out.println("You got a rock.");
}


}


}