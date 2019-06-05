package com.example.education.pojo;

import java.util.List;

public class MigrationMapPojo {

    private CoordinatePojo src;

    private List<CoordinatePojo> dst;

    public CoordinatePojo getSrc() {
        return src;
    }

    public void setSrc(CoordinatePojo src) {
        this.src = src;
    }

    public List<CoordinatePojo> getDst() {
        return dst;
    }

    public void setDst(List<CoordinatePojo> dst) {
        this.dst = dst;
    }
}
