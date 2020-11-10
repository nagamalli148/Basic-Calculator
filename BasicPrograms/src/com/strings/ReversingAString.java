/*The program buffers the input String using StringBuffer(String string) method,
 *reverse the buffer and then converts the buffer into a String
 *with the help of toString() method.
 */
package com.strings;

public class ReversingAString {

		public static void main(String[] args) {
		      String str = "abcdef";
		      
		      String reverse = new StringBuffer(str).reverse().toString();
		      
		      System.out.println("String before reverse: "+str);
		      System.out.println("String after reverse: "+reverse);
		}
}
