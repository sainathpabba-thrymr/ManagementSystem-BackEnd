package com.svs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.svs.entity.Email;

public interface EmailRepo extends JpaRepository<Email, Long> {

}
