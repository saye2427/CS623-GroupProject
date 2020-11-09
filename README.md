# CS623-GroupProject
Course Name: CS623-Database Management Systems, Fall 2020
<br/>
Professor: Dr. Christelle Scharff
<br/>
Collaborators: Briana Figueroa & Sayema Islam
<br/>
Group # 4
<br/>
Language: Java
<br/>

## Entity-Relationship Diagram (ERD):
![alt text](https://github.com/saye2427/CS623-GroupProject/blob/main/Project_ERD.png?raw=true)
<br/>
Rule 0:
Product to Stock:
    Product(prodId, pname, price ...)
    Stock(prodId, depId, quantity...)
Stock to Depot:
    Stock(prodId,depId, quantity...)
    Depot(depId, addr, volume...)
Rule2:
Product to Stock:
    Product(prodID, pname, price) B
    Stock(prodId, depId, quantity, product.prodId) A
Stock to Depot:
    Stock(prodId,depId, quantity, Depot.depId) A
    Depot(depId, addr, volume) B
    
## Link to Project Presentation Video:
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Coming soon!
<br/>

## Summary of Work:
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;To be updated soon!