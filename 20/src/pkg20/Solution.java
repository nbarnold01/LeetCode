/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20;

/**
 *
 * @author nathanarnold
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 *
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 */
public class Solution {

    private boolean isMateForBracket(char currentBracket, char nextBracket) {

        return (currentBracket == '[' && nextBracket == ']')
                || (currentBracket == '(' && nextBracket == ')')
                || (currentBracket == '{' && nextBracket == '}');

    }

    public boolean isValid(String s) {

        //Make sure the character count is correct
        if (s.length() % 2 == 0) {

            String condensedString = new String();

            int currentIndex = 0;

            int length = s.length();

            while (currentIndex < length) {

                char currentChar = s.charAt(currentIndex);
//At the end of the string
                if (currentIndex == length - 1) {

                    condensedString += currentChar;
                    currentIndex++;

                } else {

                    char nextChar = s.charAt(currentIndex + 1);

                    if (!isMateForBracket(currentChar, nextChar)) {

                        condensedString += currentChar;
                        currentIndex++;

                    } else {

                        //skip this and the next
                        currentIndex += 2;
                    }

                }

            }

            if (condensedString.length() > 0) {

                System.out.println(condensedString + "\n");

                if (condensedString.length() == s.length()) {
                    //malformed expression. Throw it out.
                    return false;

                }
                return isValid(condensedString);

            } else {

                return true;
            }

        }

        return false;

    }
}
