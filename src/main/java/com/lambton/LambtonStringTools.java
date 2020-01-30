/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import com.sun.jndi.toolkit.ctx.AtomicContext;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        String orginalString=s;
        for (int i = 0; i < orginalString.length(); i++)
        {
            System.out.println(orginalString/*[i]*/);
        }
        String reverseStrings[]=new String[orginalString.length()];
        String[] rstr;
        rstr=new String[10];
        for(int i=0;i<orginalString.length();i++)
        {
            String rev = reverseStrings(orginalString/*[i]*/);
            reverseStrings[i]=rev;
            rstr[i]=rev;
            System.out.println(new String(orginalString/*[i]*/)+rev);
        }
    }
    public static String reverseStrings(String s)
    {
        String temp=new String();
        char names[]=s.toCharArray();
        int len=names.length;
        for(int i=0,j=len-1;i<len/2;i++,j--)
        {
            char t=names[i];
            names[i]=names[j];
            names[j]=t;
        }
        temp=new String(names);
        return temp;
    }
}
        //return null;


    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {
        String fullName=s;
        int len=fullName.length();

        return null;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
        String binaryNumber=s;
        int decimal=0;
        int len=binaryNumber.length();
        for(int i=0,;i<len/2;i++,i++)
        {
            int temp = binaryNumber%10;
            decimal += temp*2;
            binaryNumber = binaryNumber/10;
        }
        }

        /*for(int i=0;i<binaryNumber.length();i++){

        }*/
      // return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        return null;
    }
}
