/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-11-17 18:43:33 UTC)
 * on 2014-12-11 at 22:31:48 UTC 
 * Modify at your own risk.
 */

package com.mycompany.services.userendpoint.model;

/**
 * Model definition for User.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the userendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class User extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer countryId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date dateOfBirth;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disability;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firstname;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gender;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mail;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer nationalityId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer userId;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCountryId() {
    return countryId;
  }

  /**
   * @param countryId countryId or {@code null} for none
   */
  public User setCountryId(java.lang.Integer countryId) {
    this.countryId = countryId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  /**
   * @param dateOfBirth dateOfBirth or {@code null} for none
   */
  public User setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisability() {
    return disability;
  }

  /**
   * @param disability disability or {@code null} for none
   */
  public User setDisability(java.lang.Boolean disability) {
    this.disability = disability;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFirstname() {
    return firstname;
  }

  /**
   * @param firstname firstname or {@code null} for none
   */
  public User setFirstname(java.lang.String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getGender() {
    return gender;
  }

  /**
   * @param gender gender or {@code null} for none
   */
  public User setGender(java.lang.String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMail() {
    return mail;
  }

  /**
   * @param mail mail or {@code null} for none
   */
  public User setMail(java.lang.String mail) {
    this.mail = mail;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public User setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNationalityId() {
    return nationalityId;
  }

  /**
   * @param nationalityId nationalityId or {@code null} for none
   */
  public User setNationalityId(java.lang.Integer nationalityId) {
    this.nationalityId = nationalityId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUserId() {
    return userId;
  }

  /**
   * @param userId userId or {@code null} for none
   */
  public User setUserId(java.lang.Integer userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public User set(String fieldName, Object value) {
    return (User) super.set(fieldName, value);
  }

  @Override
  public User clone() {
    return (User) super.clone();
  }

}
