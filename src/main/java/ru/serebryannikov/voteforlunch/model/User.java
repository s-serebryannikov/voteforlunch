package ru.serebryannikov.voteforlunch.model;

import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

public class User extends AbstractNamedEntity {

    private String email;

    private String password;

    private boolean enabled;

    private Set<Role> roles;

    public User() {
    }

    public User(Integer id, String name, String email, String password, Boolean enabled, Collection<Role> roles) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        setRoles(roles);
    }

    public User(Integer id, String name, String email, String password, Boolean enabled, Role role, Role... roles) {
        this(id, name, email, password, true, Arrays.asList(roles));
    }

    public String getEmail() {
        return email;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = CollectionUtils.isEmpty(roles) ? EnumSet.noneOf(Role.class) : EnumSet.copyOf(roles);
    }

    public String getPassword() {
        return password;
    }
}
