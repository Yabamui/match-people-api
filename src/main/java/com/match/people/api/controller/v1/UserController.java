package com.match.people.api.controller.v1;

import com.match.people.api.model.v1.Response;
import com.match.people.api.service.v1.UserService;
import com.match.people.api.utils.ResponseUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping("/user/v1")
    public <T> ResponseEntity<Response<T>> getUser(Long id) {
        userService.getUser(id);

        return ResponseUtil.getResponseEntity( null);
    }
}
