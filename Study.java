import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import static java.util.Map.entry;

import java.util.ArrayList;

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

        System.out.println("=========== ArrayList ===========");

        ArrayList<String> arrList = new ArrayList<String>();
        classType = arrList.getClass();
        arrList.add("1");
        arrList.add("3");
        arrList.add("2");
        arrList.add(0, "0");
        System.out.println("Values of \"arrList\" is: ");
        for (String elem : arrList) {
            System.out.println(elem);
        }
        System.out.println("Access the first value of arrList: \"" + arrList.get(0) + "\"");
        arrList.remove(0);
        System.out.println("Values of \"arrList\" after removing first element:");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
        arrList.clear();
        System.out.println(String.format("Length of \"arrayList\" after cleared is: %d", arrList.size()));
        System.out.println(String.format("Type of \"arrList\" is: %s", classType.getName()));

        System.out.println("=========== LinkedList ===========");
        LinkedList list = new LinkedList();
        list.add("123");
        list.add(321);
        System.out.println("Values of \"list\" is:");
        for (Object o : list) {
            System.out.println(o.toString());
        }

        System.out.println("=========== HashMap ===========");
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

        enum Colors {
            Red {
                @Override
                public String toString() {
                    return "RED";
                }
            },
            Green {
                @Override
                public String toString() {
                    return "GREEN";
                }
            },
            Blue {
                @Override
                public String toString() {
                    return "BLUE";
                }
            }
        }        
        System.out.println(String.format("All enum values of \"Colors\" is: %s", Arrays.toString(Colors.values())));
        Colors color = Colors.Green;
        classType = color.getClass();
        System.out.println("Value of \"color\" is: " + color);
        System.out.println("Does \"color\" equals Colors.Red: " + (color == Colors.Red));
        System.out.println("Does \"color\" equals Colors.Green: " + (color == Colors.Green));
        System.out.println(String.format("Type of \"color\" is: %s", classType));
        for (Colors info : EnumSet.allOf(Colors.class)) {
            String enumValue = info.name();
        }

        System.out.println(String.format("Type of \"classType\" is: %s", classType.getClass()));
        System.out.println("Is \"color\" an instance of \"Colors\": " + (color instanceof Colors));
    }
}