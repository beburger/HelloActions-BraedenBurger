public class Hello {
    public static void main(String[] args) {
        // Read the name from the WHO_TO_GREET environment variable.
        String name = System.getenv("WHO_TO_GREET");

        // If the variable isn't set or is empty, use a default value.
        if (name == null || name.isBlank()) {
            name = "World";
        }

        // Print the greeting.
        System.out.println("Hello " + name + "!");

        // Print a second message about where the program is running.
        System.out.println("This program is running inside GitHub Actions.");
    }
}
