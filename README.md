# spring-boot-graylog-learning

## Documents

# **What is GrayLog?**

GrayLog is the software that we can view the log files of our projects from a single center.

GrayLog is open source software, which makes GrayLog useful.

GrayLog includes ElastickSearch and MongoDB structures in its architecture.


## Installation

 - Configuring docker-compose.yml file and running  with docker-compose up -d
 - Define gelf using dependency
 ```java
 <dependency>
            <groupId>de.siegmar</groupId>
            <artifactId>logback-gelf</artifactId>
            <version>4.0.2</version>
        </dependency>
```


## Usage

- Connect http://localhost:9000 

- First, if we are not logged in, we log in (Default username:admin,Password:admin).

- After successfully completing the login process, we click the Search button.

![image](https://user-images.githubusercontent.com/80245013/171663439-28383c00-d529-4be1-a18e-d7c500326e78.png)

Note: The part marked with a red box determines the update period of the logs of our Project.

- Next, we come to System and select the Inputs option from there.

![image](https://user-images.githubusercontent.com/80245013/171663468-c2c1bc55-d516-4ba2-ab3d-2106e116bba9.png)

- After gaining access to the Inputs screen, after selecting the rest port type of the Logs with Select Input, we click on Launch new Input and start making the necessary adjustments.

![image](https://user-images.githubusercontent.com/80245013/171663564-c567f833-29d5-4c5a-a941-c2a09f1b6458.png)

- Since we have adjusted our project settings to GELF UDP, we select GELF UDP and click Launch new Input.


![GrayLogConfig](https://user-images.githubusercontent.com/80245013/171663654-bf900d6b-42a0-40d7-902c-9f156804cc79.png)


- After making the necessary adjustments, we encounter such a screen.

![image](https://user-images.githubusercontent.com/80245013/171663709-7eb50d2f-c28b-4a07-a561-8ef85a0f7119.png)

- We click on the marked area from the incoming screen and we come to the screen with our Log messages.

![image](https://user-images.githubusercontent.com/80245013/171663731-c9cb330c-c710-499a-89ab-f6b6e793f4d1.png)



[Muharrem Koç](https://github.com/muharremkoc)
