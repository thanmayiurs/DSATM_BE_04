package com.thanmayi.interfaceexample;

public class InterfaceDemo {
    public static void main(String[] args) {
        
        ChildInterface obj = new ExtendingChildInterface();
        
        obj.print();
        obj.show();
    }
}