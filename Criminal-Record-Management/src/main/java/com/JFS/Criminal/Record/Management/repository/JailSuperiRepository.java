package com.JFS.Criminal.Record.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JFS.Criminal.Record.Management.entity.JailSuperintendent;

@Repository
public interface JailSuperiRepository extends JpaRepository<JailSuperintendent, Integer>{

}
