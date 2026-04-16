# Assignment
# WhatsApp Chatbot Backend Simulation

## Project Overview
This project is a simple backend simulation of a WhatsApp chatbot built using Java and Spring Boot.  
It demonstrates how a webhook-based messaging system works where incoming messages are processed and predefined responses are returned.

---

## Features
- REST API endpoint `/webhook` to receive messages
- Accepts JSON input simulating WhatsApp messages
- Predefined chatbot responses:
  - Hi → Hello
  - Bye → Goodbye
  - Default → I didn't understand that
- Clean layered architecture (Controller, Service, Model)

---

## Tech Stack
- Java
- Spring Boot
- Spring Web
- Lombok
- Postman (for testing)

---

## API Endpoint
## POST localhost:8080/webhook`

### Request Body
{
  "message": "Hi"
}
