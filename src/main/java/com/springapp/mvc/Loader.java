package com.springapp.mvc;

/**
 * Created by Administrator on 2016/7/20.
 */
public class Loader extends ClassLoader {

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }
}
