
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.File;
import java.util.Scanner;
import java.awt.Color;

/*
 * Drawing is where the action happens.
 * 
 * The Drawing constructor should accept a File parameter indicating 
 * what instruction file to utilize.  It will need to create a 
 * Scanner pointing to the file.
 * 
 * It should also accept a ShapeLibrary parameter, which refers
 * to a fully filled-in library of shapes to utilize for drawing.
 * 
 * It should then use the appropriate Utility static methods
 * to ask for the retrieval of one CanvasInstruction, and create
 * a loop to ask for the retrieval of as many DrawInstruction 
 * objects as there are drawing instruction lines in the file.
 * You may decide to do the latter by saving all the drawing
 * instructions into an ArrayList, for later processing, or by
 * reading each drawing instruction and processing it immediately.
 * 
 * You must then do the work of drawing.  In some cases that will 
 * involved some transforms on the data, e.g., if the instruction
 * file says to draw the shape at (250, 100), then you must make
 * that happen.  Size is another transform that you'll need to 
 * handle.  Make sure to handle transforms in the proper order,
 * e.g., do you size first, then shift later, or the reverse?
 * 
 * When it comes to drawing the shape, you only need a couple of
 * basic Graphics methods.  You'll need .setColor() to change 
 * to the color you're about to draw with.  You'll also need
 * .drawPolygon() and .fillPolygon().  For extra credit a few
 * other methods will be necessary.
 * 
 * Do not use Graphics2D to do any of this work, regular or 
 * extra credit.  Use simple graphics commands and math to
 * accomplish these tasks.
 */

public class Drawing {

    private CanvasInstruction canvasData;
    private ArrayList<DrawInstruction> drawingSpecs;
    private DrawingPanel canvas;
    private Graphics graphics;

    /**
     * Constructor for the Drawing CLass
     *
     * @param  shapeLib  the shape library from which the drawing draws from
     * @param  instructions the file that instructs the canvas and drawing specs
     */
    public Drawing(ShapeLibrary shapeLib, File instructions) throws FileNotFoundException
    {

        Scanner fileScan = new Scanner(instructions);
        Scanner lineScan = new Scanner(fileScan.nextLine());
        canvasData = CanvasInstruction.readFromFile(lineScan);
        System.out.println(canvasData.getWidth());
        int i=0;
        drawingSpecs = new ArrayList<DrawInstruction>();
        while(fileScan.hasNextLine()) {
            lineScan = new Scanner(fileScan.nextLine());
            drawingSpecs.add(DrawInstruction.readFromFile(lineScan)); 
            
            i++;
        }
        

    }

    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void draw()
    {
        //constructs the canvas
        canvas = new DrawingPanel(canvasData.getWidth(), canvasData.getHeight());
        canvas.setBackground(canvasData.getColorSolid());
        
        
        //paints on canvas
        graphics = canvas.getGraphics();
        for(DrawInstruction drawI : drawingSpecs)   {
            
        }
        
    }
    
    


}

