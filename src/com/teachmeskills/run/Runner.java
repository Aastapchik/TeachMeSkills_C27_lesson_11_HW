package com.teachmeskills.run;

/*
The class is necessary to test the execution of methods
 */

public class Runner {

    public static void main(String[] args) {

        String str = "5554-aBc-9670-RVc-1a2b";
        System.out.println(Tasks.solveTheFirstTask(str));
        System.out.println(Tasks.solveTheSecondTask(str));
        System.out.println(Tasks.solveTheThirdTask(str));
        System.out.println(Tasks.solveTheFourthTask(str));
        Tasks.solveTheFifthTask(str);
        Tasks.solveTheSixthTask(str);
        Tasks.solveTheSeventhTask(str);

        String words = "Artyom Andrew car build Java Mouse Phone Clock";
        System.out.println(Tasks.solveTheEighthTask(words));

        String s = "Hello";
        System.out.println(Tasks.solveTheNinthTask(s));

    }
}
