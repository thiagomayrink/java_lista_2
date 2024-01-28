package com.tweteroo.api.models;

import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.UUID;

import com.tweteroo.api.dtos.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UserModel {

    public UserModel(UserDTO dto) {
        this.username = dto.getUsername();
        this.avatar = dto.getAvatar();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 150, nullable = false, unique = true)
    private String username;

    @URL()
    @Column(nullable = false)
    private String avatar;
}
