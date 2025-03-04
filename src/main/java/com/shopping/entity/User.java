package com.shopping.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;



@Entity
@Table(name="user_main")
public class User {

    private int id;
    private String name;
    private String email;
    private String nickName;

    private String user_id;

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")

    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="nick_name")
    public String getNickName() {
        return nickName;
    }


    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


    public String getUser_id() { return user_id; }

    public void setUser_id(String user_id) { this.user_id = user_id; }
}
