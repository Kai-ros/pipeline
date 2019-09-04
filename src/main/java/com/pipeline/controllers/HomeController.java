package com.pipeline.controllers;

import com.pipeline.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;

@Controller
public class HomeController {

    @Autowired
    ApplicationUserRepository applicationUserRepository;

    @Autowired
    CandidateGroupRepository candidateGroupRepository;

    @Autowired
    ScheduledTaskRepository scheduledTaskRepository;

    @Autowired
    ProgressRepository progressRepository;

    @GetMapping("/")
    public String getRoot(){
        return "root";
    }

    @GetMapping("/registration")
    public String getRegistration(){
        return "registration";
    }

    @GetMapping("/dashboard")
    public String getDash(Principal p, Model m){
        //Group if candidate
        //Groups associated with admin user
        //pull progress table
        //pull task table
        ApplicationUser currentUser = applicationUserRepository.findByUsername(p.getName());

        m.addAttribute("loggedInUser", currentUser);
//        m.addAttribute(, );
        return "dashboard";
    }

    @GetMapping("/logout")
    public String getLogout(){
        return "root";
    }


//Testing purpose front end
    @GetMapping("/groupview")
    public String getGroupView(){
        return "groupView";
    }

    @GetMapping("/taskview")
    public String getTaskView(){
        return "taskView";
    }


    //Testing purpose front end


}
