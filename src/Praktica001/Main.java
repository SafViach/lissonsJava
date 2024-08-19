package Praktica001;

import Praktica001.model.Person;
import Praktica001.model.PersonList;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       String str1 = "hello";
       String srt2 = " hello";
       String str3 = "                                                hello ";
        String str4 = "                                                Hello ";


       String regex = " *[hH]ello *";
        System.out.println(str1.matches(regex));
        System.out.println(srt2.matches(regex));
        System.out.println(str3.matches(regex));
        System.out.println(str4.matches(regex));

    }
}
