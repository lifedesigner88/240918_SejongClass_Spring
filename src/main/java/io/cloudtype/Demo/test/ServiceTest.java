package io.cloudtype.Demo.test;

import io.cloudtype.Demo.test.dto.req.CreateUserReqDto;
import io.cloudtype.Demo.test.dto.res.CreateUserResDto;
import io.cloudtype.Demo.test.dto.res.UserResDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

    private final RepositoryTest repositoryTest;

    @Autowired
    public ServiceTest(RepositoryTest repositoryTest) {
        this.repositoryTest = repositoryTest;
    }

    public CreateUserResDto createUser(CreateUserReqDto dto) {

        User user = User.builder()
                .name(dto.getName())
                .build();

        return new CreateUserResDto(repositoryTest.save(user));

    }

    public UserResDto getUsers() {
        return new UserResDto(repositoryTest.findAll());
    }
}