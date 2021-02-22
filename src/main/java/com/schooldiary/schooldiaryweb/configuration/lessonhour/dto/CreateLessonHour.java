package com.schooldiary.schooldiaryweb.configuration.lessonhour.dto;

import lombok.NonNull;

public class CreateLessonHour {

    @NonNull
    private String hourFrom;

    @NonNull
    private String minuteFrom;

    @NonNull
    private String hourTo;

    @NonNull
    private String minuteTo;

}
