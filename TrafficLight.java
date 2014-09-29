// Ravensara Travillian
// Lab 2: Traffic Light
//
// Level: Although I did the "Plus" part, the lab specified that that was for fun only, so I think this is "Check".
// optionally, a short description of the purpose of the program. The Class compiles,  and the method draws 
// the traffic light to specification. I added JavaDoc comments and the application method. The black borders around
// the lights have been removed, and the green light is the custom darker green color.
//
// The purpose of this lab is to draw a traffic light, using NscWindow and the associated graphics classes.

import java.awt.Color;

/**
 * This is a simple class to draw a traffic light.
 *
 * @author Ravensara Travillian
 * @version Lab 2: Traffic Light
 */
public class TrafficLight {
   
   /**
    * This method creates a window and draws
    * a traffic light within that window.
    */
   public void drawTheLight() {
       NscWindow win = new NscWindow();

       // The window shall be 140 pixels wide and 330 pixels tall.
       win.setSize(140, 330);

       // The window shall be positioned at (10, 10).
       win.setLocation(10, 10);

       // The background rectangle shall be 90 pixels wide and 250 pixels tall.
       // There shall be a 20-pixel "margin" between the top of the client area of the window 
       // and the top of the background rectangle.
       // Note: The bottom "margin" may be more or less than 20 pixels wide.
       // There shall be a 20-pixel "margin" between the left edge of the client area of the window 
       // and the left edge of the background rectangle.
       // Note: The right "margin" may be more or less than 20 pixels wide.
       NscRectangle rect;
       rect = new NscRectangle(20, 20, 90, 250);
 
       // The background rectangle shall be filled with Color.lightGray or Color.LIGHT_GRAY.
       rect.setFilled(true);
       rect.setBackground(java.awt.Color.LIGHT_GRAY);
       rect.setForeground(java.awt.Color.LIGHT_GRAY);
       win.add(rect);
       win.repaint();
 
       // Schematically, the arrangement of the three circles and the background rectangle is as follows:
       // The three traffic lights shall be circles, each 70 pixels in diameter.
       // The three traffic lights shall be centered horizontally in the background rectangle.
       // The three traffic lights shall be have 10 pixels of "empty" space above and below them.
       // Note: 10 + 70 + 10 + 70 + 10 + 70 + 10 = 250
       NscEllipse red_light, yellow_light, green_light;
       new java.awt.Color(0, 128, 0);
       
       // definition of customized dark green color for Plus part of assignment
       final java.awt.Color dark_green = new java.awt.Color(0, 128, 0);
 
       // The three traffic lights shall be filled with the colors: Color.red or Color.RED, Color.yellow 
       // or Color.YELLOW, and Color.green or Color.GREEN, respectively, from top to bottom.
       // I used the setForeground method, as I learned in the Snowman demo, to take out the black borders
       // for each circle and the inner rectangle.
       red_light = new NscEllipse(30, 30, 70, 70);
       red_light.setFilled(true);
       red_light.setBackground(java.awt.Color.RED);
       red_light.setForeground(java.awt.Color.RED);
 
       yellow_light = new NscEllipse(30, 110, 70, 70);
       yellow_light.setFilled(true);
       yellow_light.setBackground(java.awt.Color.YELLOW);
       yellow_light.setForeground(java.awt.Color.YELLOW);
 
       green_light = new NscEllipse(30, 190, 70, 70);
       green_light.setFilled(true);
       green_light.setBackground(dark_green);
       green_light.setForeground(dark_green);
 
       win.add(red_light);
       win.add(yellow_light);
       win.add(green_light);

       win.repaint();
    }
   /**
    * The application method to create a traffic light.
    *
    * @param args The command-line arguments
    */
   public static void main(String[] args) {
      TrafficLight light;
      light = new TrafficLight();
      light.drawTheLight();
   }
}
