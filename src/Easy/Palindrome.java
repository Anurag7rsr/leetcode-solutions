package Easy;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome sol = new Palindrome();

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (sol.isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is NOT a palindrome number.");
        }

        sc.close();

    }



    public boolean isPalindrome(int x) {

            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }

            int reversed = 0;
            int original = x;


            for (int temp = x; temp != 0; temp /= 10) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
            }


            return original == reversed;

    }
}
