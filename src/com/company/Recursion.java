package com.company;

public class Recursion {
    public void run() {
        /*
        -Always needs a base condition
        -Every step make problem smaller
        -Why learn recursion ?
            Makes code simpler instead of iterative
            Heavily used in Tree Graphs etc
            Used in div and conq, Greey, Dynamic etc
        Format:
            Recursive case
            Base Case
            if (base case satisfied)
                return value
            else
                recursion(param)

        Internal works:
        -------------------
        -- To be reviewed

        - All recursive solutions can be iterative as well, depends on the problem + efficiency
        - Use recursion when
            -> Problems can be broken down into sub problems
            -> When we can compromise time and space
            -> Avoid recursion when working on embedded system i.e Airbag software since
            time is crucial
            -> Recursion = quick and dirty solution (factorial, fibonacci)
            -> Data structure implemented using Recursion = Stack, Tree, Sorting, Searching
            Divide and Conquer, Dynamic programming (breakdown prob into smaller chunks, save
            the answer and use that answer for bigger problems)
        */

    }
    public int factorial (int n) {
        if (n == 0) {
            return 1;
        }
        return ( n * factorial(n-1));
    }

    // n always greater than 1
    public int fibonacci(int n) {
        if (n<1) {
            System.out.println("Need to enter num greater than 1");
            return 0;
        } else if (n == 1 || n == 2) {
            return n-1;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }


}
