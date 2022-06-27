import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;

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
        
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
        classType = arr.getClass();
        System.out.println("Values \"arr\" is: " + Arrays.toString(arr));
        System.out.println("Type of \"arr\" is: " + classType.getName());

        Map<String, String> map = new HashMap<String, String>(Map.ofEntries(
            entry("title1", "Java"),
            entry("title2", "is")
        ));
        map.put("title3", "awesome!");
        classType = map.getClass();
        System.out.println("Value of map is: ");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println(String.format("Type of \"map\" is: %s", classType.getName()));
    }
}