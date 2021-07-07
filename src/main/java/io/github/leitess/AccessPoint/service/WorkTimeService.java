package io.github.leitess.AccessPoint.service;

import io.github.leitess.AccessPoint.model.WorkTime;
import io.github.leitess.AccessPoint.repository.WorkTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkTimeService
{

    WorkTimeRepository workTimeRepository;

    @Autowired
    public WorkTimeService(WorkTimeRepository workTimeRepository)
    {
        this.workTimeRepository = workTimeRepository;
    }

    public WorkTime saveWorkTime(WorkTime workTime)
    {
        return workTimeRepository.save(workTime);
    }

    public List<WorkTime> findAllWorkTimes()
    {
        return workTimeRepository.findAll();
    }

    public Optional<WorkTime> getWorkTimeById(Long id)
    {
        return workTimeRepository.findById(id);
    }

    public WorkTime updateWorkTime(WorkTime workTime)
    {
        return workTimeRepository.save(workTime);
    }

    public void deleteWorkTimeById(Long id)
    {
        workTimeRepository.deleteById(id);
    }
}
