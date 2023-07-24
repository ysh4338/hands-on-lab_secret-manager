package com.example.demo.repository;

import com.example.demo.entity.Picture;
import org.springframework.data.repository.CrudRepository;

public interface PictureRepository extends CrudRepository<Picture, Long> {
}
