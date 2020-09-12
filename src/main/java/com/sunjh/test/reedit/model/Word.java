package com.sunjh.test.reedit.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author sunjh
 * @date 2020/6/26 17:21
 */
@Entity
@Data
@Table(name = "word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "en")
    private String en;

    @Column(name = "cn")
    private String cn;

    @Column(name = "type")
    private String type;

    @Column(name = "selected")
    private Boolean selected;
}
