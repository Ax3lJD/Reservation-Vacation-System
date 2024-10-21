package csi.reservationvacationsystem.service.interfaces;

import csi.reservationvacationsystem.dao.Response;
import csi.reservationvacationsystem.entity.Reservation;


public interface IReservationService {
    Response saveReservation(Long roomId, Long userId, Reservation reservationRequest);

    Response findReservationByConfirmationCode(String confirmationCode);

    Response getAllReservations();

    Response cancelReservation(Long reservationId);
}
