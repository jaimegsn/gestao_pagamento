# Features

- Start: Initial state of the system or scenario
- Action: Is the action to be performed
- Return: Final state, is the feedback of the action that was performed

### Feature 1: Register Transactions

##### Scenario 1: Register with a image (IN UML)

- **Start**: Is received a image to register a transaction
- **Action**: Read the image for extract transaction data and register this transaction
- **Return**: Transaction is recorded with success

##### Scenario 2: Register with a PDF File (IN UML)

- **Start**: Is received an PDF file to register a transaction
- **Action**: Read the PDF file for extract transaction data and register this transaction
- **Return**: Transaction is recorded with success

##### Scenario 3: Register with a JSON Data (IN UML)

- **Stat**: Is received a JSON data to register an transaction
- **Action**: Read the JSON data for extract transaction data and register this transaction
- **Return**: Transaction is recorded with success

### Feature 2: Get Transactions

##### Scenario 1: Get a specific transaction (IN UML)

- **Start**: Is requested by the client to get a specific transaction
- **Action**: Search this specific transaction by id and get the transaction
- **Return**: Return the specified transaction to the client

##### Scenario 2: Get an history of transaction (IN UML)

- **Start**: Is requested by the client to get an history of the transaction with the number of transactions specified
- **Action**: Search the latest transactions by date and in agreement with the number of transactions specified by the client request
- **Return**: Return the transactions

### Feature 3: Register Fixed Expenses

##### Scenario 1: Register with a JSON Data (IN UML)

- **Start**: Is received JSON data from the client to register an fixed expense
- **Action**: Read JSON for extract fixed expense data and register this fixed expense
- **Return**: Fixed expense is recorded with success

### Feature 4: Get Fixed Expenses

##### Scenario 1: Get a specific fixed expense (IN UML)

- **Start**: Is requested by the client to get a specific fixed expense
- **Action**: Search this specific fixed expense by id and get it
- **Return**: Return the specified fixed expense to the client

##### Scenario 2: Get a list of fixed expenses (IN UML)

- **Start**: Is requested by the client to get a list of the fixed expenses
- **Action**: Search all fixed expenses
- **Return**: Return the list of fixed expenses

### Feature 5: Register Fixed Revenues

##### Scenario 1: Register with a JSON Data (IN UML)

- **Start**: Is received JSON data from the client to register an fixed revenue
- **Action**: Read JSON for extract fixed revenue data and register it
- **Return**: Fixed revenue is recorded with success

### Feature 6: Get Fixed Revenues

##### Scenario 1: Get a specific fixed revenue (IN UML)

- **Start**: Is requested by the client to get a specific fixed revenue
- **Action**: Search this specific fixed revenue by id and get it
- **Return**: Return the specified fixed revenue to the client

##### Scenario 2: Get a list of fixed revenues (IN UML)

- **Start**: Is requested by the client to get a list of fixed revenues
- **Action**: Search all fixed revenues and get it
- **Return**: Return the list of fixed revenues to the client

### Feature 7: Register Varied Revenues

##### Scenario 1: Register with a JSON Data (IN UML)

- **Start**: Is received JSON data from the client to register an varied revenue
- **Action**: Read JSON for extract varied revenue data and register it
- **Return**: varied revenue is recorded with success

### Feature 8: Get Varied Revenues

##### Scenario 1: Get a specific varied revenue (IN UML)

- **Start**: Is requested by the client to get a specific varied revenue
- **Action**: Search this specific varied revenue by id and get it
- **Return**: Return the specified varied revenue to the client

##### Scenario 2: Get a list of varied revenues (IN UML)

- **Start**: Is requested by the client to get a list of varied revenues
- **Action**: Search last 20 varied revenues and get it
- **Return**: Return the list of varied revenues to the client

### Feature 9: Register Expense Categories

##### Scenario 1: Register with an JSON Data (IN UML)

- **Start**: Is received JSON data from the client to register a expense category
- **Action**: Read JSON for extract expense category data and register it
- **Return**: expense category is recorded with success

##### Scenario 2: Register with an JSON Data and a budget included in it (IN UML)

- **Start**: Is received JSON data from the client to register a expense category with a budget
- **Action**: Read JSON for extract expense category data with your budget and register it
- **Return**: expense category is recorded with success

##### Scenario 3: Setting the budget for a specific expense category with a JSON Data (IN UML)

- **Start**: Is requested by the client to set the budget for a specific expense category
- **Action**: Extract budget data in JSON and set it in the specified expense category
- **Return**: Expense category is setted with a budget

##### Scenario 4: Register with an JSON Data and a spending ceiling included in it (IN UML)

- **Start**: Is received JSON data from the client to register a expense category with a spending ceiling
- **Action**: Read JSON for extract expense category data with your spending ceiling and register it
- **Return**: expense category is recorded with success

##### Scenario 5: Setting the spending ceiling for a specific expense category with a JSON Data (IN UML)

- **Start**: Is requested by the client to set the spending ceiling for a specific expense category
- **Action**: Extract spending ceiling data in JSON and set it in the specified expense category
- **Return**: Expense category is setted with a spending ceiling

