package com.programmers.exhaustiveSearch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.shutdownNow();

    }


}
