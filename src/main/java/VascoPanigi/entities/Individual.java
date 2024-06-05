package VascoPanigi.entities;
import VascoPanigi.enums.IndividualsGender;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "individual")
public class Individual {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "birth_date")
    private LocalDate birth_date;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private IndividualsGender gender;

    @OneToMany(mappedBy = "individual")
    private List<Participation> participation_list;



}
