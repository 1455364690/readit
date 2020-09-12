package com.sunjh.test.reedit.dao;

import com.sunjh.test.reedit.model.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

/**
 * @author sunjh
 * @date 2020/6/26 17:29
 */
@Transactional
public interface UserDao extends JpaSpecificationExecutor<User>, PagingAndSortingRepository<User, Long> {
}
