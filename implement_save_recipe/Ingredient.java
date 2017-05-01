package com.example.entity;

/**
 * Created by doug on 4/18/17.
 */
public class Ingredient {

  private Integer id;
  private String name;

  public Ingredient(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public Ingredient(){}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Ingredient{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}