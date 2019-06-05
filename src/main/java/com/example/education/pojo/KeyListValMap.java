package com.example.education.pojo;

import java.util.Map;
import java.util.Set;

public class KeyListValMap {

    private Set<String> name;

    private Map<String, Object> value;

    public Set<String> getName() {
        return name;
    }

    public void setName(Set<String> name) {
        this.name = name;
    }

    public Map<String, Object> getValue() {
        return value;
    }

    public void setValue(Map<String, Object> value) {
        this.value = value;
    }
}
