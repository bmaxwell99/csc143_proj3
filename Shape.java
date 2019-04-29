import java.io.Serializable;

// A shape consists of a shape name and a collection of points

// You'll need to write unit tests for this class

public class Shape implements Serializable {
    private ArrayList<Point> points;
    private String name;
    
    /**
     * Constructor for the SHape Class
     *
     * @param  name the string to name the shape
     */
    public Shape(String name) {
        this.setName(name);
        points = new ArrayList<Point>();
    }
    
    /**
     * set method for the name variable
     *
     * @param  name the string to set the name to
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * get method for the name variable
     *
     * @return    the name of the shape
     */
    public String getName()
    {
        
        return this.name;
    }

    /**
     * A method for adding points to the array list
     *
     * @param  point    the point to be added
     */
    public void addPoint(Point point)
    {
        points.add(point);
    }

}
