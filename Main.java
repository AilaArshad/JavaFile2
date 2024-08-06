import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //Question 1
        System.out.println("****<Question 1>****");
        String input = "abcdcba";
        StringBuilder value = new StringBuilder(input);
        if (input.equals(value.reverse().toString())) {
            System.out.println(input + " is palindrome");
        } else {
            System.out.println(input + " is not palindrome");
        }

        //Question 2
        System.out.println("\n****<Question 2>****");
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter any UMT faculty or student email id:");
        String email = input1.nextLine();
        Pattern pattern = Pattern.compile("(([a-zA-Z]+\\d+)|([a-zA-Z])|([a-zA-Z]+.))+@gmail.com");
        Matcher matcher = pattern.matcher(email);
        boolean validation = matcher.matches();
        System.out.println(validation);

        //Question 3
        System.out.println("\n****<Question 3>****");
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Format in dd-MM-yyyy: " + date.format(formatter));

        //Question 4
        System.out.println("\n****<Question 4>****");
        LocalDate currentDate = LocalDate.now();
        currentDate = currentDate.plusDays(30);
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("After adding 30 days to current date: " + currentDate.format(formatter));

        //Question 5
        System.out.println("\n****<Question 5>****");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter any number to see its roman value");
        int sr = input2.nextInt();
        int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] NUMERALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder romanNumeral = new StringBuilder();
        for (int i = 0; i < VALUES.length; i++) {
            while (sr >= VALUES[i]) {
                romanNumeral.append(NUMERALS[i]);
                sr -= VALUES[i];
            }
        }
        System.out.println("Roman Number: " + romanNumeral.toString());

        //Question 6
        System.out.println("\n****<Question 6>****");
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter any brackets: ");
        String bracket = input3.nextLine();
        Pattern pattern1 = Pattern.compile("((\\(\\)|\\{\\}|\\[\\])+)");
        Matcher matcher1 = pattern.matcher(bracket);
        boolean valid = matcher.matches();
        System.out.println(validation);

        //Question 7
        System.out.println("\n****<Question 7>****");
        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter how many letters you want to enter: ");
        int num = input4.nextInt();
        input3.nextLine();
        String[] str = new String[num];
        System.out.println("Enter " + num + " letters: ");
        for (int i = 0; i < num; i++) {
            str[i] = input3.nextLine();
        }
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        if (prefix.isEmpty() || prefix == null) {
            System.out.println("\"\"");
            System.out.println("There is no common prefix among the input strings");
        } else {
            System.out.println("Prefix is: " + prefix);
        }

        //Question 8
        System.out.println("\n****<Question 8>****");
        Scanner input5 = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String appear = input5.nextLine();
        char[] arr = appear.toCharArray();
        String newS = "";
        for (int i = 0; i < arr.length; i++) {
            int k;
            for (k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    break;
                }
            }
            if (i == k) {
                newS += arr[i];
            }
        }
        char[] arr1 = newS.toCharArray();
        Arrays.sort(arr1);
        newS = String.valueOf(arr1);
        System.out.println(newS);
    }
}