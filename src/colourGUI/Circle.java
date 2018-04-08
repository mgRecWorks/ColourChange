/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colourGUI;

import java.awt.Color;
import static java.awt.Color.BLUE;

/**
 *
 * @author Monette
 */
public class Circle {
   private Color colour;
   private int xPos;
   private int yPos;
   private int diameter;
/**
 * The class Circle defines a shape with the characteristics of a circle.
 *
 * @author M250 Module Team
 * @version 2.0
 */

   /* Instance variables */


   /**
    * Zero argument constructor for objects of class Circle 
    * that sets colour to OUColour.BLUE, 
    * xPos and yPos to 0,.and diameter to 30. 
    */
   public Circle()
   {
      super();
      this.colour = BLUE;
      this.xPos = 0;
      this.yPos = 0;
      this.diameter = 30;
   }

   /**
    * Constructor for objects of class Circle with arguments for
    * diameter and colour, and which sets xPos and yPos to 0.
     * @param aDiameter
     * @param aColour
    */
   public Circle(int aDiameter, Color aColour)
   {
      super();
      this.diameter = aDiameter;
      this.colour = aColour;
      this.xPos = 0;
      this.yPos = 0;
   }

   /* Instance methods */    

   /**
    * Sets the diameter of the receiver to the value of the argument aDiameter.
     * @param aDiameter
    */
   public void setDiameter(int aDiameter)
   {
      this.diameter = aDiameter;
     
   }

   /**
    * Returns the diameter of the receiver.
     * @return 
    */
   public int getDiameter()
   {
      return this.diameter;
   }

   /**
    * Sets the colour of the receiver to the value of the argument aColour.
     * @param aColour
    */
   public void setColour (Color aColour)
   {
      this.colour = aColour;
      
   }

   /**
    * Returns the colour of the receiver.
     * @return 
    */
   public Color getColor ()
   {
      return this.colour;
   }

   /**
    * Sets the horizontal position of the receiver to the value of the argument x.
     * @param x
    */
   public void setXPos(int x)
   {
      this.xPos = x;
      
   }

   /**
    * Returns the horizontal position of the receiver.
     * @return 
    */
   public int getXPos()
   {
      return this.xPos;
   }

   /**
    * Sets the vertical position of the receiver to the value of the argument y.
     * @param y
    */
   public void setYPos(int y)
   {
      this.yPos = y;
      
   }

   /**
    * Returns the vertical position of the receiver.
     * @return 
    */
   public int getYPos()
   {
      return this.yPos;
   }

   /**
    * Returns a string representation of the receiver.
     * @return 
    */
   @Override
   public String toString()
   {
      return "An instance of class " + this.getClass().getName() 
      + ": position (" + this.getXPos() + ", " + this.getYPos() 
      + "), diameter " + this.getDiameter() + ", colour " + this.getColor();
   }

   

    void setColour(javafx.scene.paint.Color PURPLE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

