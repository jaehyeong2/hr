package jjfactory.common.domain.feedback.entity;

import jjfactory.common.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Feedback {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private FeedbackBadge feedbackBadge;

    @JoinColumn(name = "sender_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User sender;

    @JoinColumn(name = "receiver_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User receiver;

    @Column(columnDefinition = "TEXT")
    private String contents;;
}
