package com.ness;

// cannot have 2 imports
import javax.xml.soap.Node;
//import org.w3c.dom.Node;

public class Packages {

    public static void main(String[] args) {

        // one type of Node must have fully path for package
        Node node = null;
        org.w3c.dom.Node anotherNode = null;

        MyWIndow myWIndow = new MyWIndow("Java");
        myWIndow.setVisible(true);
    }

    // basic imports of the java language is automatic

    // awt = abstract window toolkit

}
