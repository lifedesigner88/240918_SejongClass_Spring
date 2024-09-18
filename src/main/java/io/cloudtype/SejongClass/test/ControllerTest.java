package io.cloudtype.SejongClass.test;

import io.cloudtype.SejongClass.test.dto.req.CreateUserReqDto;
import io.cloudtype.SejongClass.test.dto.res.CreateUserResDto;
import io.cloudtype.SejongClass.test.dto.res.UserResDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class ControllerTest {

    private final ServiceTest serviceTest;

    public ControllerTest(ServiceTest serviceTest) {
        this.serviceTest = serviceTest;
    }

    @GetMapping
    public ResponseEntity<UserResDto> getUser() {
        return ResponseEntity.ok(serviceTest.getUsers());
    }

    @PostMapping
    public ResponseEntity<CreateUserResDto> createUser(@RequestBody CreateUserReqDto dto) {

        CreateUserResDto resDto = serviceTest.createUser(dto);
        return ResponseEntity.ok(resDto);

    }

}
