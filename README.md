## Release Engineering

### Eclipse setup
Check out the `releng` projects and set the target platform to the file `releng/com.mimacom.ddd.target/com.mimacom.ddd.target-latest.target`.

### Maven

Make sure to use Maven version 3.6.0, as there supposedly are issues with Tycho and Maven 3.6+.

**Troubleshooting**
* possibly there is a limitation with the `xtend-maven-plugin`, see [this issue](https://github.com/eclipse/xtext-xtend/issues/576)
* if Maven fails to build, try deleting the local repository, or use the `-Dmaven.repo.local` flag to specify a different repository
