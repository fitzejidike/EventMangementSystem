package org.africa.semicolon.eventbookingsystem.repositories;

import org.africa.semicolon.eventbookingsystem.data.models.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee,Long> {
}
