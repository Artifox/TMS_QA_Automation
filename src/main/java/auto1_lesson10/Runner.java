package auto1_lesson10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner {
    //метод принимает число, возвращает строку по определенным правилам
    //если число кратно 3 то вернуть букву т
    // если кратно 5, то букву м
    //если кратно и 3 и 5 одновременно, то вернуть тмс

    /*public static void main(String[] args) {
        System.out.println(fizzBuzz(0));
    }*/

    public String fizzBuzz(int number) {
        if (number > 0) {
            if ((number % 3 == 0) && (number % 5 == 0)) {
                return "tms";
            } else if (number % 5 == 0) {
                return "m";
            } else if (number % 3 == 0) {
                return "t";
            }
        }
        return "Not valid number";
    }

    @Test
    public void fizzBuzzTest(){
        String result = fizzBuzz(3);
        Assert.assertEquals(result, "t");
    }

    @Test
    public void fizzBuzzTest2(){
        String result = fizzBuzz(15);
        Assert.assertEquals(result, "tms");
    }

}

/*
 * 3 | 5 | 15 |0 | -1 |
 *
 *
 *
 *
 * */
