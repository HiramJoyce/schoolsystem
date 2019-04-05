package com.school.system.service;

import com.school.system.domain.Score;

public interface ScoreService {
    Score getScoreByStudentIdAndCourseId(Integer studentId, Integer courseId);

    int createScore(Score score);
}
