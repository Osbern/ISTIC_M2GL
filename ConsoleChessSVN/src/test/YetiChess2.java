package test;

import static org.junit.Assert.*;
import java.io.*;
import org.junit.Test;

/** Class automatically generated by YETI **/
public class YetiChess2 {

   /** Test case automatically generated by YETI **/
   @Test public void test_1() throws Exception {
      material.Square v606=new material.Square((java.util.List)null);
      /**BUG FOUND: RUNTIME EXCEPTION**/ // time:1355223812254
      /**YETI EXCEPTION - START 
      java.lang.NullPointerException
      	at material.Square.<init>(Square.java:16)
      YETI EXCEPTION - END**/ 
      /** original locs: 690 minimal locs: 1**/
   
   }


   /** Test case automatically generated by YETI **/
   @Test public void test_2() throws Exception {
      yetihelper.Helper v0=new yetihelper.Helper(); // time:1355223811816
      int v66=0; // time:1355223811840
      java.lang.Integer v67=v0.dummyInteger((int)v66); // time:1355223811840
      material.Square v68=new material.Square((java.lang.Integer)v67,(java.lang.Integer)v67); // time:1355223811840
      java.lang.Integer v103=v68.getRow(); // time:1355223811853
      material.Square v168=new material.Square((java.lang.Integer)v103,(java.lang.Integer)v67); // time:1355223812019
      material.Board v197=new material.Board(); // time:1355223812027
      java.lang.Integer v208=v168.getCol(); // time:1355223812028
      material.Square v232=new material.Square((java.lang.Integer)v208,(java.lang.Integer)null); // time:1355223812033
      material.Piece v233=v197.getSquare((material.Square)v232);
      /**BUG FOUND: RUNTIME EXCEPTION**/ // time:1355223812034
      /**YETI EXCEPTION - START 
      java.lang.NullPointerException
      	at material.Square.hashCode(Square.java:49)
      	at java.util.HashMap.get(Unknown Source)
      	at material.Board.getSquare(Board.java:64)
      YETI EXCEPTION - END**/ 
      /** original locs: 235 minimal locs: 10**/
   
   }


   /** Test case automatically generated by YETI **/
   @Test public void test_3() throws Exception {
      yetihelper.Helper v0=new yetihelper.Helper(); // time:1355223811816
      int v66=0; // time:1355223811840
      java.lang.Integer v67=v0.dummyInteger((int)v66); // time:1355223811840
      material.Square v68=new material.Square((java.lang.Integer)v67,(java.lang.Integer)v67); // time:1355223811840
      java.lang.Integer v103=v68.getRow(); // time:1355223811853
      material.Square v168=new material.Square((java.lang.Integer)v103,(java.lang.Integer)v67); // time:1355223812019
      java.lang.Integer v208=v168.getCol(); // time:1355223812028
      material.Square v232=new material.Square((java.lang.Integer)v208,(java.lang.Integer)null); // time:1355223812033
      int v456=v232.hashCode();
      /**BUG FOUND: RUNTIME EXCEPTION**/ // time:1355223812208
      /**YETI EXCEPTION - START 
      java.lang.NullPointerException
      	at material.Square.hashCode(Square.java:49)
      YETI EXCEPTION - END**/ 
      /** original locs: 514 minimal locs: 9**/
   
   }


/** Non-Unique bugs: 135, Unique Bugs: 3, Logs size (locs): 6361**/

}