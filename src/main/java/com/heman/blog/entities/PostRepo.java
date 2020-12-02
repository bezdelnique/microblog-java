package com.heman.blog.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {

}