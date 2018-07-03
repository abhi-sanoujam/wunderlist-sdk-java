package com.sanoujam.wunderlist.model;

import com.google.api.client.util.Key;

public class WLTask {
  @Key private long id;

  @Key("assignee_id")
  private long assigneeId;

  @Key("created_at")
  private String createdAt;

  @Key("created_by_id")
  private long createdById;

  @Key("due_date")
  private String dueDate;

  @Key("list_id")
  private long listId;

  @Key("revision")
  private long revision;

  @Key("starred")
  private boolean starred;

  @Key("title")
  private String title;

  @Key("completed_at")
  private String completedAt;

  @Key("completed_by_id")
  private long completedById;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(long assigneeId) {
    this.assigneeId = assigneeId;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public long getCreatedById() {
    return createdById;
  }

  public void setCreatedById(long createdById) {
    this.createdById = createdById;
  }

  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public long getListId() {
    return listId;
  }

  public void setListId(long listId) {
    this.listId = listId;
  }

  public long getRevision() {
    return revision;
  }

  public void setRevision(long revision) {
    this.revision = revision;
  }

  public boolean isStarred() {
    return starred;
  }

  public void setStarred(boolean starred) {
    this.starred = starred;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }

  public long getCompletedById() {
    return completedById;
  }

  public void setCompletedById(long completedById) {
    this.completedById = completedById;
  }
}
