package org.africa.semicolon.eventbookingsystem.services.implementaions;

import lombok.AllArgsConstructor;
import org.africa.semicolon.eventbookingsystem.dto.request.GetEvenResponse;
import org.africa.semicolon.eventbookingsystem.dto.request.RegisterEventRequest;
import org.africa.semicolon.eventbookingsystem.dto.response.RegisterEventResponse;
import org.africa.semicolon.eventbookingsystem.dto.response.SaveEventResponse;
import org.africa.semicolon.eventbookingsystem.data.models.Event;
import org.africa.semicolon.eventbookingsystem.repositories.EventRepository;
import org.africa.semicolon.eventbookingsystem.services.utils.EventService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private final ModelMapper modelMapper;
    @Override
    public RegisterEventResponse registerEvent(RegisterEventRequest registerEventRequest) {
        return null;
    }

    @Override
    public Event saveEvent(SaveEventResponse saveEventResponse) {

        return null;
    }

    @Override
    public Event getevent(GetEvenResponse getEvenResponse) {
        return null;
    }
}
