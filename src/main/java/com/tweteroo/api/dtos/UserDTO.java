package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {
    @NotBlank(message = "username is mandatory and must not exceed 100 chars")
    @Size(max = 100)
    private String username;

    @NotBlank(message = "avatar is mandatory and must be a valid URL")
    private String avatar;
}
