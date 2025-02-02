import org.code.theater.*;
import org.code.media.*;

public class DarkenImage extends ImagePlus {

  /*
   * Calls the superclass constructor to initialize pixels
   */
  public DarkenImage(String filename) {
    super(filename);
  }
  
  public void darkerTint(int value) {
    Pixel[][] pixels = getImagePixels();

      for (Pixel[] row : pixels) {
      for (Pixel pixel : row) {
        
     int redFactor = 100;   // Reduce red intensity
     int greenFactor = 140; // Reduce green intensity
     int blueFactor = 110;  // Reduce blue intensity

        
      // Darken the RGB values
     int newRed = pixel.getRed() - redFactor;
     int newGreen = pixel.getGreen() - greenFactor;
     int newBlue = pixel.getBlue() - blueFactor;

      
        pixel.setRed(newRed);
        pixel.setGreen(newGreen);
        pixel.setBlue(newBlue);
  }
 }
}

}