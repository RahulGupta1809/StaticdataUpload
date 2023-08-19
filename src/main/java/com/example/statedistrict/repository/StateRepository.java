package com.example.statedistrict.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.statedistrict.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

	State findByStateName(String stateName);

}