package com.sishiancode.bugtrackerdemo.cucumber;

import com.sishiancode.bugtrackerdemo.JHipsterBugTrackerDemoApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JHipsterBugTrackerDemoApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
