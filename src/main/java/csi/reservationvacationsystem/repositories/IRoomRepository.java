package csi.reservationvacationsystem.repositories;

import csi.reservationvacationsystem.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface IRoomRepository extends JpaRepository<Room, Long> {
    @Query("SELECT DISTINCT r.roomType FROM Room r")
    List<String> findDistinctRoomTypes();

    @Query("SELECT r FROM Room r WHERE r.roomType LIKE %:roomType% AND r.id NOT IN (SELECT res.room.id from Reservation res WHERE" +
            "(res.checkInDate <= :checkOutDate) AND (res.checkOutDate >= :checkInDate))")
    List<Room> findAvailableRoomsByDateAndType(LocalDate checkInDate, LocalDate checkOutDate, String roomType);

    @Query("SELECT r FROM Room r WHERE r.id NOT IN (SELECT res.room.id FROM Reservation res)")
    List<Room> getAllAvailableRooms();
}
