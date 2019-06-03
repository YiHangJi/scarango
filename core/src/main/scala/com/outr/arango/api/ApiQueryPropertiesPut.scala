package com.outr.arango.api

import io.youi.client.HttpClient
import io.youi.http.HttpMethod
import scala.concurrent.Future
import scribe.Execution.global
          
class ApiQueryPropertiesPut(client: HttpClient) {
  /**
  * **A JSON object with these properties is required:**
  * 
  *   - **maxSlowQueries**: The maximum number of slow queries to keep in the list
  *    of slow queries. If the list of slow queries is full, the oldest entry in
  *    it will be discarded when additional slow queries occur.
  *   - **slowQueryThreshold**: The threshold value for treating a query as slow. A
  *    query with a runtime greater or equal to this threshold value will be
  *    put into the list of slow queries when slow query tracking is enabled.
  *    The value for *slowQueryThreshold* is specified in seconds.
  *   - **enabled**: If set to *true*, then queries will be tracked. If set to
  *    *false*, neither queries nor slow queries will be tracked.
  *   - **maxQueryStringLength**: The maximum query string length to keep in the list of queries.
  *    Query strings can have arbitrary lengths, and this property
  *    can be used to save memory in case very long query strings are used. The
  *    value is specified in bytes.
  *   - **trackSlowQueries**: If set to *true*, then slow queries will be tracked
  *    in the list of slow queries if their runtime exceeds the value set in
  *    *slowQueryThreshold*. In order for slow queries to be tracked, the *enabled*
  *    property must also be set to *true*.
  *   - **trackBindVars**: If set to *true*, then the bind variables used in queries will be tracked 
  *    along with queries.
  * 
  * 
  * 
  * 
  * The properties need to be passed in the attribute *properties* in the body
  * of the HTTP request. *properties* needs to be a JSON object.
  * 
  * After the properties have been changed, the current set of properties will
  * be returned in the HTTP response.
  */
  def put(body: PutApiQueryProperties): Future[ArangoResponse] = client
    .method(HttpMethod.Put)
    .restful[PutApiQueryProperties, ArangoResponse](body)
}