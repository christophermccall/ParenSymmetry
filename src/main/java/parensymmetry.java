package src.main.java;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class parensymmetry {

    public Boolean isBalanced(String s) {
        // implement this method
        int openCount = 0;
        int closedCount = 0;
        char[] parens = s.toCharArray();
        for (char paren : parens) {

            if (paren == '(') {
                openCount += 1;
            } else if (paren == ')') {
                closedCount += 1;
            }
        }
          if(openCount==closedCount){
            return true;

        } else {

            return false;
        }
    }


    public void checkFile(String filename) {
        // open file named filename
        try {

            Scanner reader = new Scanner(new File(filename));
            // for each line in the file
            while (reader.hasNextLine()) {
                // read the line
                System.out.println(isBalanced(reader.nextLine()));

            }
            // print whether or not the line's parenthesis are balanced

            // CLOSE the file
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }


    }

    public static void main(String[] args) {
        parensymmetry ps = new parensymmetry();


        Boolean b0 = ps.isBalanced("()");
        printResult(b0, true);

        String[] falseStrings = {"(", "((", ")","", "(()())((())))"};
        Boolean falses = true;
        for (String strToTest : falseStrings) {
            falses = ps.isBalanced(strToTest);
        }
        printResult(falses, false);

        String[] trueStrings = {"()", "(())", "(((())))" ,"", "(()())((()))", "(   )", "( () ( ) )"};
        Boolean trues = false;
        for (String strToTest : trueStrings) {
            trues = ps.isBalanced(strToTest);
        }
        printResult(trues, true);

        ps.checkFile("TestStrings0.txt");
    }

    private static void printResult(Boolean b0, boolean b) {
        if (b0 == null) {
            System.out.println("Null Failure");
            return;
        }
        if (b0 == b) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }

}
