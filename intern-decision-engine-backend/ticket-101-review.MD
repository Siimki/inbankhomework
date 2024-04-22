# TICKET-101 Code Review

### Code Functionality
- The implementation meets the functional requirements after a minor fix. Initially, it failed to display the correct maximum loan amount due to an incorrect variable reference.

### Code Quality
- The code is well-written with clear, easy-to-understand variable names. There are good tests for the code. 

### Maintainability
- We should look for options to refactor the DecisionEngine class into separate services. It would help to maintain the code in the future.

### Single Responsibility Principle
- Currently, the Decision Engine is responsible for validating input data, calculating credit scores, and making loan decisions.
- Improvement idea: Consider splitting functionality into separate classes or services. Each service for each functionality.

### Areas for Improvement
- Implement debouncing to reduce the frequency of API calls when user inputs change. I would consider moving the loan logic completely to the back-end. 

### Most Important Shortcoming
- The primary issue was the incorrect display of the loan amount, it did not show the maximum available loan amount for the applicant.  I changed the logic inside loan_form.dart file. Now it works as intended. 

### Added feature

- If the customer wanted to get loan but choose too short loan period, it suggests the new loan period to get the wanted amount of loan. This logic was added to loan_form.dart file.


### Conclusion
Overall, the intern has shown a good understanding of Java and basic software design. But SOLID principles have to be implemented a little bit more efficiently. 
