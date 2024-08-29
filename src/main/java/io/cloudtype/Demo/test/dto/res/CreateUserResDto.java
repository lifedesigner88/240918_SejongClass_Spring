package io.cloudtype.Demo.test.dto.res;

import io.cloudtype.Demo.test.User;
import lombok.Getter;

@Getter
public class CreateUserResDto {
    private final String name;

    public CreateUserResDto(User user) {
        this.name = user.getName();
    }
}
