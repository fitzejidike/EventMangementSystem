package org.africa.semicolon.eventbookingsystem.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.africa.semicolon.eventbookingsystem.data.constants.Category;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
public class CreateEventRequest {
    private String name;
    private Category category;
    private String venue;
    private LocalDate date;
    private LocalDateTime StartTime;



}
