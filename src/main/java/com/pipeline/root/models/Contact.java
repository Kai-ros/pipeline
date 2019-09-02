package com.pipeline.root.models;

public class Contact {

  private final long id;
  private String contactName;
  private String contactEmail;
  private String contactCatchPhrase;

  public Contact(long id, String contactName, String contactEmail, String contactCatchPhrase) {
    this.id = id;
    this.contactName = contactName;
    this.contactEmail = contactEmail;
    this.contactCatchPhrase = contactCatchPhrase;
  }

  public long getId() {
    return id;
  }

  public String getContactName() {
    return contactName;
  }

  public String getContactEmail() {
    return contactEmail;
  }

  public String getCCatchPhrase() {
    return contactCatchPhrase;
  }
}