package com.lwl.patterns.Builder;

import android.util.Log;

/**
 * Created by jonn on 2016/1/14.
 */
public class Test {

     public static void main(String [] args){
         //构建器
          Builder builder = new MacbookBuilder();
          Director director = new Director(builder);
          director.construct("英特尔主板","Retina显示器");
          System.out.println("info:"+builder.create());
      //  Log.e("单元测试",builder.create()+"");
     }


}
