package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static int solution1(int numSteps){

        return 0;
    }

    public static List<String> solution2(int numParenthesis){
        List<String> cases = new ArrayList<>();
        char[] str = new char[2 * numParenthesis];

        if (numParenthesis > 0) calcParenthesisCase(cases, str,  0, numParenthesis, 0, 0);
        return cases;
    }

    public static void calcParenthesisCase(List<String> cases, char str[], int pos, int n, int open, int close){
        if(close == n)
        {
            // print the possible combinations
            cases.add(new String(str));
            return;
        }
        else
        {
            if(open > close) {
                str[pos] = '}';
                calcParenthesisCase(cases, str, pos+1, n, open, close+1);
            }
            if(open < n) {
                str[pos] = '{';
                calcParenthesisCase(cases, str, pos+1, n, open+1, close);
            }
        }
    }

    public static void main(String[] args) {
	    int answer1 = solution1(3);
        List<String> answer2 = solution2(3);

        System.out.println("Answer for solution 1: " + answer1);
        System.out.println("Answer for solution 2: " + answer2);
    }
}
