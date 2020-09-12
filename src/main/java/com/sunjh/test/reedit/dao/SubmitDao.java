package com.sunjh.test.reedit.dao;

import com.sunjh.test.reedit.model.Submit;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

/**
 * @author sunjh
 * @date 2020/6/26 17:30
 */
@Transactional
public interface SubmitDao extends JpaSpecificationExecutor<Submit>, PagingAndSortingRepository<Submit, Long> {
}
