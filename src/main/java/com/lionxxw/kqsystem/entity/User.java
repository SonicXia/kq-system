package com.lionxxw.kqsystem.entity;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kq_user.id
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kq_user.account
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kq_user.cname
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    private String cname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kq_user.ename
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    private String ename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kq_user.password
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kq_user.create_time
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kq_user.last_login_time
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    private Date lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kq_user.last_login_ip
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    private String lastLoginIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kq_user.sex
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    private Integer sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kq_user.mobile
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kq_user.email
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    private String email;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kq_user.id
     *
     * @return the value of kq_user.id
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kq_user.id
     *
     * @param id the value for kq_user.id
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kq_user.account
     *
     * @return the value of kq_user.account
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kq_user.account
     *
     * @param account the value for kq_user.account
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kq_user.cname
     *
     * @return the value of kq_user.cname
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kq_user.cname
     *
     * @param cname the value for kq_user.cname
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kq_user.ename
     *
     * @return the value of kq_user.ename
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kq_user.ename
     *
     * @param ename the value for kq_user.ename
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kq_user.password
     *
     * @return the value of kq_user.password
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kq_user.password
     *
     * @param password the value for kq_user.password
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kq_user.create_time
     *
     * @return the value of kq_user.create_time
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kq_user.create_time
     *
     * @param createTime the value for kq_user.create_time
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kq_user.last_login_time
     *
     * @return the value of kq_user.last_login_time
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kq_user.last_login_time
     *
     * @param lastLoginTime the value for kq_user.last_login_time
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kq_user.last_login_ip
     *
     * @return the value of kq_user.last_login_ip
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kq_user.last_login_ip
     *
     * @param lastLoginIp the value for kq_user.last_login_ip
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kq_user.sex
     *
     * @return the value of kq_user.sex
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kq_user.sex
     *
     * @param sex the value for kq_user.sex
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kq_user.mobile
     *
     * @return the value of kq_user.mobile
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kq_user.mobile
     *
     * @param mobile the value for kq_user.mobile
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kq_user.email
     *
     * @return the value of kq_user.email
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kq_user.email
     *
     * @param email the value for kq_user.email
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}