public class Study {
    public static void main(String[] args) {
        System.out.println("=========== Primitive types ===========");
        System.out.println("[ Integer ]");
        Integer integer = 10;
        Class classType = integer.getClass();
        System.out.println(String.format("Value of \"integer\" is: %s", integer));
        int intP = 10;
        System.out.println(String.format("Value of \"integer\" declared with primitive keyword is: %s", intP));
        System.out.println(String.format("Type of \"integer\" is: %s", classType.getName()));


        System.out.println("[ String ]");
        String str = "Hello, Kimmy";
        classType = str.getClass();
        System.out.println(String.format("Value of \"str\" is: %s", str));
        str = """
                This
                is
                a
                multi-line
                string.
                """;
        System.out.println(String.format("Value of multi-line string \"str\" is: %s", str));
        System.out.println(String.format("Type of \"str\" is: %s", classType.getName()));

        double precisedNumber = 0.1;
        System.out.println(String.format("Value of \"precisedNumber\" is: %s", precisedNumber));
        //System.out.println(String.format("Type of \"precisedNumber\" is: %s", classType.getName()));
    }
}