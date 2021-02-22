package com.schooldiary.schooldiaryweb.configuration.lessonhour;

import com.schooldiary.schooldiaryweb.configuration.lessonhour.dto.CreateLessonHour;
import com.schooldiary.schooldiaryweb.configuration.lessonhour.dto.LessonHour;
import com.schooldiary.schooldiaryweb.configuration.lessonhour.dto.UpdateLessonHour;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface LessonHourMapper {

    LessonHourEntity createLessonHourToEntity(CreateLessonHour createLessonHour);

    LessonHourEntity updateLessonHourToEntity(UpdateLessonHour updateLessonHour);

    List<LessonHour> toLessonHours(List<LessonHourEntity> lessonHourEntities);

    LessonHour toLessonHour(LessonHourEntity lessonHourEntity);
}
