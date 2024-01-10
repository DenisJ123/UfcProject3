package ie.atu.ufcproject3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDetails {
    private String name;
    private String record;
    private String fighterId;
    private String message;
}
