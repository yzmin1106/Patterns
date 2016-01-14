package com.lwl.patterns.Builder;

/**
 * Created by jonn on 2016/1/14.
 * 具体产品
 */
public class Macbook extends  Computer {

    protected Macbook()
    {

    }

    @Override
    public void setmOS() {
        mOS = "Mac OS X 10.10";
    }
}
