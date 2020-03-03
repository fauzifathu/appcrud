package com.crud.demo.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.demo.springdatajpa.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    //dengan meng-Extends Jpa Repository kita dapat menggunakan method seperti save(),
    //memberikan parameter AppUser melakukan mapping class AppUser yang memiliki id tipe data integer.
    //ketika akan menyimpan object dengan tipe AppUser ke database.
}
