import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main
{

    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    int romanToDecimal(String str)
    {

        int res = 0;

        for (int i = 0; i < str.length(); i++)
        {

            int s1 = value(str.charAt(i));


            if (i + 1 < str.length())
            {
                int s2 = value(str.charAt(i + 1));


                if (s1 >= s2)
                {
                    res = res + s1;
                }
                else
                {

                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res = res + s1;
            }
        }

        return res;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splittedArray = input.split(" ");
        System.out.println(Arrays.toString(splittedArray));

        //Stream stre = Arrays.stream(splittedArray);

        if((splittedArray[0].matches(".*\\d.*")) && (splittedArray[2].matches(".*\\d.*"))){

        int num1 = Integer.parseInt(splittedArray[0]);
        int num2 = Integer.parseInt(splittedArray[2]);

        if ((num1 >= 1 && num1 <= 10) || (num2 >= 1 && num2 <= 10)) {

            if(splittedArray[1].equals("+")){
                System.out.println(num1 + num2);}
            else if(splittedArray[1].equals("-")){
                System.out.println(num1 - num2);}
            else if(splittedArray[1].equals("*")){
                System.out.println(num1 * num2);}
            else if(splittedArray[1].equals("/")){
                System.out.println(num1 / num2);}
        } else {

            throw new NullPointerException("Введенные значения находятся за пределами допустимых");

        }
    }

    else if ((splittedArray[0].matches(".*\\d.*")) || (splittedArray[2].matches(".*\\d.*"))) {

        throw new NullPointerException("Введенные значения не удовлетворяют требованиям ТЗ");

    }

    else {
        Main object = new Main();


        int number1 = object.romanToDecimal(splittedArray[0]);
        int number2 = object.romanToDecimal(splittedArray[2]);


        if(splittedArray[1].equals("+")){
            System.out.println(number1 + number2);}
        else if(splittedArray[1].equals("-")){
            System.out.println(number1 - number2);}
        else if(splittedArray[1].equals("*")){
            System.out.println(number1 * number2);}
        else if(splittedArray[1].equals("/")){
            System.out.println(number1 / number2);}
        else {

            throw new NullPointerException("Введенные значения находятся за пределами допустимых");

        }
    }

    }
}