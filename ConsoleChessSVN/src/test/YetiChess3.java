package test;

import static org.junit.Assert.*;
import java.io.*;
import org.junit.Test;

/** Class automatically generated by YETI **/
public class YetiChess3 {

   /** Test case automatically generated by YETI **/
   @Test public void test_1() throws Exception {
      run.Main v76=new run.Main();
      /**BUG FOUND: RUNTIME EXCEPTION**/ // time:1355223889291
      /**YETI EXCEPTION - START 
      java.lang.NullPointerException
      	at run.Main.printBoard(Main.java:145)
      	at run.Main.<init>(Main.java:20)
      YETI EXCEPTION - END**/ 
      /** original locs: 77 minimal locs: 1**/
   
   }


   /** Test case automatically generated by YETI **/
   @Test public void test_2() throws Exception {
      int v1694=run.Main.getAlphaConversion((java.lang.String)null);
      /**BUG FOUND: RUNTIME EXCEPTION**/ // time:1355223890359
      /**YETI EXCEPTION - START 
      java.lang.NullPointerException
      	at run.Main.getAlphaConversion(Main.java:74)
      YETI EXCEPTION - END**/ 
      /** original locs: 1933 minimal locs: 1**/
   
   }


   /** Test case automatically generated by YETI **/
   @Test public void test_3() throws Exception {
      material.Square v1165=new material.Square((java.util.List)null);
      /**BUG FOUND: RUNTIME EXCEPTION**/ // time:1355223889856
      /**YETI EXCEPTION - START 
      java.lang.NullPointerException
      	at material.Square.<init>(Square.java:16)
      YETI EXCEPTION - END**/ 
      /** original locs: 1349 minimal locs: 1**/
   
   }


   /** Test case automatically generated by YETI **/
   @Test public void test_4() throws Exception {
      yetihelper.Helper v4=new yetihelper.Helper(); // time:1355223889267
      int v57=-2; // time:1355223889283
      java.lang.Integer v101=v4.dummyInteger((int)v57); // time:1355223889355
      material.Square v327=new material.Square((java.lang.Integer)v101,(java.lang.Integer)v101); // time:1355223889486
      material.Board v591=new material.Board(); // time:1355223889607
      java.lang.Integer v716=v327.getCol(); // time:1355223889643
      material.Square v795=new material.Square((java.lang.Integer)v716,(java.lang.Integer)null); // time:1355223889674
      material.Piece v796=v591.getSquare((material.Square)v795);
      /**BUG FOUND: RUNTIME EXCEPTION**/ // time:1355223889675
      /**YETI EXCEPTION - START 
      java.lang.NullPointerException
      	at material.Square.hashCode(Square.java:49)
      	at java.util.HashMap.get(Unknown Source)
      	at material.Board.getSquare(Board.java:64)
      YETI EXCEPTION - END**/ 
      /** original locs: 926 minimal locs: 8**/
   
   }


   /** Test case automatically generated by YETI **/
   @Test public void test_5() throws Exception {
      yetihelper.Helper v4=new yetihelper.Helper(); // time:1355223889267
      int v57=-2; // time:1355223889283
      java.lang.Integer v101=v4.dummyInteger((int)v57); // time:1355223889355
      material.Square v102=new material.Square((java.lang.Integer)v101,(java.lang.Integer)v101); // time:1355223889356
      java.lang.Integer v877=v102.getCol(); // time:1355223889723
      material.Square v1052=new material.Square((java.lang.Integer)v877,(java.lang.Integer)null); // time:1355223889802
      int v5087=v1052.hashCode();
      /**BUG FOUND: RUNTIME EXCEPTION**/ // time:1355223911334
      /**YETI EXCEPTION - START 
      java.lang.NullPointerException
      	at material.Square.hashCode(Square.java:49)
      YETI EXCEPTION - END**/ 
      /** original locs: 5954 minimal locs: 7**/
   
   }


/** Non-Unique bugs: 160, Unique Bugs: 5, Logs size (locs): 6326**/

}