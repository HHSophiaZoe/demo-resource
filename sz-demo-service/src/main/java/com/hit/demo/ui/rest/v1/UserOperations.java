package com.hit.demo.ui.rest.v1;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

@Validated
@RequestMapping("${app.demo-api-path-prefix}/api/v1/user")
public interface UserOperations {

}
