package org.africa.semicolon.eventbookingsystem.repositories;

import org.africa.semicolon.eventbookingsystem.models.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizerRepository extends JpaRepository<Organizer,Long> {
}
