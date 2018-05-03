package net.cat.App2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("test branch");
        if(args!=null){
        	if(args.length==0){
            	System.out.println("Hello World!");        		
        	}else{
            	for(String s:args){
            		System.out.println(s);
            	}	
        	}
        }else{
        	System.out.println("args!=null");
        }
    }
}
