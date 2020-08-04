package com.example.demo;

import java.util.List;

public class User {
  private String id;
  private List<Group> groups;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }
}
