import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the current temperature in degrees Celsius:");
        double temperature = scanner.nextDouble();

        if (temperature >= 30) {
            System.out.println("It's hot outside! You might want to go swimming or have a picnic.");
        } else if (temperature >= 20 && temperature < 30) {
            System.out.println("The weather is pleasant. How about going for a hike or having a barbecue?");
        } else if (temperature >= 10 && temperature < 20) {
            System.out.println("It's a bit chilly. You could go for a walk or visit a museum.");
        } else {
            System.out.println("It's cold outside. You might want to stay indoors and watch a movie.");
        }

        scanner.close();
    }
}