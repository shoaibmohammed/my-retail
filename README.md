###Setup
- Download or Clone the project from Github. (then unzip if downloaded)
- Download and install mongodb

####Option 1 - In IDE
- Open a new Maven project in an IDE like Intellij or Eclipse.

- In Intellij - File -> New -> Project From Existing Sources -> choose the pom.xml file in the downloaded directory.

- Then open MyRetailApp.java file in src/main/java/com/shoaib/myretail package.

- Then right click in the file and select "Run".

####Option 2 - In Terminal
In the project home directory run the following maven commands
- mvn clean install    - (build application)
- mvn spring-boot:run  - (run the application)
- To test if application is running open this url in browser localhost:8080 , if a page with text 'myRetail' opens up, the app is running.


####Endpoint

localhost:8080/data/v1/products/{id} 

GET method to retrieve details
PUT method to update price of product, body should contain json same as GET response.

Use an API client like postman to call the Rest endpoint
Screenshots of output are in screenshots folder.



