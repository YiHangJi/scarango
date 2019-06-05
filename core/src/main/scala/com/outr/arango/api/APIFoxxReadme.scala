package com.outr.arango.api

import com.outr.arango.api.model._
import io.youi.client.HttpClient
import io.youi.http.HttpMethod
import io.youi.net._
import io.circe.Json
import scala.concurrent.Future
import scribe.Execution.global
      
class APIFoxxReadme(client: HttpClient) {
  /**
  * Fetches the service's README or README.md file's contents if any.
  */
  def get(mount: String): Future[Json] = client
    .method(HttpMethod.Get)
    .path(path"/_api/foxx/readme", append = true) 
    .params("mount" -> mount.toString)
    .call[Json]
}