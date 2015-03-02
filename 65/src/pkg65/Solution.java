/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg65;

import java.util.ArrayList;

/**
 *
 * @author nathanarnold
 */
/**
 * Validate if a given string is numeric.
 *
 * Some examples: "0" => true " 0.1 " => true "abc" => false "1 a" => false
 * "2e10" => true
 *
 * Note: It is intended for the problem statement to be ambiguous. You should
 * gather all requirements up front before implementing one.
 *
 */
public class Solution {

    private boolean hasHexPrefix(char[] chars) {
        return (chars.length > 2 && chars[0] == '0' && chars[1] == 'x');
    }

    private boolean isHexLetter(char c) {

        char[] hexLetters = new char[]{'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F'};

        for (char letter : hexLetters) {
            if (c == letter) {
                return true;
            }
        }

        return false;
    }

    public boolean isNumber(String s) {
        //trim white space
        s = s.trim();

        //trim negative symbol
        if (s.startsWith("-") || s.startsWith("+")) {
            int length = s.length();
            s = s.substring(1, length);
        }

        int length = s.length();
        int counter = 0;
        char[] ch = s.toCharArray();

        boolean isValid = length > 0;

        boolean hasPreviousDecimal = false;
        boolean hasPreviousLetters = false;

        boolean isHex = this.hasHexPrefix(ch);

        if (isHex) {
            //it can only be a hex digit, move the counter forward
            counter = 2;
        }

        //used to check validity of alpha characters
//        char[] previousLetters = new char[ch.length];
//        ArrayList previousLetters = new ArrayList<char>;
        boolean hasPreviousE = false;

        while (counter < length && isValid) {

            char currentChar = ch[counter];

            if (!Character.isDigit(currentChar)) {

                if (currentChar == '.') {

                    if (hasPreviousDecimal || isHex || hasPreviousE) {

                        isValid = false;

                    } else if (length == 1) {

                        isValid = false;

                    } else {
                        //too many decimals
                        hasPreviousDecimal = true;
                    }

                    if (counter < length - 1) {

                        char nextChar = ch[counter + 1];

                        if (!Character.isDigit(nextChar)) {
                            //handles 46.e3
                            if (counter <= length - 3) {
                                
                                if (nextChar == 'e') {
                                    
                                    if (!Character.isDigit(ch[counter + 2]) &&( ch[counter + 2]!='+' && ch[counter + 2]!='-')) {
                                        
                                        isValid = false;
                                        
                                    }
                                    if (counter == 0){
                                        
                                        isValid = false;
                                    }
                                }


                            } else {
                                isValid = false;

                            }
                        }
                    }
                 
                } else {
                    //Alpha character

                    if (currentChar == ' ') {

                        isValid = false;

                    } else if (isHex) {

                        if (!isHexLetter(currentChar)) {
                            isValid = false;
                        }

                    } else if (currentChar == 'e') {

                        //possible exponent notation
                        if (counter == 0) {
                            isValid = false;
                        }

                        if (hasPreviousE) {
                            isValid = false;
                        }
                        if (length < 3) {
                            isValid = false;
                        }
                        if (counter >= length - 1) {
                            //test if e is last character
                            isValid = false;
                        } else if (counter < length - 1) {
                            if (ch[counter + 1] == '.') {
                                isValid = false;
                            } else if (ch[counter+1] == '+' || ch[counter+1] == '-') {
                                //skip the next character
                              counter +=1;  
                              if (counter == length -1) {
                                  
                                  isValid = false;
                              }
                            }

                        }

                        hasPreviousE = true;

                    } else {

                        isValid = false;
                    }
                }

            }

            counter++;

        }

        return isValid;

    }
}
