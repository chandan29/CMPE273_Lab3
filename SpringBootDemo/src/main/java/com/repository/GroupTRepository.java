package com.repository;

import java.util.List;

import com.entity.Chandan;
import org.springframework.data.repository.CrudRepository;


public interface GroupTRepository extends CrudRepository<Chandan, Long> {
    // List<GroupT> find
    // List<User> find
    //List<GroupT> findBy(Integer group_id);

    Chandan findByGroupId(Integer group_id);
}
