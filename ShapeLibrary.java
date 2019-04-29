// A ShapeLibrary consists of a collection of Shape objects

// You'll need to write unit tests for this class 

public class ShapeLibrary {
    private ArrayList<Shape> shapes;
    
    /**
     * constructor for ShapeLib class
     *
     */
    public ShapeLibrary() {
        shapes = new ArrayList<Shape>();
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

}
