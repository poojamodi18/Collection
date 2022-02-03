package decisionMakingExamples;

import java.util.Scanner;

//create pyramid patterns
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        do {
            System.out.println("Full Pyramid : 1");
            System.out.println("Left-side Half Pyramid : 2");
            System.out.println("Right-side Half Pyramid : 3");
            System.out.println("Upside-down Pyramid : 4");
            System.out.println("Upside-down Left-side Pyramid : 5");
            System.out.println("Upside-down Right-side Pyramid : 6");
            System.out.println("Exit : 7");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            char ch;
            switch (choice) {
                case 1:
                    System.out.print("Enter Pattern Character : ");
                    ch = sc.next().charAt(0);
                    for (int i = 0; i < 5; i++) {
                        for (int j = i; j < 5; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i*2+1; j++) {
                            System.out.print(ch);
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter Pattern Character : ");
                    ch = sc.next().charAt(0);
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(ch);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter Pattern Character : ");
                    ch = sc.next().charAt(0);
                    for (int i = 1; i <= 5; i++) {
                        for (int j = i; j < 5; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print(ch);
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.print("Enter Pattern Character : ");
                    ch = sc.next().charAt(0);
                    for (int i = 5; i >= 0; i--) {
                        for (int j = i; j < 5; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i*2+1; j++) {
                            System.out.print(ch);
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.print("Enter Pattern Character : ");
                    ch = sc.next().charAt(0);
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(ch);
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.print("Enter Pattern Character : ");
                    ch = sc.next().charAt(0);
                    for (int i = 5; i > 0; i--) {
                        for (int j = i; j < 5; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print(ch);
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (exit);
    }

}
