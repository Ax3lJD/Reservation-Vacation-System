package csi.reservationvacationsystem.service.interfaces;

import csi.reservationvacationsystem.entity.User;
import csi.reservationvacationsystem.dao.LoginRequest;
import csi.reservationvacationsystem.dao.Response;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserReservationHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getUserInfo(String email);
}
