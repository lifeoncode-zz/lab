//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String args[] ) throws Exception {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//        Scanner sc = new Scanner(System.in);
//        String sub = sc.nextLine();
//        int n = Integer.parseInt(sub);
//        for(int i=0;i<n;i++){
//            String[] temp = sc.nextLine().split(" ");
//            Mobile mobile = new Mobile.MobileBuilder(temp[0], temp[1])
//                    .setTouchScreenAvailable(Boolean.parseBoolean(temp[2]))
//                    .setEnabled5G(Boolean.parseBoolean(temp[3]))
//                    .setRam(Integer.parseInt(temp[4]))
//                    .setCameraPixel(Integer.parseInt(temp[5])).build();
//            mobile.printDetails();
//        }
//    }
//}