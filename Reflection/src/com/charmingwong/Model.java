package com.charmingwong;

public class Model {
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

    private void method() {
    }

    void f() {
    }
}

