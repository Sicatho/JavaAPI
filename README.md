# JavaAPI

This project uses Java, Spring, and JPA to make 2 API's available that retrieve data from a local instance of a postgres database given an input. I followed a tutorial to practice creating Java API's using Spring. 

To run this locally, first download postgres and set up a local instance of a database, change the application.properties file with your username/password, and then create a table called Person and add some dummy data to it. Here's the sql I used:

CREATE TABLE public.person
(
    age integer,
    name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    profession character varying COLLATE pg_catalog."default",
    hobby character varying COLLATE pg_catalog."default",
    CONSTRAINT "Person_pkey" PRIMARY KEY (name)
)
TABLESPACE pg_default;

ALTER TABLE public.person
    OWNER to postgres;
    
    
    
Here is how you can hit the endpoints using your browser: http://localhost:8080/getPersonByName?myName=usman and http://localhost:8080/getPersonByProfession?profession=engineer
