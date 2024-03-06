package src.main.java;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParenSymmetry {

    private Boolean isBalanced(String s) {
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
        if (openCount % 2 != 0 || closedCount % 2 != 0) {
            return false;

        } else {
            return true;
        }
    }


    private void checkFile(String filename) {
        // open file named filename
        try {
            File file = new File(filename);
            Scanner reader = new Scanner(file);
            String data = "";
            // for each line in the file
            while (reader.hasNextLine()) {
                // read the line
                data = reader.nextLine();
            }
            // print whether or not the line's parenthesis are balanced
            System.out.println(isBalanced(data));
            // CLOSE the file
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }

    }

    public static void main(String[] args) {
        ParenSymmetry ps = new ParenSymmetry();

        Boolean b0 = ps.isBalanced("()");
        printResult(b0, true);

        String[] falseStrings = {"(", "((", ")", "", "(()())((())))"};
        Boolean falses = true;
        for (String strToTest : falseStrings) {
            falses = ps.isBalanced(strToTest);
        }
        printResult(falses, false);

        String[] trueStrings = {"()", "(())", "(((())))", "", "(()())((()))", "(   )", "( () ( ) )"};
        Boolean trues = false;
        for (String strToTest : trueStrings) {
            trues = ps.isBalanced(strToTest);
        }
        printResult(trues, true);

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
