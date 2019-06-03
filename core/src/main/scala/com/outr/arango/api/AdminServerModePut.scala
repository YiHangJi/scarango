package com.outr.arango.api

import io.youi.client.HttpClient
import io.youi.http.HttpMethod
import scala.concurrent.Future
import scribe.Execution.global
          
class AdminServerModePut(client: HttpClient) {
  /**
  * **A JSON object with these properties is required:**
  * 
  *   - **mode**: The mode of the server `readonly` or `default`.
  * 
  * 
  * 
  * 
  * Update mode information about a server. The json response will contain
  * a field `mode` with the value `readonly` or `default`. In a read-only server
  * all write operations will fail with an error code of `1004` (_ERROR_READ_ONLY_).
  * Creating or dropping of databases and collections will also fail with error code `11` (_ERROR_FORBIDDEN_).
  * 
  * This API so it *does require* authentication and administrative server rights.
  */
  def put(body: PutAdminServerMode): Future[ArangoResponse] = client
    .method(HttpMethod.Put)
    .restful[PutAdminServerMode, ArangoResponse](body)
}