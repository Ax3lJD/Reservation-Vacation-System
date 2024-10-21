package csi.reservationvacationsystem.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservationDAO {

    private Long id;

    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    private int numberOfAdults;
    private int numberOfChildren;
    private int totalNumberOfGuests;

    private String reservationConfirmationCode;

    private UserDAO user;
    private RoomDAO room;
}
