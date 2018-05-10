package net.cat.App2;

import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    final String[] W = {"adeu siau mon","Hi mon com estas","com estas mon","adeusiau a tothom"};
    String s = "mon";
    TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
    for(int i=0 ; i <  W.length;i++){
    	int n = W[i].indexOf(s);
    	if(-1 != n){
    		tm.put(n, i);
    	}
    }
    System.out.println(tm.get( tm.firstKey()));
    
    }
}
