package test;

import static org.junit.Assert.*;
import java.io.*;
import org.junit.Test;

/** Class automatically generated by YETI **/
public class YetiTestA {

   /** Test case automatically generated by YETI **/
   @Test public void test_1() throws Exception {
      example.A v0=new example.A(); // time:1355218640404
      v0.useC();
      /**BUG FOUND: RUNTIME EXCEPTION**/ // time:1355218640405
      /**YETI EXCEPTION - START 
      java.lang.NullPointerException
      	at example.A.useC(A.java:24)
      YETI EXCEPTION - END**/ 
      /** original locs: 3 minimal locs: 2**/
   
   }


/** Non-Unique bugs: 243, Unique Bugs: 1, Logs size (locs): 6952**/

}