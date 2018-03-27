package com.kkh.patient.model.mall;

import java.io.Serializable;

/**
 * Created by winner on 18/3/8.
 */

public class ProductMadeIn implements Serializable{

    private String name;  //":"新西兰",
    private String icon;  //":""

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
