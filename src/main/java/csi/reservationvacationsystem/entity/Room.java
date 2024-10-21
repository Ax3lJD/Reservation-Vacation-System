package csi.reservationvacationsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Room {
    @Id
    private Long id;

    private String roomType;
    private BigDecimal roomPrice;
    private String roomDescription;

    @OneToMany
    private List<Reservation> reservations = new ArrayList<>();

    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomType='" + roomType + '\'' +
                ", roomPrice=" + roomPrice +
                ", roomDescription='" + roomDescription + '\'' +
                ", reservations=" + reservations +
                '}';
    }
}
