package com.lwl.patterns.Builder;

/**
 * Created by jonn on 2016/1/14.
 * Director类，负责构造Computer
 */
public class Director {

    Builder mBuilder = null;

    public Director(Builder mBuilder)
    {
        this.mBuilder = mBuilder;
    }

    public void construct(String board,String display)
    {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();

    }
}
