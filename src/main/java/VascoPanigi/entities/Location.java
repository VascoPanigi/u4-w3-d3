package VascoPanigi.entities;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "location_name")
    private String location_name;

    @Column(name = "location_city")
    private String location_city;
}
