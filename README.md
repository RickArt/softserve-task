# General Information
This Repository has been created as part of an ongoing recruitment process with SoftServe.
The solution will seem overengineered and using of spring boot might seem too much, but considering it is meant
to showcase some more expertise it will help to provide more information about my skill set and line of thought.

## The task
Given a simple String AABBCCD112233, return a new String, that will not contain any duplicates. 
Code should be clean, readable and optimised. 
Also, it must have a test coverage with a different test cases.


# Requirements
 ## Functional requirements
* Solution must receive a string.
* Solution has to return a string containing only distinct letters extracted from the original string.
  * Example: AABBCCD112233 should return ABCD123

## Non Functional requirements
* Have a good test coverage.
* Implement best coding practices, with emphasis on readable code.
* Solution must be optimised.
* Other relevant requirements extracted from [Job Description](https://career.softserveinc.com/en-us/vacancy/senior-java-software-engineer-83039):
  * Knowledge of Java, Spring Boot, or a similar JVM framework
  * Expertise in REST, specifically building REST API.
  * Aware of Maven
  * Experience in test tools like JUnit, and Mockito
* Additional Non-functional requirements as part of code repository management and best practices:
  * Have version control using git.
  * Have additional versioning information using CHANGELOG and following [Keep a changelog](https://keepachangelog.com/en/1.1.0/) for documentation and follow semantic versioning.
  * Use "feature" branches for Work in Progress
  * Use [conventional commits](https://www.conventionalcommits.org/en/v1.0.0-beta.2/) for improved commit log history messages.

### Assumptions
* Order of the distinct letters is not specified, which may imply order does not matter.
* No max length specified for the String, so the expected max size will be theorized to be 1900 characters long. Based on Google chrome max URL length.
* There is no character type constraints ( A-Z, 0-9, special characters). So all characters are considered as valid.

# Proposed Solution
- [x] Create a new web Spring boot project which covers Non-functional requirements added from job description:
  - Knowledge of java, Spring boot, REST, Maven, JUnit, Mockito.
- [x] Add git version control and create a personal repository.
- [x] Add CHANGELOG
- [ ] Keep track of the changes on the CHANGELOG file.
- [ ] Use feature branches
- [ ] Use conventional commit messages for git commits.
- [ ] Create REST controller with an endpoint "/distinct" that accepts one URL param "originalString"
  - [ ] the endpoint will return a JSON body with "status" and "distinctStringLetters" fields.
    - [ ] "status" field will match the HTTP status code: 200 for successful responses. No other status are considered for this iteration, but proposed solution allows for custom handling of scenarios as needed.
    - [ ] "distinctStringLetters" field will have the distinct letters as extracted from the originalString.
- [ ] Create a service to be used by the rest controller to delegate to it any logic related to the solution.
- [ ] Use "Strategy" pattern to isolate the solution algorithm and allow for extension for the future.
- [ ] Use "Factory method" pattern to allow future extension for picking the best algorithm according to the situation.
- [ ] Add Unit tests.