package com.team.Repo;

import com.team.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by andrewdmo on 9/29/16.
 */

@Repository
public interface NoriRepo extends JpaRepository<Order, Integer> {
}
