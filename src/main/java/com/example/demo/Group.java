package com.example.demo;

import java.util.List;

public class Group {
  private String id;
  private List<User> users;
  private List<Group> children;

  public List<Group> getChildren() {
    return children;
  }

  public void setChildren(List<Group> children) {
    this.children = children;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }
}
