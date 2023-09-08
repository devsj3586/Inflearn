package com.example.SpringBasic.repository;

import com.example.SpringBasic.doamin.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDateJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //JPQL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
