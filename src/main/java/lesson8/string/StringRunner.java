package lesson8.string;

public class StringRunner {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = "hello";

        String str3 = new String(new char[] {'h','e','l','l','o'});

        System.out.println(str3.length());

        String str4 = "";
        String str5 = null;
        System.out.println(str4.isEmpty());
        if (str4 !=null && str4.isEmpty()){
            System.out.println("String is empty!");
        }

        String str6 = " ";
        //str.isBlank() is not in JDK 8

        String str7 = "hello world";
        System.out.println("str7.indexOf('l') = " +str7.indexOf('l') );

        System.out.println(str7.replace('l','L'));
        String str8 = String.join(";","Hello","World");
        System.out.println(str8);

        String str9 = String.valueOf(999);
        System.out.println("str9 = " + str9);

    }
}
