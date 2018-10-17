package com;
/*
* Задание 1.
* Строка содержит скобки открывающиеся и закрывающиеся, она является нормализованной если
   скобки открываются и закрываются в правильном порядке

   Пример:
   g{fsdfg}s - true
   g{f(sd)fg}s - true
   {g{fsdfg}s - false
   {{[cc(c)ggg]}ssss} - true
   {{[cc(c)ggg]}ssss}{ - false
* */

import java.util.Stack;

/**
 * The <code>Checker</code> class provides methods <tt>checkParenthesesOrder</tt>
 * that is checking string for normal order of parentheses
 * and <tt>removeAllCharactersExceptParentheses<tt/>
 * that removes all characters except parentheses.
 *
 * @author Anton Tsurkanu
 * */
public class Checker {

    /**
     * Checking string for normal order of parentheses.
     *
     * @param stringForChecking string that should be checked.
     * @return <code>true</code> if <code>stringForChecking</code> parentheses are in normalized order;
     *         <code>false</code> otherwise.
     *
     * */
    public boolean checkParenthesesOrder(String stringForChecking) {
        if (stringForChecking == null) {
            System.out.println("String is null.");
            return false;
        }

        if (stringForChecking.isEmpty()){
            System.out.println("String is empty.");
            return false;
        }

        String stringWithParenthesesOnly = removeAllCharactersExceptParentheses(stringForChecking);

        if (stringWithParenthesesOnly.isEmpty()){
            System.out.println("String contains no parenthesis.");
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char someBracket : stringWithParenthesesOnly.toCharArray()
        ) {
            if (someBracket == '{' || someBracket == '(' || someBracket == '[') {
                stack.push(someBracket);
                continue;
            }

            if (someBracket == '}' || someBracket == ')' || someBracket == ']') {
                if (stack.isEmpty())
                    return false;

                char lastCharFromStack = stack.peek();
                if ((someBracket == '}' && lastCharFromStack == '{')
                        || (someBracket == ')' && lastCharFromStack == '(')
                        || (someBracket == ']' && lastCharFromStack == '['))
                    stack.pop();
                else
                    return false;
            }
        }

        return stack.isEmpty();
    }

    /**
     * Remove all characters from given string except parentheses.
     *
     * @param stringWithAnyCharacters string from which only parentheses should be taken.
     * @return <code>String</code> with parentheses only or empty.
     * */
    private String removeAllCharactersExceptParentheses(String stringWithAnyCharacters) {
        String stringWithParenthesesOnly;

        stringWithParenthesesOnly = stringWithAnyCharacters.replaceAll("[^(){}\\]\\[]+", "");

        return stringWithParenthesesOnly;
    }
}

