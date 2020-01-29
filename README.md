# Pitest demo
This project includes mutation testing using [Pitest](https://pitest.org). The code in the application is just for demo purposes. It doesn't make sense to me either.

## Getting started

Make sure you have maven and a JDK installed (JDK 11 and Maven 3.6.2 works) and clone this repo

## Compile and test

From the root of this repo execute this command to run the unit tests:

```
mvn test
```

## Mutation testing

After seeing that all tests pass, you can start mutation testing using:

```
mvn org.pitest:pitest-maven:mutationCoverage
```

Look in `./target/pit-reports/YYYYMMDDHHMM/index.html` for your report!

## Oifficial Pitest report

This demo includes a modern html report. If you however want the official Pitest report, change the configuration of pitest plugin by removing this configuration block:
```xml
<configuration>
    <outputFormats>
        <format>HTML2</format>
    </outputFormats>
</configuration>
```
