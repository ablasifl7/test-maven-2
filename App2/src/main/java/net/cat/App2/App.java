package net.cat.App2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        if(args!=null){
        	for(String s:args){
        		System.out.println(s);
        	}
        }
    }
}
