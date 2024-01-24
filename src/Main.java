import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter Program that converts :");
        System.out.println("feet to meters");
        System.out.println("pounds  to kgs");
        System.out.println("fahrenheit to celsius");
        System.out.print("Select the unit you want to convert from : ");
        String fromUnit = scanner.nextLine().toLowerCase();

        System.out.print("Select the unit you want to convert to : ");
        String toUnit = scanner.nextLine().toLowerCase();

        System.out.print("Input the value : ");
        double value = scanner.nextDouble();

        double answer = convert(fromUnit, toUnit, value);
        System.out.println("Answer: "+value +fromUnit+" is equals to " + answer + " " + toUnit);
    }


    private static double convert(String fromUnit, String toUnit, double quantity) {
        switch (fromUnit.toLowerCase()) {
            case "feet":
                if (toUnit.equalsIgnoreCase("meters")) {
                    // Conversion from Feet to Meters
                    return quantity * 0.305;
                } else {
                    System.out.println("Invalid.");
                    return 0.0;
                }

            case "pounds":
                if (toUnit.equalsIgnoreCase("kgs")) {
                    // Conversion from Pounds to Kgs
                    return quantity * 0.454;
                } else {
                    System.out.println("Invalid.");
                    return 0.0;
                }

            case "fahrenheit":
                if (toUnit.equalsIgnoreCase("celsius")) {
                    // Conversion from Fahrenheit to Celsius
                    return (quantity - 32) /1.8;
                } else {
                    System.out.println("Invalid.");
                    return 0.0;
                }

            default:
                System.out.println("Invalid.");
                return 0.0;
        }
    }
}
