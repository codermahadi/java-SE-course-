package Abstruct;

/**
 * Created by Mahadi on 2/17/2019.
 */
abstract class ShapeD {
    // declare fields
    String objectName = " ";

    ShapeD(String name)
    {
        this.objectName = name;
    }

    // declare non-abstract methods
    // it has default implementation
    public void moveTo(int x, int y)
    {
        System.out.println(this.objectName + " " + "has been moved to"
                + " x = " + x + " and y = " + y);
    }

    // abstract methods which will be
    // implemented by its subclass(es)
    abstract public double area();
    abstract public void draw();
}