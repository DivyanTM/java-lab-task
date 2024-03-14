import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public boolean checkAnagram(String s1,String s2){
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(c1.length!=c2.length){
            return false;
        }
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        Anagram agrm=new Anagram();
        System.out.println(agrm.checkAnagram(s1,s2));
    }
}
