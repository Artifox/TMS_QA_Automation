package lesson8.homework;

public class Runner {
    public static void main(String[] args) {
        //task1();
        //task2();
        //System.out.println(task3("Hello"));
        //task4("Hello madam string");
        //task5();
        task6();

    }

    public static void task1() {
        String s1 = "One advanced diverted domestic sex repeated bringing you old.";
        int aFirstIndex = s1.indexOf("a");
        int bLastIndex = s1.lastIndexOf('b');
        System.out.println(s1.substring(aFirstIndex, bLastIndex));
    }

    public static void task2() {
        String s1 = "One advanced diverted domestic sex repeated bringing you old.";
        char replacedChar = s1.charAt(2);
        char charToReplace = s1.charAt(0);
        System.out.println(s1.replace(replacedChar, charToReplace));
    }

    public static String task3(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return task3(str.substring(1)) + str.charAt(0);
    }

    public static void task4(String str) {
        String[] words = str.split(" ");
        System.out.println("Amount of words = " + words.length);
        boolean isPalindromePresent = false;
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                isPalindromePresent = true;
                break;
            }
        }
        if (isPalindromePresent) {
            System.out.println("Array of words contains palindrome");
        } else {
            System.out.println("Array of words doesn't contain palindrome");
        }

    }

    public static void task5() {
        String str1 = "Hello world hello";
        String str2 = "Hello environment";
        int count = 0;

        String[] strArray1 = str1.split(" ");
        String[] strArray2 = str2.split(" ");

        for (int i = 0; i < strArray1.length; i++) {
            for (int j = 0; j < strArray2.length; j++) {
                if (strArray1[i].equalsIgnoreCase(strArray2[j])) {
                    count++;
                }
            }
        }
        System.out.println("repetitions count = " + count);
    }

    public static void task6() {
        String text = "Object-oriented programming is a programming language model organized around "
                + "objects rather than \"actions\" and data rather than logic. Object-oriented programming "
                + "blabla. Object-oriented programming bla.";
        String[] stringArray = text.split(" ");
        int count = 1;
        for (int i = 0; i < stringArray.length; i++){
            if (stringArray[i].equalsIgnoreCase("object-oriented") && stringArray[i + 1].equalsIgnoreCase("programming")){
                if (count % 2 == 0) {
                    stringArray[i] = "OOP";
                    stringArray[i+1] = "";
                }
                count++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (String elem : stringArray){
            result.append(elem + " ");
        }
        result.toString().replace("\\s+", "");
        System.out.println(result);
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
