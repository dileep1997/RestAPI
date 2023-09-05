package sample.restapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Schema(
        description = "User Dto Model Information"
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    @Schema(
            description = "User first Name"
    )
    @NotEmpty(message = "User firstName should not be null or empty")
    private String firstName;

    @Schema(
            description = "User last Name"
    )
    @NotEmpty(message = "User lastName should not be null or empty")
    private String lastName;

    @Schema(
            description = "User email Address"
    )
    @NotEmpty(message = "User email should not be null or empty")
    @Email(message =  "Email address should be valid")
    private String email;
}
