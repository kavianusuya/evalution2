public class Wall
{
    double width;
    double height;

    public Wall()
    {
        System.out.println("empty constructor");
    }
    public Wall(double width,double height)
    {
        if(width<0){
            this.width=0;
        }else if(height<0){
            this.height=0;
        }else if(width>0 && height>0){
            this.width=width;
            this.height=height;
        }
    }
    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setWidth(double width)
    {
        if(width<0){
            this.width=0;
        }else {
            this.width=width;
        }
    }
    public void setHeight(double height)
    {
        if(height<0){
            this.height=0;
        }else {
            this.height=height;
        }
    }
    public double getArea()
    {
        return width*height;
    }
    public static void main(String[] args)
    {
        Wall wall = new Wall(5.0,3.0);
        Wall wall1 = new Wall();
        System.out.println("area= "+wall.getArea());
        System.out.println("width ="+wall.getWidth());
        System.out.println("height = " +wall.getHeight());
    }

}
