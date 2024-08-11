package org.africa.semicolon.eventbookingsystem.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.africa.semicolon.eventbookingsystem.data.constants.Category;
import org.africa.semicolon.eventbookingsystem.data.models.Organizer;

@Setter
@Getter
public class RegisterEventRequest {
    private String name;
    private String venue;
    private int capacity;
    private Category category;
    private String description;
    private Organizer organizer;

}
