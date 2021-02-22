package com.schooldiary.schooldiaryweb.configuration.lessonhour;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface LessonHourRepository extends JpaRepository<LessonHourEntity, UUID> {
    Optional<LessonHourEntity> findById(UUID Id);
    List<LessonHourEntity> findAll();
}
