package ru.surikov;

import java.util.List;

public class Configuration {

    private boolean a;
    private boolean p;
    private boolean o;
    private boolean s;
    private boolean f;

    private String savePath;
    private List<String> fileName;
    private String prefix;

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
        return fileName;
    }

    public void addFileName(String fileName) {
        addFileName(fileName);
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
