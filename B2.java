interface shape {
    int radius = 24;
    int length = 12;
    int width = 24;
    double CalculateArea();
}
class Circle implements shape {
    public double CalculateArea() {
        System.out.print("Area of Circle : ");
        return 3.14*radius*radius;
    }
}
class Rectangle implements shape {
    public double CalculateArea() {
        System.out.print("Area of Rectangle : ");
        return length*width;
    }
}

class B2 {
    public static void main(String args[]){
        shape obj = new Circle();
        System.out.println(obj.CalculateArea());
    
        obj = new Rectangle();
        System.out.println(obj.CalculateArea());
    }
}