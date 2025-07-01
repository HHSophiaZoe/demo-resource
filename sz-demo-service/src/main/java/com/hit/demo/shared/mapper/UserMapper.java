package com.hit.demo.shared.mapper;

import com.hit.demo.domain.entity.User;
import com.hit.demo.domain.model.UserModel;
import com.hit.demo.ui.transfer.response.UserResponse;
import com.hit.spring.core.data.mapper.DomainMapper;
import com.hit.spring.core.data.mapper.ResponseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationName = "Movie<CLASS_NAME>Impl")
public interface UserMapper extends AuditingMapper, DomainMapper<User, UserModel>, ResponseMapper<UserModel, UserResponse> {

}
