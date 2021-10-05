import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstDivider = -5;
        int secondDivider = -4;
        int counter = 0;

        while(firstDivider != 0){

            while((firstDivider < 0 || secondDivider < 0) && firstDivider != 0){
                System.out.print("Enter the first divider(enter 0 to finish the program): ");
                firstDivider = scanner.nextInt();
                if(firstDivider != 0){
                    System.out.print("Enter the second divider: ");
                    secondDivider = scanner.nextInt();
                    if(firstDivider < 0 || secondDivider < 0){
                        System.out.println("Please enter positive numbers");
                    }
                }

            }

            if(firstDivider != 0) {
                for (int x = 1; x < 1000; x++) {

                    if ((x % firstDivider == 0) && (x % secondDivider == 0)) {
                        System.out.print(x + " ");
                        counter++;
                    }
                    if(counter ==10){
                        counter = 0;
                        System.out.println();
                    }
                }
                firstDivider = -5;
                secondDivider = -4;
                System.out.println();
            }
        }

    }
}
