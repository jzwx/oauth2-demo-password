package com.example.oauth.pojo;

/**
 * @Author:jzwx
 * @Desicription: User
 * @Date:Created in 2018-11-07 17:53
 * @Modified By:
 */
public class User {
    private long userId;

    private String userName;

    private String password;

    public User(long userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    /**
     * Getter method for property <tt>userId</tt>.
     *
     * @return property value of userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param userId value to be assigned to property userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property <tt>userName</tt>.
     *
     * @return property value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param userName value to be assigned to property userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter method for property <tt>password</tt>.
     *
     * @return property value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param password value to be assigned to property password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
