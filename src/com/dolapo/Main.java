package com.dolapo;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ConfigParser newTest = new ConfigParser("staging");
        newTest.ReadConfigWithNIO();
    }
}
