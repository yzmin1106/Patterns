package com.lwl.patterns.Builder;

/**
 * Created by jonn on 2016/1/14.
 */
public class MacbookBuilder extends Builder {
    private Computer mComputer = new Macbook();
    @Override
    public void buildBoard(String board) {

        mComputer.setmBoard(board);
    }

    @Override
    public void buildDisplay(String display) {

        mComputer.setmDisplay(display);
    }

    @Override
    public void buildOS() {

        mComputer.setmOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
