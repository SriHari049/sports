package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="roles")

public class Roles {
  
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  
  @Column(name = "role")
  int role;
  
  @ManyToOne()
  @JoinColumn(name = "mid")
  Menus menus;
  
  public Long getId() {
    return id;
  }
  

}