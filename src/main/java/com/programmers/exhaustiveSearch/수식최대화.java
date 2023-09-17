package com.programmers.exhaustiveSearch;

public class 수식최대화 {

    private static final String expression = "100-200*300-500+20";

    private static final String[][] precedences = {
            "+-*".split(""),
            "+*-".split(""),
            "-+*".split(""),
            "-*+".split(""),
            "*+-".split(""),
            "*-+".split("")
    };

    public static void main(String[] args) {



    }


}
