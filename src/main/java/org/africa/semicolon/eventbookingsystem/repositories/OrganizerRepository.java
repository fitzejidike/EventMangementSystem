package org.africa.semicolon.eventbookingsystem.repositories;

import org.africa.semicolon.eventbookingsystem.data.models.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer,Long> {
}
