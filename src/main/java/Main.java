import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the Calculator");
    Calculator myCalculator = new Calculator();

    while(true) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a command:");
      String input = scanner.nextLine();

      if (input.trim().equalsIgnoreCase("quit")) {
        break;
      }

      String[] inputs = input.split(" ");
      if(inputs[0].equalsIgnoreCase("add")){
        Integer result = myCalculator.add(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
        System.out.printf("Result: %d\n", result);
      } else if (inputs[0].equalsIgnoreCase("subtract")) {
        Integer result = myCalculator.subtract(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
        System.out.printf("Result: %d\n", result);
      } else if (inputs[0].equalsIgnoreCase("multiply")) {
        Integer result = myCalculator.multiply(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
        System.out.printf("Result: %d\n", result);
      } else if (inputs[0].equalsIgnoreCase("divide")) {
        Integer result = myCalculator.divide(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
        System.out.printf("Result: %d\n", result);
      } else if (inputs[0].equalsIgnoreCase("fibonacci")) {
        Integer result = myCalculator.fibonacciNumberFinder(Integer.parseInt(inputs[1]));
        System.out.printf("Result: %d\n", result);
      } else if (inputs[0].equalsIgnoreCase("binary")) {
        String result = myCalculator.intToBinaryNumber(Integer.parseInt(inputs[1]));
        System.out.printf("Result: %s\n", result);
      }
    }
  }
}
