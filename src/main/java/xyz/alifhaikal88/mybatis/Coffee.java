package xyz.alifhaikal88.mybatis;

import java.io.Serializable;
import java.math.BigInteger;

public class Coffee implements Serializable {
    private BigInteger id;
    private String name;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
