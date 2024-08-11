package org.africa.semicolon.eventbookingsystem.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.africa.semicolon.eventbookingsystem.models.Attendee;
import org.africa.semicolon.eventbookingsystem.models.Event;

import java.util.List;

@Setter
@Getter
public class ViewAttendanceRequest {
    private List<Attendee>attendees;
    private List<Event> events;

}
