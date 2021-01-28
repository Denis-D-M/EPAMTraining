package Lection1_Strings;

import java.util.Arrays;

public class Main  {
    private static String s = "Hello, world!";
    private static String s2 = "hello, world!";
    public static void main(String[] args) {
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase(s2));
        String s3 = "String in String Pool";
        char[] chars = s.toCharArray();
        byte[] bytes = s.getBytes();
        System.out.println(s.toUpperCase());
        System.out.println(s.indexOf("o"));
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("o"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.contains("Sun"));
        System.out.println(s.contains("wor"));
        System.out.println(s.contains("world!"));
        System.out.println(s.endsWith("Oracle"));
        System.out.println(s.startsWith("Java"));
        System.out.println(s.replaceAll("a", "o"));
        System.out.println(s.replaceAll("o", "a"));
        System.out.println(s.substring(4,8));
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(new StringBuffer(s).reverse());
        
    }
}
