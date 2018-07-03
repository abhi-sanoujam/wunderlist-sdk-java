package com.sanoujam.wunderlist.model;

import com.google.api.client.util.Key;

public class WLList {
  @Key private long id;

  @Key("created_at")
  private String createdAt;

  @Key("title")
  private String title;

  @Key("list_type")
  private String listType;

  @Key("type")
  private String type;

  @Key("revision")
  private long revision;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getListType() {
    return listType;
  }

  public void setListType(String listType) {
    this.listType = listType;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getRevision() {
    return revision;
  }

  public void setRevision(long revision) {
    this.revision = revision;
  }
}
