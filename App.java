import java util.Scanner;

public class App{
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    String[] questions = {
      "What is the max height in Minecraft?",
      "What is a mob that drops Ender Pearls?",
      "What mob can be tamed using bones?"
    };
    for (int i = 0; i < questions.length; i++){
      System.out.println(questions[i]);
      String UserAnswer = scnr.nextLine();
      String[] Answer = {UserAnswer};
    }
  }
}
