package com.heman.blog.controller;

import com.heman.blog.entity.Post;
import com.heman.blog.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
@RequestMapping("/post")
public class PostController {
    private final PostRepository postRepo;

    public PostController(PostRepository thePostRepo) {
        this.postRepo = thePostRepo;
    }


    @GetMapping("/list")
    public String index(Model model) {
        model.addAttribute("posts", postRepo.findAll());
        return "blog/post/index";
    }


    @GetMapping("/update")
    public String update(@RequestParam("id") int theId, Model model) {
        Post post = postRepo.getOne(theId);
        model.addAttribute("post", post);
        return "blog/post/form";
    }


    @PostMapping("/save")
    public String save(
            @ModelAttribute("post") @Valid Post thePost,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "blog/post/form";
        } else {
            postRepo.save(thePost);
            return "redirect:/post/list";
        }
    }


    @GetMapping("/delete")
    public String delete(@RequestParam("id") int theId) {
        postRepo.deleteById(theId);
        return "redirect:/post/list";

    }
}
