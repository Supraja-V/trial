/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Supraja V
 */
public class owels {
    public static void main(String[] args) throws Exception{
        String[] vow = {"a","e","i","o","u"};
        int count = 0;
        String s = "aaaaeeeeaaaaghijkl";
        String[] arr = s.split("");
        int charC = 0;
        for(String ch : arr){
            char charac = ch.charAt(0);
            System.out.println((int)charac);
            int z = (int)charac;
            if(((z>=65)&&(z<=90))||((z>=97)&&(z<=122))){charC+=1;
            System.out.println(charC);}
            for(String c : vow){
                if(ch.equals(c)){
                    count+=1;
                }
                
            }
        }
        System.out.println(charC);
        System.out.println(count);
    }
}
