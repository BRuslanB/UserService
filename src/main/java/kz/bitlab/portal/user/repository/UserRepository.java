package kz.bitlab.portal.user.repository;

import jakarta.transaction.Transactional;
import kz.bitlab.portal.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

}
