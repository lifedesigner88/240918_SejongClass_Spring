package io.cloudtype.Demo.test.dto.res;

import io.cloudtype.Demo.test.User;
import lombok.Getter;

import java.util.List;

@Getter
public class UserResDto {

    private final List<String> names;

    public UserResDto(List<User> names) {

        this.names = names.stream()
                .map(User::getName)
                .toList();
    }

}
