// UserRepository.java

package com.giofahreza.protogonos.repository;

import com.giofahreza.protogonos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
