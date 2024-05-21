package com.study.tdd.chap08.java.auth;

public interface CustomerRepository {
    Customer findOne(String id);
}
