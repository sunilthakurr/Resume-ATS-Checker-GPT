Resume-ATS-Checker-GPT

Overview

The Resume-ATS-Checker-GPT is designed to help recruiters efficiently analyze and match job seekers with suitable roles based on their skills and experiences. The system leverages OpenAI's GPT model for intelligent resume parsing and scoring, ensuring accurate and insightful candidate evaluations.

Features

Automated Resume Screening: Extracts key information from resumes and compares it with job requirements.

AI-Powered Matching: Utilizes OpenAI's GPT model to assess relevance and provide recommendations.

Scalability & Performance: Optimized backend operations with Spring Boot, MySQL, and RabbitMQ for asynchronous processing.

Cloud Deployment: Hosted on Heroku for high availability and seamless performance.

Technology Stack

Backend: Java, Spring Boot, MySQL

AI Integration: OpenAI GPT API, TensorFlow

Asynchronous Processing: RabbitMQ

Deployment: Heroku

Tools & Documentation: Swagger, Postman

Installation & Setup

Prerequisites

Java 17 or later

MySQL Database

RabbitMQ Server

Heroku CLI (for deployment)

Steps

Clone the repository:

git clone https://github.com/sunilthakurr/Resume-ATS-Checker-GPT.git
cd Resume-ATS-Checker-GPT

Set up environment variables:

Create a .env file and configure the following variables:

OPENAI_API_KEY=your-api-key
SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/resume_db
SPRING_DATASOURCE_USERNAME=root
SPRING_DATASOURCE_PASSWORD=yourpassword
RABBITMQ_HOST=localhost

Build and run the project:

mvn clean install
java -jar target/resume-ats-checker-gpt.jar

Test the APIs:

Use Postman to interact with the API endpoints.

API documentation available at http://localhost:8080/swagger-ui.html

Usage

Upload resumes in PDF format via the API.

The system processes the resumes asynchronously.

Retrieve analyzed results with matching scores and recommendations.

API Endpoints

POST /upload-resume - Upload a resume file.

GET /get-results/{jobId} - Retrieve screening results for a specific job.

Future Enhancements

Implement role-based authentication and authorization.

Add support for more file formats (e.g., DOCX, TXT).

Introduce dashboard analytics for recruiters.

Contributing

Contributions are welcome! Please submit a pull request or open an issue for suggestions.

License

This project is licensed under the MIT License.

Contact

For inquiries, please contact sunilthakurkv@gmail.com.

