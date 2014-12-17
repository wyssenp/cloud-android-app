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
 * on 2014-12-17 at 15:23:16 UTC 
 * Modify at your own risk.
 */

package com.mycompany.services.trackendpoint;

/**
 * Service definition for Trackendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link TrackendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Trackendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the trackendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://androidapp-hesso.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "trackendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Trackendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Trackendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getTrack".
   *
   * This request holds the parameters needed by the trackendpoint server.  After setting any optional
   * parameters, call the {@link GetTrack#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetTrack getTrack(java.lang.Long id) throws java.io.IOException {
    GetTrack result = new GetTrack(id);
    initialize(result);
    return result;
  }

  public class GetTrack extends TrackendpointRequest<com.mycompany.services.trackendpoint.model.Track> {

    private static final String REST_PATH = "track/{id}";

    /**
     * Create a request for the method "getTrack".
     *
     * This request holds the parameters needed by the the trackendpoint server.  After setting any
     * optional parameters, call the {@link GetTrack#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetTrack#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetTrack(java.lang.Long id) {
      super(Trackendpoint.this, "GET", REST_PATH, null, com.mycompany.services.trackendpoint.model.Track.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetTrack setAlt(java.lang.String alt) {
      return (GetTrack) super.setAlt(alt);
    }

    @Override
    public GetTrack setFields(java.lang.String fields) {
      return (GetTrack) super.setFields(fields);
    }

    @Override
    public GetTrack setKey(java.lang.String key) {
      return (GetTrack) super.setKey(key);
    }

    @Override
    public GetTrack setOauthToken(java.lang.String oauthToken) {
      return (GetTrack) super.setOauthToken(oauthToken);
    }

    @Override
    public GetTrack setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetTrack) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetTrack setQuotaUser(java.lang.String quotaUser) {
      return (GetTrack) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetTrack setUserIp(java.lang.String userIp) {
      return (GetTrack) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetTrack setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetTrack set(String parameterName, Object value) {
      return (GetTrack) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertTrack".
   *
   * This request holds the parameters needed by the trackendpoint server.  After setting any optional
   * parameters, call the {@link InsertTrack#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.mycompany.services.trackendpoint.model.Track}
   * @return the request
   */
  public InsertTrack insertTrack(com.mycompany.services.trackendpoint.model.Track content) throws java.io.IOException {
    InsertTrack result = new InsertTrack(content);
    initialize(result);
    return result;
  }

  public class InsertTrack extends TrackendpointRequest<com.mycompany.services.trackendpoint.model.Track> {

    private static final String REST_PATH = "track";

    /**
     * Create a request for the method "insertTrack".
     *
     * This request holds the parameters needed by the the trackendpoint server.  After setting any
     * optional parameters, call the {@link InsertTrack#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertTrack#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.mycompany.services.trackendpoint.model.Track}
     * @since 1.13
     */
    protected InsertTrack(com.mycompany.services.trackendpoint.model.Track content) {
      super(Trackendpoint.this, "POST", REST_PATH, content, com.mycompany.services.trackendpoint.model.Track.class);
    }

    @Override
    public InsertTrack setAlt(java.lang.String alt) {
      return (InsertTrack) super.setAlt(alt);
    }

    @Override
    public InsertTrack setFields(java.lang.String fields) {
      return (InsertTrack) super.setFields(fields);
    }

    @Override
    public InsertTrack setKey(java.lang.String key) {
      return (InsertTrack) super.setKey(key);
    }

    @Override
    public InsertTrack setOauthToken(java.lang.String oauthToken) {
      return (InsertTrack) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertTrack setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertTrack) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertTrack setQuotaUser(java.lang.String quotaUser) {
      return (InsertTrack) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertTrack setUserIp(java.lang.String userIp) {
      return (InsertTrack) super.setUserIp(userIp);
    }

    @Override
    public InsertTrack set(String parameterName, Object value) {
      return (InsertTrack) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listTrack".
   *
   * This request holds the parameters needed by the trackendpoint server.  After setting any optional
   * parameters, call the {@link ListTrack#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListTrack listTrack() throws java.io.IOException {
    ListTrack result = new ListTrack();
    initialize(result);
    return result;
  }

  public class ListTrack extends TrackendpointRequest<com.mycompany.services.trackendpoint.model.CollectionResponseTrack> {

    private static final String REST_PATH = "track";

    /**
     * Create a request for the method "listTrack".
     *
     * This request holds the parameters needed by the the trackendpoint server.  After setting any
     * optional parameters, call the {@link ListTrack#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListTrack#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListTrack() {
      super(Trackendpoint.this, "GET", REST_PATH, null, com.mycompany.services.trackendpoint.model.CollectionResponseTrack.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListTrack setAlt(java.lang.String alt) {
      return (ListTrack) super.setAlt(alt);
    }

    @Override
    public ListTrack setFields(java.lang.String fields) {
      return (ListTrack) super.setFields(fields);
    }

    @Override
    public ListTrack setKey(java.lang.String key) {
      return (ListTrack) super.setKey(key);
    }

    @Override
    public ListTrack setOauthToken(java.lang.String oauthToken) {
      return (ListTrack) super.setOauthToken(oauthToken);
    }

    @Override
    public ListTrack setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListTrack) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListTrack setQuotaUser(java.lang.String quotaUser) {
      return (ListTrack) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListTrack setUserIp(java.lang.String userIp) {
      return (ListTrack) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListTrack setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListTrack setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListTrack set(String parameterName, Object value) {
      return (ListTrack) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeTrack".
   *
   * This request holds the parameters needed by the trackendpoint server.  After setting any optional
   * parameters, call the {@link RemoveTrack#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveTrack removeTrack(java.lang.Long id) throws java.io.IOException {
    RemoveTrack result = new RemoveTrack(id);
    initialize(result);
    return result;
  }

  public class RemoveTrack extends TrackendpointRequest<Void> {

    private static final String REST_PATH = "track/{id}";

    /**
     * Create a request for the method "removeTrack".
     *
     * This request holds the parameters needed by the the trackendpoint server.  After setting any
     * optional parameters, call the {@link RemoveTrack#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveTrack#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveTrack(java.lang.Long id) {
      super(Trackendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveTrack setAlt(java.lang.String alt) {
      return (RemoveTrack) super.setAlt(alt);
    }

    @Override
    public RemoveTrack setFields(java.lang.String fields) {
      return (RemoveTrack) super.setFields(fields);
    }

    @Override
    public RemoveTrack setKey(java.lang.String key) {
      return (RemoveTrack) super.setKey(key);
    }

    @Override
    public RemoveTrack setOauthToken(java.lang.String oauthToken) {
      return (RemoveTrack) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveTrack setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveTrack) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveTrack setQuotaUser(java.lang.String quotaUser) {
      return (RemoveTrack) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveTrack setUserIp(java.lang.String userIp) {
      return (RemoveTrack) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveTrack setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveTrack set(String parameterName, Object value) {
      return (RemoveTrack) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateTrack".
   *
   * This request holds the parameters needed by the trackendpoint server.  After setting any optional
   * parameters, call the {@link UpdateTrack#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.mycompany.services.trackendpoint.model.Track}
   * @return the request
   */
  public UpdateTrack updateTrack(com.mycompany.services.trackendpoint.model.Track content) throws java.io.IOException {
    UpdateTrack result = new UpdateTrack(content);
    initialize(result);
    return result;
  }

  public class UpdateTrack extends TrackendpointRequest<com.mycompany.services.trackendpoint.model.Track> {

    private static final String REST_PATH = "track";

    /**
     * Create a request for the method "updateTrack".
     *
     * This request holds the parameters needed by the the trackendpoint server.  After setting any
     * optional parameters, call the {@link UpdateTrack#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateTrack#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.mycompany.services.trackendpoint.model.Track}
     * @since 1.13
     */
    protected UpdateTrack(com.mycompany.services.trackendpoint.model.Track content) {
      super(Trackendpoint.this, "PUT", REST_PATH, content, com.mycompany.services.trackendpoint.model.Track.class);
    }

    @Override
    public UpdateTrack setAlt(java.lang.String alt) {
      return (UpdateTrack) super.setAlt(alt);
    }

    @Override
    public UpdateTrack setFields(java.lang.String fields) {
      return (UpdateTrack) super.setFields(fields);
    }

    @Override
    public UpdateTrack setKey(java.lang.String key) {
      return (UpdateTrack) super.setKey(key);
    }

    @Override
    public UpdateTrack setOauthToken(java.lang.String oauthToken) {
      return (UpdateTrack) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateTrack setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateTrack) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateTrack setQuotaUser(java.lang.String quotaUser) {
      return (UpdateTrack) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateTrack setUserIp(java.lang.String userIp) {
      return (UpdateTrack) super.setUserIp(userIp);
    }

    @Override
    public UpdateTrack set(String parameterName, Object value) {
      return (UpdateTrack) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Trackendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Trackendpoint}. */
    @Override
    public Trackendpoint build() {
      return new Trackendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link TrackendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setTrackendpointRequestInitializer(
        TrackendpointRequestInitializer trackendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(trackendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
