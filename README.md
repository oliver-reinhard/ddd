## Developer Guide

### Code style

Apply the Google Style Guide in Java code by importing and setting the Eclipse preferences file [eclipse-java-google-style.xml](com.mimacom.ddd.preferences/eclipse-java-google-style.xml).

## Release Engineering

### Maven

Make sure to use Maven version 3.6.0, as there supposedly are issues with Tycho and Maven 3.6+.

#### Creating a new Release

From the command line in the repository root directory, execute the following command to build a p2 update site: `mvn clean package`. If the command is successful, there should be a file generated such as follows: `releng/com.mimacom.ddd.repository/target/com.mimacom.ddd.repository-<version>.zip`.

**Troubleshooting**
* possibly there is a limitation with the `xtend-maven-plugin`, see [this issue](https://github.com/eclipse/xtext-xtend/issues/576)
* if Maven fails to build, try deleting the local repository, or use the `-Dmaven.repo.local` flag to specify a different repository

### Eclipse setup
Check out the `releng` projects and set the target platform to the file `releng/com.mimacom.ddd.target/com.mimacom.ddd.target-latest.target`.
