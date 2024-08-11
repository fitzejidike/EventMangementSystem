package org.africa.semicolon.eventbookingsystem.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.africa.semicolon.eventbookingsystem.data.constants.TicketCategory;

import java.math.BigDecimal;

@Setter
@Getter
public class AddTicketRequest {
    public BigDecimal price;
    public TicketCategory type;
    public int quantity;

}
