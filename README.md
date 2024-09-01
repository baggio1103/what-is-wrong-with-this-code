![What's wrong with this code banner?](https://github.com/baggio1103/what-is-wrong-with-this-code/blob/master/assets/banner.png?raw=true)
# What is wrong with this code?

````
What is the purpose of this repository?
The purpose is to implement different applications with certain functionality.
The code provided meets basic requirements of the application, but unexpected behaviour 
and errors arise under certain conditions. 
The ultimate goal to improve the overall troubleshooting skills and write a more scalable and reliable code.

The task is get familiar with the code, think about 'What is wrong with the provided code'
and come up with solutions that can deal with all the requirements of the API under different
all conditions / test cases. 

Besides, for each such application, there will a separate dedicated branch that 
highlights the problems of that application, the errors that arise and I will try to provide
provide with my own views how to handle all these errors.
````
-----

## UserStatistics
![User statistics Spring boot service](https://raw.githubusercontent.com/baggio1103/what-is-wrong-with-this-code/master/assets/Spring%20Boot%2C%20Flyway%2C%20and%20PostgreSQL%20with%20Kotlin.%20The%20banner%20should%20have%20a%20modern%20and%20vibrant%20.webp)
[UserStatistics](https://github.com/baggio1103/what-is-wrong-with-this-code/tree/master/user-statistics) is a web application written using SpringBoot, PostgreSQL, Flyway, Spring Data JPA,
that has two provides two endpoints:

````
- /posts - returns a list of all the posts.
- /posts/{postId}/users/{userId} - returns a single post by postId, 
    updates the statistics of this post, and for extra information
    it also logs the userId that viewed this post.
````

The main logic resides in the following [PostService](https://github.com/baggio1103/what-is-wrong-with-this-code/blob/master/user-statistics/src/main/kotlin/com/atomic/coding/service/PostService.kt) file.

To check out what is wrong with the application, please, refer to this file.

--- 
To run this code, firstly, you need to have a Docker installed on your computer.  
- Clone the repository
- Run the **docker-compose** file
- Execute the following commands to start up the application and test the API.
```curl
// in src folder
// in case of application startup, check that the ports 5432 and 8080 are not busy or change them

docker compose up -d
curl --location 'http://localhost:8080/posts' --- returns a list of posts
curl --location 'http://localhost:8080/posts/1/users/1' --- returns a post, if exists, with id: 1 and saves the statistics of the post
```