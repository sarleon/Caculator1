package com.sarleon.myapplication;

import java.util.ArrayList;

/**
 * Created by root on 16-3-8.
 */
public class OutputList<Character> extends ArrayList<Character> {
    @Override
    public String toString() {
        StringBuffer result=new StringBuffer("");
        for (int i=0;i<this.size();i++) {
            result.append(this.get(i));
        }
        return String.valueOf(result);
    }
}
