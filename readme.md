--- 
### Build
    This project has been pre-built
    It was unclear from the task whether an IDE independant build tool or file was required 
    As a result, the archive contains the out and RecruitmentTest Module
    
### IDE
Intellij Idea 15.0.4
### Java Version
"1.8.0_73"

### Instructions
+ open a command prompt in windows
+ navigate to the root directory of this project folder 
+ copy and paste the following string and press return

`java -Dfile.encoding=UTF-8 -cp ".\out\production\RecruitmentTest;.\lib\*" cucumber.api.cli.Main --plugin pretty --monochrome --glue bdd.gherkin .\`

----------------------------------------------------------------------------------------------------------------------------------------------------
Note: This framework uses the chromedriver.exe application to run tests via Chrome, any issues may be due to chromedriver and installed googlechrome mismatch.  