## Overview

This project implements a **Toy Assembly Line simulation** using **JadeScript**, with a focus on **multi-agent system collaboration**. The simulation models a factory-like environment where three types of agents—**Workers**, **Suppliers**, and **Supervisors**—collaborate to assemble and deliver toys before the end of the workday.

The project explores agent interactions, coordination strategies, and system efficiency under varying execution dynamics.

---

## Agent Roles & Behavior

- **Workers**  
  - Assemble toys  
  - Request missing parts  
  - Ask for and provide help to other workers  

- **Suppliers**  
  - Deliver toy parts  
  - Choose between **profit-driven** and **resource-driven** strategies  

- **Supervisors**  
  - Track workflow and progress  
  - Handle issues and complaints  
  - Declare shift completion  

![image](https://github.com/user-attachments/assets/c01a2d03-a168-459a-9fd0-6d961e9b7ad5)


---

## Conclusion

This Toy Assembly Line simulation demonstrates the potential of **agent-based modeling** in structured, collaborative environments.

### Potential Improvements:
- **Optimize interaction flow** between agents to reduce bottlenecks
- **Implement dynamic inventory management**
- **Refine toy passing logic** to minimize delays and errors
- Extend the system to support **multi-day operations or agent learning**
