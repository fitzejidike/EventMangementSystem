package org.africa.semicolon.eventbookingsystem.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String eventCenter;
    private String street;
    private String city;
    private String country;
    @OneToOne
    private Event event;

}
