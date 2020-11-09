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

### Relations
**Product to Stock**
<br/>
Rule 0:
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Product(prodId, pname, price...)
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Stock(prodId, depId, quantity...)
<br/>
Rule 2:
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Product(prodID, pname, price)
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Stock(prodId, depId, quantity, <em>Product</em>.prodId)
<br/>

**Stock to Depot:**
<br/>
Rule 0:
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Stock(prodId, depId, quantity...)
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Depot(depId, addr, volume...)
<br/>
Rule 2:
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Stock(prodId, depId, quantity, <em>Depot</em>.depId)
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Depot(depId, addr, volume)
<br/>
    
## Link to Project Presentation Video:
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Coming soon!
<br/>

## Summary of Work:
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;To be updated soon!