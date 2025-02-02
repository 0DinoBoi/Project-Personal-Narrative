import org.code.theater.*;
import org.code.media.*;

/*
 * Represents a color shifted image
 */
public class ShiftedImage extends ImagePlus {

  /*
   * Calls the superclass constructor to initialize pixels
   */
  public ShiftedImage(String filename) {
    super(filename);
  }

  /*
   * Shifts the color of each Pixel object by a fixed amount
   */
  public void colorShift(int value) {

    Pixel[][] pixels = getImagePixels();
    
    for (Pixel[] row : pixels) {
      for (Pixel pixel : row) {
        int newRed = pixel.getRed() + value;
        int newGreen = pixel.getGreen() + value;
        int newBlue = pixel.getBlue() + value;

        if (newRed > 255) {
          newRed = 255;
        }

        if (newGreen > 255) {
          newGreen = 255;
        }

        if (newBlue > 255) {
          newBlue = 255;
        }
  
        pixel.setRed(newRed);
        pixel.setGreen(newGreen);
        pixel.setBlue(newBlue);
      }
    }
  }
  
  
}