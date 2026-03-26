package com.duckdxxk.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duckdxxk.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {
    
}
