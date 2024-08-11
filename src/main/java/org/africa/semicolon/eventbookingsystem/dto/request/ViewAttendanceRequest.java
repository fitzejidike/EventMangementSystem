package org.africa.semicolon.eventbookingsystem.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.africa.semicolon.eventbookingsystem.data.models.Attendee;
import org.africa.semicolon.eventbookingsystem.data.models.Event;

import java.util.List;

@Setter
@Getter
public class ViewAttendanceRequest {
    private List<Attendee>attendees;
    private List<Event> events;

}
