package jjfactory.common.domain.feedback.dao;

import jjfactory.common.domain.feedback.entity.FeedbackBadge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackBadgeRepository extends JpaRepository<FeedbackBadge, Long> {
}