# src.main.java.ParenSymmetry
balance is found except when it's not

The strings in this array are NOT balanced

`String[] falseStrings = {"(", "((", ")", "", "(()())((())))"};`

The Strings in this array are balanced

`String[] trueStrings = {"()", "(())", "(((())))", "", "(()())((()))", "(   )", "( () ( ) )"};`

Notice: it is okay to have spaces in the string. It is _also okay to have any other character in the string._

And that means `()grand()illusion` should be __true__
And `(((add (5 6)) )&^$$%^$` should be __false__

Write two methods:
- Write a method `isBalanced` that takes a string, and produces true if balanced, false otherwise. 
The method signature should be: `public boolean isBalanced(String stringToTest);`
- Write another method `checkFile` that use the first to check a file of paren strings producing a true or false for each line in the file. 
- It should look like `public void checkFile(String filename);`

And use either `TestStrings0.txt` and/or `TestStrings1.txt` to test your work.
The results of running agains the `TestStrings0.txt` file should be
__true, false, true, false, true, false, true__