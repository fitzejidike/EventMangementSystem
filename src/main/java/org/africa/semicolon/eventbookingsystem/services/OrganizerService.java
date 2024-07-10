package org.africa.semicolon.eventbookingsystem.services;

import org.africa.semicolon.eventbookingsystem.dto.request.AddTicketRequest;
import org.africa.semicolon.eventbookingsystem.dto.request.CreateEventListRequest;
import org.africa.semicolon.eventbookingsystem.dto.request.CreateEventRequest;
import org.africa.semicolon.eventbookingsystem.dto.request.RegisterEventRequest;
import org.africa.semicolon.eventbookingsystem.dto.response.AddTicketResponse;
import org.africa.semicolon.eventbookingsystem.dto.response.CreateEventListResponse;
import org.africa.semicolon.eventbookingsystem.dto.response.CreateEventResponse;
import org.africa.semicolon.eventbookingsystem.dto.response.RegisterEventResponse;
import org.springframework.stereotype.Service;

@Service
public interface OrganizerService {
RegisterEventResponse registerEvent(RegisterEventRequest registerEventRequest);
CreateEventResponse createUser(CreateEventRequest createEventRequest);
AddTicketResponse addTicket(AddTicketRequest addTicketRequest);

CreateEventListResponse createEventList(CreateEventListRequest createEventListRequest);
}
