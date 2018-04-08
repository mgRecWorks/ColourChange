/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colourGUI;

import java.awt.Color;
import java.util.*;
import static java.awt.Color.GREEN;
import static java.awt.Color.RED;
import static javafx.scene.paint.Color.PURPLE;

/**
 *
 * @author Monette
 */
public class ColourChange {
    private Color color;
    private Random randomNumberGenerator;
   private Circle light;

    /**
     *
     */
   public ColourChange()
   {
      randomNumberGenerator = new Random();
      this.light = new Circle(50, GREEN);
      light.setXPos(100);
      light.setYPos(100);   
   }
    

   /**
    * Returns a randomly generated int between 0 (inclusive) 
    * and number (exclusive). For example if number is 6,
    * the method will return one of 0, 1, 2, 3, 4, or 5.
    */
   private int getRandomInt(int number)
   {
      return this.randomNumberGenerator.nextInt(number);
   }

   /**
    * Returns the instance variable, light.
     * @return 
    */
   public Circle getLight()
   {

      return this.light; 

   }

   /** 
    * Randomly sets the colour of the instance variable 
    * light to red, green, or purple.
    * When the message getRandomInt(anInt)is sent to an 
    * instance of LightController, the message answer is a 
    * randomly generated int between 0 (inclusive) 2 (exclusive)
    * will return one or 0, 1, 2 at random.
    */
   private void changeColour()

   {
      //Creates a new instance of a random number generator
      Random rand = new Random();

      for(int i = 0; i < 3; i++)
      {
         int randomNumberGen = getRandomInt(3); //Generates a random number
         if(randomNumberGen == 0)
         {
            light.setColour(RED);

         }

         else if(randomNumberGen == 1)
         {

            light.setColour(GREEN);

         }
         else if(randomNumberGen == 2)
         {
            light.setColour(PURPLE);

         }
      }
   }

   /** 
    * Grows the diameter of the circle referenced by the 
    * receiver's instance variable light, to the argument size.  
    * The diameter is incremented in steps of 2,
    * the xPos and yPos are decremented in steps of 1 until the
    * diameter reaches the value given by size. 
    * Between each step there is a random colour change.  The message 
    * delay(anInt) is used to slow down the graphical interface, as required.
    */   
   private void grow(int size)
   {   

      while (light.getDiameter() < size)
      {
         light.setDiameter(light.getDiameter() + 2);
         light.setXPos(light.getXPos() - 1);
         light.setYPos(light.getYPos() - 1);
         this.changeColour();
         this.delay(100);
      }
      // Add your code for Q2 part (c) here  
   }

   /** 
    * Shrinks the diameter of the circle referenced by the 
    * receiver's instance variable light, to the argument size.  
    * The diameter is decremented in steps of 2,
    * the xPos and yPos are incremented in steps of 1 until the
    * diameter reaches the value given by size. 
    * Between each step there is a random colour change.  The message 
    * delay(anInt) is used to slow down the graphical interface, as required.
    */     
   private void shrink(int size)
   { 

      while (light.getDiameter() >= size)
      {
         light.setDiameter(light.getDiameter() - 2);
         light.setXPos(light.getXPos() + 1);
         light.setYPos(light.getYPos() + 1);
         this.changeColour();
         this.delay(100);
      }
      // Add your code for Q2 part (d) here
   } 

   /** 
    * Expands the diameter of the light by the amount given by
    * sizeIncrease (changing colour as it grows).
    * 
    * The method then contracts the light until it reaches its
    * original size (changing colour as it shrinks).
     * @param size
    */     
  public void lightCycle(int size)
   {
      while(light.getDiameter()< size)
      {
         this.grow(light.getDiameter() + size);
      }
      while(light.getDiameter() >= size)
      {
         this.shrink(light.getDiameter() - size);
      }
      // Add your code for Q2 part (e) here
   }
   
public void runLight()
{    
      int input = 0;
      int size = 0;

      for (int num = 0; num < input; num++) 

         if(num < input) 
         {
            this.lightCycle(size);
         }
}
   /** 
    * Prompts the user for number of growing and shrinking
    * cycles. Then prompts the user for the number of units
    * by which to increase the diameter of light.
    * Method then performs the requested growing and 
    * shrinking cycles.
    */     
  
   /**
    * Causes execution to pause by time number of milliseconds.
    */
   private void delay(int time)
   {
      try
      {
         Thread.sleep(time); 
      }
      catch (Exception e)
      {
         System.out.println(e);
      } 
   }
}

    

