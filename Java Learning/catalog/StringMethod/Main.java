package catalog.StringMethod;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //use formatted() or format() method to format strings.
        String sss = "Hi %s, your score is %d";
        System.out.println(sss.formatted("Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));

        // String can be created by a list of char, and string is immutable.
        String s = new String(new char[] {'h', 'e', 'l', 'l', 'o', '!'});
        System.out.println(s);
        //
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        //search one of the strings and extract substrings.
        "Hello".contains("ll"); // true

        "Hello".indexOf("l"); //2
        "Hello".lastIndexOf("l"); //3
        "Hello".startsWith("He"); // true
        "Hello".endsWith("o"); //true

        "Hello".substring(2); // "llo"
        "Hello".substring(2, 4); //"ll"

        // use trim() to remove the whitespace characters which including 
        // space, \t, \n from a string at the beginning and end. this method 
        // does not change the content of the string, but return a new string.
        "  \tHello\r\n".trim(); // "Hello"

        // another method to remove whitespace characters is strip()
        " Hello ".stripLeading(); // "Hello "
        " Hello ".stripTrailing(); // " Hello"
        "\u3000Hello\u3000".strip(); // "Hello"

        // use isEmpty() and isBlank() to confirm if the string is empty or 
        // only including white characters.
        "".isEmpty(); // true
        "  ".isEmpty(); // false
        "  \n".isBlank(); // true
        " Hello ".isBlank(); // false

        // replace the substring.
        String stringHello = "Hello";
        stringHello.replace("l", "w"); //"hewwo"
        stringHello.replace("ll", "~~"); // "he~~o"

        String stringalphabet = "A,,B;C ,D";
        stringalphabet = stringalphabet.replaceAll("[,;\\s]+", ",");
        System.out.println(stringalphabet);
        
        //split the string
        String sSplit= "A, B, C, D";
        String[] ss = sSplit.split("\\s*,\\s*");
        System.out.println(Arrays.toString(ss));

        //contenate strings
        String[] arr = {"A", "B", "C"};
        String sJoin = String.join("***", arr);
        System.out.println(sJoin);

        // use valueOf() method to type casting.
        String.valueOf(123); // "123"
        String.valueOf(45.67);// "45.67"
        String.valueOf(true); //"true"

        // cast string to integer.
        int n1 = Integer.parseInt("123"); // 123

        // cast string to boolean.
        boolean b1 = Boolean.parseBoolean("true"); //true

        // cast string to char.
        char[] cs = "Hello".toCharArray(); //string -> char
        String ssss = new String(cs); // char[] -> string


        
 
        
        
    }
}
