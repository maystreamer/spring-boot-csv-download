# spring-boot-csv-download
Streaming large result set from MySQL using Java 8 and then download data as large/big CSV file. <br/><br/>Fetching and processing large amount of resultsets from the database, MySQL in my case, using simple and commonly used approaches often result in out of memory error. With the ORMs or libraries like JPA, where we work on high level abstractions provided by such libraries, chances of OutOfMemory error is very high if the resultset is considerably large.
<br/>With the introduction of Streams in Java 8, we can fetch and process large amount of resultsets with minimal memory foot print.

## Getting Started

Git clone the project on your local machine and add it to your workspace

### Prerequisites

For runnning this, you will need
- Java 1.8
- Gradle support - In Eclipse editor, goto help -> eclipse marketplace -> search for buildship (buildship gradle integration) and install it.

## Brief
I have loaded MySQL database with half a million records('500, 000') of **UserDetail** model. You can download the sample data from [Sample-SQL-File-500000rows.sql](http://www.sample-videos.com/sql/Sample-SQL-File-500000rows.sql). I have also added schema **[create.sql]** and records file **[Sample-SQL-File-500000-Rows.csv]** inside [src/main/resources] folder <br/>
Then I have added two methods in **SampleController**, one for Stream (generateCSVUsingStream) and Other for List (generateCSVUsingList).

## Running the app

For running the app,
- Open **application.properties** file and update "spring.datasource.*" properties as per your configurations.
- Once, changes are done in **application.properties**, open **"AppStarter.Java"** file and select run/debug.
- If app starts successfully, hit. (I did some sort of perf monitoring (threads used 50), attaching perf results for both requests.)<br/><br/><br/>
**GET** http://localhost:8080/api/sample/userdetail/list/csv
<br/><br/><br/>
1. This shows stats for CPU, Heap, Classes and Threads when using List <br/>
![alt text](https://github.com/greyseal/spring-boot-csv-download/blob/master/src/main/resources/list_monitor.png "Using List Monitor")
<br/><br/><br/>
2. This shows stats for Visual GC when using List<br/>
![alt text](https://github.com/greyseal/spring-boot-csv-download/blob/master/src/main/resources/list_gc.png "Using List GC")
<br/><br/><br/>
**GET** http://localhost:8080/api/sample/userdetail/stream/csv
<br/><br/><br/>
1. This shows stats for CPU, Heap, Classes and Threads when using Stream <br/>
![alt text](https://github.com/greyseal/spring-boot-csv-download/blob/master/src/main/resources/stream_monitor.png "Using Stream Monitor")
<br/><br/><br/>
2. This shows stats for Visual GC when using Stream<br/>
![alt text](https://github.com/greyseal/spring-boot-csv-download/blob/master/src/main/resources/stream_gc.png "Using Stream GC")
<br/>

## Built With
* [Spring Boot](https://projects.spring.io/spring-boot/) - The web framework used
* [Gradle](https://gradle.org/) - Dependency Management
