package projects;

public class QuestionBank {
    public static String[] questions = { "Number of primitive data types in Java are?",
            "What is the size of float and double in Java?",
            "Automatic type conversion is possible in which of the possible cases?",
            "Select a valid statement.",
            "When an array is passed to a method, what does the method receive?"
    };
    public static String[][] answers = { { "6", "7", "8", "9" },
            { "32 and 64", "32 and 32", "64 and 64", "64 and 32" },
            { "Byte to int", "int to long", "long to int", "short to int" },
            { "char[] ch = new char(5)", "char[] ch = new char[5]", "char[] ch = new char()",
                    "char[] ch = new char[]" },
            { "The reference of the array", "A copy of the array", "Length of the array",
                    "Copy of the first element" } };
    public static String[] correctAnswer = { "C", "A", "B", "B", "A" };
    public static int initialScore = 0;

    public static void main(String... args) {

    }
}
