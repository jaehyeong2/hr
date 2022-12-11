package jjfactory.common.domain.user.dao;

import jjfactory.common.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}