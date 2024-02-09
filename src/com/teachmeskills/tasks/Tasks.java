package com.teachmeskills.tasks;

/*
The class contains methods for solving assigned problems.

The first method solves the problem of displaying the first two blocks of 4 digits on the screen in one line.

The second method solves the problem of displaying the document number on the screen, but blocks of three letters are replaced with ***

The third method solves the problem of displaying only one letter from the document number in the format yyy/yyy/y/y in lowercase.

The fourth method solves the problem of displaying letters from the document number in the format "Letters:yyy/yyy/y/y" in upper case (implementation using the StringBuilder class)

The fifth method checks whether the document number contains the sequence "abc" and whether the message contains or not in any case

The sixth method checks whether the document number begins with the sequence 555.

The seventh method checks whether the document number ends with the sequence 1a2b.

The eighth method finds the longest word in the line, and if there are several of them, it prints the last one.

The ninth method doubles the letters in a string and prints the resulting string.
 */
public class Tasks {
    //String str = "1574-fGa-9670-RVc-8d2Q";
    public static StringBuilder solveTheFirstTask(String s)
    {
        StringBuilder str = new StringBuilder();
        str.append("Первые два блока с цифрами в исходной строке имеют вид: ");
        str.append(s.substring(0,4) + " ");
        str.append(s.substring(9, 13));
        return str;
    }

    public static String solveTheSecondTask(String s)
    {
        return s.substring(0, 5) + "***" + s.substring(8,14) + "***" + s.substring(17, s.length());
    }

    public static String solveTheThirdTask(String s)
    {
        s = s.toLowerCase();
        return s.substring(5, 8) + "/" + s.substring(14,17) + "/" + s.charAt(19) + "/" + s.charAt(21);
    }

    public static StringBuilder solveTheFourthTask(String s)
    {
        s = s.toUpperCase();
        StringBuilder str = new StringBuilder();
        str.append("Letters:");
        str.append(s.substring(5, 8));
        str.append("/");
        str.append(s.substring(14,17));
        str.append("/");
        str.append(s.charAt(19));
        str.append("/");
        str.append(s.charAt(21));
        return str;
    }

    public static void solveTheFifthTask(String s)
    {
        if(s.toUpperCase().contains("ABC")) System.out.println("Строка содержит последовательность ABC");
        else System.out.println("Строка не содержит последовательность ABC");
    }

    public static void solveTheSixthTask(String s)
    {
        if(s.startsWith("555")) System.out.println("Строка начинается с последовательности 555");
        else System.out.println("Строка не начинается с последовательности 555");
    }

    public static void solveTheSeventhTask(String s)
    {
        if(s.endsWith("1a2b")) System.out.println("Строка заканчивается на последовательность 1a2b");
        else System.out.println("Строка не заканчивается на последовательность 1a2b");
    }

    public static String solveTheEighthTask(String s)
    {
        String[] str = s.split(" ");
        int maxLength = 0;
        int maxInd = 0;
        for (int i = 0; i < str.length; i++)
        {
            if(str[i].length() >= maxLength) {
                maxLength = str[i].length();
                maxInd = i;
            }
        }
        return str[maxInd];
    }
    public static String solveTheNinthTask(String s)
    {
        String[] letter = s.split("");
        String[] str = new String[2*s.length()];

        for(int i = 0; i < s.length(); i++)
        {
            str[2*i] = letter[i];
            str[2*i + 1] = letter[i];
        }

        StringBuilder sMod = new StringBuilder();
        for (String string : str) sMod.append(string);

        return sMod.toString();
    }
}
