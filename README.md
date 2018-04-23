# ORCID API (generated by JAXB)

This is an ORCID Java API generated (using JAXB) from the official ORCID XSDs.

Resources:
* ORCID Official XSDs: https://github.com/ORCID/ORCID-Source/tree/master/orcid-model/src/main/resources


## How to (re)generate ORCID Java API

The below will regenerate/update the ORCID Java API stored in the `src/main/java` folder of this GitHub repo.

1. Clone this repo locally
2. Clone the ORCID-Source repo (to a different location), and optionally checkout a specific tag:
   ```
   git clone https://github.com/ORCID/ORCID-Source.git
   ```
3. Copy the necessary XSD folders into this repo's `src/main/resources/xsd/` folder. Check the POM `<schemaIncludes>` list for the XSDs we need.  
  _Be sure not to overwrite the `.gitignore` already in the "empty" `xsd` folder, as we do NOT want to keep the XSDs in this repo!_
   ```
   # Copy over common_2.1 XSDs
   cp -r [ORCID-Source]/orcid-model/src/main/resources/common_2.1 [orcid-jaxb-api]/src/main/resources/xsd/
   
   # Copy over record_2.1 XSDs
   cp -r [ORCID-Source]/orcid-model/src/main/resources/record_2.1 [orcid-jaxb-api]/src/main/resources/xsd/
   ```
4. Build project (with profile `generate-sources-from-jaxb` enabled)
   ```
   cd [orcid-jaxb-api]
   
   # WARNING This next line overwrites Java source in ./src/main/java/
   mvn -U clean package -Pgenerate-sources-from-jaxb
   ```
5. Create a PR, noting which version of the ORCID XSDs you used to update the Java source code (e.g. either a specific release number or `master` of a given date)
   
## Build Project

After regenerating the ORCID Java API (using JAXB and ORCID's XSDs -- see above), you can easily build this project by just running:

```
mvn -U clean package
```

The result will be a `./target/orcid-jaxb-api-[version].jar`
