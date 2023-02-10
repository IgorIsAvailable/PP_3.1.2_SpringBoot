package PP_31._SpringBoot.dao;

import PP_31._SpringBoot.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UserDao extends CrudRepository<User, Long> {
}
