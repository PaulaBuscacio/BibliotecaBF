package com.treinamento.administrationservice.entity;

import javax.persistence.*;


@Entity(name = "tbl_user") // mesmo nome da tabela no V1
public class User {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id_user")
    @SequenceGenerator(sequenceName = "seq_id_user", allocationSize = 1, name = "seq_id_user")
    @Column(name = "n_id_user")
    private Integer id;

    @Column(name = "s_username")
    private String username;

    @Column(name = "s_first_name")
    private String firstName;

    @Column(name = "s_last_name")
    private String lastName;

    @Column(name = "s_password")
    private String password;

    public User() {}

    public User(Integer id, String username, String firstName, String lastName, String password) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
