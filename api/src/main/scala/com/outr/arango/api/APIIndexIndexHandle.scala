package com.outr.arango.api

import com.outr.arango.api.model._
import io.youi.client.HttpClient
import io.youi.http.HttpMethod
import io.youi.net._
import io.circe.Json
import scala.concurrent.{ExecutionContext, Future}
      
object APIIndexIndexHandle {
  /**
  * Deletes an index with *index-handle*.
  * 
  * 
  * 
  * 
  * **Example:**
  *  
  * 
  * <pre><code><span class="hljs-meta">shell&gt;</span><span class="bash"> curl -X DELETE --header <span class="hljs-string">'accept: application/json'</span> --dump - http://localhost:8529/_api/index/products/104909</span>
  * </code><code>
  * </code><code>HTTP/<span class="hljs-number">1.1</span> OK
  * </code><code>content-type: application/json; charset=utf<span class="hljs-number">-8</span>
  * </code><code>x-content-type-options: nosniff
  * </code><code>
  * </code><code>{ 
  * </code><code>  <span class="hljs-string">"id"</span> : <span class="hljs-string">"products/104909"</span>, 
  * </code><code>  <span class="hljs-string">"error"</span> : <span class="hljs-literal">false</span>, 
  * </code><code>  <span class="hljs-string">"code"</span> : <span class="hljs-number">200</span> 
  * </code><code>}
  * </code></pre>
  */
  def delete(client: HttpClient, indexHandle: String)(implicit ec: ExecutionContext): Future[Json] = client
    .method(HttpMethod.Delete)
    .path(path"/_api/index/{index-handle}".withArguments(Map("index-handle" -> indexHandle)), append = true)
    .call[Json]

  /**
  * The result is an object describing the index. It has at least the following
  * attributes:
  * 
  * - *id*: the identifier of the index
  * 
  * - *type*: the index type
  * 
  * All other attributes are type-dependent. For example, some indexes provide
  * *unique* or *sparse* flags, whereas others don't. Some indexes also provide 
  * a selectivity estimate in the *selectivityEstimate* attribute of the result.
  * 
  * 
  * 
  * 
  * **Example:**
  *  
  * 
  * <pre><code><span class="hljs-meta">shell&gt;</span><span class="bash"> curl --header <span class="hljs-string">'accept: application/json'</span> --dump - http://localhost:8529/_api/index/products/0</span>
  * </code><code>
  * </code><code>HTTP/<span class="hljs-number">1.1</span> OK
  * </code><code>content-type: application/json; charset=utf<span class="hljs-number">-8</span>
  * </code><code>x-content-type-options: nosniff
  * </code><code>
  * </code><code>{ 
  * </code><code>  <span class="hljs-string">"fields"</span> : [ 
  * </code><code>    <span class="hljs-string">"_key"</span> 
  * </code><code>  ], 
  * </code><code>  <span class="hljs-string">"id"</span> : <span class="hljs-string">"products/0"</span>, 
  * </code><code>  <span class="hljs-string">"sparse"</span> : <span class="hljs-literal">false</span>, 
  * </code><code>  <span class="hljs-string">"type"</span> : <span class="hljs-string">"primary"</span>, 
  * </code><code>  <span class="hljs-string">"unique"</span> : <span class="hljs-literal">true</span>, 
  * </code><code>  <span class="hljs-string">"error"</span> : <span class="hljs-literal">false</span>, 
  * </code><code>  <span class="hljs-string">"code"</span> : <span class="hljs-number">200</span> 
  * </code><code>}
  * </code></pre>
  */
  def get(client: HttpClient, indexHandle: String)(implicit ec: ExecutionContext): Future[Json] = client
    .method(HttpMethod.Get)
    .path(path"/_api/index/{index-handle}".withArguments(Map("index-handle" -> indexHandle)), append = true)
    .call[Json]
}