package ru.itis.spring_app_template.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Post extends AbstractEntity {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    User author;
    String content;
    Timestamp createdAt;
}
