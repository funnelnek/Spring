package com.funnelnek.spring.entities;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Integer id;

    @ManyToMany
    private Collection<RolePermission> permissions;    
    private String name;

    public Role() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
    
    public Collection<RolePermission> getPermissions( ) {
        return permissions;
    }
}
