### Spring Boot, ElastichSearch, Logstash, Kibana Demo

* Remove comment line (ony remove # symbol) `elasticsearch.url: "http://localhost:9200"` in kibana.yml file

* Execute this command `./elasticsearch` in this folder **ELASTICSEARCH_DIR/bin/**

* Execute this command `./kibana` in this folder **KIBANA_DIR/bin/**

* Execute this command `./logstash -f logstash.conf` in this folder **LOGSTASH_DIR/bin/**

* You can see logs then your application started on Postman by this link `http://localhost:9200/logstash-*/_search`


#### Urls and Ports
Elastichsearch: http://localhost:9200/

Kibana: http://localhost:5601

Logstash: http://localhost:9600/

Spring Boot App: http://localhost:8080
