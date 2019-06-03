package com.outr.arango.api

/**
  * PutAPIReplicationApplierAdjust
  *
  * @param endpoint the logger server to connect to (e.g. "tcp://192.168.173.13:8529"). The endpoint must be specified.
  * @param adaptivePolling if set to *true*, the replication applier will fall
  *        to sleep for an increasingly long period in case the logger server at the
  *        endpoint does not have any more replication events to apply. Using
  *        adaptive polling is thus useful to reduce the amount of work for both the
  *        applier and the logger server for cases when there are only infrequent
  *        changes. The downside is that when using adaptive polling, it might take
  *        longer for the replication applier to detect that there are new replication
  *        events on the logger server.
  *        
  *        Setting *adaptivePolling* to false will make the replication applier
  *        contact the logger server in a constant interval, regardless of whether
  *        the logger server provides updates frequently or seldom.
  * @param autoResync whether or not the slave should perform a full automatic resynchronization
  *        with the master in case the master cannot serve log data requested by the
  *        slave,
  *        or when the replication is started and no tick value can be found.
  * @param autoResyncRetries number of resynchronization retries that will be performed in a row when
  *        automatic resynchronization is enabled and kicks in. Setting this to *0*
  *        will
  *        effectively disable *autoResync*. Setting it to some other value will limit
  *        the number of retries that are performed. This helps preventing endless
  *        retries
  *        in case resynchronizations always fail.
  * @param autoStart whether or not to auto-start the replication applier on
  *        (next and following) server starts
  * @param chunkSize the requested maximum size for log transfer packets that
  *        is used when the endpoint is contacted.
  * @param connectTimeout the timeout (in seconds) when attempting to connect to the
  *        endpoint. This value is used for each connection attempt.
  * @param connectionRetryWaitTime the time (in seconds) that the applier will intentionally idle before
  *        it retries connecting to the master in case of connection problems.
  *        This value will be ignored if set to *0*.
  * @param database the name of the database on the endpoint. If not specified, defaults to the current local database name.
  * @param idleMaxWaitTime the maximum wait time (in seconds) that the applier will intentionally idle 
  *        before fetching more log data from the master in case the master has 
  *        already sent all its log data and there have been previous log fetch attempts
  *        that resulted in no more log data. This wait time can be used to control the
  *        maximum frequency with which the replication applier sends HTTP log fetch
  *        requests to the master in case there is no write activity on the master for
  *        longer periods. This configuration value will only be used if the option
  *        *adaptivePolling* is set to *true*.
  *        This value will be ignored if set to *0*.
  * @param idleMinWaitTime the minimum wait time (in seconds) that the applier will intentionally idle
  *        before fetching more log data from the master in case the master has
  *        already sent all its log data. This wait time can be used to control the
  *        frequency with which the replication applier sends HTTP log fetch requests
  *        to the master in case there is no write activity on the master.
  *        This value will be ignored if set to *0*.
  * @param includeSystem whether or not system collection operations will be applied
  * @param initialSyncMaxWaitTime the maximum wait time (in seconds) that the initial synchronization will
  *        wait for a response from the master when fetching initial collection data.
  *        This wait time can be used to control after what time the initial
  *        synchronization
  *        will give up waiting for a response and fail. This value is relevant even
  *        for continuous replication when *autoResync* is set to *true* because this
  *        may re-start the initial synchronization when the master cannot provide
  *        log data the slave requires.
  *        This value will be ignored if set to *0*.
  * @param maxConnectRetries the maximum number of connection attempts the applier
  *        will make in a row. If the applier cannot establish a connection to the
  *        endpoint in this number of attempts, it will stop itself.
  * @param password the password to use when connecting to the endpoint.
  * @param requestTimeout the timeout (in seconds) for individual requests to the endpoint.
  * @param requireFromPresent if set to *true*, then the replication applier will check
  *        at start whether the start tick from which it starts or resumes replication is
  *        still present on the master. If not, then there would be data loss. If 
  *        *requireFromPresent* is *true*, the replication applier will abort with an
  *        appropriate error message. If set to *false*, then the replication applier will
  *        still start, and ignore the data loss.
  * @param restrictCollections the array of collections to include or exclude,
  *        based on the setting of *restrictType*
  * @param restrictType the configuration for *restrictCollections*; Has to be either *include* or *exclude*
  * @param username an optional ArangoDB username to use when connecting to the endpoint.
  * @param verbose if set to *true*, then a log line will be emitted for all operations 
  *        performed by the replication applier. This should be used for debugging replication
  *        problems only.
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class PutAPIReplicationApplierAdjust(endpoint: String,
                                          adaptivePolling: Option[Boolean] = None,
                                          autoResync: Option[Boolean] = None,
                                          autoResyncRetries: Option[Long] = None,
                                          autoStart: Option[Boolean] = None,
                                          chunkSize: Option[Long] = None,
                                          connectTimeout: Option[Long] = None,
                                          connectionRetryWaitTime: Option[Long] = None,
                                          database: Option[String] = None,
                                          idleMaxWaitTime: Option[Long] = None,
                                          idleMinWaitTime: Option[Long] = None,
                                          includeSystem: Option[Boolean] = None,
                                          initialSyncMaxWaitTime: Option[Long] = None,
                                          maxConnectRetries: Option[Long] = None,
                                          password: Option[String] = None,
                                          requestTimeout: Option[Long] = None,
                                          requireFromPresent: Option[Boolean] = None,
                                          restrictCollections: Option[List[String]] = None,
                                          restrictType: Option[String] = None,
                                          username: Option[String] = None,
                                          verbose: Option[Boolean] = None)