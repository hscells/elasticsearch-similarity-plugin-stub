# Elasticsearch Plugin Stub

These project files document how to create a custom similarity scoring plugin for elasticsearch.

First of all, you need to define an `ES_PATH` environment variable. If you installed elasticsearch through 
`brew`, you can find this out using `brew list elasticsearch`:

```bash
export ES_PATH=/usr/local/Cellar/elasticsearch/5.3.0
```

Next, you may wish to rename the package from `com.github.hscells.customsimilarity` to something more 
appropriate. You should also rename the classes from `MyCustomSimilarity...` to something more
appropriate. This isn't necessary but is recommended. Finally, to set the name of your similarity
plugin when you use it in the elasticsearch api, change the `SIMILARITY_NAME` field in the plugin class
(the class that extends `Plugin`).

At this stage, you should be all set to install the plugin to elasticsearch. A `gradle` task is provided
to do this. It will build and copy the files to wherever `ES_PATH` is set. To run this `gradle` task, in
the same directory as this readme file, run:

```bash
./gradlew installPlugin
```

For elasticsearch to register the plugin as installed, you need to **restart** elasticsearch.
