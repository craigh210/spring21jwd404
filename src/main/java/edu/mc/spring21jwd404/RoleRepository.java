package edu.mc.spring21jwd404;

import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRole(String role);

}
