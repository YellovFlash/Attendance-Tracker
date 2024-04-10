package com.attendance.attendance_tracker.repositories;

import com.attendance.attendance_tracker.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {

}
