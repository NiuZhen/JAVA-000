package com.demo;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GeekClassLoader  extends ClassLoader {

    public static void main(String[] args) {

        try {
            Class<?> aClass = new GeekClassLoader().findClass("Hello");

            Object o = aClass.newInstance();
            Method m = aClass.getMethod("hello");
            m.invoke(o); //Hello, classLoader!
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String helloPath = "file:///E:/java/javageektime/JAVA-000/Week_01/" + name.replace(".", "/") + ".xlass";
//        System.out.println(helloPath);
        byte[] cLassBytes = null;
        Path path = null;
        try {
            path = Paths.get(new URI(helloPath));
            cLassBytes = Files.readAllBytes(path);

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

        for(int i=0;i<cLassBytes.length;++i){
            cLassBytes[i]=(byte)(255-cLassBytes[i]);
        }
        Class clazz = defineClass(name, cLassBytes, 0, cLassBytes.length);
        return clazz;
    }

}