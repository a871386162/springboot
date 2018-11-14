package com.newer.springboot.domain;

import java.io.Serializable;

public class Authority implements Serializable {
    private static final long serialVersionUID = -543187982682284091L;
    private Integer id;
    private AuthorityName name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AuthorityName getName() {
        return name;
    }

    public void setName(AuthorityName name) {
        this.name = name;
    }
}
