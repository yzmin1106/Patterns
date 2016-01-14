package com.lwl.patterns.Builder;

/**
 * Created by jonn on 2016/1/14.
 * 产品角色
 */
public abstract class Computer {
    protected  String mBoard;
    protected String mDisplay;
    protected String mOS;

    public Computer() {
    }

    public String getmBoard() {
        return mBoard;
    }

    /**
     * 设置CPU核心数
     * @param mBoard
     */
    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }


    /**
     * 设置内存
     * @param mDisplay
     */
    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }



    /**
     * 设置操作系统
     * @return
     */
    public abstract void setmOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
