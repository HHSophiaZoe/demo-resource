package com.hit.demo.infrastructure.store.adapter;

import com.hit.jpa.BaseJPAAdapter;
import com.hit.demo.domain.entity.User;
import com.hit.demo.domain.store.UserStore;
import com.hit.demo.infrastructure.store.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserAdapter extends BaseJPAAdapter<User, String, UserRepository> implements UserStore {

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }

}

