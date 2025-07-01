package com.hit.demo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    private String id;

    private String username;

    private String password;

    private String avatar;

    private Boolean isAdmin;

    private LocalDateTime createdDate;

    private LocalDateTime lastModifiedDate;

}
