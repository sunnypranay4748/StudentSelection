import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numStudents = scan.nextInt();
        scan.nextLine(); // consume the newline character

        String[] stdName = new String[numStudents];
        int[] stdAge = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student name: ");
            stdName[i] = scan.nextLine();
            System.out.println("Enter student age: ");
            stdAge[i] = scan.nextInt();
            scan.nextLine(); // consume the newline character
        }

        for (int j = 0; j < numStudents; j++) {
            if (stdAge[j] >= 15) {
                System.out.println(stdName[j] + " age is equal or above " + stdAge[j]
                        + ". He/she can receive the vaccine.");
            }
        }
        scan.close();
    }
}
