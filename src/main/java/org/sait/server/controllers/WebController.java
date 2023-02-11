package org.sait.server.controllers;

import org.sait.server.entities.ClubService;
import org.sait.server.entities.Event;
import org.sait.server.entities.Member;
import org.sait.server.services.CSService;
import org.sait.server.services.EventService;
import org.sait.server.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@CrossOrigin(origins = "*")
@RestController
public class WebController
{
    @Autowired
    private MemberService memberService;

    @Autowired
    private CSService csService;

    @Autowired
    private EventService eventService;


    @GetMapping("/member")
    public Member getMember() throws InterruptedException, ExecutionException
    {
        return memberService.getMember();
    }


    @GetMapping("/members/{type}")
    public List<Member> getAllMembers(@PathVariable("type") String type) throws InterruptedException, ExecutionException
    {
        return memberService.getAllMembers(type);
    }


    @PostMapping("/member")
    public String addMember(@RequestBody Member member) throws InterruptedException, ExecutionException
    {
        return memberService.addMember(member);
    }


    @GetMapping("/clubservices")
    public List<ClubService> getAllCS() throws ExecutionException, InterruptedException {
        return csService.getAllCS();
    }

    @GetMapping("/events")
    public List<Event> getAllEvents() throws ExecutionException, InterruptedException {
        return eventService.getAllEvents();
    }
}
