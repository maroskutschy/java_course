package com.ness;

import com.sun.xml.internal.ws.util.StringUtils;

public class Main102 {

    public static void main(String[] args) {
        StringUtilities utils = new StringUtilities();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 10) {
            utils.addChar(sb, 'a');
        }
        System.out.println(sb);

        String str = "abcdefg";
        String result = utils.upperPrefix(utils.addSuffix(str));

    }

}
