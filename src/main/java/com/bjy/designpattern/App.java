package com.bjy.designpattern;

import com.bjy.designpattern.adaperpattern.Adaptee;
import com.bjy.designpattern.adaperpattern.Adapter;
import com.bjy.designpattern.adaperpattern.Adapter2;
import com.bjy.designpattern.adaperpattern.Target;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//类适配器模式
        Target target=new Adapter();
        target.request();
        
        //对象适配器模式
        Target target2=new Adapter2(new Adaptee());
        target2.request();
    }
}
