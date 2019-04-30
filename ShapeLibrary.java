// A ShapeLibrary consists of a collection of Shape objects

// You'll need to write unit tests for this class 

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Iterator;
public class ShapeLibrary {
    private ArrayList<Shape> shapes;

    /**
     * constructor for ShapeLib class
     *
     */
    public ShapeLibrary() {
        shapes = new ArrayList<Shape>();

        File folder = new File("./proj3/shapes");
        File[] listOfFiles = folder.listFiles();
        int i = 0;
        try {for (File file : listOfFiles) {

                FileInputStream shapeFile = new FileInputStream(file);
                ObjectInputStream in = new ObjectInputStream(shapeFile);
                shapes.set(i, (Shape) in.readObject());
                in.close();
                shapeFile.close();
                i++;
            }
        } catch (FileNotFoundException e){}
        catch   (IOException e)  {}
        catch   (ClassNotFoundException e)    {}
        

    }

    /**
     * method for adding a shape to the library
     *
     * @param  shape    the shape to be added
     */
    public void addShape(Shape shape)
    {
        this.shapes.add(shape);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    iterator
     */
    public Iterator iterator()
    {
        return shapes.iterator();
    }

}
