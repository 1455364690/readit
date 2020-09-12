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
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "do_time")
    private Timestamp doTime;
}
