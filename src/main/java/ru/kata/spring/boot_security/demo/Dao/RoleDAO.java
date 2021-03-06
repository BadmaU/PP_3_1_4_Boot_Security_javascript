package ru.kata.spring.boot_security.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {

    List<Role> findAllByRole(String [] roles);

    Role findRoleById(Long id);
}
