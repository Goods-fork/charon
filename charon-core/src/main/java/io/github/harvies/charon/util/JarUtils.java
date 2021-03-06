package io.github.harvies.charon.util;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

@Slf4j
public class JarUtils {

    public static List<String> getClassNameListByJarFile(File jarFile) throws IOException {
        List<String> classNameList = Lists.newArrayList();
        //通过jarFile和JarEntry得到所有的类 
        JarFile jar = new JarFile(jarFile);
        //返回zip文件条目的枚举 
        Enumeration<JarEntry> enumFiles = jar.entries();
        JarEntry entry;

        //测试此枚举是否包含更多的元素 
        while (enumFiles.hasMoreElements()) {
            entry = enumFiles.nextElement();
            if (!entry.getName().contains("META-INF")) {
                String classFullName = entry.getName();
                if (classFullName.endsWith(".class")) {
                    //去掉后缀.class 
                    String className = classFullName.substring(0, classFullName.length() - 6).replace("/", ".");
                    classNameList.add(className);
                }
            }
        }
        return classNameList;
    }

    private static Method[] getMethodList(Class<?> myClass) {
        //得到类中包含的属性 
        Method[] methods = myClass.getMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            System.out.println("方法名称:" + methodName);
            getParameterTypes(method);
            System.out.println("==========================");
        }
        return methods;
    }

    private static Class<?>[] getParameterTypes(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (Class<?> clazz : parameterTypes) {
            String parameterName = clazz.getName();
            System.out.println("参数类型:" + parameterName);
        }
        return parameterTypes;
    }
}
