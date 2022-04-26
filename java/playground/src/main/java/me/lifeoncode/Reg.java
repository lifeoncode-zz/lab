package me.lifeoncode;

import java.util.regex.Pattern;

public class Reg {
    public static void main(String[] args) {
        String regex = "^[a-z 0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        String s = "forward5";
        System.out.println(pattern.matcher(s).matches());
    }
}
