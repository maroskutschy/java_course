package com.ness;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main104 {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeesbcDtttR3331312132";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeesbcDtttabcDeee13331312132";

        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        // beginning
        System.out.println(alphanumeric.matches("^abcDeeesbcDttt13331312132"));

        //end
        System.out.println(alphanumeric.replaceAll("312132$", "END"));

        // all characters in brackets (treated separately not as a string)
        System.out.println(alphanumeric.replaceAll("[aet]", "X"));

        // all characters in brackets (treated separately not as a string) followed by another character
        System.out.println(alphanumeric.replaceAll("[aet][R]]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry]", "Harry"));

        // everything except e will replace [karet = ^]
        String newAplhanumeric = "abcDeeesbcDtttR3331312132";
        System.out.println(newAplhanumeric.replaceAll("[^e]", "X"));

        // all characters in brackets (treated separately not as a string) - case sensitive
        System.out.println(newAplhanumeric.replaceAll("[abcdef345678]", "X"));

        // all characters in brackets (treated separately not as a string) - Range - case sensitive
        System.out.println(newAplhanumeric.replaceAll("[a-f3-8]", "X"));

        // all characters in brackets (treated separately not as a string) - Range - case InSensitive
        System.out.println(newAplhanumeric.replaceAll("[a-fA-F3-8]", "X"));

        // all characters in brackets (treated separately not as a string) - Range - Also case InSensitive
        System.out.println(newAplhanumeric.replaceAll("(?i)[a-f3-8]", "X"));

        // all numbers - replaced
        System.out.println(newAplhanumeric.replaceAll("[0-9]", "X"));

        // all numbers - replaced = ignored letters = escaped slash
        System.out.println(newAplhanumeric.replaceAll("\\d", "X"));

        // all numbers - replaced = ignored numbers = escaped slash
        System.out.println(newAplhanumeric.replaceAll("\\d", "X"));

        // removing spaces, tabs and new lines
        String space = "I have blanks and\ta tab, and also new line\ntest";
        System.out.println(space);
        System.out.println(space.replaceAll("\\s", ""));

        // replaces tab
        System.out.println(space.replaceAll("\\t", "X"));

        // replace not white space characeters (except spaces, tabs, new lines)
        System.out.println(space.replaceAll("\\s", ""));

        // replace numbers, letters, and backslash w (W opposite)
        System.out.println(newAplhanumeric.replaceAll("\\w", "X"));

        // surrounds words with replacement string
        System.out.println(space.replaceAll("\\b", "X"));

        //String alphanumeric2 = "abcDeeesbcDtttR3331312132";
        String alphanumeric2 = "abcDsbcDtttR3331312132";
        System.out.println(alphanumeric2.replaceAll("^abcDeee", "YYY"));

        // quantifiers - concrete number of 'e'
        System.out.println(alphanumeric2.replaceAll("^abcDe{3}", "YYY"));

        // quantifiers - any number of 'e'
        System.out.println(alphanumeric2.replaceAll("^abcDe+", "YYY"));

        // quantifiers - anything after character before character before *
        System.out.println(alphanumeric2.replaceAll("^abcDe*", "YYY"));

        // quantifiers - range of number of 'e'
        System.out.println(alphanumeric2.replaceAll("^abcDe{2,5}", "YYY"));

        // quantifiers -replace any ocurencies of h followed by i and then any number of j
        System.out.println(alphanumeric2.replaceAll("h+i*j", "YYY"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        // anything before and after
        String h2Pattern = ".*<h2>.*";
        // Group: ()
        //String h2Pattern = "(<h2>)";
        Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        // quantifiers - anything after character before character before *
        System.out.println(alphanumeric2.replaceAll("^abcDe*", "YYY"));

        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurence " + count + " : " + matcher.start() +  " to " + matcher.end() );
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurence: " + h2TextMatcher.group(0));
        }


        // Groups
        // group 0 is the entire pattern

        // greedy quantifier = * = 'Greedy' means match longest possible string.
        // lazy quantifier = ? = 'Lazy' means match shortest possible string.
        // https://stackoverflow.com/questions/2301285/what-do-lazy-and-greedy-mean-in-the-context-of-regular-expressions

//        Example:
//        test string : stackoverflow
//        greedy reg expression : s.*o output: stackoverflow
//        lazy reg expression : s.*?o output: stackoverflow


    }



}
