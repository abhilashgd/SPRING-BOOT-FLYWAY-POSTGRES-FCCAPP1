# FCCApp1

//Initial Check

Postman POST: http://localhost:8080/api/v1/person 

JSON RAW

{
    "name":"abhilash gd"
}

Response: 200 OK status

postman GET: http://localhost:8080/api/v1/person 

Response:

[
    {
        "id": "86ea9a16-3d01-4376-a90f-456a001b2a1a",
        "name": "abhilash gd"
    }
]

Validation Constraints have been added @NotBlank(on model), @Valid @NotNull(on Controller)


//Deploying on Server

maven install // creates FCCApp1-0.0.1-SNAPSHOT.jar under target folder

% java -jar FCCApp1-0.0.1-SNAPSHOT.jar // Command to deploy  app on port 8080 


