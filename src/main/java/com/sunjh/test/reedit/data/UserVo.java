package com.sunjh.test.reedit.data;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author sunjh
 * @date 2020/6/26 17:37
 */
@Data
public class UserVo {
    private Long id;
    private String name;
    private Timestamp createTime;
    private Timestamp doTime;
}
