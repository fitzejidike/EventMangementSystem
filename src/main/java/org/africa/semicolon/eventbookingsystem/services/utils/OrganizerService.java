package org.africa.semicolon.eventbookingsystem.services.utils;

import org.africa.semicolon.eventbookingsystem.dto.request.*;
import org.africa.semicolon.eventbookingsystem.dto.response.*;
import org.springframework.stereotype.Service;

@Service
public interface OrganizerService {
RegisterEventResponse registerEvent(RegisterEventRequest registerEventRequest);
CreateEventResponse createUser(CreateEventRequest createEventRequest);
AddTicketResponse addTicket(AddTicketRequest addTicketRequest);
CreateEventListResponse createEventList(CreateEventListRequest createEventListRequest);

CreateDiscountResponse discount(CreateDiscountRequest createDiscountRequest);
ViewAttendanceResponse attendance(ViewAttendanceRequest viewAttendanceRequest);

}
