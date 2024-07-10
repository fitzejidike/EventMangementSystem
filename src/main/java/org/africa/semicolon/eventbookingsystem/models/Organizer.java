package org.africa.semicolon.eventbookingsystem.models;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
@Entity
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    @Column(unique = true,nullable = false)
    private String userName;
    @OneToMany
    private List<Event> event;


}
