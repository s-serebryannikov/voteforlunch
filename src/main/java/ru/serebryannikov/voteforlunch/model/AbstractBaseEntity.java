package ru.serebryannikov.voteforlunch.model;

import org.hibernate.Hibernate;
import org.springframework.util.Assert;

import java.util.Objects;

public abstract class AbstractBaseEntity{
    public static final int START_SEQ = 100_000;

    protected Integer id;

    public AbstractBaseEntity() {
    }

    public AbstractBaseEntity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isNew() {
        return getId() == null;
    }

    public long id() {
        Assert.notNull(getId(), "Entity must has id");
        return getId();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(Hibernate.getClass(o)) ) return false;
        AbstractBaseEntity that = (AbstractBaseEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
