# Elasticsearch Plugin Stub

These project files document how to create a custom similarity scoring plugin for 
elasticsearch.

First of all, you need to define an `ES_PATH` environment variable. If you installed easticsearch through `brew`, you
can find this out using `brew list elasticsearch`:

```
export ES_PATH=/usr/local/Cellar/elasticsearch/5.3.0
```

