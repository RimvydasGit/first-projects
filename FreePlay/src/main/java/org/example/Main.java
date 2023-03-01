package org.example;



public class Main {
    public static void main(String[] args) {
       System.out.println(stringMatch("xxHxix"));


    }


    public static String stringMatch(String str) {
      String a = "";
      if (str.charAt(0) == 'x') {
          a = a + 'x'; }
      else a = a + str.charAt(0);
      if (str.length() > 1){
          str = str.substring(1,str.length());

      for(int i = 0; i < str.length(); i++) {
          if (str.charAt(i) == 'x') {
              continue;
          } else {
              a = a + str.charAt(i);
          }
      }
      if (str.charAt(str.length()-1) == 'x') a = a + str.charAt(str.length()-1) ;}
      return a;
    }


}