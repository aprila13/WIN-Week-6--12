package com.tts.TechTalentBlog.service;

import com.tts.TechTalentBlog.model.BlogPost;

import java.util.Optional;

//This service will serve as a contract for our implementation
//All the methods in this interface must be implemented
public interface BlogPostService {

    BlogPost addNewBlogPost(BlogPost blogPost);

}
