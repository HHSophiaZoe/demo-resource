package com.hit.demo.infrastructure.store.repository;

import com.hit.demo.domain.entity.User;
import com.hit.jpa.BaseJPARepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseJPARepository<User, String> {

}
