package com.charmingwong;

import java.io.IOException;
import java.util.HashSet;

/**
 * Created by CharmingWong on 2017/4/17.
 */
public class HashSetTest {

    public static void main(String[] args) throws IOException {
        HashSet<Model> hashSet = new HashSet<>();
        Model a = new Model(1);
        Model b = new Model(1);
        hashSet.add(a);
        System.out.println(hashSet.add(b));
        System.out.println(b.value);
    }
}

class Model {
    int value;

    public Model(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Model) {
            if (((Model) obj).value == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return value % 7;
    }
}

