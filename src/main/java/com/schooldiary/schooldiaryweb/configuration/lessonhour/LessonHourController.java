package com.schooldiary.schooldiaryweb.configuration.lessonhour;

import com.schooldiary.schooldiaryweb.configuration.lessonhour.dto.LessonHour;
import com.schooldiary.schooldiaryweb.configuration.lessonhour.dto.UpdateLessonHour;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/configuration/lesson-hours")
@RequiredArgsConstructor
public class LessonHourController {

    private final LessonHourService lessonHourService;

    @PostMapping
    public ResponseEntity<LessonHour> create(@RequestBody LessonHour lessonHour) {
        return new ResponseEntity<>(lessonHourService.createLessonHour(lessonHour), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable UUID id) {
        lessonHourService.deleteLessonHour(id);
        return new ResponseEntity<>("Record has been deleted", HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<List<LessonHour>> getLessonHours() {
        return new ResponseEntity<>(lessonHourService.getLessonHours(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<LessonHour> getLessonHour(@PathVariable UUID id) {
        return new ResponseEntity<>(lessonHourService.getLessonHour(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<LessonHour> update(@RequestBody UpdateLessonHour updateLessonHour) {
        return new ResponseEntity<>(this.lessonHourService.updateLessonHour(updateLessonHour), HttpStatus.ACCEPTED);
    }
}
