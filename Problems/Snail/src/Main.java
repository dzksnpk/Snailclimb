import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the wall size: ");
        int h = scanner.nextInt();
        System.out.println("How much snail will climb up in day: ");
        int a = scanner.nextInt();
        System.out.println("How much snail will slide down in night " +
                "(can't be greater than previous number, otherwise he will never climb desired height): ");
        int b = scanner.nextInt();
        int count = 0;
        
        while (h > 0 && h > b && a > b) {
            h -= a;
            h += b;
            count++;
        }
        System.out.println("Your snail will climb up the wall in " + count + " days");
        
    }
}
