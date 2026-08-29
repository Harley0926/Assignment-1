public class Checker extends App{
  String[] answers = {
    "Y = 320",
    "Enderman",
    "Wolf"
  };
  public void checkAnswer(String[] Answer, String[] answers){
    for(int i = 0; i < Answer.length; i++){
      for(int a = 0; a < answers.length; a++){
        if(Answer[i].contains(answers[a])){
          System.out.println("Correct!");
        }
        else{
          System.out.println("Incorrect!");
        }
      }
    }
  }
}
