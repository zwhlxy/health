package com.zz.demo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @Author zwh
 * @Date 2020/7/16 10:22
 * @Version 1.0
 **/
public class MyClassLoader extends ClassLoader {

    private String fileName;

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = loadClassData(name);
        if (bytes == null) {
            throw new ClassNotFoundException();
        } else {
            return defineClass(name, bytes, 0, bytes.length);
        }
    }

    protected byte[] loadClassData(String className) {
        String name = fileName + File.separatorChar +
                className.replace('.', File.separatorChar) + ".class";
        try {
            FileInputStream inputStream = new FileInputStream(name);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            int byteSize = 1024;
            byte[] bytes = new byte[byteSize];
            int length = 0;
            while ((length = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, length);
            }
            return outputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public static void main(String[] args) {
        MyClassLoader myClassLoader = new MyClassLoader();
        myClassLoader.setFileName("e:\\1.txt");
        Class<?> testClass = null;
        try {
            testClass = ClassLoader.getSystemClassLoader().loadClass("com.zz.demo.Demo3");
            Object object = testClass.newInstance();
            System.out.println(object.getClass().getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
