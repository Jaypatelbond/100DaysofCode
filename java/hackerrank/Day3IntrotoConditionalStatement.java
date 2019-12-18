/**
 * 
 * Objective
In this challenge, we're getting started with conditional statements. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
Explanation

Sample Case 0: 
 is odd and odd numbers are weird, so we print Weird.

Sample Case 1: 
 and  is even, so it isn't weird. Thus, we print Not Weird.
 *
 * 
 * @@author Jaypatelbond
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

static final String WEIRD = "Weird";
static final String NOT_WEIRD = "Not Weird";
static String ans = NOT_WEIRD;

public static Boolean hasRemainder(final int number) {
        return number % 2 == 1;
    }

    public static Boolean isNumberOdd(final int number) {
        boolean status = false;
        if (hasRemainder(number)) {
            status = true;
        }
        return status;
    }

    public static String isNumberWeird(final int number) {
        if (isNumberOdd(number) || (number > 5 && number < 21)) {
            ans = WEIRD;
        }
        return ans;
    }

    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final int number = scan.nextInt();
        scan.close();

  System.out.println(isNumberWeird(number));
} 
}
