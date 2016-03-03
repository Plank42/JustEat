# Answers to Technical Questions
---
+ source:  [JUST EAT Test Automation Engineer Recruitment Test](https://github.com/justeat/JustEat.RecruitmentTest/blob/master/Test.Automation.Engineer.md)
## Part 1
        How long did you spend on the technical test? 
        What would you add to your solution if you had more time? 
        If you didn't spend much time on the technical test then use this as an opportunity to explain what you would add.  
    
+ Approximately 7-8 hours, 
    + the writing of the framework took about a couple of hours, most of that on the page objects clean up. 
        + Using the selenium page object generator extension available in chrome, which can save a lot of time. 
    + Then, about 2 hours debugging my code and integrating cucumber with testNG, I've previously just used Junit - Stackoverflow quickly resolved any issues.  
    + Another hour was taken adding and polishing aspects as well as writing and considering aspects of the readme doc.
    + Any additional time after that was debugging a few set-up issues for the running and build.        
+ This solution contains the bare bones of an automation framework, however 
    + there still needs to be flow and error handling.    
    + there is room for creating some parent methods - default page objects, interfaces and/or abstract methods to cut down on duplicate code.
    + expand the page objects. 
    + create some default bean objects to speed up testing.

## Part 2
        What do you think is the most interesting trend in test automation?
A lot more emphasis is being placed on the importance of API testing. It's invariably the sweet spot in every application and just as likely to be the source of issues as the back-end layer or the UI. 

This opens up a lot of areas for integration between UI and data-driven testing.    


## Part 3    
        How would you implement test automation in a a legacy application? Have you ever had to do this?
    
Automation of legacy applications can be tricky at best and doomed to failure if they are not planned. A thought of automating 100% of the application is nigh impossible to achieve and to ensure an adequate return on investment it is sometimes better to consider only automating parts of the applications - those areas which are:
 
+ Time consuming/resource heavy 
+ Prone to input error/process mistakes
+ Have a high customer impact.

While at Schlumberger, I was tasked, as part of a wider geographically separated team (Norway, USA, UK), automating their legacy survey analysis tool. 

This used TestComplete, as the basis of the framework, with interactions controlled by the tool recognising certain embedded areas, and other interactions controlled by keystrokes and hotkeys. 

Inevitably it was very buggy, more than the application it was designed to test.   

## Part 4
        How would you improve the customer experience of the JUST EAT website?

1. From looking at the current website, the search requirement that users can only enter a full post code seems restrictive. 
2. Partial post codes and town/area names would be a useful addition. 
3. I imagine some aspect of GEO ip is already used on the site, this could be extended
4. A lot of content is hidden in the footer; the ability to browse takeaways, the takeaway choices, metropolitan sites etc. All this information could be displayed more prominently for a website or tablet.
5. There is a lot of empty real estate that while it looks lovely, could be used to push other aspects of the site. Even in the mobile view there is some space going begging.     

## Part 5
    	Please describe yourself using json

[andrewnewton.json](andrewnewton.json) 