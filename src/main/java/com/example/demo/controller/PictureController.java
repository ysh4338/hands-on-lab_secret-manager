package com.example.demo.controller;

import com.example.demo.entity.Picture;
import com.example.demo.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PictureController {

    private final PictureRepository pictureRepository;

    @Autowired
    public PictureController(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }

    @GetMapping("/")
    public String getAllPictures(Model model) {
        Iterable<Picture> pictures = pictureRepository.findAll();
        model.addAttribute("pictures", pictures);
        return "index";
    }
}
