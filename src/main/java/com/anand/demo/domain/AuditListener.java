package com.anand.demo.domain;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class AuditListener {

    @PrePersist
    @PreUpdate
    @PreRemove
    private void beforeAnyOperation(Object object) {
        System.out.println("*******************");
    }
}
