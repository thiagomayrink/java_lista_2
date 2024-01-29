package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TweetDTO {
    @NotBlank(message = "Text is mandatory and hava a limit of 280 chars")
    @Size(max = 280)
    private String text;

    @NotNull(message = "userId is mandatory")
    private Long userId;
}
