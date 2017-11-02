package com.jayg.tis.task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskDao extends JpaRepository <Task, Integer>{

}
