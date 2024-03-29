package com.assap.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "USER")
public class User {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name = "ID",unique = true)	
  private Integer id;
  @Column(name = "USERNAME",unique = true)	
  private String username;
  @Column(name = "PASSWORD")
  private String password;
  
  public User(String username, String password) { 
	this.username = username;
	this.password = password;
  }  
  
  public User(){}

  public Integer getId(){
   return id;	  
  }
  public void setId(Integer id){
   this.id = id;	  
  }
  public String getUsername() {
	return username;
  }
  public void setUsername(String username) {
	this.username = username;
  }
  public String getPassword() {
	return password;
  }
  public void setPassword(String password) {
	this.password = password;
  }
}