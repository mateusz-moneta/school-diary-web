package com.schooldiary.schooldiaryweb.configuration.lessonhour;

import com.schooldiary.schooldiaryweb.configuration.lessonhour.dto.CreateLessonHour;
import com.schooldiary.schooldiaryweb.configuration.lessonhour.dto.LessonHour;
import com.schooldiary.schooldiaryweb.configuration.lessonhour.dto.UpdateLessonHour;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LessonHourService {

    private final LessonHourMapper lessonHourMapper;
    private final LessonHourRepository lessonHourRepository;

    public LessonHour createLessonHour(CreateLessonHour createLessonHour) {
        LessonHourEntity lessonHourEntity = lessonHourRepository.save(lessonHourMapper.createLessonHourToEntity(createLessonHour));
        return lessonHourMapper.toLessonHour(lessonHourEntity);
    }

    public void deleteLessonHour(UUID id) {
        lessonHourRepository.deleteById(id);
    }

    public LessonHour getLessonHour(UUID id) {
        Optional<LessonHourEntity> lessonHourEntity = lessonHourRepository.findById(id);
        return lessonHourMapper.toLessonHour(lessonHourEntity.get());
    }

    public List<LessonHour> getLessonHours() {
        return lessonHourMapper.toLessonHours(lessonHourRepository.findAll());
    }

    public LessonHour updateLessonHour(UpdateLessonHour updateLessonHour) {
        LessonHourEntity lessonHourEntity = lessonHourRepository.save(lessonHourMapper.updateLessonHourToEntity(updateLessonHour));
        return lessonHourMapper.toLessonHour(lessonHourEntity);
    }
}
