package org.africa.semicolon.eventbookingsystem.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Setter
@Getter
@Builder
@Entity
@Table(name = "attendees")
@AllArgsConstructor
@NoArgsConstructor
public class Attendee {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false)
    private String userName;
    private String email;
    private String phoneNumber;
    private String password;
    private BigDecimal discount;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Ticket> tickets;


}
