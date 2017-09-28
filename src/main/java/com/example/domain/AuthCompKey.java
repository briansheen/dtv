package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by bsheen on 9/28/17.
 */

@Embeddable
public class AuthCompKey implements Serializable{

    @Column(name = "username")
    private String username;

    @Column(name = "authority")
    private String authority;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthCompKey that = (AuthCompKey) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        return authority != null ? authority.equals(that.authority) : that.authority == null;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (authority != null ? authority.hashCode() : 0);
        return result;
    }
}
