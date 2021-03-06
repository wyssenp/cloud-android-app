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
 * on 2014-12-17 at 15:23:11 UTC 
 * Modify at your own risk.
 */

package com.mycompany.services.pointendpoint.model;

/**
 * Model definition for Point.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the pointendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Point extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float accuracy;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double altitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float bearing;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double latitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double longtitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long pointId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer satellites;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float speed;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long time;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer trackId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean uploaded;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getAccuracy() {
    return accuracy;
  }

  /**
   * @param accuracy accuracy or {@code null} for none
   */
  public Point setAccuracy(java.lang.Float accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getAltitude() {
    return altitude;
  }

  /**
   * @param altitude altitude or {@code null} for none
   */
  public Point setAltitude(java.lang.Double altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getBearing() {
    return bearing;
  }

  /**
   * @param bearing bearing or {@code null} for none
   */
  public Point setBearing(java.lang.Float bearing) {
    this.bearing = bearing;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLatitude() {
    return latitude;
  }

  /**
   * @param latitude latitude or {@code null} for none
   */
  public Point setLatitude(java.lang.Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLongtitude() {
    return longtitude;
  }

  /**
   * @param longtitude longtitude or {@code null} for none
   */
  public Point setLongtitude(java.lang.Double longtitude) {
    this.longtitude = longtitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getPointId() {
    return pointId;
  }

  /**
   * @param pointId pointId or {@code null} for none
   */
  public Point setPointId(java.lang.Long pointId) {
    this.pointId = pointId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSatellites() {
    return satellites;
  }

  /**
   * @param satellites satellites or {@code null} for none
   */
  public Point setSatellites(java.lang.Integer satellites) {
    this.satellites = satellites;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getSpeed() {
    return speed;
  }

  /**
   * @param speed speed or {@code null} for none
   */
  public Point setSpeed(java.lang.Float speed) {
    this.speed = speed;
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
  public Point setTime(java.lang.Long time) {
    this.time = time;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTrackId() {
    return trackId;
  }

  /**
   * @param trackId trackId or {@code null} for none
   */
  public Point setTrackId(java.lang.Integer trackId) {
    this.trackId = trackId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUploaded() {
    return uploaded;
  }

  /**
   * @param uploaded uploaded or {@code null} for none
   */
  public Point setUploaded(java.lang.Boolean uploaded) {
    this.uploaded = uploaded;
    return this;
  }

  @Override
  public Point set(String fieldName, Object value) {
    return (Point) super.set(fieldName, value);
  }

  @Override
  public Point clone() {
    return (Point) super.clone();
  }

}
