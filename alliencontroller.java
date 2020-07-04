package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.allienrepo;
import com.example.demo.model.alien;

import antlr.collections.List;

@Controller
public class alliencontroller {
	@Autowired
	allienrepo repo;
@RequestMapping("/")
public String home() {
	return "home.jsp";
}
@RequestMapping("/addalien")
public String addalien(alien alien) {
	repo.save(alien);
	return  "home.jsp";
}
@RequestMapping("/alliens")
@ResponseBody
public java.util.List<alien> getAlliens() {
	return repo.findAll();
}
@RequestMapping("/deletealien")


	public String deletealien() {


	return  "getalien.jsp";
	
}

@RequestMapping("/deletealien/{aid}")
@ResponseBody

public String deletealienByaid(int aid) {

	alien a= repo.getOne(aid);
	repo.delete(a);
	return "deleted";



}
@RequestMapping("/searchbyid")


public String searchbyid() {


return  "search.jsp";

}

@RequestMapping("/searchbyid/{aid}")
@ResponseBody

public Optional<alien> searchalienByaid( int aid) {
	return repo.findById(aid);

	



}
@RequestMapping("/update")
public String update() {
	return "updatealien.jsp";
}
@RequestMapping("/updatestudent")


public String  updatestudent(alien alien) {
	
		repo.save(alien);
		return  "home.jsp";
	}
	

	



}





