package com.paul.userRegistration.appuser;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface UserRepository {
    Optional<AppUser> findByEmil;
}
