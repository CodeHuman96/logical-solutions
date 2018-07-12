package practice_0607;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author test
 */
public class enumeration {
    public static void main(String[] args){
        Vector<Integer> vec=new Vector<>();
        vec.add(10);
        vec.add(19);
        vec.add(17);
        vec.add(28);
        vec.add(32);
        vec.add(41);
        Enumeration em=vec.elements();
        while(em.hasMoreElements()){
            Object t=em.nextElement();
            int i=(Integer) t;
            if(i%2==0)
                System.out.println(t);
        }
        
    }
}
