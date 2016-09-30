package com.team.repo;

import com.team.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by andrewdmo on 9/29/16.
 */

public class NoriRepo {


    public interface LunchRepo extends JpaRepository<Order, Integer> {
    }
}
