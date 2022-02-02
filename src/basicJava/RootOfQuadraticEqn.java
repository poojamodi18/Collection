package basicJava;

/*
find the root of a quadratic equation
ax^2 + bx + c = 0
x = (-b +- sqrt(b^2 - 4ac)/(2a))
+- so 2 answers
x = (-b + sqrt(b^2 - 4ac)/(2a))
x = (-b - sqrt(b^2 - 4ac)/(2a))
b^2 - 4ac > 0 roots are real and different
          ==0 roots are real and equal
          < 0 roots complex and different
 */
public class RootOfQuadraticEqn {
    public static void main(String[] args) {
        double a = 2.4, b = 4, c = 5.6;
        double root1, root2;
        double d = b * b - (4 * a * c);

        if (d == 0) {
            root1 = -b / (2 * a);
            System.out.println("Root of quadratic equation : " + root1);
        } else if (d > 0) {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots of quadratic equation : " + root1 + " and " + root2);
        } else if (d < 0) {
            root1 = -b / (2 * a);
            root2 = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots of quadratic equation are : \n" + root1 + " + " + root2 + "\n" + root1 + " - " + root2);
        }

    }
}
