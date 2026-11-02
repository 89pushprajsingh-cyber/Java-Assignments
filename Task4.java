// Create a constant named PIwith final keyword and the final value 3.14. 
//For a circle with radius 7, print Area: Followed by area and Perimeter : 
//followed by perimeter , using PI.


public class Task4 {
    public static void main(String args[]){
        final double PI = 3.14;
        int radius = 7;
        
        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
