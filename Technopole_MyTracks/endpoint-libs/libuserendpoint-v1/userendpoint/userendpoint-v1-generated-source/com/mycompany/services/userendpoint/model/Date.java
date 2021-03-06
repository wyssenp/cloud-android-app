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
 * on 2014-12-17 at 15:23:05 UTC 
 * Modify at your own risk.
 */

package com.mycompany.services.userendpoint.model;

/**
 * Model definition for Date.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the userendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Date extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer date;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer day;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer hours;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minutes;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer month;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer seconds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long time;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timezoneOffset;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer year;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDate() {
    return date;
  }

  /**
   * @param date date or {@code null} for none
   */
  public Date setDate(java.lang.Integer date) {
    this.date = date;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDay() {
    return day;
  }

  /**
   * @param day day or {@code null} for none
   */
  public Date setDay(java.lang.Integer day) {
    this.day = day;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHours() {
    return hours;
  }

  /**
   * @param hours hours or {@code null} for none
   */
  public Date setHours(java.lang.Integer hours) {
    this.hours = hours;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinutes() {
    return minutes;
  }

  /**
   * @param minutes minutes or {@code null} for none
   */
  public Date setMinutes(java.lang.Integer minutes) {
    this.minutes = minutes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMonth() {
    return month;
  }

  /**
   * @param month month or {@code null} for none
   */
  public Date setMonth(java.lang.Integer month) {
    this.month = month;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSeconds() {
    return seconds;
  }

  /**
   * @param seconds seconds or {@code null} for none
   */
  public Date setSeconds(java.lang.Integer seconds) {
    this.seconds = seconds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getTime() {
    return time;
  }

  /**
   * @param time time or {@code null} for none
   */
  public Date setTime(java.lang.Long time) {
    this.time = time;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimezoneOffset() {
    return timezoneOffset;
  }

  /**
   * @param timezoneOffset timezoneOffset or {@code null} for none
   */
  public Date setTimezoneOffset(java.lang.Integer timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getYear() {
    return year;
  }

  /**
   * @param year year or {@code null} for none
   */
  public Date setYear(java.lang.Integer year) {
    this.year = year;
    return this;
  }

  @Override
  public Date set(String fieldName, Object value) {
    return (Date) super.set(fieldName, value);
  }

  @Override
  public Date clone() {
    return (Date) super.clone();
  }

}
