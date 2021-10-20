package coin.dispenser.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "coins")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Coins {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Integer tenCent;

    @Column(nullable = false)
    private Integer twentyCent;

    @Column(nullable = false)
    private Integer fiftyCent;

    @Column(nullable = false)
    private Integer oneRand;

    @Column(nullable = false)
    private Integer fiveRand;

    @Column(nullable = false)
    private Integer twoRand;

}
