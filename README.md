# StreamCQL: Continuous Query Language on RealTime Computation System.(example: Apache Storm)

------

Continuous Query Language (CQL) is a query language used for data streams. Compared with traditional SQL, CQL introduces the concept of window. Data is stored in memory so that in-memory computing can be quickly implemented. CQL query results are computing results at a specific moment of data streams.
CQL is a Storm-based SQL query language. It resolves the problem that original Storm APIs are complex and difficult to use and some basic functions are unavailable. CQL improves usability of the Storm component. 
During CQL syntax design, it is found that syntax of existing CEP products includes not only SQL statements but requires client code. This forces users to learn client APIs, which improves complexity and difficulty. 
The CQL design objective is to use SQL statements and certain commands to execute and release all tasks so that the tasks can be distributed by using SQL interfaces. In this way, client interfaces are unified. Users who are familiar with SQL statements can develop operational CQL programs only by learning certain special CQL syntax, such as syntax of window or stream definitions. This reduces difficulty. 

------

## Requirements

Storm 0.10.0-beta : Required
Kafka_2.10 0.8.2.2 : Optional

## Building StreamCQ
StreamCQL is built using [Apache Maven](http://maven.apache.org/).

 1. Clone HuaweiBigData/StreamCQL from github.
```shell
$ git clone https://github.com/HuaweiBigData/StreamCQL
```
 2. Go to the root of source directory.
```shell
$ cd StreamCQL
```
 3. build project
```shell
$ mvn clean install
```
------
## Install StreamCQL
 1. Copy stream-cql-bianry-1.0.tar.gz from

    ${StreamCQL_Source_Dir}/cql-binary/target to Storm Client node.
 2. unCompression stream-cql-bianry-1.0.tar.gz
```shell
$ tar xvf stream-cql-bianry-1.0.tar.gz
```
 3. Go to Stream CQL bin directory
```shell
$ cd stream-cql-bianry-1.0/bin
```
## Submit CQL application to Storm
 1. Open CQL Client Shell.
```shell
$ ./cql
```
 2. Execute CQL in CQL client shell.
this is a simple cql example.
```sql
CREATE INPUT STREAM s
    (id INT, name STRING, type INT)
SOURCE randomgen
    PROPERTIES ( timeUnit = "SECONDS", period = "1",
        eventNumPerperiod = "1", isSchedule = "true" );

CREATE OUTPUT STREAM rs
    (type INT, cc INT)
SINK consoleOutput;

INSERT INTO STREAM rs SELECT type, COUNT(id) as cc
    FROM s[RANGE 20 SECONDS BATCH]
    WHERE id > 5 GROUP BY type;

SBUMIT APPLICATION example;    
```
## Another CQL example with [Apache Kafka](http://kafka.apache.org/)

```sql
CREATE INPUT STREAM s1
    (name STRING)
SOURCE RANDOMGEN
    PROPERTIES ( timeUnit = "SECONDS", period = "1",
        eventNumPerperiod = "1", isSchedule = "true" );

CREATE OUTPUT STREAM s2 
    (c1 STRING)
SINK kafakOutput
    PROPERTIES ( topic = "cqlOut");

CREATE INPUT STREAM s3
    ( c1 STRING)
SOURCE KafkaInput
    PROPERTIES (groupid = "cqlClient", topic = "cqlInput")

CREATE OUTPUT STREAM s4
    (c1 STRING)
SINK consoleOutput;

INSERT INTO STREAM s2 SELECT * FROM s1;
INSERT INTO STREAM s4 SELECT * FROM s3;

SUBMIT APPLICATION cql_kafka_example;
```
