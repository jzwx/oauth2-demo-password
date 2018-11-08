package com.example.oauth.pojo;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.Collections;

/**
 * @Author:jzwx
 * @Desicription: MyUserDetails
 * @Date:Created in 2018-11-08 8:51
 * @Modified By:
 */
public class MyUserDetails extends org.springframework.security.core.userdetails.User {
    private User user;

    public MyUserDetails(User user) {
        super(user.getUserName(), user.getPassword(), true, true, true, true, Collections.EMPTY_SET);
        this.user = user;
    }

    /**
     * Getter method for property <tt>user</tt>.
     *
     * @return property value of user
     */
    public User getUser() {
        return user;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param user value to be assigned to property user
     */
    public void setUser(User user) {
        this.user = user;
    }
}
