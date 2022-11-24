package com.example.randomstringsgenerator.repositories;

import com.example.randomstringsgenerator.models.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRequestRepository extends JpaRepository<Request,Long> {
}
