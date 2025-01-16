package ru.surikov.entities;

import java.util.ArrayList;
import java.util.List;

public class Configuration {

    private static boolean a;
    private static boolean p;
    private static boolean o;
    private static boolean s;
    private static boolean f;
    private static String savePath;
    private static String prefix;
    private static List<String> listFileName;
    private static Configuration instance;

    public Configuration() {
        listFileName = new ArrayList<>();
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public boolean getA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public boolean getP() {
        return p;
    }

    public void setP(boolean p) {
        this.p = p;
    }

    public boolean getO() {
        return o;
    }

    public void setO(boolean o) {
        this.o = o;
    }

    public boolean getS() {
        return s;
    }

    public void setS(boolean s) {
        this.s = s;
    }

    public boolean getF() {
        return f;
    }

    public void setF(boolean f) {
        this.f = f;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public List<String> getListOfFileName() {
        return listFileName;
    }

    public void addFileName(String fileName) {
        listFileName.add(fileName);
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "a=" + a +
                ", p=" + p +
                ", o=" + o +
                ", s=" + s +
                ", f=" + f +
                ", savePath='" + savePath + '\'' +
                ", prefix='" + prefix + '\'' +
                ", listFileName=" + listFileName +
                '}';
    }
}
