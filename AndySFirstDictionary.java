/*
 * Created by:
 * Enrique F. Espinet
 * Copyright @2018
 */
package andy.s.first.dictionary;

import java.util.*;

/**
 *Andys First Dictionary
 * UVA 10815
 */
public class AndySFirstDictionary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        TreeSet ts = new TreeSet();
        
        while(in.hasNext())
        {
            String word = "";
            word = in.next();
            
            if(ts.contains(word))
            {
                //Do Nothing
            }
            else
            {
                ts.add(word);
            }
        }
        Iterator itr = ts.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    
}
