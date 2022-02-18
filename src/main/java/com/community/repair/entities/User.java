package com.community.repair.entities;

import com.community.repair.DTO.UserDto;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@ToString
@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends AbstractEntity<Integer> {
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;

    public User(UserDto userDto) {
        this.login = userDto.getLogin();
        this.password = userDto.getPassword();
    }
}
