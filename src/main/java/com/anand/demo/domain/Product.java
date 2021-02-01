package com.anand.demo.domain;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "PRODUCT")
@Table(name = "PRODUCT")
@Audited
@Data
public class Product {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Double price;

    //...

    @Column(name = "ACTION")
    private String action;

    @Column(name = "ACTION_ON")
    private Date actionOn;

    @Column(name = "ACTION_BY")
    private String actionBy;

    @PrePersist
    public void onPrePersist() {
        audit("INSERT");
    }

    @PreUpdate
    public void onPreUpdate() {
        audit("UPDATE");
    }

    @PreRemove
    public void onPreRemove() {
        audit("DELETE");
    }

    private void audit(String operation) {
        setAction(operation);
        setActionOn(new Date());
        setActionBy("DummyUser");
    }

}
