package io.cloudtype.SejongClass.test.dto.res;

import io.cloudtype.SejongClass.test.User;
import lombok.Getter;

@Getter
public class CreateUserResDto {
    private final String name;

    public CreateUserResDto(User user) {
        this.name = user.getName();
    }
}
