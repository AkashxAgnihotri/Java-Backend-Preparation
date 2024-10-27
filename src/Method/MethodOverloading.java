package Method;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(area(8));
        System.out.println(area(8,9));

    }
    public static int area(int height,int width){
        return height*width;
    }
    public static double area(int side){
        return side*side;
    }
    // Method overloading means method can have same name but parameters should be different
}
