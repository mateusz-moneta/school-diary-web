package com.schooldiary.schooldiaryweb.configuration.lessonhour;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "lesson_hours")
public class LessonHourEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "hour_from")
    private String hourFrom;

    @Column(name = "minute_from")
    private String minuteFrom;

    @Column(name = "hour_to")
    private String hourTo;

    @Column(name = "minute_to")
    private String minuteTo;

    @CreationTimestamp
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    @UpdateTimestamp
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt = new Date();

    protected LessonHourEntity() {}

    public LessonHourEntity(String hourFrom, String minuteFrom, String hourTo, String minuteTo) {
        this.hourFrom = hourFrom;
        this.minuteFrom = minuteFrom;
        this.hourTo = hourTo;
        this.minuteTo = minuteTo;
    }
}
