package com.learning.designPatterns;

import com.learning.singleton.SingleObject;

public class SingleTonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
