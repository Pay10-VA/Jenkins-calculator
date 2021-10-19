import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Calculator calc = new Calculator();
        System.out.println("Welcome to the calculator");
        boolean keepGoing = true;
        do {

            Scanner scanner = new Scanner(System.in);
            String command = scanner.next();
            if(!command.equals("fibonacci") && !command.equals("binary")) {
                int result = 0;
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                if (command.equals("add")) {
                    result = calc.add(a, b);
                } else if (command.equals("subtract")) {
                    result = calc.subtract(a, b);
                } else if (command.equals("multiply")) {
                    result = calc.multiply(a, b);
                } else {
                    result = calc.divide(a, b);
                }

                System.out.println(result);
            }
            else if(command.equals("done")) {
                keepGoing = false;
            }
            else {
                if(command.equals("fibonacci")) {
                    int num = scanner.nextInt();
                    System.out.println(calc.fibonacciNumberFinder(num));
                }
                else {
                    int num = scanner.nextInt();
                    System.out.println(calc.intToBinaryNumber(num));
                }
            }
        } while(keepGoing);

        System.exit(1);

    }

}
