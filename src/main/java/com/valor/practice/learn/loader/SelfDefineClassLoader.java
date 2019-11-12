package com.valor.practice.learn.loader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-06-04 18:28
 **/
public class SelfDefineClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classData = downloadClass(name);
        if (classData == null){
            super.findClass(name);
        }else {
            return defineClass(name,classData,0,classData.length);
        }
        return null;
    }

    private byte[] downloadClass(String name) {
        String path = ""+ File.separatorChar;
        try {
            URL url = new URL(path);
            InputStream ins = url.openStream();
            ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
            int bufferSize = 1024;
            byte[] buffer = new byte[bufferSize];
            int read = 0;
            while ((read = ins.read(buffer)) != -1) {
                byteStream.write(buffer, 0, read);
            }
            return byteStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
