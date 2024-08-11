package org.africa.semicolon.eventbookingsystem.services.utils;

import org.africa.semicolon.eventbookingsystem.dto.request.GetEvenResponse;
import org.africa.semicolon.eventbookingsystem.dto.request.RegisterEventRequest;
import org.africa.semicolon.eventbookingsystem.dto.response.RegisterEventResponse;
import org.africa.semicolon.eventbookingsystem.dto.response.SaveEventResponse;
import org.africa.semicolon.eventbookingsystem.data.models.Event;
import org.springframework.stereotype.Service;

@Service
public interface EventService {
    RegisterEventResponse registerEvent(RegisterEventRequest registerEventRequest);
    Event saveEvent(SaveEventResponse saveEventResponse);
    Event getevent (GetEvenResponse getEvenResponse);
}
