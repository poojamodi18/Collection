package stringExamples;

import java.util.Scanner;

//switch case with string
public class StringSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DO RE MI FA SOL LA SI");
        System.out.print("Enter any one from above : ");
        String note = sc.next().toUpperCase();
        switch (note){
            case "DO":
                System.out.println("Note C");
                break;
            case "RE":
                System.out.println("Note D");
                break;
            case "MI":
                System.out.println("Note E");
                break;
            case "FA":
                System.out.println("Note F");
                break;
            case "SOL":
                System.out.println("Note G");
                break;
            case "LA":
                System.out.println("Note A");
                break;
            case "SI":
                System.out.println("Note B");
                break;
            default:
                System.out.println("Undefined");
        }
    }
}
