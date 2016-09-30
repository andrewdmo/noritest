package com.team.repo;

/**
 * Created by andrewdmo on 9/29/16.
 */

//package com.theironyard.repository;

public class NoriRepo {

import com.team.entity.Lunch;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface LunchRepo extends JpaRepository<Lunch, Integer> {
    }
}
