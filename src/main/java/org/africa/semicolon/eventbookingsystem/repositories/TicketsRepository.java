package org.africa.semicolon.eventbookingsystem.repositories;

import org.africa.semicolon.eventbookingsystem.data.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketsRepository extends JpaRepository<Ticket,Long> {
}
