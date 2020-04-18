package rectangle.homework;

public class RectangleCalculations {
    public static void main(String[] args){
        rectangleFunctions();
    }
    public static void rectangleFunctions(){
        int sideA = 2;
        int sideB = 6;
        int P = 2*(sideA+sideB);
        int S = sideA*sideB;
        System.out.println("The perimeter of the rectangle in is: "+ P + "cm");
        System.out.println("The area of the rectangle is: " + S + "cm");

    }
}
