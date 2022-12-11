package jjfactory.common.domain.feedback.dao;

import jjfactory.common.domain.feedback.entity.FeedbackComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackCommentRepository extends JpaRepository<FeedbackComment, Long> {
}