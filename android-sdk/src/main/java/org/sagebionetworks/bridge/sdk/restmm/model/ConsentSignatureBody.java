package org.sagebionetworks.bridge.sdk.restmm.model;

import org.joda.time.LocalDate;

import java.util.Date;

public class ConsentSignatureBody {
  /**
   * The identifier for the study under which the user is signing in
   */
  public String study;

  /**
   * User's name
   */
  public String name;

  /**
   * User's birthdate
   */
  public String birthdate;

  /**
   * User's signature image data
   */
  public String imageData;

  /**
   * User's signature image mime type
   */
  public String imageMimeType;

  /**
   * User's sharing scope choice
   */
  public String scope;

  public ConsentSignatureBody(String study, String name, Date birthdate, String imageData,
      String imageMimeType, String scope) {
    this.study = study;
    this.name = name;
    // TODO make sure formatting is correct
    this.birthdate = LocalDate.fromDateFields(birthdate).toString();
    this.imageData = imageData;
    this.imageMimeType = imageMimeType;
    this.scope = scope;
  }
}
