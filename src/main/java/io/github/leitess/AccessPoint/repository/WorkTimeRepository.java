package io.github.leitess.AccessPoint.repository;

import io.github.leitess.AccessPoint.model.WorkTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkTimeRepository extends JpaRepository<WorkTime, Long> { }
