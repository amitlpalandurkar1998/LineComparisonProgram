import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the x-coordinate of the first point: ");
        double x1 = scanner.nextDouble();
        System.out.printf("Enter the y-coordinate of the first point: ");
        double y1 = scanner.nextDouble();
        System.out.printf("Enter the x-coordinate of the second point: ");
        double x2 = scanner.nextDouble();
        System.out.printf("Enter the y-coordinate of the second point: ");
        double y2 = scanner.nextDouble();

        // Calculate the length of the line
        double length_of_line = Math.sqrt((Math.pow(x2-x1,2)+(Math.pow(y2-y1,2))));

        System.out.printf("The length of the line is: "+length_of_line);
    }
}
