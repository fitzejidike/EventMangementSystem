package org.africa.semicolon.eventbookingsystem.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.africa.semicolon.eventbookingsystem.models.TicketCategory;

import java.math.BigDecimal;

@Setter
@Getter
public class AddTicketRequest {
    public BigDecimal price;
    public TicketCategory type;
    public int quantity;

}
