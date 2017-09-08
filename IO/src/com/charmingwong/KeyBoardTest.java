package com.charmingwong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by CharmingWong on 2017/4/20.
 */
public class KeyBoardTest {

    public static void main(String[] args) {
        BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = bufferedReader.readLine();
            System.out.println(Integer.parseInt(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
