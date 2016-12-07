package jp.ac.uryukyu.ie.e165746;

/**
 * Created by e165746 on 2016/12/05.
 */
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.printf("%s\n", str.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionが発生した。\n" );
            e.printStackTrace();
        }
    }
}