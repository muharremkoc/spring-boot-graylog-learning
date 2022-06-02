# spring-boot-graylog-learning

## Documents

# **What is GrayLog?**

GrayLog is the software that we can view the log files of our projects from a single center.

GrayLog is open source software, which makes GrayLog useful.

GrayLog includes ElastickSearch and MongoDB structures in its architecture.


## Installation

 - Configuring docker-compose.yml file and running  with docker-compose up -d
## Usage

- First, if we are not logged in, we log in (Default username:admin,Password:admin).

- After successfully completing the login process, we click the Search button.

![](RackMultipart20220602-1-ceqwwh_html_6e41cc9c868619b1.png)

Note: The part marked with a red box determines the update period of the logs of our Project.

- Next, we come to System and select the Inputs option from there.

![](RackMultipart20220602-1-ceqwwh_html_5d6b1c459e29e07f.png)

- After gaining access to the Inputs screen, after selecting the rest port type of the Logs with Select Input, we click on Launch new Input and start making the necessary adjustments.

![](RackMultipart20220602-1-ceqwwh_html_e2725b29d930bb12.png)

- Since we have adjusted our project settings to GELF UDP, we select GELF UDP and click Launch new Input.

- After making the necessary adjustments, we encounter such a screen.

![](RackMultipart20220602-1-ceqwwh_html_c853f300336d60e.png)

- We click on the marked area from the incoming screen and we come to the screen with our Log messages.

![](RackMultipart20220602-1-ceqwwh_html_a371254094972ff2.png)



[Muharrem Koç](https://github.com/muharremkoc)
