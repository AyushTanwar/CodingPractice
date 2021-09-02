import java.util.*;

public class Main {
    public static void main(String args[]) {
        ans("10000111");

    }
    public static void ans(String s) {
        
        int max = 1;
        int i = 1;
        Pair rv = new Pair(0,0);
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(i-1)){
                int initial = i; 
                  while(i<s.length() && s.charAt(i)==s.charAt(i-1)){
                     i++;
                  }  
                  if(i -initial  > max && i <= s.length()){
                      max = i - initial ;
                      rv = new Pair(initial-1,i-1);
                  }
            }else{
            i++;
            }
        }
        System.out.println(rv.first + " " + rv.second);
    }

    public static class Pair{
        int first = 0;
        int second = 0;
        Pair (int first,int second){
            this.first = first;
            this.second = second;
        }
    }
}
