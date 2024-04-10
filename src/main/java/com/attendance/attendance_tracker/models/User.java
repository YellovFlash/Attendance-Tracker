package com.attendance.attendance_tracker.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.ldap.odm.annotations.Id;
@Document("user")
public class User {
    @Id
    private String id;
    private String userName;

    public User(String id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    private String password;
}
