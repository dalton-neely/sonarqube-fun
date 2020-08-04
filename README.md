# SonarQube Fun

## Table of Contents
1. [Useful Properties](#useful-properties)
1. [How to Run SonarQube From Gradle](#how-to-run-sonarqube-from-gradle)
1. [Useful Links](#useful-links)

## Useful Properties
The table below describes some useful properties when dealing with SonarQube

| Property         | Value                                    |
|:----------------:|:----------------------------------------:|
| Default Username | Admin                                    |
| Default Password | Admin                                    |
| Localhost        | [localhost:9000][1]                      |
| Project Name     | SonarQube Fun                            |
| Project Key      | d3da23cc-2bcd-4bdc-b0ad-6b2c854ea6e3     |
| Default Token    | 1aad870a5a62af9118f5b42baeff3e30e7a69c3c |

## How to Run SonarQube From Gradle
To run SonarQube from Gradle you need the `projectKey` and the `token` to run the following command.
```powershell
gradlew.bat sonarqube -Dsonar.projectKey=d3da23cc-2bcd-4bdc-b0ad-6b2c854ea6e3 -Dsonar.host.url=http://lo
calhost:9000 -Dsonar.login=1aad870a5a62af9118f5b42baeff3e30e7a69c3c
```
Conversely, you can add the properties to the `gradle.properties` file like this.
```properties
ystemProp.sonar.projectKey=d3da23cc-2bcd-4bdc-b0ad-6b2c854ea6e3
systemProp.sonar.login=1aad870a5a62af9118f5b42baeff3e30e7a69c3c
systemProp.sonar.url=http://localhost:9000
```
Then just run the command below.
```powershell
gradlew.bat sonarqube
```

## Useful Links
* [SonarQube Gradle Plugin Documentation][2]
* [SonarQube Documentation][3]

[1]:http://localhost:9000
[2]:https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-gradle/
[3]:https://docs.sonarqube.org/latest/