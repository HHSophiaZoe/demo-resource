package com.hit.demo.core.service.impl;

import com.hit.demo.core.service.UserService;
import com.hit.demo.domain.entity.User;
import com.hit.demo.domain.model.UserModel;
import com.hit.demo.domain.store.UserStore;
import com.hit.demo.shared.mapper.UserMapper;
import com.hit.rest.base.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends BaseService<UserModel, User, String, UserStore, UserMapper> implements UserService {

}
