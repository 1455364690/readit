package com.sunjh.test.reedit.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author sunjh
 * @date 2020/6/26 17:21
 */
@Entity
@Data
@Table(name = "submit")
public class Submit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "worker_id")
    private Long workId;

    @Column(name = "word_id")
    private Long wordId;

    @Column(name = "answer")
    private Long answer;

    @Column(name = "start_time")
    private Timestamp startTime;

    @Column(name = "sure_time")
    private Timestamp sureTime;
}
