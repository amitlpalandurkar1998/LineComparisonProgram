import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Line Number 1.(l1)
        System.out.printf("Enter the x-coordinate of the first point (x1): ");
        double x1 = scanner.nextDouble();
        System.out.printf("Enter the y-coordinate of the first point (y1): ");
        double y1 = scanner.nextDouble();
        System.out.printf("Enter the x-coordinate of the second point (x2): ");
        double x2 = scanner.nextDouble();
        System.out.printf("Enter the y-coordinate of the second point (y2): ");
        double y2 = scanner.nextDouble();

        // Line Number 2.(l2)
        System.out.printf("Enter the x-coordinate of the first point (p1): ");
        double p1 = scanner.nextDouble();
        System.out.printf("Enter the y-coordinate of the first point (q1): ");
        double q1 = scanner.nextDouble();
        System.out.printf("Enter the x-coordinate of the second point (p2): ");
        double p2 = scanner.nextDouble();
        System.out.printf("Enter the y-coordinate of the second point (q2): ");
        double q2 = scanner.nextDouble();

        // Calculate the length of the line.(l1)&&
        //using String.valueOf() Convert to String for to use compareTo method.
        String length_of_line_1 = String.valueOf(Math.sqrt((Math.pow(x2-x1,2)+(Math.pow(y2-y1,2)))));
        String length_of_line_2 = String.valueOf(Math.sqrt((Math.pow(p2-p1,2)+(Math.pow(q2-q1,2)))));

        System.out.println("length_of_line_1 : "+length_of_line_1);
        System.out.println("length_of_line_2 : "+ length_of_line_2);
        String checkRetun = String.valueOf(length_of_line_1.compareTo(length_of_line_2));
        String check_equal_or_not = null;


        if(checkRetun.equals("0")){
            check_equal_or_not="Equal";
        } else {
            check_equal_or_not="Not Equal";
        }
        System.out.printf("The length of the 1st line is "+check_equal_or_not+" to Second Line.");
    }
}
