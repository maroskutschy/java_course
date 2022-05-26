package com.ness;

import java.util.Locale;

public class StringUtilities {

    private StringBuilder sBuilder = new StringBuilder();
    private  int charAdded = 0;

    public  void  addChar(StringBuilder sBuilder, char c) {
        sBuilder.append(c);
        charAdded++;
    }

    public String upperPrefix(String str) {
       String upper = str.toUpperCase();
       return "Prefix_" + upper;
    }

    public String addSuffix(String str) {
        return str + "_Suffix";
    }
}
