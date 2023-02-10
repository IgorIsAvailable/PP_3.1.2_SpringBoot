package PP_31._SpringBoot.service;

import PP_31._SpringBoot.dao.UserDao;
import PP_31._SpringBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional
    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return (List<User>) userDao.findAll();
    }
    @Transactional
    @Override
    public User getUserById(Long id) {
        return userDao.findById(id).get();
    }
    @Transactional
    @Override
    public void deleteUserById(Long id) {
        userDao.deleteById(id);
    }
}

