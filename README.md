[![Build Status](https://dev.azure.com/VizCentric/Flair%20BI/_apis/build/status/viz-centric.flair-commons?branchName=master)](https://dev.azure.com/VizCentric/Flair%20BI/_build/latest?definitionId=1&branchName=master)
![com.project.bi:project-bi-common package in flair-commons feed in Azure Artifacts](https://feeds.dev.azure.com/VizCentric/_apis/public/Packaging/Feeds/d62c60be-25b2-465f-9bf0-8c6406fc89ff/Packages/f6c17ac6-8157-49c2-ba21-0c0f02b78335/Badge)
# Flair Commons

This repository is common for all java based flair applications which share code. Its a maven based project which is used as a dependency in the other projects.

## Build

To build the application and install in local maven repository use

```
mvn clean install
```

## Release

To perform a release you need:
*  have configured credentials in settings.xml

    ```
    <settings>  
        <servers>  
            <server>
                <id>github-credentials</id>  
                <username>myUser</username>  
                <password>myPassword</password>  
            </server>   
        </servers>
    </settings>   
    ```
* run following command you need to set development version and release version:

   ``` 
   mvn release:clean release:prepare release:perform -DreleaseVersion=${releaseVersion} -DdevelopmentVersion=${developmentVersion}
   ```

