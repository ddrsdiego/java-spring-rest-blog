package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PostRepository extends JpaRepository<Post, Long> {

    @RestResource(rel = "contains-title", path = "containsTitle")
    List<Post> findByTitleContaining(String title);

    List<Post> findByAuthor_Lastname(String lastname);
}