### Feature 10: Get Expense Categories

##### Scenario 1: Get a specific expense category and your current values. (IN UML)

- **Start**: Is requested by the client to get a specific expense category
- **Action**: Search this specific expense category by id and get it
- **Return**: Return the specified expense category to the client

##### Scenario 2: Get a specific expense category and your history with values and order by (amount, month(default) or budget) and perform an comparison always with the previous month, history with a maximum limit of 1 year. (IN UML)

- **Start**: Is requested by the client to get the history of an the expense category with your values and ordered by any of these values: amount, month or budget
- **Action**: Search the history of the expense category ordered by the parameters chosen by the client and perform a comparison in each of these ordered elements always with previous element
- **Return**: A list of expense history ordered with comparing values

##### Scenario 3: Get an history of all expense categories with your values and order by (amount, month(default), budget or alphabet) and perform an comparison always with the previous expense, history with a maximum limit of 1 year. (IN UML)

- **Start**: Is requested by the client to get the history of all the expense categories with your values and ordered by any of these values: amount, month, budget or alphabet
- **Action**: Search the history of all expense categories ordered by the parameters chosen by the client and perform a comparison in each of these ordered elements always with previous element
- **Return**: A list of all expenses history ordered with comparing values

##### Scenario 4: Get the comparison of current specified expense category value with previous one. (IN UML)

- **Start**: Is requested by the client to get an comparison of current expense category value with previous one
- **Action**: Extract budget data in JSON and set it in the specified expense category
- **Return**: value of the difference of the comparison of current expense category value with previous one

##### Scenario 5: Get a history of all expense without dividing per categories and with your total value in the month and order by (amount, month(default), budget) and perform an comparison always with the previous expense, history with a maximum limit of 1 year. (IN UML)

- **Start**: Is requested by the client to get the history of total value of the expense categories in each month with your values and ordered by any of these values: amount, month or budget
- **Action**: Search the total value history of all expense categories ordered by the parameters chosen by the client and perform a comparison in each of these ordered elements always with previous element
- **Return**: A list of all expenses total value history ordered with comparing values

##### Scenario 6: Get current expense total amount in the month (IN UML)

- **Start**: Is requested by the client to get current expense total amount in the month
- **Action**: Search the total amount in the month of the current expense
- **Return**: The value of the total amount in the current expense month

### Feature 11: Register Bank Account

##### Scenario 1: Register with an JSON Data (IN UML)

- **Start**: Is received JSON data from the client to register a bank account
- **Action**: Read JSON for extract bank account data and register it
- **Return**: bank account is recorded with success

### Feature 12: Get Bank Account

##### Scenario 1: Get a specific bank account (IN UML)

- **Start**: Is received JSON data with bank account id from the client to search it
- **Action**: Search for bank account with id parameter
- **Return**: bank account is found

##### Scenario 2: Get the most used bank accounts (IN UML)

- **Start**: Is requested by the client for find the most used bank accounts
- **Action**: Search for the most used bank accounts
- **Return**: the most used bank accounts with a percent ranking

##### Scenario 2: Get All bank accounts (IN UML)

- **Start**: Is requested by the client for find all bank accounts
- **Action**: Search for all bank accounts
- **Return**: all bank accounts

### Feature 13: Finance Planning

##### Scenario 1: Verify if economic goals to fulfill a desire is possible and your difficulty level (IN UML)

- **Start**: Is received JSON data from the client with a date, goal amount and your desire(string) setted
- **Action**: Verify if that goal amount is possible to fulfill based on the expense and revenues and verify the difficulty level to finish the goal
- **Return**: difficulty level to finish the goal

##### Scenario 2: Register economic goals to fulfill a desire (IN UML)

- **Start**: Is received JSON data from the client with a date, goal amount and your desire(string) setted
- **Action**: Register total economic goals and goal amount per month
- **Return**: economic goals is recorded

##### Scenario 3: User don't reach the goal amount in the month (IN UML)

- **Start**: User don't reach the goal amount in the month
- **Action**: Ask the user if they want to extend the initially set deadline by 1 month, otherwise recalculate the difficulty level to reach the goal and set a new goal amount per month
- **Return**: A new goal amount or extend the initially set deadline by 1 month

##### Scenario 4: User exceeds monthly goal amount (IN UML)

- **Start**: User exceeds monthly goal amount
- **Action**: Recalculate the difficulty level to reach the goal and set a new goal amount per month
- **Return**: A new goal amount

##### Scenario 5: Return the difference between the current expense and the current economic goal amount (IN UML)

- **Start**: Client want to check the difference between the current expense and the current economic financial goal amount
- **Action**: Calculate the difference between the current expense and the current economic goal amount
- **Return**: The value of the difference between the current expense amount and the current economic goal amount

### Feature 14: Provide data and reports

### Feature 15: Alert and notification systems (integration with Google Calendar?)

### Feature 16: Simulate fee in expenses

### Feature 17: Collect debts and Collect debts with fee

### Feature 18: Scheduled payment

### Feature 19: Demand Rent Automatically

### Feature 20: Notify when you buy the same product cheaper in past purchases at other establishments
