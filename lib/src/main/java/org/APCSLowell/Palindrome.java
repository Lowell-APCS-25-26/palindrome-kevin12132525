package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return s.equals(reverse(s));
    }
    public String reverse(String s) {
        String n = new String();
        for(int i = s.length(); i >0; i--){
            n += s.substring(i-1,i);
        }
        return n;
    }
}
