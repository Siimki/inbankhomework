# Implementation of Age-Related Restrictions for Loan Decisions (TICKET-102)

### Overview

- The added functionality calculates the loan applicant's age from the personal ID code and checks if the applicant is not underage or too old. Currently, I set the expected lifetime to 78 years which is the Baltics average.

### Requirements

- **Age Restrictions**: Loans must not be issued to individuals who are underage or beyond the calculated maximum age limit, which considers the expected lifetime minus the maximum loan period.

### Age Validation Logic

The DecisionEngine now includes a function that validates a customer's age against the allowed age range taken from their personal ID code.

- **Baltics**: 78 years

The maximum loan period is considered to be 5 years. Therefore, the maximum allowable ages for loan approval would be:

- **Baltics**: 18-73 years old.


### Technical Implementation

- I created a new file ageCalculator.java which contains all the logic. 

### Improvements and Additions

- Add lifetime expectations separately for every Baltic country. 
