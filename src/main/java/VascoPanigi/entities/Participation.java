package VascoPanigi.entities;
import VascoPanigi.enums.ParticipationState;
import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Table(name = "participation")
public class Participation {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "individual_id", nullable = false)
    private Individual individual;

    @Column(name = "event")
    @OneToOne(mappedBy = "event_participation")
    private Event event;

    @Column(name = "participation_state")
    @Enumerated(EnumType.STRING)
    private ParticipationState participation_state;

}
