package csi.reservationvacationsystem.repositories;

import csi.reservationvacationsystem.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByRoomId(Long roomId);

    Optional<Reservation> findByBookingConfirmationCode(String confirmationCode);

    List<Reservation> findByUserId(Long user_id);
}
