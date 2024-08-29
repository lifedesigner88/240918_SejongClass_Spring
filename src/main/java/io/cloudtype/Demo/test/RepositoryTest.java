package io.cloudtype.Demo.test;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTest extends JpaRepository<User, Long> {
}
