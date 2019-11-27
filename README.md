## Release Engineering

### Maven

Make sure to use Maven version 3.6.0, as there supposedly are issues with Tycho and Maven 3.6+.

#### Creating a new Release

From the command line in the repository root directory, execute the following command to build a P2 update site or a new distribution: `mvn clean package`. If the command is successful, the following files should have been generated:
* `releng/com.mimacom.ddd.repository/target/com.mimacom.ddd.repository-<version>.zip`
* `releng/com.mimacom.ddd.repository/target/products/com.mimacom.ddd.product-linux.gtk.x86_64.zip`
* `releng/com.mimacom.ddd.repository/target/products/com.mimacom.ddd.product-macosx.cocoa.x86_64.zip`
* `releng/com.mimacom.ddd.repository/target/products/com.mimacom.ddd.product-win32.win32.x86_64.zip`

**Troubleshooting**
* possibly there is a limitation with the `xtend-maven-plugin`, see [this issue](https://github.com/eclipse/xtext-xtend/issues/576)
* if Maven fails to build, try deleting the local repository, or use the `-Dmaven.repo.local` flag to specify a different repository

## Development

### Eclipse IDE setup
Import the `com.mimacom.ddd.target` project from the `releng` folder into the workspace and set the target platform to the file `releng/com.mimacom.ddd.target/com.mimacom.ddd.target-latest.target`.
