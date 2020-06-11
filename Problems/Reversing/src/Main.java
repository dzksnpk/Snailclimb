import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int firstNum = number / 100; 
        int secondNum = (number / 10) % 10;
        int thirdNum = number % 10;
        
        System.out.println(100 * thirdNum + 10 * secondNum + firstNum);
    }
}
