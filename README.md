## Rest API written in Java for generating random unique strings

I am sorry this app is a bit mess but my girlfriend brokeup with me 3 days ago and I am barely keeping myself together. Please be understanding.

#### Exec command in terminal to build and run the application
    mvn clean install spring-boot:run
    
#### Database connection
	spring.datasource.name=postgres
	spring.datasource.url=jdbc:postgresql://localhost:5432/stringsDB
	spring.datasource.username=postgres
	spring.datasource.password=password


#### Endpoints
##### POST /request
    POST http://localhost:8080/request
    Content-Type: application/json
	}
      "minLength" : "5",
      "maxLength" : "10",
      "requestedAmountOfStrings" : "30",
      "usedCharacters" : "asdfg"
    }

##### GET /results
    GET http://localhost:8080/results
##### GET /runningrequests
    GET http://localhost:8080/runningrequests
