package com.no0name.jwt.model.dto;

import com.no0name.jwt.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterResponseDTO {
    private Long id;
    private String email;
    private String firstname;
    private String lastname;

    public static RegisterResponseDTO fromUser(User user) {
        return RegisterResponseDTO.builder()
                .id(user.getId())
                .email(user.getEmail())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .build();
    }
}
