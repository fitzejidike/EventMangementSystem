package org.africa.semicolon.eventbookingsystem.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.africa.semicolon.eventbookingsystem.models.Category;
import org.africa.semicolon.eventbookingsystem.models.Organizer;
import org.africa.semicolon.eventbookingsystem.models.Venue;

@Setter
@Getter
public class RegisterEventRequest {
    private String name;
    private Venue venue;
    private int capacity;
    private Category category;
    private String description;
    private Organizer organizer;

}
