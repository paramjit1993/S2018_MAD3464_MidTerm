/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co734711_midterm_mads3464;

/**
 *
 * @author macstudent
 */
public class CO734711_MidTerm_MADS3464 {
    
public static String reverseString(String str)
{
    StringBuilder strr = new StringBuilder (str);
    strr.reverse();
    return strr.toString();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(CO734711_MidTerm_MADS3464.reverseString("paramjit"));
       
    }
    
}
