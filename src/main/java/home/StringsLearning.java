package home;

public class StringsLearning {
    public static void main(String[] args) {
        String str1 = "StringLiteral";
        str1.concat("AdditionalString");
        System.out.println(str1);

        str1 = str1.concat("AdditionalString");
        System.out.println(str1);

        String str2 = "String2";
        String str3 = new String("String2");
        String str4 = "String2";

        System.out.println(str2 == str3); //false
        System.out.println(str2.equals(str3));//true
        System.out.println(str2 == str4);//true
    }
}
