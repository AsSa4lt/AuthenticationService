package com.st1tchqwerty.authenticationservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TransactionRepository extends JpaRepository<CustomTransaction, Long> {
    @Query("SELECT u FROM CustomTransaction u where u.id = :id")
    CustomTransaction findById(@Param("Id") int id);

}
