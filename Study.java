public class Study {
    public static void main(String[] args) {
        System.out.println("=========== Primitive types ===========");
        System.out.println("[ Integer ]");
        Integer integer = 10;
        Class classType = integer.getClass();
        System.out.println(String.format("Value of \"integer\" is: %s", integer));
        System.out.println(String.format("Type of \"integer\" is: %s", classType.getName()));

        int intP = 10;
        System.out.println(String.format("Value of \"integer\" is: %s", intP));

        System.out.println("[ String ]");
        String str = "Hello, Kimmy";
        classType = str.getClass();
        System.out.println(String.format("Value of \"str\" is: %s", str));
        System.out.println(String.format("Type of \"str\" is: %s", classType.getName()));


    }
}