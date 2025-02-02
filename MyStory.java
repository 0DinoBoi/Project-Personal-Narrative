import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene{

  private String[][] desc1;
  private ShiftedImage[][] desc2;
  private DarkenImage[][] desc3;

public MyStory(String[][] desc1, ShiftedImage[][] desc2, DarkenImage[][] desc3){
this.desc1 = desc1;
  this.desc2 = desc2;
  this.desc3 = desc3;
}
  
//Calls each scene in the right order
public void drawScene(){
drawPartOfScene();
drawScene1();
drawScene2();
drawScene3();
drawScene4();
drawScene5();
drawScene6();
}
/*
  *Each drawScene 
  */
public void drawScene1(){
  clear("white");
  setTextHeight(17);
  setTextStyle(Font.SERIF, FontStyle.ITALIC);
  drawText(desc1[0][0], 35, 350);
  drawImage(desc2[0][0], 0, 0, 400);
  pause(3.5);
}
public void drawScene2(){
  clear("white");
  setTextHeight(17);
  setTextStyle(Font.SERIF, FontStyle.ITALIC);
  drawText(desc1[0][1], 10, 350);
  drawImage(desc2[0][1], 0, 0, 400);
  pause(3.5);
}
public void drawScene3(){
  clear("white");
  setTextHeight(17);
  setTextStyle(Font.SERIF, FontStyle.ITALIC);
  drawText(desc1[0][2], 0, 350);
  drawImage(desc2[0][2], 0, 0, 400);
  pause(3.5);
}
  public void drawScene4(){
  clear("white");
  setTextHeight(15);
  setTextStyle(Font.SERIF, FontStyle.ITALIC);
  drawText(desc1[1][0], 10, 350);
  drawImage(desc2[1][0], 0, 0, 400);
  pause(3.5);
}
  public void drawScene5(){
  clear("white");
  setTextHeight(17);
  setTextStyle(Font.SERIF, FontStyle.ITALIC);
  drawText(desc1[1][1], 20, 350);
  drawImage(desc3[0][0], 0, 0, 400);
  pause(3.5);
}
  public void drawScene6(){
  clear("white");
  setTextHeight(17);
  setTextStyle(Font.SERIF, FontStyle.ITALIC);
  drawText(desc1[1][2], 75, 350);
  drawImage(desc3[0][1], 0, 0, 400);
  pause(3.5);
}
  
public void drawPartOfScene() {
clear("white");
  drawImage("clock.jpg", 130, 0, 130);
  setTextHeight(50);
  setTextColor("red");
  drawText("Ben's", 140, 145);
  drawText("Daily Routine", 60, 215);
  pause(4);
 }
}