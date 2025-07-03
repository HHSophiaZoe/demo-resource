package com.hit.demo.ui.rest.v1.controller;

import com.hit.demo.domain.model.UserModel;
import com.hit.demo.shared.mapper.UserMapper;
import com.hit.demo.ui.rest.v1.UserOperations;
import com.hit.demo.ui.transfer.response.UserResponse;
import com.hit.rest.base.BaseController;
import com.hit.rest.base.IService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends BaseController<UserModel, String, UserResponse, UserMapper>

        implements UserOperations {

    protected UserController(IService<UserModel, String> service) {
        super(service);
    }

}
