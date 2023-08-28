# Header
Example of text with **Bold Text** 

## SubHeader
Example of text denoted `Example`
Example of link --> [link](https://www.jetbrains.com/help/idea/markdown.html#preview)

## Code Block
```java 
something
```


### Example of divider

---

# How to initialize and push a local repository to an existing GitHub repository
* git init -b main(By default creates master)
* git config user.email `email`
* git config user.name `name`
* git add .
* git commit -m `message`
* git remote add origin `URL of GitHub repository`
* git push -u -f origin `branch_name`

# Basic dependencies

## Starter Web
To be able to create WEB, RESTful applications using Spring MVC
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

## Starter dev tools
Use the following tools to develop and configure in an easy way:
* Automatic restart
* Exclude resources
* Watching additional paths
* Live Reload
* Global Settings
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
```

## Starter dev tools
Starter for testing Spring Boot applications with libraries including:

* JUnit Jupiter
* Hamcrest 
* Mockito

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```