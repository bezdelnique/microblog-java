package com.heman.blog.repository;

import com.heman.blog.entity.User;
import com.heman.blog.entity.Role;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;

public interface RoleRepository extends JpaRepository<User, Long> {
}
