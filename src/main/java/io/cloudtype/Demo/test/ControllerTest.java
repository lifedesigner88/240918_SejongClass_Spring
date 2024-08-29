package io.cloudtype.Demo.test;

import io.cloudtype.Demo.test.dto.req.CreateUserReqDto;
import io.cloudtype.Demo.test.dto.res.CreateUserResDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class ControllerTest {

    private final ServiceTest serviceTest;

    public ControllerTest(ServiceTest serviceTest) {
        this.serviceTest = serviceTest;
    }

    @PostMapping
    public ResponseEntity<CreateUserResDto> createUser(@RequestBody CreateUserReqDto dto) {

        CreateUserResDto resDto = serviceTest.createUser(dto);
        return ResponseEntity.ok(resDto);

    }

}
