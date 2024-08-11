package org.africa.semicolon.eventbookingsystem.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.africa.semicolon.eventbookingsystem.data.models.Attendee;

import java.util.List;

@Setter
@Getter
public class CreateEventListResponse {
    private List<Attendee> attendees;
}
