package com.charmingwong;

import java.io.*;

/**
 * Created by CharmingWong on 2017/4/20.
 */
public class ReadFileTest {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\56223\\Desktop\\dir\\新建文本文档.txt");
        try {
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            fos.write("i am charming wong".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
