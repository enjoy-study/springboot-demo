package com.bill.model;

public class EnjoyUser extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column enjoy_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column enjoy_user.passwd
     *
     * @mbggenerated
     */
    private String passwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column enjoy_user.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column enjoy_user.id
     *
     * @return the value of enjoy_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column enjoy_user.id
     *
     * @param id the value for enjoy_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column enjoy_user.passwd
     *
     * @return the value of enjoy_user.passwd
     *
     * @mbggenerated
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column enjoy_user.passwd
     *
     * @param passwd the value for enjoy_user.passwd
     *
     * @mbggenerated
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column enjoy_user.username
     *
     * @return the value of enjoy_user.username
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column enjoy_user.username
     *
     * @param username the value for enjoy_user.username
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username;
    }
}