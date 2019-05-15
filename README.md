# Jenkins Containerization

[![CircleCI](https://circleci.com/gh/robot297/Jenkins-Containerization/tree/master.svg?style=svg)](https://circleci.com/gh/robot297/Jenkins-Containerization/tree/master)


You can find the basic container [here](https://hub.docker.com/r/robot297/jenkins-container) with all the basic plugins installed. **Note** No tools will be installed.

Trying to containerize Jenkins so that you can configure it and deploy when needed.

Project structured as follows.

```
|-downloads (ignored directory/maven, gradle, jdks, should go here and reflected in the groovy script)
|-groovy
|-Dockerfile
|-plugins.txt
```
