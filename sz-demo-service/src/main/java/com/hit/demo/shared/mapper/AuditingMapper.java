package com.hit.demo.shared.mapper;

import com.hit.demo.domain.entity.User;
import com.hit.demo.domain.model.UserModel;
import com.hit.spring.core.data.dto.CreatorDTO;
import com.hit.spring.core.data.dto.ModifierDTO;
import com.hit.spring.core.data.model.UserPrincipal;
import org.mapstruct.Mapping;

public interface AuditingMapper {

    CreatorDTO toCreator(User user);

    CreatorDTO toCreator(UserModel user);

    CreatorDTO toCreator(CreatorDTO user);

    @Mapping(target = ".", source = "principal.user")
    CreatorDTO toCreator(UserPrincipal principal);

    ModifierDTO toModifier(User user);

    ModifierDTO toModifier(UserModel user);

    ModifierDTO toModifier(ModifierDTO user);

    @Mapping(target = ".", source = "principal.user")
    ModifierDTO toModifier(UserPrincipal principal);

}
