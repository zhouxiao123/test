package com.example;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/2/14.
 */
@Entity
@Table(name="Message")
public class TestList {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="messageid")
    private Integer Id;
    @Column(name="Name")
    private String name;
    @Column(name="Email")
    private String email;
    @Column(name="Telphone")
    private String telphone;
    @Column(name="Content")
    private String content;

    public TestList() {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
}
