# Features

- Start: Initial state of the system or scenario
- Action: Is the action to be performed
- Return: Final state, is the feedback of the action that was performed

### Feature 1: Register Transactions 

##### Scenario 1: Register with a image

- **Start**: I receive a image to register a transaction
- **Action**: Read the image for extract transaction data and register this transaction
- **Return**: Transaction is recorded with success

##### Scenario 2: Register with a PDF File

- **Start**: I receive an PDF file to register a transaction
- **Action**: Read the PDF file for extract transaction data and register this transaction
- **Return**: Transaction is recorded with success

##### Scenario 3: Register with a JSON Data

- **Stat**: I receive a JSON data to register an transaction
- **Action**: Read the JSON data for extract transaction data and register this transaction
- **Return**: Transaction is recorded with success

### Feature 2: Get Transactions

##### Scenario 1: Get a specific transaction

- **Start**: I receive a request from the client to get a specific transaction
- **Action**: Search this specific transaction by id and get the transaction
- **Return**: Return the specified transaction to the client

##### Scenario 2: Get an history of transaction

- **Start**: I receive a request from the client to get an history of the transaction with the number of transactions specified
- **Action**: Search the latest transactions by date and in agreement with the number of transactions specified by the client request
- **Return**: Return the transactions

### Feature 3: Register Fixed Expenses 

##### Scenario 1: Register with a JSON Data

- **Start**: I receive JSON data from the client to register an fixed expense
- **Action**: Read JSON for extract fixed expense data and register this fixed expense
- **Return**: Fixed expense is recorded with success

### Feature 4: Get Fixed Expenses

##### Scenario 1: Get a specific fixed expense

- **Start**: I receive a request from the client to get a specific fixed expense
- **Action**: Search this specific fixed expense by id and get it
- **Return**: Return the specified fixed expense to the client

##### Scenario 2: Get a list of fixed expenses

- **Start**: I receive a request from the client to get a list of the fixed expenses
- **Action**: Search all fixed expenses
- **Return**: Return the list of fixed expenses

### Feature 5: Register Fixed Revenues 

##### Scenario 1: Register with a JSON Data

- **Start**: I receive JSON data from the client to register an fixed revenue
- **Action**: Read JSON for extract fixed revenue data and register it
- **Return**: Fixed revenue is recorded with success

### Feature 6: Get Fixed Revenues

##### Scenario 1: Get a specific fixed revenue

- **Start**: I receive a request from the client to get a specific fixed revenue
- **Action**: Search this specific fixed revenue by id and get it
- **Return**: Return the specified fixed revenue to the client

##### Scenario 2: Get a list of fixed revenues

- **Start**: I receive a request from the client to get a list of fixed revenues
- **Action**: Search all fixed revenues and get it
- **Return**: Return the list of fixed revenues to the client

### Feature 7: Register Varied Revenues

##### Scenario 1: Register with a JSON Data

- **Start**: I receive JSON data from the client to register an varied revenue
- **Action**: Read JSON for extract varied revenue data and register it
- **Return**: varied revenue is recorded with success

### Feature 8: Get Varied Revenues

##### Scenario 1: Get a specific varied revenue

- **Start**: I receive a request from the client to get a specific varied revenue
- **Action**: Search this specific varied revenue by id and get it
- **Return**: Return the specified varied revenue to the client

##### Scenario 2: Get a list of varied revenues

- **Start**: I receive a request from the client to get a list of varied revenues
- **Action**: Search all varied revenues and get it
- **Return**: Return the list of varied revenues to the client

### Feature 9: Register Expense Categories

##### Scenario 1: Register with an JSON Data

- **Start**: I receive JSON data from the client to register a expense category
- **Action**: Read JSON for extract expense category data and register it
- **Return**: expense category is recorded with success

##### Scenario 2: Register with an JSON Data and a budget included in it

- **Start**: I receive JSON data from the client to register a expense category with a budget
- **Action**: Read JSON for extract expense category data with your budget and register it
- **Return**: expense category is recorded with success

### Feature 10: Get Expense Categories

##### Scenario 1: Get a specific expense category and your current values

- **Start**: I receive a request from the client to get a specific expense category
- **Action**: Search this specific expense category by id and get it
- **Return**: Return the specified expense category to the client

##### Scenario 2: Get a specific expense category and your history with values and order by (amount, month(default) and budget) and perform an comparison always with the previous expense, history with a maximum limit of 1 year

- **Start**:
- **Action**:
- **Return**:

##### Scenario 3: Get an history of all expense categories with your values and order by (amount, month(default), budget or alphabet) and perform an comparison always with the previous expense, history with a maximum limit of 1 year

- **Start**:
- **Action**:
- **Return**:

##### Scenario 4: Get the comparison of current specified expense category value with previous one

- **Start**: I receive a request from the client to get an comparison of current expense category value with previous one
- **Action**: Extract budget data in JSON and set it in the specified expense category
- **Return**: value of the difference of the comparison of current expense category value with previous one

##### Scenario 5: Get a history of all expense without dividing per categories and with your total value in the month and order by (amount, month(default), budget or alphabet) and perform an comparison always with the previous expense, history with a maximum limit of 1 year

- **Start**: 
- **Action**: 
- **Return**: 

##### Scenario 6: Get current expense total amount in the month

- **Start**:
- **Action**:
- **Return**:


### Feature 11: Setting a budget for a specific expense category

##### Scenatio 1: Setting the budget with a JSON Data

- **Start**: I receive a request from the client to set the budget for a specific expense category
- **Action**: Extract budget data in JSON and set it in the specified expense category
- **Return**: Expense category is setted with a budget


---
Falta detalhar :

- Sistema de alerta para notificar sobre o vencimento de despesas fixas (Integração com o Google Calendar ?)

- Conta bancária mais utilizadas com ranking de %, qual o método de pagamento e para qual categorias de despesas

- Planejamento Financeiro a Longo Prazo, definindo metas de economia para aposentadoria, compra de casa, educação, viagem entre outros.

  - Pedir para o usuário definir uma data dessa meta
  - Verificar com base no histórico de despesas/transações do usuário o nível de dificuldade dele atingir essa meta nesse tempo determinado por ele

- Fornecer gráficos e relatórios
  - Gráficos por categorias de despesas, qual categoria a pessoa está gastando mais
