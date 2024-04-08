package com.hotelreservationsystem.hrs.services;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MongoService {
    <T> List<T> findAll(Class<T> entityClass);
    <T> T save(T entity, String collectionName);

    <T> List<T> find(Query query, Class<T> entityClass);

}

