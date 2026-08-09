/**
 * Hello World Application - Use Case 3
 *
 * @author Ishita Singh
 * @version 3.0
 */
public class HelloWorld {

    public static void main(String[] args) {

        String name = "World";

        if (args.length > 0) {
            name = args[0];
        }

        System.out.println("Hello " + name);
    }
}