package coin.dispenser.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegistrationDTO {
    public String firstname;
    public String lastname;
    public String email;
    public String password;
}
