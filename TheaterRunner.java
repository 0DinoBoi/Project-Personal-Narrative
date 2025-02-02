import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

/*
  * Images for Ben's Daily Routine are stored in the 2D picArray
  */
ShiftedImage[][]picArray = {
  {new ShiftedImage("Ben-is-waking-up-from-bed.jpg"), new ShiftedImage("Baseballfield2.jpg"), new ShiftedImage("benEating.jpg")}, 
  {new ShiftedImage("benGaming.jpg"), new ShiftedImage("benHw.jpg"), new ShiftedImage("benSleep.jpg")}
};

DarkenImage[][]pic2Array = {
  {new DarkenImage("benHw.jpg"), new DarkenImage("benSleep.jpg")}
};
/*
  * The description for each image in the picArray is assigned to the corresponding location in the 2D array
  */   

String[][]desArray = {
  {"Ben wakes up and gets ready to go to school.", "School ends and afterschool baseball practice starts.", "Baseball practice ends and Ben goes home to eat dinner."},
  {"Ben had showered and now playing video games with friends.", "Ben gets off video games and does his homework.", "Ben is going to sleep after a good day."}
};


    MyStory scene = new MyStory(desArray, picArray, pic2Array);


    
//Draws the scene
    scene.drawScene();

    Theater.playScenes(scene);
  }
}