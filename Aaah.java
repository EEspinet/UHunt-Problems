/*
 * Created by:
 * Enrique F. Espinet
 * Copyright @2018
 */
package aaah;

import java.util.*;

/**
 * Kattis
 *  AAAh!
 * @author Enrique
 */
public class Aaah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String firstWord = in.next();
        String secondWord = in.next();
        
        if(firstWord.length() >= secondWord.length())
        {
            System.out.println("go");
        }
        else
        {
            System.out.println("no");
        }
    }
    
}
