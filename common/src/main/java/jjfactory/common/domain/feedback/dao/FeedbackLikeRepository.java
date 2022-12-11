package jjfactory.common.domain.feedback.dao;

import jjfactory.common.domain.feedback.entity.FeedbackLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackLikeRepository extends JpaRepository<FeedbackLike, Long> {
}