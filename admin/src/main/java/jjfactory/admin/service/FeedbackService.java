package jjfactory.admin.service;


import jjfactory.common.repository.FeedbackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class FeedbackService {
    private final FeedbackRepository feedbackRepository;
}
