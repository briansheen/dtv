package com.example.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by bsheen on 9/28/17.
 */

@Entity
@Table(name = "authorities")
public class Authorities {

    @EmbeddedId
    private AuthCompKey compKey;

    public AuthCompKey getCompKey() {
        return compKey;
    }

    public void setCompKey(AuthCompKey compKey) {
        this.compKey = compKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Authorities that = (Authorities) o;

        return compKey != null ? compKey.equals(that.compKey) : that.compKey == null;
    }

    @Override
    public int hashCode() {
        return compKey != null ? compKey.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Authorities{" +
                "compKey=" + compKey +
                '}';
    }
}
