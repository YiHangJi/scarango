package com.outr.arango.api

import io.youi.client.HttpClient
import io.youi.http.HttpMethod
import scala.concurrent.Future
import scribe.Execution.global
          
class AdminShutdownDelete(client: HttpClient) {
  /**
  * This call initiates a clean shutdown sequence. Requires administrive privileges
  */
  def delete(): Future[ArangoResponse] = client
    .method(HttpMethod.Delete)
    .call[ArangoResponse]
}