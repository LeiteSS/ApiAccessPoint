package io.github.leitess.AccessPoint.controller;

import io.github.leitess.AccessPoint.model.WorkTime;
import io.github.leitess.AccessPoint.service.WorkTimeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1/worktime")
@Api("/api/v1/worktime")
public class WorkTimeController
{
    @Autowired
    WorkTimeService workTimeService;

    @PostMapping
    public WorkTime createWorkTime(@RequestBody WorkTime workTime)
    {
        return workTimeService.saveWorkTime(workTime);
    }

    @GetMapping
    public List<WorkTime> getWorkTimeList()
    {
        return workTimeService.findAllWorkTimes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkTime> getWorkTimeById(@PathVariable Long id) throws Exception
    {
        return ResponseEntity.ok(
                workTimeService.getWorkTimeById(id)
                        .orElseThrow(
                                () -> new NoSuchElementException(("Work Time Not Found"))));
    }

    @PutMapping
    public WorkTime updateWorkTime(@RequestBody WorkTime workTime)
    {
        return workTimeService.updateWorkTime(workTime);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkTime(@PathVariable Long id)
    {
        workTimeService.deleteWorkTimeById(id);
    }
}
