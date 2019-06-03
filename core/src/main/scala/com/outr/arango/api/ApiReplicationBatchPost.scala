package com.outr.arango.api

import io.youi.client.HttpClient
import io.youi.http.HttpMethod
import scala.concurrent.Future
import scribe.Execution.global
          
class ApiReplicationBatchPost(client: HttpClient) {
  /**
  * **A JSON object with these properties is required:**
  * 
  *   - **ttl**: the time-to-live for the new batch (in seconds)
  *    A JSON object with the batch configuration.
  * 
  * 
  * 
  * 
  * Creates a new dump batch and returns the batch's id.
  * 
  * The response is a JSON object with the following attributes:
  * 
  * - *id*: the id of the batch
  * 
  * **Note**: on a coordinator, this request must have the query parameter
  * *DBserver* which must be an ID of a DBserver.
  * The very same request is forwarded synchronously to that DBserver.
  * It is an error if this attribute is not bound in the coordinator case.
  */
  def post(body: PostBatchReplication): Future[ArangoResponse] = client
    .method(HttpMethod.Post)
    .restful[PostBatchReplication, ArangoResponse](body)
}