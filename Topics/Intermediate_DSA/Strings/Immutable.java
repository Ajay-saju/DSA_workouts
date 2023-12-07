package Strings;

public class Immutable {
    public static void main(String[] args) {
        String s1 = "Hello"; // String literal
        String s2 = "Hello"; // String literal
        String s3 = s1; // same reference

        // Changing the value of s1
        s1 = "java";

        // Updating s2 with concat
        s2.concat("World");
        // System.out.println("s2 refers to " + s2);
        String newS3 = s3.concat("Scalar");

        System.out.println("s1 refers to " + s1); // java
        System.out.println("s2 refers to " + s2); // Hello World
        System.out.println("s3 refers to " + s3); // java
        System.out.println("newS3 refers to " + newS3); // java scalar

    }
}
