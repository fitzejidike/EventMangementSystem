package org.africa.semicolon.eventbookingsystem.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterEventResponse {
    @JsonProperty(value = "user_id")
    private Long id;
    private String username;
    private String message;
}
