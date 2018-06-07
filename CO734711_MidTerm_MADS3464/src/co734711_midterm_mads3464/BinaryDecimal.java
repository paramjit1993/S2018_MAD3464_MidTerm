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
class BinaryDecimal {
    public static int binaryToDecimal(String input) {
        Long binary =  Long.valueOf(input).longValue();
        int decimalNumber = 0, i = 0;
        long remainder;
        while (binary != 0)
        {
            remainder = binary % 10;
            binary /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
    
}
