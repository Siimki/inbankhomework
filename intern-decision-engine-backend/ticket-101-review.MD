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
- Implement debouncing to reduce the frequency of API calls when user inputs change.

### Most Important Shortcoming
- The primary issue was the incorrect display of the loan amount, it did not show the maximum available loan amount for the applicant. To fix it, I had to change the value of ```_loanAmountResult``` variable inside the else case, from ```_LoanAmount``` to ```tempAmount``` in api_service.dart file. 

### Conclusion
Overall, the intern has shown a good understanding of Java and basic software design. But SOLID principles have to be implemented a little bit more efficiently. 
