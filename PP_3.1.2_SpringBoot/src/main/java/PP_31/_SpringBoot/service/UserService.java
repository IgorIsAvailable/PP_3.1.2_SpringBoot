package PP_31._SpringBoot.service;

import PP_31._SpringBoot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {
    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUserById(Long id);

}
