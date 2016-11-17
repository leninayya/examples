package com.example.exampleservice.repository;

import com.example.exampleservice.data.ExampleBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends JpaRepository<ExampleBean, Long> {


}
